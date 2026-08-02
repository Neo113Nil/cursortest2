package defpackage;

import com.yandex.go.chargers.debt.data.ChargersDebtApi;
import com.yandex.go.chargers.network.api.ChargersApi;
import com.yandex.go.chargers.offer.data.ChargersOfferApi;
import com.yandex.go.chargers.offer.passes.data.api.ChargersPassesApi;
import com.yandex.go.chargers.offer.plus_dvizh.data.api.ChargersPlusDvizhPurchaseApi;
import com.yandex.go.chargers.orchestrator_user_events.data.ChargersOrchestratorUserEventsApi;
import com.yandex.go.chargers.order.completion.pre_finish.data.ChargersFinishApi;
import com.yandex.go.chargers.partner_subscription.data.ChargersPartnerSubscriptionInfoApi;
import com.yandex.go.chargers.qr.data.ChargersStationSearchApi;
import com.yandex.go.chargers.station.data.ChargersStationApi;
import com.yandex.go.chargers.subscription.data.ChargersSubscriptionApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes12.dex */
public final class b6a implements v7p {
    public final /* synthetic */ int a;
    public final pxf b;

    public /* synthetic */ b6a(pxf pxfVar, int i) {
        this.a = i;
        this.b = pxfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        pxf pxfVar = this.b;
        switch (i) {
            case 0:
                ChargersApi chargersApi = (ChargersApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersApi.class);
                q5z.i(chargersApi);
                return chargersApi;
            case 1:
                ChargersDebtApi chargersDebtApi = (ChargersDebtApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersDebtApi.class);
                q5z.i(chargersDebtApi);
                return chargersDebtApi;
            case 2:
                ChargersFinishApi chargersFinishApi = (ChargersFinishApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersFinishApi.class);
                q5z.i(chargersFinishApi);
                return chargersFinishApi;
            case 3:
                ChargersOfferApi chargersOfferApi = (ChargersOfferApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersOfferApi.class);
                q5z.i(chargersOfferApi);
                return chargersOfferApi;
            case 4:
                ChargersOrchestratorUserEventsApi chargersOrchestratorUserEventsApi = (ChargersOrchestratorUserEventsApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersOrchestratorUserEventsApi.class);
                q5z.i(chargersOrchestratorUserEventsApi);
                return chargersOrchestratorUserEventsApi;
            case 5:
                ChargersPassesApi chargersPassesApi = (ChargersPassesApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersPassesApi.class);
                q5z.i(chargersPassesApi);
                return chargersPassesApi;
            case 6:
                ChargersPartnerSubscriptionInfoApi chargersPartnerSubscriptionInfoApi = (ChargersPartnerSubscriptionInfoApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersPartnerSubscriptionInfoApi.class);
                q5z.i(chargersPartnerSubscriptionInfoApi);
                return chargersPartnerSubscriptionInfoApi;
            case 7:
                com.yandex.go.chargers.passes.data.ChargersPassesApi chargersPassesApi2 = (com.yandex.go.chargers.passes.data.ChargersPassesApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, com.yandex.go.chargers.passes.data.ChargersPassesApi.class);
                q5z.i(chargersPassesApi2);
                return chargersPassesApi2;
            case 8:
                ChargersPlusDvizhPurchaseApi chargersPlusDvizhPurchaseApi = (ChargersPlusDvizhPurchaseApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersPlusDvizhPurchaseApi.class);
                q5z.i(chargersPlusDvizhPurchaseApi);
                return chargersPlusDvizhPurchaseApi;
            case 9:
                ChargersStationApi chargersStationApi = (ChargersStationApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersStationApi.class);
                q5z.i(chargersStationApi);
                return chargersStationApi;
            case 10:
                ChargersStationSearchApi chargersStationSearchApi = (ChargersStationSearchApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersStationSearchApi.class);
                q5z.i(chargersStationSearchApi);
                return chargersStationSearchApi;
            default:
                ChargersSubscriptionApi chargersSubscriptionApi = (ChargersSubscriptionApi) ((on2) pxfVar.get()).a(GoApiName.TaxiV4, ChargersSubscriptionApi.class);
                q5z.i(chargersSubscriptionApi);
                return chargersSubscriptionApi;
        }
    }
}
