package xsna;

import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vkontakte.android.R;
import java.util.List;
import xsna.sga;

/* compiled from: CatalogSectionScreenViewStateMapper.kt */
/* loaded from: classes16.dex */
public final class xfa implements izs<CatalogSectionScreenState, wfa> {
    public final tga b;

    public xfa(tga tgaVar) {
        this.b = tgaVar;
    }

    @Override // xsna.izs
    public final wfa invoke(CatalogSectionScreenState catalogSectionScreenState) {
        sga sgaVar;
        CatalogSectionScreenState catalogSectionScreenState2 = catalogSectionScreenState;
        List<CatalogButtonDo> list = catalogSectionScreenState2.d;
        CatalogSectionState catalogSectionState = catalogSectionScreenState2.b;
        if (catalogSectionState == null || (sgaVar = this.b.a(catalogSectionState)) == null) {
            Throwable th = catalogSectionScreenState2.e;
            if (th != null) {
                j03.a.getClass();
                sgaVar = new sga.c(tq.h(tlo0.Companion, R.string.vk_common_retry), j03.h(th));
            } else {
                sgaVar = sga.d.b;
            }
        }
        sga sgaVar2 = sgaVar;
        String str = catalogSectionScreenState2.c;
        CatalogButtonDo catalogButtonDo = (CatalogButtonDo) j5g.b0(0, list);
        e7a a = catalogButtonDo != null ? f7a.a(catalogButtonDo) : null;
        CatalogButtonDo catalogButtonDo2 = (CatalogButtonDo) j5g.b0(1, list);
        e7a a2 = catalogButtonDo2 != null ? f7a.a(catalogButtonDo2) : null;
        CatalogButtonDo catalogButtonDo3 = (CatalogButtonDo) j5g.b0(2, list);
        return new wfa(sgaVar2, str, a, a2, catalogButtonDo3 != null ? f7a.a(catalogButtonDo3) : null);
    }
}
