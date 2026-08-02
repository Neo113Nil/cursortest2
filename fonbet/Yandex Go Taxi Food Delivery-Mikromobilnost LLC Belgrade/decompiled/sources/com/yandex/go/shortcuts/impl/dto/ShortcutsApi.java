package com.yandex.go.shortcuts.impl.dto;

import com.yandex.go.shortcuts.dto.request.MarkNotifyParam;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.request.ProductsScreenParam;
import com.yandex.go.shortcuts.dto.request.RouteEtaParam;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import com.yandex.go.shortcuts.dto.response.RouteEtaResponse;
import defpackage.cmt;
import defpackage.n851;
import defpackage.neu;
import defpackage.ni21;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00170\u0006j\u0002`\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00170\u0006j\u0002`\u00182\b\b\u0001\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/shortcuts/impl/dto/ShortcutsApi;", "", "", "location", "Lcom/yandex/go/shortcuts/dto/request/ProductsParam;", "productsParam", "Lcmt;", "Lcom/yandex/go/shortcuts/dto/response/ProductsResponse;", "a", "(Ljava/lang/String;Lcom/yandex/go/shortcuts/dto/request/ProductsParam;)Lcmt;", "timezoneOffset", "screenName", "Lcom/yandex/go/shortcuts/dto/request/ProductsScreenParam;", "Lcom/yandex/go/shortcuts/dto/response/ProductsScreenResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/shortcuts/dto/request/ProductsScreenParam;)Lcmt;", "Lcom/yandex/go/shortcuts/dto/request/RouteEtaParam;", "routeEtaParam", "Lcom/yandex/go/shortcuts/dto/response/RouteEtaResponse;", "c", "(Lcom/yandex/go/shortcuts/dto/request/RouteEtaParam;)Lcmt;", "Lcom/yandex/go/shortcuts/dto/request/MarkNotifyParam;", "items", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "e", "(Lcom/yandex/go/shortcuts/dto/request/MarkNotifyParam;)Lcmt;", "Lkotlinx/serialization/json/b;", "payload", "d", "(Lkotlinx/serialization/json/b;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ShortcutsApi {
    @s490("mlutp/v1/products")
    @neu({"themeable: 2"})
    cmt<ProductsResponse> a(@z8u("x-location") String location, @q76 ProductsParam productsParam);

    @n851(strategy = ObserveStrategy.ScootersDiscovery)
    @s490("mlutp/v1/products/screen/{screen_name}")
    @neu({"themeable: 2"})
    @ni21
    cmt<ProductsScreenResponse> b(@z8u("Timezone-Offset") String timezoneOffset, @pq90("screen_name") String screenName, @q76 ProductsScreenParam productsParam);

    @s490("mlutp/v1/route-matrix")
    cmt<RouteEtaResponse> c(@q76 RouteEtaParam routeEtaParam);

    @s490("mark-notify/v1")
    cmt<zy11> d(@q76 b payload);

    @s490("mark-notify/v1")
    cmt<zy11> e(@q76 MarkNotifyParam items);
}
