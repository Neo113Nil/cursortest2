package yads;

/* loaded from: classes10.dex */
public final class ni1 {
    public final oi1 a = new oi1();
    public final h73 b = new h73();

    public final void a(Runnable runnable) {
        this.b.getClass();
        if (h73.a()) {
            runnable.run();
        } else {
            this.a.a.post(runnable);
        }
    }

    public final void a() {
        this.a.a.removeCallbacksAndMessages(null);
    }
}
