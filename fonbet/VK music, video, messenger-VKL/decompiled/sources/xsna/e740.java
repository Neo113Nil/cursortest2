package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.ui.core.cache.CatalogCacheEntry;
import com.vk.catalog2.common.ui.core.cache.CatalogCatalogCacheEntry;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MultikeyCatalogSerializerCache.kt */
/* loaded from: classes16.dex */
public final class e740 implements d740 {
    public final String a;
    public final long b;
    public final io.reactivex.rxjava3.core.w c;
    public final hov d;

    /* compiled from: MultikeyCatalogSerializerCache.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<CatalogCacheEntry, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCacheEntry catalogCacheEntry) {
            CatalogCacheEntry catalogCacheEntry2 = catalogCacheEntry;
            ((e740) this.receiver).getClass();
            return new hda(catalogCacheEntry2.b, catalogCacheEntry2.c, null);
        }
    }

    public e740(long j, io.reactivex.rxjava3.core.w wVar) {
        wmi0 wmi0Var = wmi0.a;
        this.a = "video-catalog-cache";
        this.b = j;
        this.c = wVar;
        this.d = wmi0Var;
    }

    @Override // xsna.d740
    public final void a(String str) {
        this.d.c(d(str));
    }

    @Override // xsna.d740
    public final io.reactivex.rxjava3.core.q<hda> b(String str) {
        return this.d.b(d(str), this.c).L(new vj0(new f410(this, 8), 29), false).U(new t34(new a(1, this, e740.class, "toCatalogResponse", "toCatalogResponse(Lcom/vk/catalog2/common/ui/core/cache/CatalogCacheEntry;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 21));
    }

    @Override // xsna.d740
    public final void c(String str, hda hdaVar) {
        String d = d(str);
        Object obj = hdaVar.a;
        CatalogExtendedData catalogExtendedData = hdaVar.b;
        if (obj instanceof CatalogCatalog) {
            this.d.a(d, new CatalogCatalogCacheEntry((CatalogCatalog) obj, catalogExtendedData, 0L, 4, null));
        } else {
            throw new RuntimeException("Unknown item <" + obj.getClass().getCanonicalName() + "> in CatalogResponse, please add new CatalogCacheEntry for this type!");
        }
    }

    public final String d(String str) {
        return this.a + '-' + str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultikeyCatalogSerializerCache(baseKey='");
        sb.append(this.a);
        sb.append("', expirationTimeMillis=");
        return vu5.a(')', this.b, sb);
    }
}
