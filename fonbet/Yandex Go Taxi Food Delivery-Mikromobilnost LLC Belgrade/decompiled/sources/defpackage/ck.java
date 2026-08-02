package defpackage;

import com.yandex.go.agreement.trackable.network.TrackableAcceptanceApi;
import com.yandex.go.delivery.tracking.shortcuts.DeliveryShortcutsApi;
import com.yandex.go.mainscreen.superapp.address.ExpectedDestinationsApi;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersApi;
import com.yandex.go.multimodal_route.network.MultimodalRoutesApi;
import com.yandex.go.overdraft.data.DebtsApiV4;
import com.yandex.go.promocodes.base.impl.promo_codes.data.api.PromoCodesApi;
import com.yandex.go.promocodes.referral.impl.net.ReferralApi;
import com.yandex.go.splash.dynamic.DynamicSplashInternalApi;
import com.yandex.go.superapp.unified_polling.data.api.SuperAppTrackingApi;
import ru.yandex.taxi.altpins.order.AltpinApi;
import ru.yandex.taxi.client.api.PendingOrdersApi;
import ru.yandex.taxi.communications.common.network.api.CommunicationsApi;
import ru.yandex.taxi.favorites.data.api.FavoritesApi;
import ru.yandex.taxi.favorites.suggest.FavoritesSuggestApi;
import ru.yandex.taxi.geosharing.GeoSharingApi;
import ru.yandex.taxi.linked_order.api.LinkedOrderApi;
import ru.yandex.taxi.masstransit.promo.network.MtSummaryCommunicationsApi;
import ru.yandex.taxi.net.taxi.AuthApi;
import ru.yandex.taxi.net.taxi.LocationApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.personalstate.data.remote.PersonalStateApi;
import ru.yandex.taxi.persuggest.api.PerSuggestInternalApi;
import ru.yandex.taxi.profile.api.ProfileApi;
import ru.yandex.taxi.startup.launch.a;
import ru.yandex.taxi.summary.promotions.api.SummaryPromotionsApi;
import ru.yandex.taxi.translations.api.TranslationsApi;

/* loaded from: classes9.dex */
public final /* synthetic */ class ck implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ on2 b;

    public /* synthetic */ ck(on2 on2Var, int i) {
        this.a = i;
        this.b = on2Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        on2 on2Var = this.b;
        switch (i) {
            case 0:
                on2Var.getClass();
                return (AuthApi) on2Var.a(GoApiName.TaxiV3, AuthApi.class);
            case 1:
                on2Var.getClass();
                return (AltpinApi) on2Var.a(GoApiName.TaxiV4, AltpinApi.class);
            case 2:
                return new nxf0((w2j0) on2Var.d.get());
            case 3:
                on2Var.c.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 4:
                return (a) on2Var.b.get();
            case 5:
                on2Var.getClass();
                return (DebtsApiV4) on2Var.a(GoApiName.TaxiV4, DebtsApiV4.class);
            case 6:
                on2Var.getClass();
                return (DeliveryShortcutsApi) on2Var.a(GoApiName.TaxiV4, DeliveryShortcutsApi.class);
            case 7:
                on2Var.getClass();
                return (DynamicSplashInternalApi) on2Var.a(GoApiName.TaxiV4, DynamicSplashInternalApi.class);
            case 8:
                on2Var.getClass();
                return (ExpectedDestinationsApi) on2Var.a(GoApiName.TaxiV3, ExpectedDestinationsApi.class);
            case 9:
                on2Var.getClass();
                return (FavoritesApi) on2Var.a(GoApiName.TaxiV4, FavoritesApi.class);
            case 10:
                on2Var.getClass();
                return (FavoritesSuggestApi) on2Var.a(GoApiName.TaxiV4, FavoritesSuggestApi.class);
            case 11:
                on2Var.getClass();
                return (GeoSharingApi) on2Var.a(GoApiName.TaxiV3, GeoSharingApi.class);
            case 12:
                on2Var.getClass();
                return (LocationApi) on2Var.a(GoApiName.TaxiV3, LocationApi.class);
            case 13:
                on2Var.getClass();
                return (LinkedOrderApi) on2Var.a(GoApiName.TaxiV4, LinkedOrderApi.class);
            case 14:
                on2Var.getClass();
                return (MasstransitOrdersApi) on2Var.a(GoApiName.TaxiV4, MasstransitOrdersApi.class);
            case 15:
                on2Var.getClass();
                return (MtSummaryCommunicationsApi) on2Var.a(GoApiName.TaxiV4, MtSummaryCommunicationsApi.class);
            case 16:
                on2Var.getClass();
                return (MultimodalRoutesApi) on2Var.a(GoApiName.TaxiV4, MultimodalRoutesApi.class);
            case 17:
                on2Var.getClass();
                return (MultimodalRoutesApi) on2Var.a(GoApiName.TaxiV4, MultimodalRoutesApi.class);
            case 18:
                on2Var.getClass();
                return (PendingOrdersApi) on2Var.a(GoApiName.TaxiV4, PendingOrdersApi.class);
            case 19:
                on2Var.getClass();
                return (PerSuggestInternalApi) on2Var.a(GoApiName.TaxiV4, PerSuggestInternalApi.class);
            case 20:
                on2Var.getClass();
                return (PersonalStateApi) on2Var.a(GoApiName.TaxiV3, PersonalStateApi.class);
            case 21:
                on2Var.getClass();
                return (TrackableAcceptanceApi) on2Var.a(GoApiName.TaxiV4, TrackableAcceptanceApi.class);
            case 22:
                on2Var.getClass();
                return (PromoCodesApi) on2Var.a(GoApiName.TaxiV3, PromoCodesApi.class);
            case 23:
                on2Var.getClass();
                return (ProfileApi) on2Var.a(GoApiName.TaxiV4, ProfileApi.class);
            case 24:
                on2Var.getClass();
                return (ReferralApi) on2Var.a(GoApiName.TaxiV3, ReferralApi.class);
            case 25:
                on2Var.getClass();
                return (SummaryPromotionsApi) on2Var.a(GoApiName.TaxiV4, SummaryPromotionsApi.class);
            case 26:
                on2Var.getClass();
                return (CommunicationsApi) on2Var.a(GoApiName.TaxiV4, CommunicationsApi.class);
            case 27:
                on2Var.getClass();
                return (TranslationsApi) on2Var.a(GoApiName.TaxiV3, TranslationsApi.class);
            default:
                on2Var.getClass();
                return (SuperAppTrackingApi) on2Var.a(GoApiName.TaxiV4, SuperAppTrackingApi.class);
        }
    }
}
