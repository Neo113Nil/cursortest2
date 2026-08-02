package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class fi10 {
    public ei10 a;

    public static void b(fi10 fi10Var, Context context) {
        double d = 0.2d;
        try {
            if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        if (0.0d > d || d > 1.0d) {
            ny61.g("percent must be in the range [0.0, 1.0].");
        } else {
            fi10Var.a = new ei10(d, context);
        }
    }

    public final adi0 a() {
        tdi0 tdi0Var = new tdi0();
        ei10 ei10Var = this.a;
        if (ei10Var != null) {
            return new adi0(new ndi0(((Number) ei10Var.invoke()).longValue(), tdi0Var), tdi0Var);
        }
        ny61.r("maxSizeBytesFactory == null");
        return null;
    }
}
