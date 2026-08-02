package yads;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class br2 {
    public final hr2 a;
    public final h22 b;

    public /* synthetic */ br2() {
        this(new hr2(), new h22());
    }

    public final gp2 a(v9 v9Var, d4 d4Var) {
        String str;
        String str2;
        String str3;
        Map map;
        e00 e00Var;
        gp2 gp2Var = new gp2(new LinkedHashMap(), 2);
        if (v9Var == null || !v9Var.y) {
            gp2Var.b(v9Var != null ? v9Var.b : null, "ad_type_format");
            gp2Var.b(v9Var != null ? v9Var.d : null, "product_type");
        }
        if (v9Var == null || (str = v9Var.e) == null) {
            str = d4Var.c.a;
        }
        gp2Var.b(str, "ad_unit_id");
        gp2Var.b(v9Var != null ? v9Var.l : null, "ad_source");
        if (v9Var == null || (e00Var = v9Var.a) == null || (str2 = e00Var.b) == null) {
            str2 = d4Var.a.b;
        }
        gp2Var.b(str2, "ad_type");
        gp2Var.a(v9Var != null ? v9Var.k : null, "design");
        List list = v9Var != null ? v9Var.h : null;
        if (list != null && (!list.isEmpty())) {
            gp2Var.a.put("active_experiments", list);
        }
        gp2Var.a(v9Var != null ? v9Var.o : null, "server_log_id");
        this.a.getClass();
        if ((v9Var != null ? v9Var.q : null) != null) {
            str3 = "mediation";
        } else {
            str3 = (v9Var != null ? v9Var.t : null) != null ? "ad" : "empty";
        }
        gp2Var.b(str3, CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE);
        if (v9Var != null && (map = v9Var.u) != null) {
            gp2Var.a.putAll(map);
        }
        gp2Var.b = v9Var != null ? v9Var.i : null;
        return gp2Var;
    }

    public final gp2 b(v9 v9Var, d4 d4Var) {
        List list;
        gp2 a = a(v9Var, d4Var);
        e22 e22Var = v9Var != null ? (e22) v9Var.t : null;
        if (e22Var != null) {
            this.b.getClass();
            list = h22.b(e22Var);
        } else {
            list = EmptyList.b;
        }
        a.b(j5g.a0(list), "ad_id");
        a.b(list.isEmpty() ? null : list, "ad_ids");
        return a;
    }

    public br2(hr2 hr2Var, h22 h22Var) {
        this.a = hr2Var;
        this.b = h22Var;
    }
}
