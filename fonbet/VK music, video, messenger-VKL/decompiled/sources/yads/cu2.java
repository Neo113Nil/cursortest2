package yads;

import android.content.Context;
import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.j5g;
import xsna.jgp;
import xsna.on00;

/* loaded from: classes10.dex */
public final class cu2 {
    public final d4 a;
    public final ov2 b;
    public final n9 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cu2(d4 d4Var, ov2 ov2Var) {
        this(d4Var, ov2Var, r0);
        n9 n9Var = new n9();
        new br2();
        new n9();
        new wy();
    }

    public final void a(Context context, v9 v9Var, dp2 dp2Var, gp2 gp2Var) {
        gz1 gz1Var;
        dr2 dr2Var;
        gp2 a = this.c.a(this.a.e);
        a.b(v9Var.e, "ad_unit_id");
        String str = cp2.a;
        a.b(str, O6.G1);
        e00 e00Var = v9Var.a;
        a.b(e00Var != null ? e00Var.b : null, "ad_type");
        e22 e22Var = (e22) v9Var.t;
        if (e22Var != null) {
            List list = e22Var.a;
            String str2 = (list == null || (gz1Var = (gz1) j5g.a0(list)) == null || (dr2Var = gz1Var.a) == null) ? null : dr2Var.b;
            if (str2 == null) {
                str2 = "";
            }
            a.b(str2, "native_ad_type");
        }
        a.b(v9Var.l, "ad_source");
        gp2 a2 = hp2.a(a, gp2Var);
        Map map = a2.a;
        c cVar = a2.b;
        String str3 = dp2Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        fp2 fp2Var = new fp2(str3, linkedHashMap, cVar);
        ((mv3) this.b).getClass();
        tv3 tv3Var = tv3.a;
        cf.a(context, new gr3(((mv3) this.b).a)).a(fp2Var);
        new we(context).a(dp2Var, linkedHashMap, str, null);
    }

    public cu2(d4 d4Var, ov2 ov2Var, n9 n9Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = n9Var;
    }

    public final void a(Context context, v9 v9Var, e32 e32Var) {
        Map map;
        gp2 gp2Var = new gp2((Map) null, 3);
        if (e32Var != null) {
            List list = e32Var.a.b.c;
            List list2 = list.isEmpty() ? null : list;
            if (list2 != null) {
                map = on00.f(new Pair("image_sizes", j5g.O0(list2)));
            } else {
                map = jgp.b;
            }
            gp2Var.a.putAll(map);
        }
        a(context, v9Var, dp2.g, gp2Var);
    }

    public final void a(Context context, v9 v9Var, f32 f32Var) {
        gp2 gp2Var = new gp2((Map) null, 3);
        ep2 ep2Var = ep2.c;
        gp2Var.b("success", "status");
        a(context, v9Var, dp2.h, gp2Var);
    }
}
