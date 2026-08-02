package xsna;

import android.content.Context;
import xsna.pbz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class guy0 {
    public final thz0 a;
    public final Context b;
    public boolean c = true;

    public guy0(thz0 thz0Var, Context context) {
        this.b = context;
        this.a = thz0Var;
    }

    public final t5z0 a(tez0 tez0Var, pbz0 pbz0Var, pbz0.a aVar, pbz0 pbz0Var2, pbz0 pbz0Var3) {
        boolean isEmpty = tez0Var.b0.isEmpty();
        Context context = this.b;
        if (!isEmpty && tez0Var.P) {
            return new dly0(context, pbz0Var, pbz0Var3, pbz0Var2);
        }
        if (!tez0Var.b0.isEmpty()) {
            return new bly0(pbz0Var, pbz0Var2, context);
        }
        if (tez0Var.c0 == null || aVar == null) {
            return new qqy0(new mzy0(context), new fbz0(context), new m0z0(context), null, pbz0Var, this.b);
        }
        mzy0 mzy0Var = new mzy0(context);
        fbz0 fbz0Var = new fbz0(context);
        dvy0 dvy0Var = new dvy0(context);
        return new x4z0(mzy0Var, fbz0Var, new cez0(kqz0.a(dvy0Var.getContext(), this.c), dvy0Var, context, aVar), null, pbz0Var, aVar, this.b);
    }
}
