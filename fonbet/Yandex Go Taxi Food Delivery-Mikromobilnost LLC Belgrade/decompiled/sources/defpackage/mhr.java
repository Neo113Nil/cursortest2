package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class mhr implements hgl0 {
    public final yvf0 a;
    public final ArrayList b = new ArrayList();

    public mhr(yvf0 yvf0Var) {
        this.a = yvf0Var;
    }

    @Override // defpackage.hgl0
    public final void a(sls slsVar, tls tlsVar) {
        khr khrVar = new khr(this);
        this.b.add(khrVar);
        e(khrVar, tlsVar.invoke(new lhr(this.a, this)), new gpa(3, this, khrVar, slsVar));
    }

    @Override // defpackage.hgl0
    public final void b(cgl0 cgl0Var) {
        jhr jhrVar = (jhr) ycc.A(this.b);
        if (jhrVar == null) {
            d(cgl0Var);
        } else {
            jhrVar.P(cgl0Var);
        }
    }

    public abstract void d(cgl0 cgl0Var);

    public abstract void e(khr khrVar, Object obj, gpa gpaVar);
}
