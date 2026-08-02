package com.yandex.go.chargers.offer.data;

import com.yandex.go.chargers.offer.data.api.ChargersOfferParams;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferV2Params;
import com.yandex.go.chargers.offer.data.model.ChargersCreateOrderParams;
import com.yandex.go.chargers.offer.data.model.ChargersCreateOrderResponse;
import defpackage.cmt;
import defpackage.n851;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/offer/data/ChargersOfferApi;", "", "", "", "headers", "Lcom/yandex/go/chargers/offer/data/api/ChargersOfferParams;", "body", "Lcmt;", "Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto;", "c", "(Ljava/util/Map;Lcom/yandex/go/chargers/offer/data/api/ChargersOfferParams;)Lcmt;", "Lcom/yandex/go/chargers/offer/data/api/ChargersOfferV2Params;", "a", "(Ljava/util/Map;Lcom/yandex/go/chargers/offer/data/api/ChargersOfferV2Params;)Lcmt;", "Lcom/yandex/go/chargers/offer/data/model/ChargersCreateOrderParams;", "params", "Lcom/yandex/go/chargers/offer/data/model/ChargersCreateOrderResponse;", "b", "(Ljava/util/Map;Lcom/yandex/go/chargers/offer/data/model/ChargersCreateOrderParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersOfferApi {
    @n851
    @s490("chargers/v2/offers/create")
    cmt<ChargersOfferResponseDto> a(@uau Map<String, String> headers, @q76 ChargersOfferV2Params body);

    @s490("chargers/v1/order/create")
    cmt<ChargersCreateOrderResponse> b(@uau Map<String, String> headers, @q76 ChargersCreateOrderParams params);

    @n851
    @s490("chargers/v1/offers/create")
    cmt<ChargersOfferResponseDto> c(@uau Map<String, String> headers, @q76 ChargersOfferParams body);
}
