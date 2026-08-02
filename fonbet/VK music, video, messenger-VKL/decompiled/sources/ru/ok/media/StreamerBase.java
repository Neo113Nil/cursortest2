package ru.ok.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.media.StreamerBase;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import ru.ok.media.utils.TimedEvent;
import xsna.asp;
import xsna.ece0;
import xsna.el3;
import xsna.epx;
import xsna.et5;
import xsna.ft5;
import xsna.jaj0;
import xsna.kv3;
import xsna.ne7;
import xsna.qox;
import xsna.r44;
import xsna.s3q0;
import xsna.tto0;
import xsna.tvo0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StreamerBase.kt */
/* loaded from: classes9.dex */
public abstract class StreamerBase implements Streamer {
    protected static final Companion Companion = new Companion(null);
    private static final String TAG = "Publisher";
    private static final long bitrateAverageInterval = 5000;
    private static final int droppedFrameMinLogTime = 1000;
    private static final long linkTimerUpdateInterval = 1000;
    private static final int recentQueueJobsCount = 8;
    private StreamerState _state;
    private LiveStreamStatReporter _statsReporter;
    private boolean _wasBound;
    private boolean _wasConnected;
    private final et5 averageBitrateEstimator;
    private final ft5 averageFpsEstimator;
    private final et5 averagePayloadBitrateEstimator;
    private final Handler dispatchQueue;
    private final AtomicLong framesDropped;
    private AtomicInteger framesDroppedDueToStateMismatch;
    private final TimedEvent lastFrameDropLog;
    private Long lastPresentationTime;
    private qox linkTimer;
    private final StreamerLinkTracker linkTracker;
    private final el3<Streamer.Listener> listeners;
    private Handler mainQueue;
    private volatile StreamerPacketsInfo prevPacketsInfo;
    private long queueTicks;
    private long queuedJobs;
    private int[] recentQueueJobs;
    private final tto0 timeMachine;
    private volatile StreamerPacketsInfo totalPacketsInfo;
    private URI uri;
    private boolean wasStarted;
    private boolean wasStarting;
    private final HandlerThread workerThread;

    /* compiled from: StreamerBase.kt */
    public static final class Companion {

        /* compiled from: StreamerBase.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StreamerLinkState.values().length];
                try {
                    iArr[StreamerLinkState.paused.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StreamerLinkState.stable.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StreamerLinkState.disconnected.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StreamerLinkState.unstable.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StreamerLinkState.stalled.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final StreamQuality getQuality(StreamerLinkStats streamerLinkStats) {
            int i = WhenMappings.$EnumSwitchMapping$0[StreamerLinkState.Companion.combine(streamerLinkStats.getAudio().getState(), streamerLinkStats.getVideo().getState()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return StreamQuality.normal;
            }
            if (i == 4) {
                return StreamQuality.unstable;
            }
            if (i == 5) {
                return StreamQuality.stalled;
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    /* compiled from: StreamerBase.kt */
    public static final class DebugQueueInfo {
        private final int[] lastBlocks;
        private final int[] lastBlocksNative;
        private final long ticks;
        private final long ticks2;

        public DebugQueueInfo(long j, int[] iArr, long j2, int[] iArr2) {
            this.ticks = j;
            this.lastBlocksNative = iArr;
            this.ticks2 = j2;
            this.lastBlocks = iArr2;
        }

        public final int[] getLastBlocks() {
            return this.lastBlocks;
        }

        public final int[] getLastBlocksNative() {
            return this.lastBlocksNative;
        }

        public final long getTicks() {
            return this.ticks;
        }

        public final long getTicks2() {
            return this.ticks2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StreamerBase.kt */
    public static final class ESender {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ESender[] $VALUES;
        private final int value;
        public static final ESender senderStreamerBase_linkTracker_timerTick = new ESender("senderStreamerBase_linkTracker_timerTick", 0, 2000);
        public static final ESender senderStreamerBase_updateState = new ESender("senderStreamerBase_updateState", 1, 2001);
        public static final ESender senderStreamerBase_reachabilityChanged = new ESender("senderStreamerBase_reachabilityChanged", 2, 2002);
        public static final ESender senderOkmpStreamer_applyConfiguration = new ESender("senderOkmpStreamer_applyConfiguration", 3, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);

        private static final /* synthetic */ ESender[] $values() {
            return new ESender[]{senderStreamerBase_linkTracker_timerTick, senderStreamerBase_updateState, senderStreamerBase_reachabilityChanged, senderOkmpStreamer_applyConfiguration};
        }

        static {
            ESender[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private ESender(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<ESender> getEntries() {
            return $ENTRIES;
        }

        public static ESender valueOf(String str) {
            return (ESender) Enum.valueOf(ESender.class, str);
        }

        public static ESender[] values() {
            return (ESender[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public StreamerBase(HandlerThread handlerThread, LiveStreamStatReporter liveStreamStatReporter) {
        this.workerThread = handlerThread;
        this._statsReporter = liveStreamStatReporter;
        tto0 tto0Var = new tto0();
        this.timeMachine = tto0Var;
        this.dispatchQueue = new Handler(handlerThread.getLooper());
        this._state = StreamerState.waiting;
        this.mainQueue = new Handler(Looper.getMainLooper());
        this.averageBitrateEstimator = new et5(5000L, tto0Var);
        this.averagePayloadBitrateEstimator = new et5(5000L, tto0Var);
        this.prevPacketsInfo = new StreamerPacketsInfo(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.totalPacketsInfo = new StreamerPacketsInfo(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.averageFpsEstimator = new ft5(1000L, tto0Var);
        this.framesDropped = new AtomicLong(0L);
        this.lastFrameDropLog = new TimedEvent();
        this.framesDroppedDueToStateMismatch = new AtomicInteger(0);
        this._wasBound = true;
        this.recentQueueJobs = new int[8];
        this.listeners = new el3<>(0);
        this.linkTracker = new StreamerLinkTracker(tto0Var);
        ne7.m(TAG, "StreamerBase init");
        ne7.m(TAG, "updateState() - state= " + get_state().idNameString());
        startLinkTracker();
    }

    public static final StreamQuality getQuality(StreamerLinkStats streamerLinkStats) {
        return Companion.getQuality(streamerLinkStats);
    }

    private final void logDroppedFrames() {
        this.lastFrameDropLog.signal();
        AtomicInteger atomicInteger = this.framesDroppedDueToStateMismatch;
        String str = this._wasConnected ? "" : "NOT ";
        ne7.J(TAG, "Ignored " + atomicInteger + " frame(s), was " + str + "connected, now in state= " + get_state());
        this.framesDroppedDueToStateMismatch.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queueJob$lambda$9$lambda$8(StreamerBase streamerBase, int i, Runnable runnable) {
        streamerBase.debugJobStarted(i);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queueJobDelayed$lambda$11$lambda$10(StreamerBase streamerBase, int i, Runnable runnable) {
        streamerBase.debugJobStarted(i);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reachabilityChanged$lambda$13(boolean z, StreamerBase streamerBase) {
        if (z) {
            streamerBase.linkTracker.connected(streamerBase.get_state() != StreamerState.started);
        } else {
            streamerBase.linkTracker.disconnected();
        }
    }

    private final void startLinkTracker() {
        if (this.linkTimer != null) {
            return;
        }
        this.linkTimer = new qox(new Handler(Looper.getMainLooper()), 1000L, 1000L, this.timeMachine, new ece0(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 startLinkTracker$lambda$15(StreamerBase streamerBase, qox qoxVar) {
        streamerBase.queueJob(ESender.senderStreamerBase_linkTracker_timerTick.getValue(), new r44(streamerBase, 19));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLinkTracker$lambda$15$lambda$14(StreamerBase streamerBase) {
        if (streamerBase.get_state() != StreamerState.started) {
            streamerBase.linkTracker.pause();
        } else {
            StreamerPacketsInfo packetsInfo = streamerBase.getPacketsInfo();
            streamerBase.linkTracker.update(packetsInfo.getAudioPacketsDelivered(), packetsInfo.getAudioPacketsLost(), packetsInfo.getVideoPacketsDelivered(), packetsInfo.getVideoPacketsLost());
        }
    }

    private final void stopLinkTracker() {
        qox qoxVar = this.linkTimer;
        if (qoxVar != null) {
            qoxVar.b();
            this.linkTimer = null;
        }
    }

    private final void updateAverageBitrate() {
        StreamerPacketsInfo packetsInfo = getPacketsInfo();
        long bytesSent = packetsInfo.getBytesSent() - this.prevPacketsInfo.getBytesSent();
        long payloadBytesSent = packetsInfo.getPayloadBytesSent() - this.prevPacketsInfo.getPayloadBytesSent();
        if (packetsInfo.getBytesSent() < this.prevPacketsInfo.getBytesSent() || packetsInfo.getPayloadBytesSent() < this.prevPacketsInfo.getPayloadBytesSent()) {
            return;
        }
        tvo0.a(this.averageBitrateEstimator, Long.valueOf(bytesSent));
        tvo0.a(this.averagePayloadBitrateEstimator, Long.valueOf(payloadBytesSent));
        this.prevPacketsInfo = packetsInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateState$lambda$3(StreamerBase streamerBase) {
        if (streamerBase.get_state() == StreamerState.started) {
            streamerBase.linkTracker.unpause();
        } else {
            streamerBase.linkTracker.pause();
        }
    }

    @Override // ru.ok.media.api.Streamer
    public void addListener(Streamer.Listener listener) {
        this.listeners.add(listener);
    }

    public final void debugJobStarted(int i) {
        synchronized (this) {
            int[] iArr = this.recentQueueJobs;
            long j = this.queueTicks;
            iArr[(int) (j % 8)] = i;
            this.queueTicks = j + 1;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.Streamer
    public double getAverageBitrate() {
        double b;
        synchronized (this.averageBitrateEstimator) {
            updateAverageBitrate();
            et5 et5Var = this.averageBitrateEstimator;
            et5Var.getClass();
            b = tvo0.b(et5Var) * 8;
        }
        return b;
    }

    public final et5 getAverageBitrateEstimator() {
        return this.averageBitrateEstimator;
    }

    public final ft5 getAverageFpsEstimator() {
        return this.averageFpsEstimator;
    }

    public final double getAverageOverheadBitrate() {
        double b;
        synchronized (this.averageBitrateEstimator) {
            updateAverageBitrate();
            et5 et5Var = this.averageBitrateEstimator;
            et5Var.getClass();
            double d = 8;
            double b2 = tvo0.b(et5Var) * d;
            et5 et5Var2 = this.averagePayloadBitrateEstimator;
            et5Var2.getClass();
            b = b2 - (tvo0.b(et5Var2) * d);
            if (b <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                b = 0.0d;
            }
        }
        return b;
    }

    public final DebugQueueInfo getDebugQueueInfo() {
        long j;
        int[] iArr;
        int[] iArr2;
        synchronized (this) {
            try {
                j = this.queueTicks;
                long j2 = 0;
                if (j > 0) {
                    int i = j <= 8 ? (int) j : 8;
                    iArr = new int[i];
                    if (j > 8) {
                        j2 = j - 8;
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        iArr[i2] = this.recentQueueJobs[(int) ((i2 + j2) % 8)];
                    }
                } else {
                    iArr = null;
                }
                iArr2 = iArr;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new DebugQueueInfo(getTicksNative(), getLastBlocksNative(), j, iArr2);
    }

    public final AtomicLong getFramesDropped() {
        return this.framesDropped;
    }

    public abstract int[] getLastBlocksNative();

    public final Long getLastPresentationTime() {
        return this.lastPresentationTime;
    }

    public final StreamerLinkTracker getLinkTracker() {
        return this.linkTracker;
    }

    public final el3<Streamer.Listener> getListeners() {
        return this.listeners;
    }

    public final Handler getMainQueue() {
        return this.mainQueue;
    }

    @Override // ru.ok.media.api.Streamer
    public StreamerState getState() {
        return get_state();
    }

    @Override // ru.ok.media.api.Streamer
    public LiveStreamStatReporter getStatsReporter() {
        return this._statsReporter;
    }

    public abstract long getTicksNative();

    public final tto0 getTimeMachine() {
        return this.timeMachine;
    }

    public final StreamerPacketsInfo getTotalPacketsInfo() {
        return this.totalPacketsInfo;
    }

    public final URI getUri() {
        return this.uri;
    }

    public abstract long getVideoFramesDropped();

    @Override // ru.ok.media.api.Streamer
    public boolean getWasBound() {
        return this._wasBound;
    }

    @Override // ru.ok.media.api.Streamer
    public boolean getWasConnected() {
        return this._wasConnected;
    }

    public final boolean getWasStarted() {
        return this.wasStarted;
    }

    public final boolean getWasStarting() {
        return this.wasStarting;
    }

    public final HandlerThread getWorkerThread() {
        return this.workerThread;
    }

    public final StreamerState get_state() {
        StreamerState streamerState;
        synchronized (this) {
            streamerState = this._state;
        }
        return streamerState;
    }

    public final LiveStreamStatReporter get_statsReporter() {
        return this._statsReporter;
    }

    public final boolean get_wasBound() {
        return this._wasBound;
    }

    public final boolean get_wasConnected() {
        return this._wasConnected;
    }

    public final void logDroppedFramesIfNeeded() {
        if (this.framesDroppedDueToStateMismatch.get() > 0) {
            logDroppedFrames();
        }
    }

    public final void onFrameDropped() {
        this.framesDropped.incrementAndGet();
        this.framesDroppedDueToStateMismatch.incrementAndGet();
        if (this.lastFrameDropLog.elapsed() >= 1000) {
            logDroppedFrames();
        }
    }

    public final void queueJob(final int i, final Runnable runnable) {
        synchronized (this) {
            this.queuedJobs++;
            this.dispatchQueue.post(new Runnable() { // from class: xsna.dpm0
                @Override // java.lang.Runnable
                public final void run() {
                    StreamerBase.queueJob$lambda$9$lambda$8(StreamerBase.this, i, runnable);
                }
            });
        }
    }

    public final void queueJobDelayed(final int i, long j, final Runnable runnable) {
        synchronized (this) {
            this.queuedJobs++;
            this.dispatchQueue.postDelayed(new Runnable() { // from class: xsna.epm0
                @Override // java.lang.Runnable
                public final void run() {
                    StreamerBase.queueJobDelayed$lambda$11$lambda$10(StreamerBase.this, i, runnable);
                }
            }, j);
        }
    }

    @Override // ru.ok.media.api.Streamer
    public void reachabilityChanged(boolean z) {
        queueJob(ESender.senderStreamerBase_reachabilityChanged.getValue(), new jaj0(z, this, 1));
    }

    public void release() {
        ne7.m(TAG, "StreamerBase.release()");
        stop();
        stopLinkTracker();
    }

    @Override // ru.ok.media.api.Streamer
    public void removeListener(Streamer.Listener listener) {
        this.listeners.remove(listener);
    }

    public final void setLastPresentationTime(Long l) {
        this.lastPresentationTime = l;
    }

    public final void setMainQueue(Handler handler) {
        this.mainQueue = handler;
    }

    public final void setTotalPacketsInfo(StreamerPacketsInfo streamerPacketsInfo) {
        this.totalPacketsInfo = streamerPacketsInfo;
    }

    public final void setUri(URI uri) {
        this.uri = uri;
    }

    public final void setWasStarted(boolean z) {
        this.wasStarted = z;
    }

    public final void setWasStarting(boolean z) {
        this.wasStarting = z;
    }

    public final void set_state(StreamerState streamerState) {
        synchronized (this) {
            try {
                if (this._state != streamerState) {
                    this._state = streamerState;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void set_statsReporter(LiveStreamStatReporter liveStreamStatReporter) {
        this._statsReporter = liveStreamStatReporter;
    }

    public final void set_wasBound(boolean z) {
        this._wasBound = z;
    }

    public final void set_wasConnected(boolean z) {
        this._wasConnected = z;
    }

    public final void updateState(StreamerState streamerState) {
        boolean z;
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        if (streamerState == get_state()) {
            return;
        }
        ne7.m(TAG, "updateState() - state= " + streamerState.idNameString());
        StreamerState streamerState2 = get_state();
        set_state(streamerState);
        synchronized (this) {
            try {
                if (!this.wasStarting && streamerState != StreamerState.starting) {
                    z = false;
                    this.wasStarting = z;
                    s3q0 s3q0Var = s3q0.a;
                }
                z = true;
                this.wasStarting = z;
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        LiveStreamStatReporter statsReporter = getStatsReporter();
        if (statsReporter != null) {
            statsReporter.streamStateChanged(streamerState2, streamerState, "");
        }
        queueJob(ESender.senderStreamerBase_updateState.getValue(), new kv3(this, 23));
        if (streamerState2 != streamerState) {
            el3<Streamer.Listener> el3Var = this.listeners;
            el3Var.getClass();
            el3.a aVar = new el3.a();
            while (aVar.hasNext()) {
                ((Streamer.Listener) aVar.next()).onStreamerStateChanged(streamerState, streamerState2);
            }
        }
    }
}
