package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class bu71 {
    public static final Object a = new Object();
    public static volatile y381 b;

    public static y381 a(Context context) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new y381(s881.a(context, "YadPreferenceFile"));
                }
            }
        }
        y381 y381Var = b;
        if (y381Var != null) {
            return y381Var;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
