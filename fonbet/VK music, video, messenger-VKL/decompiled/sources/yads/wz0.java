package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class wz0 {
    public static volatile vz0 a;
    public static final Object b = new Object();

    public static final vz0 a(Context context) {
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        a = new vz0(vh1.a(context, "YadPreferenceFile"));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vz0 vz0Var = a;
        if (vz0Var != null) {
            return vz0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
