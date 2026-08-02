package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class ab2 {
    public static volatile za2 a;
    public static final Object b = new Object();

    public static final za2 a(Context context) {
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        a = new za2(vh1.a(context, "YadPreferenceFile"));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        za2 za2Var = a;
        if (za2Var != null) {
            return za2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
