package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.CreateOffersV1Params;
import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferParams;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import defpackage.cmt;
import defpackage.n851;
import defpackage.q76;
import defpackage.r86;
import defpackage.s490;
import defpackage.uau;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0007j\u0002`\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/data/ScootersOfferApi;", "", "", "", "headers", "Lcom/yandex/go/scooters/data/model/CreateOffersV1Params;", "createOffersParams", "Lcmt;", "Lcom/yandex/go/scooters/data/model/CreateOffersV1Response;", "b", "(Ljava/util/Map;Lcom/yandex/go/scooters/data/model/CreateOffersV1Params;)Lcmt;", "Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams;", "alternativeOfferParams", "Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse;", "a", "(Ljava/util/Map;Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams;)Lcmt;", "Lr86;", "bookOfferParams", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "c", "(Lr86;Ljava/util/Map;)Lcmt;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersOfferApi {
    @s490("scooters/v1/alt-offer")
    cmt<ScootersAlternativeOfferResponse> a(@uau Map<String, String> headers, @q76 ScootersAlternativeOfferParams alternativeOfferParams);

    @n851
    @s490("scooters/v1/offers/create")
    cmt<CreateOffersV1Response> b(@uau Map<String, String> headers, @q76 CreateOffersV1Params createOffersParams);

    @s490("scooters/api/yandex/offers/book")
    cmt<zy11> c(@q76 r86 bookOfferParams, @uau Map<String, String> headers);
}
