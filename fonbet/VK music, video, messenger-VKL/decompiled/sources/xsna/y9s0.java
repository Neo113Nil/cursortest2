package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogSearchRequestFactory;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoCatalogSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class y9s0 extends FunctionReferenceImpl implements izs<hda, hda> {
    @Override // xsna.izs
    public final hda invoke(hda hdaVar) {
        List<CatalogSection> list;
        hda hdaVar2 = hdaVar;
        final VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory = (VideoCatalogSearchRequestFactory) this.receiver;
        videoCatalogSearchRequestFactory.getClass();
        Object obj = hdaVar2.a;
        CatalogSection catalogSection = null;
        CatalogSection catalogSection2 = obj instanceof CatalogSection ? (CatalogSection) obj : null;
        if (catalogSection2 == null) {
            CatalogCatalog catalogCatalog = obj instanceof CatalogCatalog ? (CatalogCatalog) obj : null;
            if (catalogCatalog != null && (list = catalogCatalog.b) != null) {
                catalogSection = (CatalogSection) j5g.a0(list);
            }
            if (catalogSection == null) {
                return hdaVar2;
            }
            catalogSection2 = catalogSection;
        }
        catalogSection2.i.replaceAll(new UnaryOperator() { // from class: xsna.w9s0
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                CatalogBlock catalogBlock = (CatalogBlock) obj2;
                CatalogLayout catalogLayout = catalogBlock.i;
                if (catalogBlock.c != CatalogDataType.DATA_TYPE_VIDEO_VIDEOS || catalogLayout.b != CatalogViewType.SLIDER || catalogLayout.c.b == 0) {
                    return catalogBlock;
                }
                String h = VideoCatalogViewStyle.Style.AuthorVideos.h();
                VideoCatalogSearchRequestFactory.this.getClass();
                Bundle bundle = catalogLayout.h;
                bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), h);
                s3q0 s3q0Var = s3q0.a;
                return CatalogBlock.zb(catalogBlock, null, CatalogLayout.zb(catalogLayout, null, bundle, 1), null, 2097023);
            }
        });
        return hdaVar2;
    }
}
