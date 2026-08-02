package defpackage;

/* loaded from: classes12.dex */
public final class ihr extends mhr {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihr(jhr jhrVar, sxv sxvVar) {
        super(jhrVar.D);
        this.e = jhrVar;
        this.d = sxvVar;
    }

    @Override // defpackage.mhr
    public final void d(cgl0 cgl0Var) {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((jhr) obj).P(cgl0Var);
                break;
            default:
                ((xyz) obj).invoke();
                cgl0Var.invoke();
                break;
        }
    }

    @Override // defpackage.mhr
    public final void e(khr khrVar, Object obj, gpa gpaVar) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                sxv sxvVar = (sxv) obj2;
                sxvVar.getClass();
                ((jhr) this.e).E(khrVar, obj, gpaVar, hxx.a);
                if (khrVar.x()) {
                    sxvVar.h();
                    break;
                }
                break;
            default:
                ((pep0) ((oep0) obj2)).f(khrVar, obj, hxx.a);
                break;
        }
    }

    public ihr(g3p g3pVar, oep0 oep0Var, xyz xyzVar) {
        super(g3pVar);
        this.d = oep0Var;
        this.e = xyzVar;
    }

    public /* synthetic */ ihr(jhr jhrVar) {
        this(jhrVar, xpb1.G);
    }
}
