package xsna;

import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import java.util.List;

/* compiled from: CommunitiesCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class tng extends w060 {
    @Override // xsna.w060
    public final List<UIBlock> z0(bi20 bi20Var, UIBlockBadge uIBlockBadge, List<? extends UIBlockAction> list) {
        CatalogBadge catalogBadge;
        int i;
        if (uIBlockBadge != null && (catalogBadge = uIBlockBadge.y) != null && epx.f(catalogBadge.c, "prominent")) {
            ysg0<awd0> ysg0Var = o1e0.a;
            String str = catalogBadge.b;
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(str);
            } catch (Throwable unused) {
                i = 0;
            }
            ysg0Var.a(new i8q0(i));
        }
        return super.z0(bi20Var, uIBlockBadge, list);
    }
}
