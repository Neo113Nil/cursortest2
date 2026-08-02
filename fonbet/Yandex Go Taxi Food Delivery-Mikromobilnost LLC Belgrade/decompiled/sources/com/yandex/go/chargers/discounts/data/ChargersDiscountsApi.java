package com.yandex.go.chargers.discounts.data;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsRequestDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsResponseDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateRequestDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateResponseDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListParams;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListResponse;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsViewedParams;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/ChargersDiscountsApi;", "", "", "", "headers", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListParams;", "params", "Lcmt;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListResponse;", "b", "(Ljava/util/Map;Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListParams;)Lcmt;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsActivateRequestDto;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsActivateResponseDto;", "c", "(Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsActivateRequestDto;)Lcmt;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountStationsRequestDto;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountStationsResponseDto;", "d", "(Ljava/util/Map;Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountStationsRequestDto;)Lcmt;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsViewedParams;", "Lzy11;", "a", "(Ljava/util/Map;Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsViewedParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersDiscountsApi {
    @s490("chargers/v1/discounts/viewed")
    cmt<zy11> a(@uau Map<String, String> headers, @q76 ChargersDiscountsViewedParams params);

    @s490("chargers/v1/discounts/list")
    cmt<ChargersDiscountsListResponse> b(@uau Map<String, String> headers, @q76 ChargersDiscountsListParams params);

    @s490("chargers/v1/promocodes/activate")
    cmt<ChargersDiscountsActivateResponseDto> c(@q76 ChargersDiscountsActivateRequestDto params);

    @s490("chargers/v1/discounts/stations")
    cmt<ChargersDiscountStationsResponseDto> d(@uau Map<String, String> headers, @q76 ChargersDiscountStationsRequestDto params);
}
