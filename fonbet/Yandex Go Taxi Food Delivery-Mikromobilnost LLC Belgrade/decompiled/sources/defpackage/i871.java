package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.im2;
import yads.jk3;
import yads.s83;
import yads.x3;

/* loaded from: classes7.dex */
public final class i871 implements k771 {
    public final pf71 a;
    public final lm71 b;
    public final hl71 c;
    public final dn71 w;

    public i871() {
        za81 za81Var = new za81();
        hl71 hl71Var = new hl71();
        dn71 dn71Var = new dn71();
        this.a = new pf71();
        this.b = new lm71(9, za81Var);
        this.c = hl71Var;
        this.w = dn71Var;
    }

    @Override // defpackage.k771
    public final zj71 a(Object obj) {
        fe81 fe81Var = (fe81) obj;
        hn71 hn71Var = new hn71(2, new HashMap());
        nl61 nl61Var = fe81Var.e;
        if (nl61Var != null) {
            hn71Var = fga1.a(hn71Var, this.a.a(nl61Var));
        }
        hn71Var.r(fe81Var.c.a, "ad_unit_id");
        hn71Var.r(fe81Var.a.b, "ad_type");
        a271 a271Var = fe81Var.d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            hn71Var.r(jd81Var.a.b, "size_type");
            hn71Var.r(Integer.valueOf(jd81Var.b), "width");
            hn71Var.r(Integer.valueOf(jd81Var.c), "height");
        }
        hn71Var.r(Boolean.valueOf(fe81Var.g == s83.c), "is_passback");
        hn71Var.r(Boolean.valueOf(fe81Var.m), "image_loading_automatically");
        List list = (List) fe81Var.b.w;
        if (!list.isEmpty()) {
            hn71Var.r(list, "image_sizes");
        }
        return new zj71("ad_request", new LinkedHashMap((Map) hn71Var.b), (no61) hn71Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    @Override // defpackage.k771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zj71 b(km81 km81Var, int i, Object obj, jk3 jk3Var) {
        String str;
        im2 im2Var;
        d881 d881Var;
        fe81 fe81Var = (fe81) obj;
        za81 za81Var = (za81) this.b.b;
        String str2 = null;
        d881 d881Var2 = km81Var != null ? (d881) km81Var.a : null;
        hn71 d = za81Var.a.d(fe81Var, d881Var2, d881Var2 != null ? (qb71) d881Var2.q : null);
        a271 a271Var = fe81Var.d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            d.r(jd81Var.a.b, "size_type");
            d.r(Integer.valueOf(jd81Var.b), "width");
            d.r(Integer.valueOf(jd81Var.c), "height");
        }
        d.r(Integer.valueOf(i), i == -1 ? "error_code" : AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (km81Var != null && (d881Var = (d881) km81Var.a) != null) {
            if (d881Var.o != null) {
                str = "mediation";
            } else if (d881Var.q != null) {
                str = "ad";
            }
            d.r(str, "response_type");
            if (km81Var != null) {
                d881 d881Var3 = (d881) km81Var.a;
                d.c = d881Var3 != null ? d881Var3.i : null;
            }
            d881 d881Var4 = km81Var == null ? (d881) km81Var.a : null;
            if (204 != i) {
                im2Var = im2.e;
            } else if (d881Var4 == null || i != 200) {
                im2Var = im2.d;
            } else {
                this.c.getClass();
                qb71 qb71Var = (qb71) d881Var4.q;
                im2Var = qb71Var != null ? (im2) qb71Var.e.get(ACSPConstants.STATUS) : d881Var4.o == null ? im2.d : null;
            }
            if (im2Var != null) {
                d.r(im2Var.b, ACSPConstants.STATUS);
            }
            if (jk3Var != null) {
                this.w.getClass();
                if (jk3Var instanceof x3) {
                    str2 = l8a1.b(fe81Var, ((x3) jk3Var).c).b;
                }
            }
            d.j(str2, "error_description");
            return new zj71("ad_response", new LinkedHashMap((Map) d.b), (no61) d.c);
        }
        str = "empty";
        d.r(str, "response_type");
        if (km81Var != null) {
        }
        if (km81Var == null) {
        }
        if (204 != i) {
        }
        if (im2Var != null) {
        }
        if (jk3Var != null) {
        }
        d.j(str2, "error_description");
        return new zj71("ad_response", new LinkedHashMap((Map) d.b), (no61) d.c);
    }
}
