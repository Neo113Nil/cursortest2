package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.dto.newsfeed.entries.Digest;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kxq implements mf7 {
    public final /* synthetic */ lca b;

    @Override // xsna.mf7
    public final int e0(int i) {
        uuk uukVar = this.b.c;
        UIBlock uIBlock = (UIBlock) uukVar.c(i - 1);
        UIBlock uIBlock2 = (UIBlock) uukVar.c(i);
        boolean z = false;
        if (uIBlock2 != null) {
            CatalogViewType catalogViewType = uIBlock2.d;
            CatalogViewType catalogViewType2 = CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND;
            if (catalogViewType != catalogViewType2) {
                UIBlock uIBlock3 = (UIBlock) uukVar.c(i + 1);
                boolean z2 = (uIBlock3 != null ? uIBlock3.d : null) == catalogViewType2;
                boolean z3 = (uIBlock != null ? uIBlock.d : null) == catalogViewType2;
                boolean z4 = uIBlock2 instanceof UIBlockFeed;
                if (z4 && (((UIBlockFeed) uIBlock2).y.b instanceof Digest)) {
                    z = true;
                }
                if (!z4 || z) {
                    int i2 = z2 ? 5 : 1;
                    return z3 ? i2 | 2 : i2;
                }
                if (i > 0) {
                    return 1;
                }
                return ((UIBlockFeed) uIBlock2).y.d;
            }
        }
        return 0;
    }
}
