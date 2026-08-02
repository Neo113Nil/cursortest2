package ru.ok.media;

import xsna.efz;
import xsna.tj0;
import xsna.zcl;

/* compiled from: StreamerMediaLinkStats.kt */
/* loaded from: classes9.dex */
public final class StreamerMediaLinkStats {
    private long disconnectCount;
    private long disconnectDuration;
    private long duration;
    private long pauseCount;
    private long pauseDuration;
    private long stallDuration;
    private long stallsCount;
    private StreamerLinkState state;
    private long unstableCount;
    private long unstableDuration;

    public StreamerMediaLinkStats(StreamerLinkState streamerLinkState, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.state = streamerLinkState;
        this.duration = j;
        this.stallsCount = j2;
        this.stallDuration = j3;
        this.unstableCount = j4;
        this.unstableDuration = j5;
        this.pauseCount = j6;
        this.pauseDuration = j7;
        this.disconnectCount = j8;
        this.disconnectDuration = j9;
    }

    public final long getDisconnectCount() {
        return this.disconnectCount;
    }

    public final long getDisconnectDuration() {
        return this.disconnectDuration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getPauseCount() {
        return this.pauseCount;
    }

    public final long getPauseDuration() {
        return this.pauseDuration;
    }

    public final long getStallDuration() {
        return this.stallDuration;
    }

    public final long getStallsCount() {
        return this.stallsCount;
    }

    public final StreamerLinkState getState() {
        return this.state;
    }

    public final long getUnstableCount() {
        return this.unstableCount;
    }

    public final long getUnstableDuration() {
        return this.unstableDuration;
    }

    public final void setDisconnectCount(long j) {
        this.disconnectCount = j;
    }

    public final void setDisconnectDuration(long j) {
        this.disconnectDuration = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setPauseCount(long j) {
        this.pauseCount = j;
    }

    public final void setPauseDuration(long j) {
        this.pauseDuration = j;
    }

    public final void setStallDuration(long j) {
        this.stallDuration = j;
    }

    public final void setStallsCount(long j) {
        this.stallsCount = j;
    }

    public final void setState(StreamerLinkState streamerLinkState) {
        this.state = streamerLinkState;
    }

    public final void setUnstableCount(long j) {
        this.unstableCount = j;
    }

    public final void setUnstableDuration(long j) {
        this.unstableDuration = j;
    }

    public String toString() {
        StreamerLinkState streamerLinkState = this.state;
        long j = this.duration;
        long j2 = this.stallsCount;
        long j3 = this.stallDuration;
        long j4 = this.unstableCount;
        long j5 = this.unstableDuration;
        long j6 = this.pauseCount;
        long j7 = this.pauseDuration;
        long j8 = this.disconnectCount;
        long j9 = this.disconnectDuration;
        StringBuilder sb = new StringBuilder("{ state: ");
        sb.append(streamerLinkState);
        sb.append(" duration: ");
        sb.append(j);
        tj0.d(sb, " stallsCount: ", j2, " stallDuration: ");
        sb.append(j3);
        tj0.d(sb, " unstableCount: ", j4, " unstableDuration: ");
        sb.append(j5);
        tj0.d(sb, " pauseCount: ", j6, " pauseDuration: ");
        sb.append(j7);
        tj0.d(sb, " disconnectCount: ", j8, " disconnectDuration: ");
        return efz.b(j9, " }", sb);
    }

    public /* synthetic */ StreamerMediaLinkStats(StreamerLinkState streamerLinkState, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, zcl zclVar) {
        this(streamerLinkState, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? 0L : j4, (i & 32) != 0 ? 0L : j5, (i & 64) != 0 ? 0L : j6, (i & 128) != 0 ? 0L : j7, (i & 256) != 0 ? 0L : j8, (i & 512) != 0 ? 0L : j9);
    }
}
