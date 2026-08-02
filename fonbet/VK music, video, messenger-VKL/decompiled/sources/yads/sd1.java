package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class sd1 {
    public static td1 a() {
        if (td1.d == null) {
            synchronized (td1.c) {
                try {
                    if (td1.d == null) {
                        td1.d = new td1(new lj2(), new py0());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        td1 td1Var = td1.d;
        if (td1Var != null) {
            return td1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
