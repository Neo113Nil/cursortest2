package yads;

/* loaded from: classes10.dex */
public abstract class bp0 {
    public static dp0 a() {
        dp0 dp0Var;
        dp0 dp0Var2 = dp0.d;
        if (dp0Var2 != null) {
            return dp0Var2;
        }
        synchronized (dp0.c) {
            dp0Var = dp0.d;
            if (dp0Var == null) {
                dp0Var = new dp0();
                dp0.d = dp0Var;
            }
        }
        return dp0Var;
    }
}
