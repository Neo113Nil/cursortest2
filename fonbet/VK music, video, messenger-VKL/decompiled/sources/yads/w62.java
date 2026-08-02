package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class w62 {
    public final boolean a;
    public final t62 b;
    public final rg2 c;

    public /* synthetic */ w62(Context context, d4 d4Var, ov2 ov2Var, v9 v9Var) {
        this(context, d4Var, ov2Var, v9Var, pu2.a(context));
    }

    public final t62 a(Context context, v9 v9Var, ov2 ov2Var, d4 d4Var) {
        return this.a ? new he0(context, v9Var, ov2Var, d4Var) : new ie0(context, v9Var, ov2Var, d4Var);
    }

    public w62(Context context, d4 d4Var, ov2 ov2Var, v9 v9Var, boolean z) {
        this.a = z;
        this.b = a(context.getApplicationContext(), v9Var, ov2Var, d4Var);
        this.c = a();
    }

    public final rg2 a() {
        kp0 kp0Var;
        if (this.a) {
            kp0 kp0Var2 = kp0.c;
            if (kp0Var2 == null) {
                synchronized (kp0.b) {
                    kp0Var = kp0.c;
                    if (kp0Var == null) {
                        kp0Var = new kp0();
                        kp0.c = kp0Var;
                    }
                }
                kp0Var2 = kp0Var;
            }
            return new v62(kp0Var2);
        }
        return new u62(jp0.a());
    }
}
