package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class cf {
    public static final bu1 a(Context context, gr3 gr3Var) {
        tv3 tv3Var = tv3.a;
        if (du1.b == null) {
            synchronized (bu1.e) {
                try {
                    if (du1.b == null) {
                        Context a = uz.a(context);
                        du1.b = du1.a(a, du1.a.a(a), gr3Var);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bu1 bu1Var = du1.b;
        if (bu1Var != null) {
            return bu1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
