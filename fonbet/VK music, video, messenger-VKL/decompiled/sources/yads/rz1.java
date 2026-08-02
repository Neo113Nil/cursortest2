package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class rz1 {
    public final a93 a;
    public final m42 b;
    public final w13 c;

    public /* synthetic */ rz1(ov2 ov2Var) {
        this(new a93(), new m42(ov2Var), new w13(ov2Var));
    }

    public final w32 a(Context context, sz1 sz1Var, nj2 nj2Var, y02 y02Var, g02 g02Var) {
        sz1 sz1Var2 = sz1Var;
        jx0 jx0Var = new jx0();
        m42 m42Var = this.b;
        m42Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<gz1> list = sz1Var2.a.a;
        y02 y02Var2 = y02Var;
        m82 m82Var = y02Var2.c;
        for (gz1 gz1Var : list) {
            l82 a = m82Var.a(gz1Var);
            t12 t12Var = new t12(context, gz1Var, nj2Var, a);
            db dbVar = m42Var.b;
            a93 a93Var = dbVar.a;
            List list2 = gz1Var.h;
            a93Var.getClass();
            ArrayList a2 = a93.a(list2, null);
            a93 a93Var2 = dbVar.a;
            List list3 = gz1Var.g;
            a93Var2.getClass();
            ArrayList a3 = a93.a(list3, null);
            List list4 = gz1Var.b;
            n82 n82Var = new n82(list4, a2, a3, gz1Var.c, gz1Var.f, gz1Var.i);
            qz1 qz1Var = m42Var.c;
            va vaVar = va.d;
            qz1Var.getClass();
            i32 a4 = h32.a();
            ArrayList arrayList2 = arrayList;
            oz1 oz1Var = new oz1(list4, a4);
            m82 m82Var2 = m82Var;
            up upVar = new up(sz1Var2, new l22(oz1Var, sz1Var2.b), n82Var, a, y02Var2, new a6(jx0Var), new u22(context, oz1Var, a4), qz1Var.a, gz1Var, vaVar);
            sz1 sz1Var3 = sz1Var2;
            l42 l42Var = m42Var.a;
            dr2 dr2Var = gz1Var.a;
            l42Var.getClass();
            int ordinal = dr2Var.ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (l42Var.a != null) {
                arrayList2.add(new pz1(context, gz1Var, t12Var, nj2Var, upVar, g02Var));
                y02Var2 = y02Var;
                sz1Var2 = sz1Var3;
                arrayList = arrayList2;
                m82Var = m82Var2;
            } else {
                y02Var2 = y02Var;
                sz1Var2 = sz1Var3;
                m82Var = m82Var2;
                arrayList = arrayList2;
            }
        }
        sz1 sz1Var4 = sz1Var2;
        v32 v32Var = new v32(arrayList);
        w13 w13Var = this.c;
        mb mbVar = w13Var.b;
        mbVar.getClass();
        e22 e22Var = sz1Var4.a;
        List list5 = e22Var.b;
        a93 a93Var3 = mbVar.a;
        List list6 = e22Var.g;
        a93Var3.getClass();
        ArrayList a5 = a93.a(null, list6);
        a93 a93Var4 = mbVar.a;
        List list7 = e22Var.c;
        a93Var4.getClass();
        n82 n82Var2 = new n82(list5, a5, a93.a(null, list7), "ad_unit", e22Var.d, null);
        i32 a6 = h32.a();
        oz1 oz1Var2 = new oz1(list5, a6);
        return new w32(context, v32Var, nj2Var, new up(sz1Var, new z13(v32Var, oz1Var2, gx2.a(), sz1Var4.b), n82Var2, new a23(list5), y02Var, new lb(jx0Var), new u22(context, oz1Var2, a6), w13Var.a, null, va.c), g02Var);
    }

    public rz1(a93 a93Var, m42 m42Var, w13 w13Var) {
        this.a = a93Var;
        this.b = m42Var;
        this.c = w13Var;
    }
}
