package yads;

/* loaded from: classes10.dex */
public final class cv1 {
    public final dv1 a() {
        dv1 dv1Var;
        dv1 dv1Var2 = dv1.f;
        if (dv1Var2 != null) {
            return dv1Var2;
        }
        synchronized (this) {
            dv1Var = dv1.f;
            if (dv1Var == null) {
                dv1Var = new dv1();
                dv1.f = dv1Var;
            }
        }
        return dv1Var;
    }
}
