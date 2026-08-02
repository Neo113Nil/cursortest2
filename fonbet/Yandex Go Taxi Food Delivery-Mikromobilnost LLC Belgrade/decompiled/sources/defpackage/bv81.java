package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class bv81 {
    public static final bv81 a = new bv81();
    public static volatile r191 b;

    public static final r191 a(Context context) {
        r191 r191Var;
        r191 r191Var2 = b;
        if (r191Var2 != null) {
            return r191Var2;
        }
        synchronized (a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            r191Var = b;
            if (r191Var == null) {
                r191Var = new r191(context);
                b = r191Var;
            }
        }
        return r191Var;
    }
}
