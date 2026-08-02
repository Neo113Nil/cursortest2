package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;

/* compiled from: FriendsAnalyticsBindListenerImpl.kt */
/* loaded from: classes16.dex */
public final class dks implements vls {
    public final cks a;

    public dks(cks cksVar) {
        this.a = cksVar;
    }

    @Override // xsna.vls
    public final void a(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockProfile) {
            CatalogViewType catalogViewType = uIBlock.d;
            CatalogViewType catalogViewType2 = CatalogViewType.LIST_FRIENDS_SUGGEST;
            cks cksVar = this.a;
            if (catalogViewType == catalogViewType2) {
                cksVar.c(((UIBlockProfile) uIBlock).y, null);
            }
            UIBlockProfile uIBlockProfile = (UIBlockProfile) uIBlock;
            cksVar.getClass();
            String str = uIBlockProfile.B;
            if (str != null) {
                cksVar.d(str, uIBlockProfile.b);
            }
        }
    }
}
