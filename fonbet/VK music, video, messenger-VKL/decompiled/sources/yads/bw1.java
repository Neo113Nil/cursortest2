package yads;

/* loaded from: classes10.dex */
public abstract class bw1 {
    public static cw1 a() {
        cw1 cw1Var;
        cw1 cw1Var2 = cw1.b;
        if (cw1Var2 != null) {
            return cw1Var2;
        }
        synchronized (cw1.c) {
            cw1Var = cw1.b;
            if (cw1Var == null) {
                cw1Var = new cw1();
                cw1.b = cw1Var;
            }
        }
        return cw1Var;
    }
}
