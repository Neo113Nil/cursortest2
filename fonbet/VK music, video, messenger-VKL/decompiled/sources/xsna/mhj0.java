package xsna;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.search.params.api.SearchParams;

/* compiled from: ShowAllCatalogSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class mhj0 extends SearchRequestFactory {
    public String p;
    public String q;

    public mhj0(wba wbaVar) {
        super(wbaVar, (SearchRequestFactory.a) null, 6);
        this.p = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        String str2 = this.p;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1492631400:
                    if (str2.equals("video_subscriptions_filtered_by_section")) {
                        return rsg0.y0(yfb.x(wga.b(k(), str, this.q, 21)), null, null, 3).U(new i3u(new jhj0(1, j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 13));
                    }
                    break;
                case -20445853:
                    if (str2.equals("history_videos")) {
                        return rsg0.y0(yfb.x(k().q(Boolean.valueOf(this.j), str)), null, null, 3).U(new utg0(new khj0(1, j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 2));
                    }
                    break;
                case 93166550:
                    if (str2.equals("audio")) {
                        wga k = k();
                        String str3 = this.q;
                        return rsg0.y0(yfb.x(wga.i(k, str, null, null, null, null, str3 != null ? ao8.l(str3) : null, null, null, 886)), null, null, 3).U(new l340(new lhj0(1, j(), e3a.class, "mapToSingleSection", "mapToSingleSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 11));
                    }
                    break;
                case 724287026:
                    if (str2.equals("video_subscriptions")) {
                        return rsg0.y0(yfb.x(wga.b(k(), str, null, 29)), null, null, 3).U(new hhj0(new ihj0(1, j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 0));
                    }
                    break;
            }
        }
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q i(String str, boolean z) {
        return h(str, null, null, z);
    }
}
