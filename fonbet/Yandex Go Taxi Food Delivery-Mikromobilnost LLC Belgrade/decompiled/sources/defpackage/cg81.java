package defpackage;

import java.util.LinkedHashMap;
import yads.zp1;

/* loaded from: classes7.dex */
public final class cg81 {
    public static hn71 a(zp1 zp1Var) {
        hn71 hn71Var = new hn71(2, new LinkedHashMap());
        String str = zp1Var.b;
        hn71Var.r(str, "adapter");
        hn71Var.r(zp1Var.c, "adapter_parameters");
        CharSequence charSequence = (CharSequence) zp1Var.c.get("bidding_data");
        boolean z = false;
        hn71Var.r(Boolean.valueOf(!(charSequence == null || evu0.J(charSequence))), "mediation_bidder");
        if (evu0.y(str, "LevelPlay", true)) {
            try {
                Class.forName("com.yandex.ads.mobile.ads.mediation.extras.BuildConfig");
                z = true;
            } catch (ClassNotFoundException unused) {
            }
            hn71Var.r(Boolean.valueOf(z), "has_extras");
        }
        return hn71Var;
    }
}
