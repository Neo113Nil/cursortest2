package yads;

import com.ironsource.O6;
import com.ironsource.adapters.bigo.BigoConstants;
import java.util.LinkedHashMap;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class ks1 {
    public static gp2 a(rr1 rr1Var) {
        gp2 gp2Var = new gp2(new LinkedHashMap(), 2);
        String str = rr1Var.b;
        gp2Var.b(str, O6.G1);
        gp2Var.b(rr1Var.c, "adapter_parameters");
        CharSequence charSequence = (CharSequence) rr1Var.c.get("bidding_data");
        boolean z = false;
        gp2Var.b(Boolean.valueOf(!(charSequence == null || drm0.N(charSequence))), "mediation_bidder");
        if (drm0.D(str, BigoConstants.MEDIATION_NAME, true)) {
            try {
                Class.forName("com.yandex.ads.mobile.ads.mediation.extras.BuildConfig");
                z = true;
            } catch (ClassNotFoundException unused) {
            }
            gp2Var.b(Boolean.valueOf(z), "has_extras");
        }
        return gp2Var;
    }
}
