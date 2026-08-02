package yads;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class c31 {
    public final km0 a;
    public final a5 b;

    public c31(km0 km0Var, a5 a5Var) {
        this.a = km0Var;
        this.b = a5Var;
    }

    public final void a(Context context, b31 b31Var) {
        String a;
        tg tgVar = b31Var.a;
        String str = b31Var.b;
        g31 g31Var = b31Var.c;
        a5 a5Var = this.b;
        a5Var.getClass();
        int ordinal = g31Var.ordinal();
        if (ordinal == 0) {
            a = a5Var.a(context);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            a = tgVar.a;
            if (a == null) {
                a = a5Var.a(context);
            }
        }
        km0 km0Var = this.a;
        km0Var.e = a;
        km0Var.a = tgVar.b;
        String str2 = tgVar.c;
        synchronized (km0.h) {
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        km0Var.g = str2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
        this.a.d = str;
    }
}
