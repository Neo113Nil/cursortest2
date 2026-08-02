package defpackage;

/* loaded from: classes7.dex */
public final class cn71 {
    public final xp71 a() {
        xp71 xp71Var;
        xp71 xp71Var2 = xp71.d;
        if (xp71Var2 != null) {
            return xp71Var2;
        }
        synchronized (this) {
            xp71Var = xp71.d;
            if (xp71Var == null) {
                xp71Var = new xp71();
                xp71.d = xp71Var;
            }
        }
        return xp71Var;
    }
}
