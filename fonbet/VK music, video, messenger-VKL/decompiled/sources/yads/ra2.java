package yads;

/* loaded from: classes10.dex */
public abstract class ra2 {
    public static sa2 a() {
        sa2 sa2Var;
        sa2 sa2Var2 = sa2.d;
        if (sa2Var2 != null) {
            return sa2Var2;
        }
        synchronized (sa2.c) {
            sa2Var = sa2.d;
            if (sa2Var == null) {
                sa2Var = new sa2(new cb2());
                sa2.d = sa2Var;
            }
        }
        return sa2Var;
    }
}
