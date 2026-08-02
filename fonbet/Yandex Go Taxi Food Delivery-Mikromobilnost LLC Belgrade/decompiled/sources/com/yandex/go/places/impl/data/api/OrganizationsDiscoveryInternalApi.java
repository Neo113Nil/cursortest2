package com.yandex.go.places.impl.data.api;

import com.yandex.go.places.impl.data.entities.network.bookings.PlacesUserBookingsRequestParams;
import com.yandex.go.places.impl.data.entities.network.bookings.PlacesUserBookingsResponse;
import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesListRequestParams;
import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesListResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponseV2;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsRequestParams;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerRequestParams;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerResponse;
import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatusResponse;
import com.yandex.go.places.impl.data.entities.network.payments.PlacesProcessPaymentRequestParams;
import com.yandex.go.places.impl.data.entities.network.payments.PlacesProcessPaymentResponse;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.wqs;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u000eH'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/yandex/go/places/impl/data/api/OrganizationsDiscoveryInternalApi;", "", "Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationsRequestParams;", "params", "Lcmt;", "Lcom/yandex/go/places/impl/data/entities/network/organizations/BaseOrganizationsResponse$OrganizationsResponse;", "e", "(Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationsRequestParams;)Lcmt;", "Lcom/yandex/go/places/impl/data/entities/network/organizations/BaseOrganizationsResponse$OrganizationsResponseV2;", "b", "Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerRequestParams;", "Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerResponse;", "a", "(Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerRequestParams;)Lcmt;", "", "folderId", "Lcom/yandex/go/places/impl/data/entities/network/favorites/FavoritesListRequestParams;", "Lcom/yandex/go/places/impl/data/entities/network/favorites/FavoritesListResponse;", "f", "(Ljava/lang/String;Lcom/yandex/go/places/impl/data/entities/network/favorites/FavoritesListRequestParams;)Lcmt;", "Lcom/yandex/go/places/impl/data/entities/network/payments/PlacesProcessPaymentRequestParams;", "Lcom/yandex/go/places/impl/data/entities/network/payments/PlacesProcessPaymentResponse;", "d", "(Lcom/yandex/go/places/impl/data/entities/network/payments/PlacesProcessPaymentRequestParams;)Lcmt;", "invoiceId", "Lcom/yandex/go/places/impl/data/entities/network/payments/PaymentStatusResponse;", "g", "(Ljava/lang/String;)Lcmt;", "Lcom/yandex/go/places/impl/data/entities/network/bookings/PlacesUserBookingsRequestParams;", "Lcom/yandex/go/places/impl/data/entities/network/bookings/PlacesUserBookingsResponse;", "c", "(Lcom/yandex/go/places/impl/data/entities/network/bookings/PlacesUserBookingsRequestParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OrganizationsDiscoveryInternalApi {
    @s490("organizations-manager/v1/places/organizations/layer")
    cmt<PlacesOrganizationsLayerResponse> a(@q76 PlacesOrganizationsLayerRequestParams params);

    @s490("organizations-manager/v2/places/organizations/list")
    cmt<BaseOrganizationsResponse$OrganizationsResponseV2> b(@q76 OrganizationsRequestParams params);

    @s490("organizations-manager/v1/bookings/user")
    cmt<PlacesUserBookingsResponse> c(@q76 PlacesUserBookingsRequestParams params);

    @s490("organizations-manager/v1/payment/create")
    cmt<PlacesProcessPaymentResponse> d(@q76 PlacesProcessPaymentRequestParams params);

    @s490("layers/v1/places/organizations/list")
    cmt<BaseOrganizationsResponse$OrganizationsResponse> e(@q76 OrganizationsRequestParams params);

    @s490("organizations-manager/v1/favorites/{folder_id}/list")
    cmt<FavoritesListResponse> f(@pq90("folder_id") String folderId, @q76 FavoritesListRequestParams params);

    @wqs("organizations-manager/v1/payment/status/{invoice_id}")
    cmt<PaymentStatusResponse> g(@pq90("invoice_id") String invoiceId);
}
