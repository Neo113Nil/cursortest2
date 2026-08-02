package yads;

/* loaded from: classes10.dex */
public abstract class xp2 {
    public static yp2 a() {
        yp2 yp2Var;
        yp2 yp2Var2 = yp2.b;
        if (yp2Var2 != null) {
            return yp2Var2;
        }
        synchronized (yp2.a) {
            yp2Var = yp2.b;
            if (yp2Var == null) {
                yp2Var = new yp2();
                yp2.b = yp2Var;
            }
        }
        return yp2Var;
    }
}
