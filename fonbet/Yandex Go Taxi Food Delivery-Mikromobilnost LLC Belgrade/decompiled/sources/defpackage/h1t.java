package defpackage;

import android.content.Context;
import com.yandex.go.information.data.InformationApi;
import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import com.yandex.go.loyalty.impl.selector.domain.b;
import com.yandex.go.navigator.safe.SaveOneKilometerTripInMissionControlApi;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.goal_tracking_link.a;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.a0;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.resolver.internal.network.LinkApi;
import ru.yandex.logistics.sdk.cargo_form.core.impl.data.FormApi;
import ru.yandex.taxi.logistics.sdk.promotions.impl.PromotionsApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.summary.requirements.list.interactors.j;

/* loaded from: classes12.dex */
public final class h1t implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ h1t(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new g1t(i2, (d1t) ((dag) xvf0Var).get());
            case 1:
                return new a((gst) ((xat) xvf0Var).get());
            case 2:
                return new x2u((a0) ((prq) xvf0Var).get());
            case 3:
                SaveOneKilometerTripInMissionControlApi saveOneKilometerTripInMissionControlApi = (SaveOneKilometerTripInMissionControlApi) ((on2) ((b2g) xvf0Var).b.h).a(GoApiName.TaxiV4, SaveOneKilometerTripInMissionControlApi.class);
                q5z.i(saveOneKilometerTripInMissionControlApi);
                return saveOneKilometerTripInMissionControlApi;
            case 4:
                return new i4u((cb50) ((j4g) xvf0Var).get());
            case 5:
                return new j((ehu) ((xat) xvf0Var).get());
            case 6:
                return new v0v((dne0) ((l3g) xvf0Var).get());
            case 7:
                return new gpv((x1l0) ((s3f0) xvf0Var).get());
            case 8:
                return new b1((pho) ((u0g) xvf0Var).get());
            case 9:
                return new i4u((pj) ((h1t) xvf0Var).get());
            case 10:
                return new pj((pho) ((q1g) xvf0Var).get());
            case 11:
                InformationApi informationApi = (InformationApi) ((on2) ((q1g) xvf0Var).get()).a(GoApiName.TaxiV4, InformationApi.class);
                q5z.i(informationApi);
                return informationApi;
            case 12:
                return new nw8((zuj0) ((d2g) xvf0Var).get());
            case 13:
                return new com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.init.a((jgs) ((wvq) xvf0Var).get());
            case 14:
                return new o61((pho) ((d2g) xvf0Var).get());
            case 15:
                return new bpw((epf) xvf0Var);
            case 16:
                return (FormApi) ((t0k0) ((m1g) xvf0Var).get()).b(FormApi.class);
            case 17:
                t0k0 t0k0Var = (t0k0) ((w5g) xvf0Var).get();
                csw.a.getClass();
                return (PromotionsApi) t0k0Var.b(PromotionsApi.class);
            case 18:
                return (j0x) ((ret) xvf0Var).get();
            case 19:
                return (KycApi) ((t0k0) ((u1g) xvf0Var).get()).b(KycApi.class);
            case 20:
                return (LinkApi) ((t0k0) ((u1g) xvf0Var).get()).b(LinkApi.class);
            case 21:
                return new pj((pho) ((r2g) xvf0Var).get());
            case 22:
                return new o61((pho) ((i9g) xvf0Var).get());
            case 23:
                return new bpz((Context) ((s2g) xvf0Var).get());
            case 24:
                return new epz((dne0) ((s2g) xvf0Var).get(), 0);
            case 25:
                return new com.yandex.go.lootbox.impl.data.mapper.gift.a((com.yandex.go.lootbox.impl.data.mapper.action.a) ((rut) xvf0Var).get());
            case 26:
                return new b((LoyaltyApi) ((i2g) xvf0Var).get());
            case 27:
                return new hvz((gf41) ((d441) xvf0Var).get());
            case 28:
                return (com.ybsdk.feature.banners.impl.domain.interactors.a) ((tu4) ((u1g) xvf0Var).get()).b.get();
            default:
                return (pa00) ((y500) xvf0Var).get();
        }
    }
}
