package yads;

/* loaded from: classes10.dex */
public abstract class x0 {
    public static z0 a() {
        z0 z0Var;
        z0 z0Var2 = z0.g;
        if (z0Var2 != null) {
            return z0Var2;
        }
        synchronized (z0.f) {
            z0Var = z0.g;
            if (z0Var == null) {
                z0Var = new z0();
                z0.g = z0Var;
            }
        }
        return z0Var;
    }
}
