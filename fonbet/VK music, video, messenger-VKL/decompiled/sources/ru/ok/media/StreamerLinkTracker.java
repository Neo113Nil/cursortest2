package ru.ok.media;

import one.video.streaming.tools.TimeMachine;

/* compiled from: StreamerLinkTracker.kt */
/* loaded from: classes9.dex */
public final class StreamerLinkTracker {
    private final StreamerMediaLinkTracker audio;
    private final TimeMachine timeMachine;
    private final StreamerMediaLinkTracker video;

    public StreamerLinkTracker(TimeMachine timeMachine) {
        this.timeMachine = timeMachine;
        this.audio = new StreamerMediaLinkTracker(timeMachine);
        this.video = new StreamerMediaLinkTracker(timeMachine);
    }

    public final void connected(boolean z) {
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        this.audio.connected(currentTimeMillis, z);
        this.video.connected(currentTimeMillis, z);
    }

    public final void disconnected() {
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        this.audio.disconnected(currentTimeMillis);
        this.video.disconnected(currentTimeMillis);
    }

    public final StreamerLinkStats getStats() {
        return new StreamerLinkStats(this.audio.getStats(), this.video.getStats());
    }

    public final void pause() {
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        this.audio.pause(currentTimeMillis);
        this.video.pause(currentTimeMillis);
    }

    public final void unpause() {
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        this.audio.unpause(currentTimeMillis);
        this.video.unpause(currentTimeMillis);
    }

    public final boolean update(long j, long j2, long j3, long j4) {
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        return this.audio.update(currentTimeMillis, j, j2) || this.video.update(currentTimeMillis, j3, j4);
    }
}
