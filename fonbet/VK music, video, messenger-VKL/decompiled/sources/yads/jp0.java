package yads;

/* loaded from: classes10.dex */
public abstract class jp0 {
    public static lp0 a() {
        lp0 lp0Var;
        lp0 lp0Var2 = lp0.c;
        if (lp0Var2 != null) {
            return lp0Var2;
        }
        synchronized (lp0.b) {
            lp0Var = lp0.c;
            if (lp0Var == null) {
                lp0Var = new lp0();
                lp0.c = lp0Var;
            }
        }
        return lp0Var;
    }
}
