package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class ev5 implements kgn {
    public final /* synthetic */ zu5 a;
    public final /* synthetic */ cpi b;

    public ev5(zu5 zu5Var, cpi cpiVar) {
        this.a = zu5Var;
        this.b = cpiVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        zu5 zu5Var = this.a;
        jy50 jy50Var = zu5Var.a;
        cpi cpiVar = this.b;
        if (jy50Var != null) {
            cpiVar.b.e();
        } else {
            if (zu5Var.b == null) {
                throw new IllegalStateException("Unreachable");
            }
            cpiVar.a.remove();
        }
    }
}
