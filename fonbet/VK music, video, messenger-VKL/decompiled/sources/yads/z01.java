package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class z01 {
    public static final Object a = new Object();
    public static volatile yy0 b;

    public static final yy0 a(Context context) {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new yy0(context, "com.huawei.hms.location.LocationServices");
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        yy0 yy0Var = b;
        if (yy0Var != null) {
            return yy0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
