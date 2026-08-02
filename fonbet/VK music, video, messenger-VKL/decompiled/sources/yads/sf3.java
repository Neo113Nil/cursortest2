package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class sf3 {
    public static tf3 a(Context context) {
        tf3 tf3Var;
        tf3 tf3Var2 = tf3.c;
        if (tf3Var2 != null) {
            return tf3Var2;
        }
        synchronized (tf3.b) {
            tf3Var = tf3.c;
            if (tf3Var == null) {
                tf3Var = new tf3(yq3.a(context, 1));
                tf3.c = tf3Var;
            }
        }
        return tf3Var;
    }
}
