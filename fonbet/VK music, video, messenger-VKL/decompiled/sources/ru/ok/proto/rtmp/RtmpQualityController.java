package ru.ok.proto.rtmp;

import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import ru.ok.media.utils.TimedEvent;
import ru.ok.proto.QualityControllerBase;
import xsna.m06;
import xsna.tto0;

/* loaded from: classes9.dex */
public class RtmpQualityController extends QualityControllerBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int AUDIO_DROP_THRESHOLD = 1500;
    private static final int BAD_NETWORK_THRESHOLD = 400;
    private static final int GOOD_NETWORK_THRESHOLD = 100;
    private static final long SOCKET_BUFFER_MS = 600;
    private static final String TAG = "ru.ok.proto.rtmp.RtmpQualityController";
    private static final int VIDEO_DROP_THRESHOLD = 850;
    private volatile int audioMSSinceLastVideo;
    private m06 bandwidthEstimator;
    private volatile long bitrate;
    private boolean droppingAudio;
    private long lastSwitchDownBuffer;
    private final AtomicLong dataQueued = new AtomicLong(0);
    private TimedEvent badNetworkEvent = new TimedEvent();
    private TimedEvent notPerfectNetworkEvent = new TimedEvent();
    private TimedEvent lastSwitchDownBufferEvent = new TimedEvent();
    private TimedEvent lastAudioDrop = new TimedEvent();
    private volatile boolean transmissionBlocked = false;

    public RtmpQualityController(int i) {
        this.bitrate = i;
        reset();
    }

    private long getBufferMS() {
        return -1L;
    }

    public synchronized void audioPushedToQueue(int i) {
        this.audioMSSinceLastVideo += i;
    }

    @Override // ru.ok.proto.QualityController
    public boolean canSwitchUp() {
        return this.badNetworkEvent.elapsed(10000) > 4000 && this.notPerfectNetworkEvent.elapsed(10000) > 3000;
    }

    public void dataPushedToQueue(int i) {
        this.dataQueued.addAndGet(i);
    }

    public void dataRemovedFromQueue(int i) {
        this.bandwidthEstimator.a(i);
        this.dataQueued.addAndGet(-i);
    }

    @Override // ru.ok.proto.QualityController
    public long getBandwidth() {
        return (long) this.bandwidthEstimator.f;
    }

    public int getRecommendedSocketBufferBytes() {
        return -1;
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
        long bufferMS = getBufferMS();
        if (this.transmissionBlocked) {
            return false;
        }
        synchronized (this) {
            try {
                if (bufferMS > 1500) {
                    this.droppingAudio = true;
                    this.lastAudioDrop.signal();
                    return false;
                }
                if (!this.droppingAudio || bufferMS <= 400) {
                    this.droppingAudio = false;
                    return true;
                }
                this.badNetworkEvent.signal();
                this.lastAudioDrop.signal();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0026 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:9:0x0008, B:13:0x000e, B:15:0x0018, B:20:0x0026), top: B:2:0x0001 }] */
    @Override // ru.ok.proto.QualityController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isVideoFrameAllowed() {
        boolean z;
        try {
            if (this.transmissionBlocked) {
                return false;
            }
            if (this.droppingAudio) {
                return false;
            }
            if (getBufferMS() >= 850 && this.audioMSSinceLastVideo < 4000) {
                z = false;
                if (z) {
                    this.audioMSSinceLastVideo = 0;
                }
                return z;
            }
            z = true;
            if (z) {
            }
            return z;
        } finally {
        }
    }

    @Override // ru.ok.proto.QualityController
    public void pause() {
        this.bandwidthEstimator.h = true;
    }

    public void reset() {
        this.dataQueued.set(0L);
        this.bandwidthEstimator = new m06(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, new tto0());
    }

    @Override // ru.ok.proto.QualityController
    public void resume() {
        this.bandwidthEstimator.h = false;
    }

    @Override // ru.ok.proto.QualityController
    public void setTargetBitrate(long j) {
        this.bitrate = j;
    }

    @Override // ru.ok.proto.QualityController
    public long update() {
        return 0L;
    }

    @Override // ru.ok.proto.QualityController
    public void videoSizeChanged() {
    }

    public void blockTransmission(boolean z) {
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
