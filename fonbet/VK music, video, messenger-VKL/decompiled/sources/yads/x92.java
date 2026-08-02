package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class x92 {
    public static final u92 d = new u92();
    public static volatile x92 e;
    public final h13 a;
    public final ek0 b;
    public final tb3 c;

    public x92(Context context, m31 m31Var) {
        w92 a = a(context);
        dq2 b = b(context);
        v92 v92Var = new v92(a);
        this.c = new tb3(a, m31Var);
        this.a = new h13(b, v92Var, m31Var);
        this.b = new ek0(b, context);
    }

    public static w92 a(Context context) {
        int i;
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
            i = maxMemory / 8;
            int i2 = ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3;
            if (i > i2) {
                i = i2;
            }
        } catch (IllegalArgumentException unused) {
            i = 5120;
        }
        return new w92(i >= 5120 ? i : 5120);
    }

    public final h13 b() {
        return this.a;
    }

    public static dq2 b(Context context) {
        int i;
        Integer num;
        qu2 a = gx2.a().a(context);
        if (a != null && (num = a.v0) != null) {
            if (num.intValue() == 0) {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
                dq2 a2 = eq2.a(context, i);
                a2.a();
                return a2;
            }
        }
        i = 4;
        dq2 a22 = eq2.a(context, i);
        a22.a();
        return a22;
    }

    public final ek0 a() {
        return this.b;
    }
}
