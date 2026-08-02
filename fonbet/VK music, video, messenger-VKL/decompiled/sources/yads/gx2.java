package yads;

/* loaded from: classes10.dex */
public abstract class gx2 {
    public static hx2 a() {
        hx2 hx2Var;
        hx2 hx2Var2 = hx2.k;
        if (hx2Var2 != null) {
            return hx2Var2;
        }
        synchronized (hx2.j) {
            hx2Var = hx2.k;
            if (hx2Var == null) {
                hx2Var = new hx2();
                hx2.k = hx2Var;
            }
        }
        return hx2Var;
    }
}
