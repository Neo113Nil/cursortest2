package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class z02 {
    public final l42 a;
    public final qz1 b;

    public z02(l42 l42Var, qz1 qz1Var) {
        this.a = l42Var;
        this.b = qz1Var;
    }

    public final pz1 a(Context context, sz1 sz1Var, nj2 nj2Var, rz1 rz1Var, y02 y02Var, g02 g02Var, gz1 gz1Var) {
        if (gz1Var == null) {
            return null;
        }
        l42 l42Var = this.a;
        dr2 dr2Var = gz1Var.a;
        l42Var.getClass();
        int ordinal = dr2Var.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        o02 o02Var = l42Var.a;
        l82 a = y02Var.c.a(gz1Var);
        jx0 jx0Var = new jx0();
        a93 a93Var = rz1Var.a;
        List list = gz1Var.h;
        List list2 = sz1Var.a.g;
        a93Var.getClass();
        ArrayList a2 = a93.a(list, list2);
        a93 a93Var2 = rz1Var.a;
        List list3 = gz1Var.g;
        List list4 = sz1Var.a.c;
        a93Var2.getClass();
        ArrayList a3 = a93.a(list3, list4);
        List list5 = gz1Var.b;
        n82 n82Var = new n82(list5, a2, a3, gz1Var.c, gz1Var.f, gz1Var.i);
        qz1 qz1Var = this.b;
        va vaVar = va.b;
        qz1Var.getClass();
        i32 a4 = h32.a();
        oz1 oz1Var = new oz1(list5, a4);
        up upVar = new up(sz1Var, new l22(oz1Var, sz1Var.b), n82Var, a, y02Var, new a6(jx0Var), new u22(context, oz1Var, a4), qz1Var.a, gz1Var, vaVar);
        t12 t12Var = new t12(context, gz1Var, nj2Var, a);
        o02Var.getClass();
        return new pz1(context, gz1Var, t12Var, nj2Var, upVar, g02Var);
    }

    public /* synthetic */ z02(ov2 ov2Var) {
        this(new l42(), new qz1(ov2Var));
    }
}
