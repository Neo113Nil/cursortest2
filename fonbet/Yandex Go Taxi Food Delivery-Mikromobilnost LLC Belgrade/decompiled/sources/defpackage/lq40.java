package defpackage;

import android.content.Context;
import com.yandex.go.layers.domain.g;
import com.yandex.go.multimodal_route.experiement.c;
import com.yandex.go.multimodal_route.ui.error.a;
import com.yandex.go.navigator.settings.network.api.NavigatorSettingsApi;
import com.yandex.go.tariffcard.experiment.h;
import com.ybsdk.network.Api;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes14.dex */
public final class lq40 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ lq40(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new kq40((h) ((q02) obj).get());
            case 1:
                return new ht40((v0g) obj);
            case 2:
                return new a((c) ((y3g) obj).get());
            case 3:
                return new t42(i2, (uw40) ((dag) obj).get());
            case 4:
                NavigatorSettingsApi navigatorSettingsApi = (NavigatorSettingsApi) ((on2) ((f4g) obj).get()).a(GoApiName.TaxiV4, NavigatorSettingsApi.class);
                q5z.i(navigatorSettingsApi);
                return navigatorSettingsApi;
            case 5:
                return new me50((pho) ((k4g) obj).get());
            case 6:
                return ((jc61) ((h4g) obj).get()).a(new rwp0(RoutePointType.POINT_B, false));
            case 7:
                return new xl10((g) ((n4g) obj).get());
            case 8:
                return new uk10((tyx) ((n4g) obj).get());
            case 9:
                return (egz) ((di20) obj).get();
            case 10:
                return (com.ybsdk.di.modules.features.nfc.a) ((di20) obj).get();
            case 11:
                ((g7g) obj).get();
                return new v960();
            case 12:
                return new aj60((k40) ((t0g) obj).get());
            case 13:
                return new p070((u1n) ((k0n) obj).get());
            case 14:
                return new com.ybsdk.common.repositiories.onboarding.a((Api) ((c6g) obj).get());
            case 15:
                return new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_delivery.a((v470) ((uc50) obj).get());
            case 16:
                return new jg9(i5m.a((ge50) obj), 2);
            case 17:
                return new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_navigator.a((v470) ((uc50) obj).get());
            case 18:
                return new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_organization.a((v470) ((uc50) obj).get());
            case 19:
                return new com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.open_organizations.a((v4c) ((t160) obj).get());
            case 20:
                return new com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.open_service.a((d870) ((uc50) obj).get());
            case 21:
                return new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_taxi.a((v470) ((uc50) obj).get());
            case 22:
                return new ds0((jwh) ((ywf) obj).get());
            case 23:
                return new yj70((ef00) ((ff00) obj).get());
            case 24:
                ((pn70) obj).getClass();
                return new qn70();
            case 25:
                sei0 sei0Var = (sei0) ((elr) ((o4g) obj).get()).a.a.get();
                q5z.i(sei0Var);
                return sei0Var;
            case 26:
                return new bc2((Context) ((o4g) obj).get());
            case 27:
                return new g1t(i2, (qv70) ((t160) obj).get());
            case 28:
                o2y0 o2y0Var = ((ix70) obj).a;
                q5z.i(o2y0Var);
                return o2y0Var;
            default:
                com.yandex.go.taxi.order.map.overlay.c cVar = (com.yandex.go.taxi.order.map.overlay.c) ((n3g) ((nw70) obj).b).B0.get();
                q5z.i(cVar);
                return cVar;
        }
    }
}
