package xsna;

import android.view.View;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.superapp.SuperAppFeatures;
import java.util.Map;

/* compiled from: SuperAppCatalogBridgeImpl.kt */
/* loaded from: classes6.dex */
public final class t7n0 implements s7n0 {
    @Override // xsna.s7n0
    public final void a(View view) {
        bwt0.j(view, new h57(25, view, HintId.INFO_SUPERAPP_IM_INTEGRATION_CATALOG_ONBOARDING));
    }

    @Override // xsna.s7n0
    public final boolean b() {
        return pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_CATALOG_ONBOARDING);
    }

    @Override // xsna.s7n0
    public final Integer c() {
        Map<String, String> map;
        String str;
        int i;
        Hint p = pla.e().b().p(HintId.INFO_SUPERAPP_IM_INTEGRATION_CATALOG_ONBOARDING.getId());
        if (p == null || (map = p.e) == null || (str = map.get("app_action_section_index_android")) == null) {
            return null;
        }
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // xsna.s7n0
    public final String d() {
        return k720.a.a(SuperAppFeatures.RequestName.GET_MINI_APPS_CATALOG);
    }

    @Override // xsna.s7n0
    public final String e() {
        Map<String, String> map;
        Hint p = pla.e().b().p(HintId.INFO_SUPERAPP_IM_INTEGRATION_CATALOG_ONBOARDING.getId());
        if (p == null || (map = p.e) == null) {
            return null;
        }
        return map.get("main_footer_text");
    }

    @Override // xsna.s7n0
    public final void f(View view) {
        bwt0.j(view, new h57(25, view, HintId.INFO_MINI_APPS_CATALOG_SECTION_WITH_BADGES));
    }

    @Override // xsna.s7n0
    public final void g() {
        Hint p = pla.e().b().p(HintId.INFO_SUPERAPP_IM_INTEGRATION_CATALOG_ONBOARDING.getId());
        if (p != null) {
            pla.e().b().s(p);
        }
    }
}
