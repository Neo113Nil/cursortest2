package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogSearchRequestFactory;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoCatalogSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class x9s0 extends FunctionReferenceImpl implements izs<hda, hda> {
    @Override // xsna.izs
    public final hda invoke(hda hdaVar) {
        hda hdaVar2 = hdaVar;
        ((VideoCatalogSearchRequestFactory) this.receiver).getClass();
        CatalogSection Ab = ((CatalogCatalog) hdaVar2.a).Ab();
        return Ab == null ? hdaVar2 : new hda(Ab, hdaVar2.b, Ab.e);
    }
}
