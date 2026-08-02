package xsna;

import one.video.streaming.tools.TimeMachine;

/* compiled from: TimedEvent.java */
/* loaded from: classes8.dex */
public final class zvo0 {
    public volatile long a = -1;
    public final TimeMachine b;

    public zvo0(TimeMachine timeMachine) {
        this.b = timeMachine == null ? new tto0() : timeMachine;
    }

    public final long a(long j) {
        return this.a < 0 ? j : this.b.currentTimeMillis() - this.a;
    }

    public final void b() {
        this.a = this.b.currentTimeMillis();
    }

    public final void c() {
        if (this.a < 0) {
            b();
        }
    }
}
