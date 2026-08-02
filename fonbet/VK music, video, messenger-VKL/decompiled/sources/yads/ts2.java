package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class ts2 {
    public static us2 a() {
        if (us2.d == null) {
            synchronized (us2.c) {
                try {
                    if (us2.d == null) {
                        us2.d = new us2(new lj2(), new py0());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        us2 us2Var = us2.d;
        if (us2Var != null) {
            return us2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
