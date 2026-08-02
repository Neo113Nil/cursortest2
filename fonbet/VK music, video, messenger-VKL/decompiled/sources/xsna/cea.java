package xsna;

import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;

/* compiled from: CatalogSectionFactory.kt */
/* loaded from: classes16.dex */
public interface cea {
    static /* synthetic */ tda a(cea ceaVar, CatalogSearchStatInfo catalogSearchStatInfo, int i) {
        if ((i & 1) != 0) {
            catalogSearchStatInfo = null;
        }
        return ceaVar.f(catalogSearchStatInfo, (i & 4) != 0);
    }

    mm50<CatalogSectionState, yda, bea> b(CatalogSectionParams catalogSectionParams, s0a s0aVar, gzs<CatalogSectionState> gzsVar);

    uga c();

    rga createView();

    q4a d();

    v0a e(tda tdaVar);

    uda f(CatalogSearchStatInfo catalogSearchStatInfo, boolean z);

    dga g(tda tdaVar);
}
