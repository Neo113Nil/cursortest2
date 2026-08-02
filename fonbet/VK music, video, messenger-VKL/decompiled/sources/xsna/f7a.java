package xsna;

import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vkontakte.android.R;

/* compiled from: CatalogIconButtonMapper.kt */
/* loaded from: classes16.dex */
public final class f7a {
    public static final e7a a(CatalogButtonDo catalogButtonDo) {
        Integer valueOf = epx.f(catalogButtonDo.c, CatalogLinkButtonActionDo.ClearVideoHistory.b) ? Integer.valueOf(R.drawable.vk_icon_delete_outline_28) : null;
        if (valueOf != null) {
            return new e7a(valueOf.intValue(), catalogButtonDo.b);
        }
        return null;
    }
}
