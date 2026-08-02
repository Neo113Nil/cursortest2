package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.ui.core.cache.CatalogCacheEntry;
import com.vk.catalog2.common.ui.core.cache.CatalogCatalogCacheEntry;
import com.vk.catalog2.common.ui.core.cache.CatalogSectionCacheEntry;
import com.vk.core.serialize.Serializer;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CatalogSerializerCache.kt */
/* loaded from: classes16.dex */
public class vga implements w2a {
    public final String a;

    /* compiled from: CatalogSerializerCache.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<CatalogCacheEntry, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCacheEntry catalogCacheEntry) {
            CatalogCacheEntry catalogCacheEntry2 = catalogCacheEntry;
            ((vga) this.receiver).getClass();
            return new hda(catalogCacheEntry2.b, catalogCacheEntry2.c, null);
        }
    }

    public vga(String str) {
        this.a = str;
    }

    @Override // xsna.w2a
    public io.reactivex.rxjava3.core.q<hda> a() {
        return wmi0.a.h(this.a).U(new r41(new a(1, this, vga.class, "toCatalogResponse", "toCatalogResponse(Lcom/vk/catalog2/common/ui/core/cache/CatalogCacheEntry;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 10));
    }

    @Override // xsna.w2a
    public final void b(hda hdaVar) {
        Serializer.StreamParcelableAdapter catalogSectionCacheEntry;
        wmi0 wmi0Var = wmi0.a;
        Object obj = hdaVar.a;
        CatalogExtendedData catalogExtendedData = hdaVar.b;
        if (obj instanceof CatalogCatalog) {
            catalogSectionCacheEntry = new CatalogCatalogCacheEntry((CatalogCatalog) obj, catalogExtendedData, 0L, 4, null);
        } else {
            if (!(obj instanceof CatalogSection)) {
                throw new RuntimeException("Unknown item <" + obj.getClass().getCanonicalName() + "> in CatalogResponse, please add new CatalogCacheEntry for this type!");
            }
            catalogSectionCacheEntry = new CatalogSectionCacheEntry((CatalogSection) obj, catalogExtendedData, 0L, 4, null);
        }
        wmi0Var.a(this.a, catalogSectionCacheEntry);
    }

    @Override // xsna.w2a
    public final void clear() {
        wmi0.a.c(this.a);
    }
}
