package xsna;

import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: FriendsNestedListTransformer.kt */
/* loaded from: classes16.dex */
public final class jrs extends w060 {
    @Override // xsna.w060
    public final List<UIBlock> z0(bi20 bi20Var, UIBlockBadge uIBlockBadge, List<? extends UIBlockAction> list) {
        Object obj;
        List<UIBlock> z0 = super.z0(bi20Var, uIBlockBadge, list);
        Iterator it = ((ArrayList) z0).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            UIBlock uIBlock = (UIBlock) obj;
            if ((uIBlock instanceof UIBlockActionShowFilters) && uIBlock.d == CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES) {
                break;
            }
        }
        UIBlockActionShowFilters uIBlockActionShowFilters = obj instanceof UIBlockActionShowFilters ? (UIBlockActionShowFilters) obj : null;
        if (uIBlockActionShowFilters != null) {
            Object Y = j5g.Y(z0);
            UIBlockHeader uIBlockHeader = Y instanceof UIBlockHeader ? (UIBlockHeader) Y : null;
            if (uIBlockHeader != null) {
                return Collections.singletonList(new UIBlockHeader(new com.vk.catalog2.common.dto.api.ui.a(uIBlockHeader.b, uIBlockHeader.c, uIBlockHeader.d, uIBlockHeader.e, uIBlockHeader.f, uIBlockHeader.g, uIBlockHeader.h, uIBlockHeader.Db(), uIBlockHeader.j, uIBlockHeader.l, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168), uIBlockHeader.y, uIBlockHeader.z, uIBlockHeader.B, new mwp0(uIBlockHeader.C, uIBlockHeader.D, uIBlockHeader.E, uIBlockHeader.F, uIBlockHeader.G, uIBlockHeader.H, uIBlockHeader.I, uIBlockHeader.J, uIBlockHeader.K, uIBlockActionShowFilters), uIBlockHeader.A, uIBlockHeader.M));
            }
        }
        return z0;
    }
}
