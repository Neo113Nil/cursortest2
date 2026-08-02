package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ep0 {
    public static final Object c = new Object();
    public static volatile ep0 d;
    public final ap0 a = new ap0();
    public zz2 b;

    public final nr a(Context context) {
        zz2 zz2Var;
        synchronized (c) {
            zz2Var = this.b;
            if (zz2Var == null) {
                zz2Var = this.a.a(context);
                this.b = zz2Var;
            }
        }
        return zz2Var;
    }
}
