package yads;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class d22 implements gq2 {
    public final n9 a;
    public final x9 b;
    public final h22 c;

    public /* synthetic */ d22() {
        this(new v52(), new h22());
    }

    @Override // yads.gq2
    public final fp2 a(Object obj) {
        d4 d4Var = (d4) obj;
        gp2 gp2Var = new gp2(new HashMap(), 2);
        g9 g9Var = d4Var.e;
        if (g9Var != null) {
            gp2Var = hp2.a(gp2Var, this.a.a(g9Var));
        }
        gp2Var.b(d4Var.c.a, "ad_unit_id");
        gp2Var.b(d4Var.a.b, "ad_type");
        e13 e13Var = d4Var.d.a;
        if (e13Var != null) {
            gp2Var.b(e13Var.b().b, "size_type");
            gp2Var.b(Integer.valueOf(e13Var.getWidth()), "width");
            gp2Var.b(Integer.valueOf(e13Var.getHeight()), "height");
            fn a = e13Var.a();
            gp2Var.a(a != null ? a.b : null, "banner_size_calculation_type");
        }
        gp2Var.b(Boolean.valueOf(d4Var.g == ub3.c), "is_passback");
        gp2Var.b(Boolean.valueOf(d4Var.m), "image_loading_automatically");
        List list = d4Var.b.c;
        if (!list.isEmpty()) {
            gp2Var.b(list, "image_sizes");
        }
        dp2 dp2Var = dp2.c;
        return new fp2("ad_request", new LinkedHashMap(gp2Var.a), gp2Var.b);
    }

    public d22(v52 v52Var, h22 h22Var) {
        this.a = new n9();
        this.b = new x9(v52Var);
        this.c = h22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    @Override // yads.gq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fp2 a(wq2 wq2Var, int i, Object obj) {
        v9 v9Var;
        String str;
        String str2;
        v9 v9Var2;
        d4 d4Var = (d4) obj;
        v52 v52Var = this.b.a;
        ep2 ep2Var = null;
        if (wq2Var != null) {
            v52Var.getClass();
            v9Var = (v9) wq2Var.a;
        } else {
            v9Var = null;
        }
        gp2 a = v52Var.a.a(v9Var, d4Var, v9Var != null ? (e22) v9Var.t : null);
        e13 e13Var = d4Var.d.a;
        if (e13Var != null) {
            a.b(e13Var.b().b, "size_type");
            a.b(Integer.valueOf(e13Var.getWidth()), "width");
            a.b(Integer.valueOf(e13Var.getHeight()), "height");
            fn a2 = e13Var.a();
            a.a(a2 != null ? a2.b : null, "banner_size_calculation_type");
        }
        if (i == -1) {
            str = "error_code";
        } else {
            str = "code";
        }
        a.b(Integer.valueOf(i), str);
        if (wq2Var != null && (v9Var2 = (v9) wq2Var.a) != null) {
            if (v9Var2.q != null) {
                str2 = "mediation";
            } else if (v9Var2.t != null) {
                str2 = "ad";
            }
            a.b(str2, CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE);
            if (wq2Var != null) {
                v9 v9Var3 = (v9) wq2Var.a;
                a.b = v9Var3 != null ? v9Var3.i : null;
            }
            v9 v9Var4 = wq2Var == null ? (v9) wq2Var.a : null;
            if (204 != i) {
                ep2Var = ep2.e;
            } else if (v9Var4 != null && i == 200) {
                this.c.getClass();
                e22 e22Var = (e22) v9Var4.t;
                if (e22Var != null) {
                    ep2Var = (ep2) e22Var.e.get("status");
                } else if (v9Var4.q == null) {
                    ep2Var = ep2.d;
                }
            } else {
                ep2Var = ep2.d;
            }
            if (ep2Var != null) {
                a.b(ep2Var.b, "status");
            }
            dp2 dp2Var = dp2.c;
            return new fp2("ad_response", new LinkedHashMap(a.a), a.b);
        }
        str2 = "empty";
        a.b(str2, CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE);
        if (wq2Var != null) {
        }
        if (wq2Var == null) {
        }
        if (204 != i) {
        }
        if (ep2Var != null) {
        }
        dp2 dp2Var2 = dp2.c;
        return new fp2("ad_response", new LinkedHashMap(a.a), a.b);
    }
}
