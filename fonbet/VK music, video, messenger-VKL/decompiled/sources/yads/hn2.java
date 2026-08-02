package yads;

/* loaded from: classes10.dex */
public final class hn2 {
    public final in2 a() {
        in2 in2Var;
        in2 in2Var2 = in2.d;
        if (in2Var2 != null) {
            return in2Var2;
        }
        synchronized (this) {
            in2Var = in2.d;
            if (in2Var == null) {
                in2Var = new in2();
                in2.d = in2Var;
            }
        }
        return in2Var;
    }
}
