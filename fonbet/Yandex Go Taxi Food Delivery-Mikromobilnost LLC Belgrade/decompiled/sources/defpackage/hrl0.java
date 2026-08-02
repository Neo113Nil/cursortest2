package defpackage;

/* loaded from: classes13.dex */
public final class hrl0 {
    public Runnable a;
    public Runnable b;
    public boolean c;
    public boolean d;
    public boolean e;

    public final boolean a() {
        return (this.c || !this.d || this.a == null) ? false : true;
    }

    public final void b(Runnable runnable) {
        this.b = runnable;
        if (this.e) {
            runnable.run();
        }
    }

    public final void c(Runnable runnable, boolean z) {
        this.a = runnable;
        this.c = z;
        if (!this.d || z) {
            return;
        }
        runnable.run();
    }
}
