package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.api.section.CatalogSection;

/* compiled from: CatalogResponseProcessor.kt */
/* loaded from: classes16.dex */
public abstract class ida {
    public final hda a(hda hdaVar) {
        CatalogExtendedData catalogExtendedData = hdaVar.b;
        Object obj = hdaVar.a;
        return obj instanceof CatalogCatalog ? c(hdaVar, (CatalogCatalog) obj, catalogExtendedData) : obj instanceof CatalogSection ? e(hdaVar, (CatalogSection) obj, catalogExtendedData) : obj instanceof CatalogBlock ? b(hdaVar, (CatalogBlock) obj, catalogExtendedData) : hdaVar;
    }

    public abstract hda b(hda hdaVar, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData);

    public abstract hda c(hda hdaVar, CatalogCatalog catalogCatalog, CatalogExtendedData catalogExtendedData);

    public abstract hda e(hda hdaVar, CatalogSection catalogSection, CatalogExtendedData catalogExtendedData);

    public CatalogReplacementResponse d(CatalogReplacementResponse catalogReplacementResponse) {
        return catalogReplacementResponse;
    }
}
