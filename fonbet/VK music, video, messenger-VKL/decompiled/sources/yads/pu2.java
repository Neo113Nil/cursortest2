package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class pu2 {
    public static final Object a = new Object();
    public static Boolean b;

    public static boolean a(Context context) {
        boolean z;
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (a) {
            try {
                Boolean bool2 = b;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                } else {
                    qu2 a2 = gx2.a().a(context);
                    z = a2 != null && a2.L0;
                    b = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
