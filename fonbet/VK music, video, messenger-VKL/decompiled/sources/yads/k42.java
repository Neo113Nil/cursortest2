package yads;

import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class k42 implements tz1 {
    public final z02 a;

    public k42(z02 z02Var) {
        this.a = z02Var;
    }

    @Override // yads.tz1
    public final void a(Context context, sz1 sz1Var, nj2 nj2Var, rz1 rz1Var, y02 y02Var, g02 g02Var, i02 i02Var) {
        x12 x12Var;
        List list = sz1Var.a.a;
        if (list == null || list.isEmpty()) {
            x12Var = null;
        } else if (list.size() > 1) {
            x12Var = rz1Var.a(context, sz1Var, nj2Var, y02Var, g02Var);
        } else {
            x12Var = this.a.a(context, sz1Var, nj2Var, rz1Var, y02Var, g02Var, (gz1) list.get(0));
        }
        if (x12Var != null) {
            i02Var.a(x12Var);
        } else {
            i02Var.a(h9.a);
        }
    }

    public /* synthetic */ k42(ov2 ov2Var) {
        this(new z02(ov2Var));
    }
}
