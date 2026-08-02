package xsna;

/* compiled from: CompositeEventGenerator.kt */
/* loaded from: classes11.dex */
public final class dti implements zyp {
    public final zyp[] a;

    public dti(zyp... zypVarArr) {
        this.a = zypVarArr;
    }

    @Override // xsna.zyp
    public final qyp a(long j, rrk0 rrk0Var, m0q m0qVar) {
        for (int i = 0; i < 2; i++) {
            qyp a = this.a[i].a(j, rrk0Var, m0qVar);
            if (a.a.length() > 0) {
                return a;
            }
        }
        return new qyp("", new eta0("NO_PLATFORM"));
    }
}
