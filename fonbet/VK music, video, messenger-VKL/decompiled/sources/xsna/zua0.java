package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayMix;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.dto.common.id.UserId;

/* compiled from: PlayMixButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class zua0 {
    public static final UIBlockPlayMixAction a(CatalogButton catalogButton, bi20 bi20Var) {
        CatalogButtonPlayMix catalogButtonPlayMix = (CatalogButtonPlayMix) catalogButton;
        String str = catalogButtonPlayMix.n;
        CatalogViewType catalogViewType = CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX;
        if (!epx.f(str, catalogViewType.getId())) {
            catalogViewType = CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX_BLURRED;
            if (!epx.f(str, catalogViewType.getId())) {
                catalogViewType = CatalogViewType.SYNTHETIC_ACTION_PLAY_MIX;
            }
        }
        return new UIBlockPlayMixAction(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.c(catalogViewType), null, null, null, null, UserId.d, null, 8159), catalogButtonPlayMix.h, catalogButtonPlayMix.i, catalogButtonPlayMix.j, catalogButtonPlayMix.k, catalogButtonPlayMix.o, new UIBlockPlayMixAction.a(catalogButtonPlayMix.l, catalogButtonPlayMix.m, catalogButtonPlayMix.f, catalogButtonPlayMix.g, bi20Var.i), bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
    }
}
