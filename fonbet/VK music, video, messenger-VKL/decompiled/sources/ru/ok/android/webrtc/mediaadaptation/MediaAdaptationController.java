package ru.ok.android.webrtc.mediaadaptation;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.fp;

/* loaded from: classes9.dex */
public final class MediaAdaptationController implements NetworkStateListener, NetworkConditionProvider {

    @Deprecated
    public static final String DEGRADATION_PREFERENCE = "maintain-framerate";
    public final NetworkStateProvider a;
    public final TimeProvider b;
    public final RTCLog c;
    public long d;
    public final MediaAdaptationConfig e;
    public PeerVideoSettings f;
    public MediaAdaptation.NetworkCondition g;
    public MediaAdaptation.NetworkState h;
    public final CopyOnWriteArrayList i;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaAdaptation.NetworkCondition.values().length];
            try {
                iArr[MediaAdaptation.NetworkCondition.BAD_LEVEL_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaAdaptation.NetworkCondition.BAD_LEVEL_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaAdaptationController(NetworkStateProvider networkStateProvider, MediaAdaptationConfig mediaAdaptationConfig, TimeProvider timeProvider, RTCLog rTCLog) {
        this.a = networkStateProvider;
        this.b = timeProvider;
        this.c = rTCLog;
        if (mediaAdaptationConfig == null || !mediaAdaptationConfig.validate$webrtc_android_sdk_release(rTCLog)) {
            mediaAdaptationConfig = new MediaAdaptationConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this.e = mediaAdaptationConfig;
        this.g = MediaAdaptation.NetworkCondition.GOOD;
        this.h = new MediaAdaptation.NetworkState(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.i = new CopyOnWriteArrayList();
        rTCLog.log(MediaAdaptation.LOG_TAG, "Media adaptation control enabled. Configuration is " + mediaAdaptationConfig);
        networkStateProvider.addListener(this);
    }

    public final void a(MediaAdaptation.NetworkState networkState) {
        this.c.log(MediaAdaptation.LOG_TAG, "Bad network detected. Current condition is " + this.g + ", state is " + networkState);
        MediaAdaptation.NetworkCondition networkCondition = networkState.getRoundTripTimeMs() >= this.e.getBadNetwork().getRttEnterLevel2Mode() ? MediaAdaptation.NetworkCondition.BAD_LEVEL_2 : this.g == MediaAdaptation.NetworkCondition.BAD_LEVEL_2 ? networkState.getRoundTripTimeMs() < this.e.getBadNetwork().getRttLeaveLevel2Mode() ? MediaAdaptation.NetworkCondition.BAD_LEVEL_1 : this.g : MediaAdaptation.NetworkCondition.BAD_LEVEL_1;
        this.d = this.b.getMsSinceBoot();
        if (this.g != networkCondition) {
            a(networkCondition, networkState);
        }
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkConditionProvider
    public void addEventListener(MediaAdaptation.EventListener eventListener) {
        this.i.add(eventListener);
        MediaAdaptation.NetworkCondition networkCondition = this.g;
        MediaAdaptation.NetworkConditionChange networkConditionChange = new MediaAdaptation.NetworkConditionChange(networkCondition, this.h, a(networkCondition), this.g != MediaAdaptation.NetworkCondition.GOOD && this.e.getBadNetwork().getPreferHardwareVPXEncoder());
        this.c.log(MediaAdaptation.LOG_TAG, "Got new subscriber, trigger my state event: " + networkConditionChange);
        eventListener.onNetworkConditionChanged(networkConditionChange);
    }

    public final void b(MediaAdaptation.NetworkState networkState) {
        this.c.log(MediaAdaptation.LOG_TAG, "Good network detected. Current condition is " + this.g + ", state is " + networkState);
        if (this.e.getGoodNetwork().getRecoveryTimeoutMs() < 0) {
            this.c.log(MediaAdaptation.LOG_TAG, "Good network detected. Reconfiguring to good network mode is prohibited");
            return;
        }
        long msSinceBoot = this.b.getMsSinceBoot() - this.d;
        if (msSinceBoot <= this.e.getGoodNetwork().getRecoveryTimeoutMs()) {
            RTCLog rTCLog = this.c;
            long recoveryTimeoutMs = this.e.getGoodNetwork().getRecoveryTimeoutMs();
            StringBuilder b = fp.b(msSinceBoot, "Good network detected. Do not update to good networks state because of ", " < ");
            b.append(recoveryTimeoutMs);
            rTCLog.log(MediaAdaptation.LOG_TAG, b.toString());
            return;
        }
        MediaAdaptation.NetworkCondition networkCondition = this.g;
        MediaAdaptation.NetworkCondition networkCondition2 = MediaAdaptation.NetworkCondition.GOOD;
        if (networkCondition != networkCondition2) {
            this.c.log(MediaAdaptation.LOG_TAG, "Good network detected. Reconfigure to good network mode. Timeout " + msSinceBoot);
            a(networkCondition2, networkState);
        }
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateListener
    public void onNetworkStateChanged(MediaAdaptation.NetworkState networkState) {
        double lostPacketsFraction = networkState.getLostPacketsFraction();
        double roundTripTimeMs = networkState.getRoundTripTimeMs();
        if ((roundTripTimeMs <= this.e.getBadNetwork().getRttThreshold() && lostPacketsFraction >= this.e.getBadNetwork().getLostPacketsLimitForRttBelowLowBound()) || ((roundTripTimeMs > this.e.getBadNetwork().getRttThreshold() && lostPacketsFraction >= this.e.getBadNetwork().getLostPacketsLimitForRttAboveLowBound()) || roundTripTimeMs >= this.e.getBadNetwork().getRttEnterLevel2Mode())) {
            a(networkState);
            return;
        }
        if ((roundTripTimeMs < this.e.getGoodNetwork().getRttLowBound() && lostPacketsFraction <= this.e.getGoodNetwork().getLostPacketsLimitForRttLowBound()) || (roundTripTimeMs < this.e.getGoodNetwork().getRttHighBound() && lostPacketsFraction <= this.e.getGoodNetwork().getLostPacketsLimitForRttHighBound())) {
            b(networkState);
            return;
        }
        this.c.log(MediaAdaptation.LOG_TAG, "Ignore inbound state update " + networkState);
    }

    public final void onPeerVideoSettingsChange(PeerVideoSettings peerVideoSettings) {
        this.f = peerVideoSettings;
        a();
    }

    public final void release() {
        this.c.log(MediaAdaptation.LOG_TAG, "Releasing media adaptation controller");
        this.a.removeListener(this);
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkConditionProvider
    public void removeEventListener(MediaAdaptation.EventListener eventListener) {
        this.i.remove(eventListener);
    }

    public final void a(MediaAdaptation.NetworkCondition networkCondition, MediaAdaptation.NetworkState networkState) {
        this.c.log(MediaAdaptation.LOG_TAG, "Update network condition. Current condition is " + this.g + ", new one is " + networkCondition + ", state is " + networkState);
        this.g = networkCondition;
        this.h = networkState;
        a();
    }

    public final void a() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            MediaAdaptation.EventListener eventListener = (MediaAdaptation.EventListener) it.next();
            MediaAdaptation.NetworkCondition networkCondition = this.g;
            eventListener.onNetworkConditionChanged(new MediaAdaptation.NetworkConditionChange(networkCondition, this.h, a(networkCondition), this.g != MediaAdaptation.NetworkCondition.GOOD && this.e.getBadNetwork().getPreferHardwareVPXEncoder()));
        }
    }

    public final PeerVideoSettings a(MediaAdaptation.NetworkCondition networkCondition) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable;
        PeerVideoSettings peerVideoSettings = this.f;
        if (peerVideoSettings == null) {
            i = 1280;
            i2 = 1280;
            str = DEGRADATION_PREFERENCE;
            i3 = 1000;
            i4 = 30;
            peerVideoSettingsBitrateTable = null;
        } else {
            int maxDimension = peerVideoSettings.getMaxDimension();
            int initialMaxDimension = peerVideoSettings.getInitialMaxDimension();
            int maxBitrateK = peerVideoSettings.getMaxBitrateK();
            int maxFrameRate = peerVideoSettings.getMaxFrameRate();
            PeerVideoSettingsBitrateTable bitrateTable = peerVideoSettings.getBitrateTable();
            String degradationPreference = peerVideoSettings.getDegradationPreference();
            str = degradationPreference == null ? DEGRADATION_PREFERENCE : degradationPreference;
            i = maxDimension;
            i2 = initialMaxDimension;
            i3 = maxBitrateK;
            i4 = maxFrameRate;
            peerVideoSettingsBitrateTable = bitrateTable;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[networkCondition.ordinal()];
        if (i5 == 1) {
            int i6 = i2;
            if (this.e.getBadNetwork().getLimitFrameSize()) {
                i = 640;
            }
            if (this.e.getBadNetwork().getLimitBitrate()) {
                i3 = this.e.getBadNetwork().getVideoBitrateLevel1K();
            }
            return new PeerVideoSettings(i, i6, i3, i4, str, peerVideoSettingsBitrateTable, 2, this.e.getBadNetwork().getSetTemporalLayers() ? 2 : 0, networkCondition.name());
        }
        if (i5 != 2) {
            PeerVideoSettings peerVideoSettings2 = this.f;
            if (peerVideoSettings2 == null) {
                return new PeerVideoSettings(i, i2, i3, i4, str, peerVideoSettingsBitrateTable, 1, 0, networkCondition.name());
            }
            return new PeerVideoSettings(peerVideoSettings2.getMaxDimension(), peerVideoSettings2.getInitialMaxDimension(), peerVideoSettings2.getMaxBitrateK(), peerVideoSettings2.getMaxFrameRate(), DEGRADATION_PREFERENCE, peerVideoSettings2.getBitrateTable(), 1, peerVideoSettings2.getTemporalLayersCount(), networkCondition.name());
        }
        int i7 = i2;
        if (this.e.getBadNetwork().getLimitFrameSize()) {
            i = 320;
        }
        if (this.e.getBadNetwork().getLimitBitrate()) {
            i3 = this.e.getBadNetwork().getVideoBitrateLevel2K();
        }
        return new PeerVideoSettings(i, i7, i3, i4, str, peerVideoSettingsBitrateTable, 4, this.e.getBadNetwork().getSetTemporalLayers() ? 3 : 0, networkCondition.name());
    }
}
