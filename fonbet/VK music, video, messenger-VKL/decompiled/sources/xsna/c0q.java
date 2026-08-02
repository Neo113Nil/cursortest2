package xsna;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes11.dex */
public abstract class c0q extends ovj {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public sk3<ocn<?>> e;

    @Override // xsna.ovj
    public final ovj T(int i) {
        p7i.c(i);
        return this;
    }

    public final void U(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void V(ocn<?> ocnVar) {
        sk3<ocn<?>> sk3Var = this.e;
        if (sk3Var == null) {
            sk3Var = new sk3<>();
            this.e = sk3Var;
        }
        sk3Var.addLast(ocnVar);
    }

    public final void X(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public long Y() {
        return !a0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean a0() {
        ocn<?> l;
        sk3<ocn<?>> sk3Var = this.e;
        if (sk3Var == null || (l = sk3Var.l()) == null) {
            return false;
        }
        l.run();
        return true;
    }

    public void shutdown() {
    }
}
