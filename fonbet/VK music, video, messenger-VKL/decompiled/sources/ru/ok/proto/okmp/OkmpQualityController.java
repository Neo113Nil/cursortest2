package ru.ok.proto.okmp;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.credentials.provider.CredentialEntry;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.streaming.tools.LogInterface;
import ru.ok.media.utils.TimedEvent;
import ru.ok.proto.QualityControllerBase;
import xsna.lhg;
import xsna.ne7;

/* loaded from: classes9.dex */
public class OkmpQualityController extends QualityControllerBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BUFFER_AUDIO_LIMIT = 800;
    private static final int BUFFER_VIDEO_LIMIT = 300;
    private static final int DROP_AUDIO_LIMIT = 900;
    private static final int DROP_VIDEO_LIMIT = 300;
    private static final long INACTIVE_THRESHOLD_UP = 500;
    private static final String TAG = "Publisher";
    private boolean audioBlocked;
    private boolean bitrateTrialRunning;
    private OkmpClient client;
    private final int delayThresholdSwitchDown;
    private ThreadLocal<Boolean> isLogging;
    private long lastAudioDrops;
    private final LogInterface log;
    private final int maxDelayMS;
    private int normalDelayMS;
    private int videoFrameCounter;
    private AtomicBoolean audioBlockedCallbackSent = new AtomicBoolean();
    private TimedEvent lastBufferUpdate = new TimedEvent();
    private TimedEvent lastBadNet = new TimedEvent();
    private TimedEvent bitrateTrialStarted = new TimedEvent();
    private TimedEvent kfRequested = new TimedEvent();
    private final TimedEvent lastLog = new TimedEvent();

    public interface StringSupplier {
        String get();
    }

    public OkmpQualityController(int i, int i2, int i3, LogInterface logInterface) {
        ne7.m(TAG, "OkmpQualityController()");
        this.isLogging = new ThreadLocal<Boolean>() { // from class: ru.ok.proto.okmp.OkmpQualityController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        };
        this.lastBadNet.signal();
        this.log = logInterface;
        this.maxDelayMS = i2;
        this.delayThresholdSwitchDown = i3;
    }

    private void abortBitrateTrial(StringSupplier stringSupplier) {
        if (!this.bitrateTrialRunning) {
            ne7.m(TAG, "abortBitrateTrial() - not running");
            return;
        }
        this.bitrateTrialRunning = false;
        OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            ne7.m(TAG, "abortBitrateTrial() - no client");
            return;
        }
        ne7.m(TAG, "abortBitrateTrial()");
        okmpClient.stopRetransmitFlood();
        if (this.log.enabled()) {
            this.log.message("Aborting BR trial: " + stringSupplier.get());
        }
    }

    private void doLogState() {
        OkmpClient okmpClient;
        if (this.isLogging.get().booleanValue() || (okmpClient = this.client) == null) {
            return;
        }
        try {
            this.isLogging.set(Boolean.TRUE);
            if (this.log.enabled()) {
                LogInterface logInterface = this.log;
                StringBuilder sb = new StringBuilder("QC: audio=");
                sb.append(okmpClient.audioSendStreamGetBufferDeepnessMS());
                sb.append(isAudioFrameAllowed() ? "(ok   )" : "(block)");
                sb.append(" video=");
                sb.append(okmpClient.videoSendStreamGetBufferDeepnessMS());
                sb.append(isVideoFrameAllowed() ? "(ok   )" : "(block)");
                sb.append(" bw=");
                sb.append(okmpClient.getEstimatedBandwidth(0L) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                sb.append("K nd=");
                sb.append(this.normalDelayMS);
                sb.append("ms rtt=");
                sb.append((int) okmpClient.getAverageRTT());
                sb.append(" loss=");
                sb.append(String.format("%.2f", Double.valueOf(okmpClient.getEstimatedLossSlow() * 100.0d)));
                sb.append(DomExceptionUtils.SEPARATOR);
                sb.append(String.format("%.2f", Double.valueOf(okmpClient.getEstimatedLossFast() * 100.0d)));
                sb.append("% lossDyn=");
                sb.append(getLossDynamic());
                sb.append(" inact=");
                sb.append(okmpClient.getInactiveTime());
                sb.append(" mtu=");
                sb.append(okmpClient.getMTU());
                sb.append(" up=");
                sb.append(canSwitchUp());
                sb.append(" brTrialTime=");
                sb.append(this.bitrateTrialRunning ? this.bitrateTrialStarted.elapsed() : 0L);
                sb.append(" upSpeed=");
                sb.append(getSwitchUpSpeed());
                logInterface.message(sb.toString());
            }
            this.isLogging.set(Boolean.FALSE);
        } catch (Throwable th) {
            this.isLogging.set(Boolean.FALSE);
            throw th;
        }
    }

    private int getLossDynamic() {
        int i;
        OkmpClient okmpClient = this.client;
        int i2 = 0;
        if (okmpClient == null) {
            ne7.m(TAG, "getLossDynamic() - 0 (no client)");
            return 0;
        }
        float estimatedLossFast = okmpClient.getEstimatedLossFast();
        float estimatedLossSlow = okmpClient.getEstimatedLossSlow();
        double d = estimatedLossFast;
        if (d > 0.4d) {
            i = 2;
        } else if (d < 1.0E-4d) {
            i = -1;
        } else {
            if (estimatedLossFast >= estimatedLossSlow ? d > 0.03d : d >= 0.1d) {
                i2 = 1;
            }
            i = i2;
        }
        ne7.m(TAG, "getLossDynamic() - " + i);
        return i;
    }

    private long getMaxBufferDeepnessMS() {
        long max = Math.max(this.client.audioSendStreamGetBufferDeepnessMS(), this.client.videoSendStreamGetBufferDeepnessMS());
        ne7.m(TAG, "getMaxBufferDeepnessMS() - " + max);
        return max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVideoFrameAllowed$0() {
        return "audioBlocked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isVideoFrameAllowed$1(int i) {
        return lhg.a(i, "lossDynamic=");
    }

    private void logState() {
        if (!this.isLogging.get().booleanValue() && this.log.enabled() && this.lastLog.elapsed(Integer.MAX_VALUE) > 2000) {
            this.lastLog.signal();
            doLogState();
        }
    }

    private void startBitrateTrial() {
        if (!this.bitrateTrialRunning) {
            OkmpClient okmpClient = this.client;
            if (okmpClient == null) {
                ne7.m(TAG, "startBitrateTrial() - no client");
                return;
            }
            ne7.m(TAG, "startBitrateTrial()");
            this.bitrateTrialStarted.signal();
            this.bitrateTrialRunning = true;
            okmpClient.startRetransmitFlood(0.2f);
            return;
        }
        long elapsed = this.bitrateTrialStarted.elapsed();
        ne7.m(TAG, "startBitrateTrial() - already running");
        if (elapsed > 20000 && this.client.getEstimatedBandwidth(0L) < 1500000) {
            this.client.startRetransmitFlood(0.5f);
        } else if (elapsed > 10000) {
            this.client.startRetransmitFlood(0.2f);
        } else if (elapsed > 5000) {
            this.client.startRetransmitFlood(0.1f);
        }
    }

    private void updateBuffers() {
        OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            ne7.m(TAG, "updateBuffers() - no client");
            return;
        }
        this.lastBufferUpdate.signal();
        this.normalDelayMS = Math.max(500, Math.min(okmpClient.getExpectedDeliveryDelayMS(3), this.maxDelayMS));
        ne7.m(TAG, "updateBuffers() - normalDelayMS=" + this.normalDelayMS);
        okmpClient.audioSendStreamSetMaxDeepness(this.normalDelayMS + 800, 102400);
        okmpClient.videoSendStreamSetMaxDeepness(this.normalDelayMS + 300, 3145728);
    }

    @Override // ru.ok.proto.QualityController
    public boolean canSwitchUp() {
        OkmpClient okmpClient = this.client;
        boolean z = false;
        if (okmpClient == null) {
            ne7.m(TAG, "canSwitchUp() - false (no client)");
            return false;
        }
        if (okmpClient.getInactiveTime() <= 500 && getLossDynamic() <= 0 && okmpClient.getExpectedDeliveryDelayMS(1) <= this.delayThresholdSwitchDown && this.bitrateTrialRunning && this.bitrateTrialStarted.elapsed() > 5000 && getMaxBufferDeepnessMS() < Math.max((this.normalDelayMS * 2) / 3, 150)) {
            z = true;
        }
        ne7.m(TAG, "canSwitchUp() - ".concat(z ? "true" : CredentialEntry.FALSE_STRING));
        return z;
    }

    @Override // ru.ok.proto.QualityControllerBase, ru.ok.proto.QualityController
    public boolean getAndResetKeyFrameRequest() {
        OkmpClient okmpClient = this.client;
        boolean z = okmpClient != null && okmpClient.videoSendStreamIsWaitingForSync() && this.kfRequested.elapsed(Integer.MAX_VALUE) > 500;
        if (z) {
            this.kfRequested.signal();
        }
        ne7.m(TAG, "getAndResetKeyFrameRequest() - " + z);
        return z;
    }

    @Override // ru.ok.proto.QualityController
    public long getBandwidth() {
        OkmpClient okmpClient = this.client;
        long estimatedBandwidth = okmpClient != null ? okmpClient.getEstimatedBandwidth(-1L) : -1L;
        ne7.m(TAG, "getBandwidth() - " + estimatedBandwidth);
        return estimatedBandwidth;
    }

    @Override // ru.ok.proto.QualityController
    public long getSelectedBandwidth() {
        return 0L;
    }

    @Override // ru.ok.proto.QualityController
    public int getVideoFrameSkipCounter() {
        return 0;
    }

    @Override // ru.ok.proto.QualityController
    public boolean isAudioFrameAllowed() {
        OkmpClient okmpClient = this.client;
        boolean z = false;
        if (okmpClient == null) {
            ne7.m(TAG, "isAudioFrameAllowed() - no client");
            return false;
        }
        logState();
        long audioSendStreamGetTotalDrops = okmpClient.audioSendStreamGetTotalDrops();
        if (audioSendStreamGetTotalDrops > this.lastAudioDrops) {
            this.audioBlocked = true;
        }
        this.lastAudioDrops = audioSendStreamGetTotalDrops;
        if (okmpClient.getInactiveTime() > 3000 || (!this.audioBlocked ? okmpClient.audioSendStreamGetBufferDeepnessMS() > this.normalDelayMS + DROP_AUDIO_LIMIT : okmpClient.audioSendStreamGetBufferDeepnessMS() > 0)) {
            z = true;
        }
        this.audioBlocked = z;
        ne7.m(TAG, "isAudioFrameAllowed() - ".concat(z ? "blocked" : "allowed"));
        return !z;
    }

    @Override // ru.ok.proto.QualityController
    public boolean isVideoFrameAllowed() {
        if (this.client == null) {
            ne7.m(TAG, "isVideoFrameAllowed() - no client");
            return false;
        }
        if (this.lastBufferUpdate.elapsed() > 1000) {
            updateBuffers();
        }
        if (this.audioBlocked) {
            abortBitrateTrial(new b());
            ne7.m(TAG, "isVideoFrameAllowed() - blocked due to audio blocked");
            return false;
        }
        long maxBufferDeepnessMS = getMaxBufferDeepnessMS();
        final int lossDynamic = getLossDynamic();
        if (lossDynamic > 0) {
            abortBitrateTrial(new StringSupplier() { // from class: ru.ok.proto.okmp.c
                @Override // ru.ok.proto.okmp.OkmpQualityController.StringSupplier
                public final String get() {
                    String lambda$isVideoFrameAllowed$1;
                    lambda$isVideoFrameAllowed$1 = OkmpQualityController.lambda$isVideoFrameAllowed$1(lossDynamic);
                    return lambda$isVideoFrameAllowed$1;
                }
            });
            this.lastBadNet.signal();
        }
        boolean z = maxBufferDeepnessMS < ((long) (this.normalDelayMS + 300));
        ne7.m(TAG, "isVideoFrameAllowed() - ".concat(z ? "allowed" : "blocked"));
        return z;
    }

    @Override // ru.ok.proto.QualityController
    public void pause() {
        ne7.m(TAG, "pause()");
        OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            ne7.m(TAG, "pause() - no client");
        } else {
            okmpClient.pause();
        }
    }

    @Override // ru.ok.proto.QualityController
    public void resume() {
        ne7.m(TAG, "resume()");
        this.lastBadNet.signal();
        OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            ne7.m(TAG, "resume() - no client");
        } else {
            okmpClient.resume();
        }
    }

    public void setClient(OkmpClient okmpClient) {
        ne7.m(TAG, "setClient(" + okmpClient + ")");
        this.client = okmpClient;
        updateBuffers();
    }

    @Override // ru.ok.proto.QualityController
    public void setTargetBitrate(long j) {
        ne7.m(TAG, "setTargetBitrate(" + j + ") - <empty impl>");
    }

    @Override // ru.ok.proto.QualityController
    public long update() {
        return 0L;
    }

    @Override // ru.ok.proto.QualityController
    public void videoSizeChanged() {
    }

    @Override // ru.ok.proto.QualityController
    public void debugForceTargetBitrate(long j) {
    }

    @Override // ru.ok.proto.QualityController
    public void setKeyFrameInterval(int i) {
    }

    @Override // ru.ok.proto.QualityController
    public void start(long j) {
    }
}
