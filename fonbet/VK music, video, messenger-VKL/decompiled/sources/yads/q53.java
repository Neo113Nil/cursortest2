package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class q53 {
    public static r53 a() {
        if (r53.b == null) {
            synchronized (r53.c) {
                try {
                    if (r53.b == null) {
                        r53.b = new r53();
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r53 r53Var = r53.b;
        if (r53Var != null) {
            return r53Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
