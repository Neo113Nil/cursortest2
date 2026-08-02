package defpackage;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$DisplayBanners;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.models.api.response.i7;
import com.yandex.go.taxi.order.models.api.response.o7;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class hup0 extends lnt {
    public static final hup0 f = new hup0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i7.INSTANCE.serializer(), qoi0.a(i7.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "search_type";
    }

    @Override // defpackage.h9
    public final List f() {
        SearchOverlayType searchOverlayType = SearchOverlayType.UBER_LONG_SEARCH;
        o7 o7Var = SearchInfoResponse$TaxiSearch.Companion;
        f9 f9Var = new f9((String) h().invoke(searchOverlayType), o7Var.serializer(), qoi0.a(SearchInfoResponse$TaxiSearch.class));
        SearchOverlayType searchOverlayType2 = SearchOverlayType.SEARCH_CARS_OVERLAY_STRATEGY;
        f9 f9Var2 = new f9((String) h().invoke(searchOverlayType2), o7Var.serializer(), qoi0.a(SearchInfoResponse$TaxiSearch.class));
        SearchOverlayType searchOverlayType3 = SearchOverlayType.FAST;
        f9 f9Var3 = new f9((String) h().invoke(searchOverlayType3), o7Var.serializer(), qoi0.a(SearchInfoResponse$TaxiSearch.class));
        SearchOverlayType searchOverlayType4 = SearchOverlayType.ORDINARY;
        f9 f9Var4 = new f9((String) h().invoke(searchOverlayType4), o7Var.serializer(), qoi0.a(SearchInfoResponse$TaxiSearch.class));
        SearchOverlayType searchOverlayType5 = SearchOverlayType.LONG;
        f9 f9Var5 = new f9((String) h().invoke(searchOverlayType5), o7Var.serializer(), qoi0.a(SearchInfoResponse$TaxiSearch.class));
        SearchOverlayType searchOverlayType6 = SearchOverlayType.DISPLAY_BANNERS;
        f9 f9Var6 = new f9((String) h().invoke(searchOverlayType6), SearchInfoResponse$DisplayBanners.Companion.serializer(), qoi0.a(SearchInfoResponse$DisplayBanners.class));
        SearchOverlayType searchOverlayType7 = SearchOverlayType.SEARCH_COMPANIONS;
        f9 f9Var7 = new f9((String) h().invoke(searchOverlayType7), SearchInfoResponse$CompanionsSearch.Companion.serializer(), qoi0.a(SearchInfoResponse$CompanionsSearch.class));
        SearchOverlayType searchOverlayType8 = SearchOverlayType.QUEUE;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, f9Var7, new f9((String) h().invoke(searchOverlayType8), SearchInfoResponse$QueueSearch.Companion.serializer(), qoi0.a(SearchInfoResponse$QueueSearch.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return SearchOverlayType.Companion.serializer();
    }
}
