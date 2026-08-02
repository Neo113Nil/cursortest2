package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class tu1 {
    public static vu1 a(ov2 ov2Var) {
        if (vu1.g == null) {
            synchronized (vu1.f) {
                try {
                    if (vu1.g == null) {
                        vu1.g = new vu1(new ou1(new pu1()), new su1(), new xv2(), ov2Var, uu1.b);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vu1 vu1Var = vu1.g;
        if (vu1Var != null) {
            return vu1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
