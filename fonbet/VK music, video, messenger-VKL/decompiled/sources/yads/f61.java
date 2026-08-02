package yads;

import android.content.Context;
import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class f61 {
    public v9 a;
    public final d4 b;
    public final j5 c;
    public final jp2 d;
    public final qu2 e;
    public final sx f;
    public final we g;
    public j32 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ f61(Context context, v9 v9Var, d4 d4Var, ov2 ov2Var, j5 j5Var) {
        this(v9Var, d4Var, j5Var, cf.a(context, r12.b()), gx2.a().a(context), new sx(), new we(context));
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
    }

    public final gp2 a(uc3 uc3Var) {
        gp2 a = a();
        a.b(uc3Var.a.b, "reason");
        String str = uc3Var.b;
        if (str != null && str.length() > 0) {
            a.b(str, "asset_name");
        }
        String str2 = uc3Var.c;
        if (str2 != null && str2.length() > 0) {
            a.b(str2, "description");
        }
        return a;
    }

    public f61(v9 v9Var, d4 d4Var, j5 j5Var, jp2 jp2Var, qu2 qu2Var, sx sxVar, we weVar) {
        this.a = v9Var;
        this.b = d4Var;
        this.c = j5Var;
        this.d = jp2Var;
        this.e = qu2Var;
        this.f = sxVar;
        this.g = weVar;
    }

    public final gp2 a() {
        gp2 a = this.f.a(this.a, this.b);
        a.b(cp2.a, O6.G1);
        e13 e13Var = this.b.d.a;
        if (e13Var != null) {
            a.b(e13Var.b().b, "size_type");
            a.b(Integer.valueOf(e13Var.getWidth()), "width");
            a.b(Integer.valueOf(e13Var.getHeight()), "height");
        }
        qu2 qu2Var = this.e;
        if (qu2Var != null) {
            a.b(qu2Var.R, "banner_size_calculation_type");
        }
        j32 j32Var = this.h;
        return j32Var != null ? hp2.a(a, j32Var.a()) : a;
    }

    public final void a(dp2 dp2Var, gp2 gp2Var) {
        Map map = gp2Var.a;
        c cVar = gp2Var.b;
        String str = dp2Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        this.d.a(new fp2(str, linkedHashMap, cVar));
        this.g.a(dp2Var, linkedHashMap, cp2.a, this.c);
    }
}
