package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class hz2 {
    public static volatile jz2 b;
    public static final /* synthetic */ hz2 a = new hz2();
    public static final Object c = new Object();

    public static iz2 a(Context context) {
        if (b == null) {
            synchronized (c) {
                try {
                    if (b == null) {
                        b = new jz2(vh1.a(context, "YadPreferenceFile"));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jz2 jz2Var = b;
        if (jz2Var != null) {
            return jz2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
