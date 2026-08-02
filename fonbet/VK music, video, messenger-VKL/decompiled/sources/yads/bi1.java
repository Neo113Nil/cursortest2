package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class bi1 {
    public static ci1 a(Context context) {
        if (ci1.g == null) {
            synchronized (ci1.f) {
                try {
                    if (ci1.g == null) {
                        ci1.g = new ci1(context, new fi1(), new ei1(), gx2.a(), new sy2());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ci1 ci1Var = ci1.g;
        if (ci1Var != null) {
            return ci1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
