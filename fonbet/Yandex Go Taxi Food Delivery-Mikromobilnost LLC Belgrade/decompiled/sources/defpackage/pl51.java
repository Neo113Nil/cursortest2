package defpackage;

/* loaded from: classes10.dex */
public final class pl51 extends skl0 {
    public final /* synthetic */ eb7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s4j0 c;

    public pl51(eb7 eb7Var, int i, s4j0 s4j0Var) {
        this.a = eb7Var;
        this.b = i;
        this.c = s4j0Var;
    }

    @Override // defpackage.skl0
    public final Object doWork() {
        eb7 eb7Var = this.a;
        s4j0 s4j0Var = this.c;
        if (s4j0Var.x == null) {
            return null;
        }
        su6 k = jd00.k(this.b, s4j0Var.a);
        try {
            jd00.g(k, eb7Var, s4j0Var, true);
            k.d();
            return k.a();
        } catch (Throwable th) {
            k.d();
            throw th;
        }
    }
}
