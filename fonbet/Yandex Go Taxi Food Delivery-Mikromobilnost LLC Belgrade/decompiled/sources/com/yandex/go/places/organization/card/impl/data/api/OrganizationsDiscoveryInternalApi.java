package com.yandex.go.places.organization.card.impl.data.api;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.UserReviewRequestParams;
import com.yandex.go.places.organization.card.impl.data.entities.network.search.LoadOrganizationCardsListRequest;
import com.yandex.go.places.organization.card.impl.data.entities.network.search.LoadOrganizationCardsListResponse;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/api/OrganizationsDiscoveryInternalApi;", "", "", "id", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/UserReviewRequestParams;", "userReviewRequestParams", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "a", "(Ljava/lang/String;Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/UserReviewRequestParams;)Lcmt;", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/search/LoadOrganizationCardsListRequest;", "params", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/search/LoadOrganizationCardsListResponse;", "b", "(Lcom/yandex/go/places/organization/card/impl/data/entities/network/search/LoadOrganizationCardsListRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OrganizationsDiscoveryInternalApi {
    @s490("layers/v1/places/organizations/card/reviews/{org_id}/delete")
    cmt<zy11> a(@pq90("org_id") String id, @q76 UserReviewRequestParams userReviewRequestParams);

    @s490("organizations-manager/v1/organizations/search")
    cmt<LoadOrganizationCardsListResponse> b(@q76 LoadOrganizationCardsListRequest params);
}
