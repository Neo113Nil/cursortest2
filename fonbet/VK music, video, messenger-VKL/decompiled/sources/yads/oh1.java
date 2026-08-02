package yads;

/* loaded from: classes10.dex */
public abstract class oh1 {
    public static ph1 a() {
        ph1 ph1Var;
        ph1 ph1Var2 = ph1.e;
        if (ph1Var2 != null) {
            return ph1Var2;
        }
        synchronized (ph1.d) {
            ph1Var = ph1.e;
            if (ph1Var == null) {
                ph1Var = new ph1(new fz1(fz1.c));
                ph1.e = ph1Var;
            }
        }
        return ph1Var;
    }
}
