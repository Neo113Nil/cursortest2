package xsna;

/* compiled from: TimedEvent.java */
/* loaded from: classes8.dex */
public final class awo0 {
    public volatile long a = -1;

    public final long a() {
        return this.a < 0 ? 0 : System.currentTimeMillis() - this.a;
    }
}
