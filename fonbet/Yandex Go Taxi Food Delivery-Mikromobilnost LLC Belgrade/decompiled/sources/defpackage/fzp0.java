package defpackage;

import kotlinx.serialization.modules.a;

/* loaded from: classes9.dex */
public final class fzp0 implements r1m {
    public final /* synthetic */ int a = 1;
    public final z3q0 b;
    public final uyg c;
    public final seu d;
    public final Object e;

    public fzp0(z3q0 z3q0Var, uyg uygVar, jse jseVar, seu seuVar) {
        this.b = z3q0Var;
        this.c = uygVar;
        this.e = jseVar;
        this.d = seuVar;
    }

    @Override // defpackage.r1m
    public final void extendDocumentParser(a aVar) {
        int i = this.a;
        seu seuVar = this.d;
        uyg uygVar = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                aVar.g(qoi0.a(dzp0.class), new gzp0(this.b, uygVar, (jse) obj, seuVar));
                break;
            default:
                aVar.g(qoi0.a(pyp0.class), new z2q0(new t6f0(5, this), (a3q0) obj, uygVar, seuVar));
                break;
        }
    }

    public fzp0(z3q0 z3q0Var, a3q0 a3q0Var, uyg uygVar, seu seuVar) {
        this.b = z3q0Var;
        this.e = a3q0Var;
        this.c = uygVar;
        this.d = seuVar;
    }
}
