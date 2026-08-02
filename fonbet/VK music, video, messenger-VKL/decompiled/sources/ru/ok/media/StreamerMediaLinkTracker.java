package ru.ok.media;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.NoWhenBranchMatchedException;
import one.video.streaming.tools.TimeMachine;
import xsna.ne7;

/* compiled from: StreamerMediaLinkTracker.kt */
/* loaded from: classes9.dex */
public final class StreamerMediaLinkTracker {
    private long created;
    private long lastUpdate;
    private long packetsDelivered;
    private long packetsLost;
    private StreamerMediaLinkStats stats = new StreamerMediaLinkStats(StreamerLinkState.paused, 0, 0, 0, 0, 0, 0, 0, 0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null);
    private final TimeMachine timeMachine;

    /* compiled from: StreamerMediaLinkTracker.kt */
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
                iArr[StreamerLinkState.unstable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StreamerLinkState.stalled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StreamerLinkState.disconnected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamerMediaLinkTracker(TimeMachine timeMachine) {
        this.timeMachine = timeMachine;
        long currentTimeMillis = timeMachine.currentTimeMillis();
        this.created = currentTimeMillis;
        this.lastUpdate = currentTimeMillis;
    }

    private final void onInstabilityDetected(long j) {
        StreamerLinkState state = this.stats.getState();
        StreamerLinkState streamerLinkState = StreamerLinkState.unstable;
        if (state == streamerLinkState) {
            return;
        }
        StreamerMediaLinkStats streamerMediaLinkStats = this.stats;
        streamerMediaLinkStats.setUnstableCount(streamerMediaLinkStats.getUnstableCount() + 1);
        this.stats.setState(streamerLinkState);
    }

    private final void onStableConnection(long j) {
        this.stats.setState(StreamerLinkState.stable);
    }

    private final void onStallDetected(long j) {
        StreamerLinkState state = this.stats.getState();
        StreamerLinkState streamerLinkState = StreamerLinkState.stalled;
        if (state == streamerLinkState) {
            return;
        }
        StreamerMediaLinkStats streamerMediaLinkStats = this.stats;
        streamerMediaLinkStats.setStallsCount(streamerMediaLinkStats.getStallsCount() + 1);
        this.stats.setState(streamerLinkState);
    }

    private final void updateDurations(long j) {
        long j2 = j - this.lastUpdate;
        int i = WhenMappings.$EnumSwitchMapping$0[this.stats.getState().ordinal()];
        if (i == 1) {
            StreamerMediaLinkStats streamerMediaLinkStats = this.stats;
            streamerMediaLinkStats.setPauseDuration(streamerMediaLinkStats.getPauseDuration() + j2);
        } else if (i != 2) {
            if (i == 3) {
                StreamerMediaLinkStats streamerMediaLinkStats2 = this.stats;
                streamerMediaLinkStats2.setUnstableDuration(streamerMediaLinkStats2.getUnstableDuration() + j2);
            } else if (i == 4) {
                StreamerMediaLinkStats streamerMediaLinkStats3 = this.stats;
                streamerMediaLinkStats3.setStallDuration(streamerMediaLinkStats3.getStallDuration() + j2);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                StreamerMediaLinkStats streamerMediaLinkStats4 = this.stats;
                streamerMediaLinkStats4.setDisconnectDuration(streamerMediaLinkStats4.getDisconnectDuration() + j2);
            }
        }
        this.lastUpdate = j;
        this.stats.setDuration(j - this.created);
    }

    public final void connected(long j, boolean z) {
        updateDurations(j);
        if (this.stats.getState() == StreamerLinkState.disconnected) {
            this.stats.setState(z ? StreamerLinkState.paused : StreamerLinkState.stable);
        }
    }

    public final void disconnected(long j) {
        updateDurations(j);
        StreamerMediaLinkStats streamerMediaLinkStats = this.stats;
        streamerMediaLinkStats.setDisconnectCount(streamerMediaLinkStats.getDisconnectCount() + 1);
        this.stats.setState(StreamerLinkState.disconnected);
    }

    public final StreamerMediaLinkStats getStats() {
        return this.stats;
    }

    public final void pause(long j) {
        updateDurations(j);
        if (this.stats.getState() != StreamerLinkState.disconnected) {
            StreamerLinkState state = this.stats.getState();
            StreamerLinkState streamerLinkState = StreamerLinkState.paused;
            if (state != streamerLinkState) {
                StreamerMediaLinkStats streamerMediaLinkStats = this.stats;
                streamerMediaLinkStats.setPauseCount(streamerMediaLinkStats.getPauseCount() + 1);
                this.stats.setState(streamerLinkState);
            }
        }
    }

    public final void unpause(long j) {
        updateDurations(j);
        if (this.stats.getState() == StreamerLinkState.paused) {
            this.stats.setState(StreamerLinkState.stable);
        }
    }

    public final boolean update(long j, long j2, long j3) {
        updateDurations(j);
        StreamerLinkState state = this.stats.getState();
        if (state != StreamerLinkState.disconnected) {
            long j4 = j2 - this.packetsDelivered;
            long j5 = j3 - this.packetsLost;
            if (j4 == 0) {
                onStallDetected(j);
            } else if (j5 > 0) {
                onInstabilityDetected(j);
            } else {
                onStableConnection(j);
            }
        }
        this.packetsDelivered = j2;
        this.packetsLost = j3;
        if (state != this.stats.getState()) {
            ne7.m("Publisher", "StreamerMediaLinkTracker.update() - " + state + " -> " + this.stats.getState());
        }
        return state != this.stats.getState();
    }
}
