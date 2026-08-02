package xsna;

import com.vk.catalog2.common.dto.api.section.CatalogSection;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CatalogFriendsGetPeopleSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class q5a extends FunctionReferenceImpl implements izs<hda, hda> {
    @Override // xsna.izs
    public final hda invoke(hda hdaVar) {
        hda hdaVar2 = hdaVar;
        ((r5a) this.receiver).getClass();
        Object obj = hdaVar2.a;
        CatalogSection catalogSection = obj instanceof CatalogSection ? (CatalogSection) obj : null;
        if (catalogSection == null) {
            return hdaVar2;
        }
        catalogSection.i.replaceAll(new p5a());
        return hdaVar2;
    }
}
