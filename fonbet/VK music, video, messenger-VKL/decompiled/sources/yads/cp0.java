package yads;

/* loaded from: classes10.dex */
public abstract class cp0 {
    public static ep0 a() {
        ep0 ep0Var;
        ep0 ep0Var2 = ep0.d;
        if (ep0Var2 != null) {
            return ep0Var2;
        }
        synchronized (ep0.c) {
            ep0Var = ep0.d;
            if (ep0Var == null) {
                ep0Var = new ep0();
                ep0.d = ep0Var;
            }
        }
        return ep0Var;
    }
}
