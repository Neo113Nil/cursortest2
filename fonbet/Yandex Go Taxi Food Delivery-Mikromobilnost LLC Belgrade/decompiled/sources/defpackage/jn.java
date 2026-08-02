package defpackage;

import com.yandex.go.dto.response.Action$Marketplace;
import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.dto.response.Action$Payload;
import com.yandex.go.dto.response.Action$SdcRouteSelection;
import com.yandex.go.dto.response.Action$SdcRouteSelection$Screen$$serializer;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.a;
import com.yandex.go.dto.response.a0;
import com.yandex.go.dto.response.c1;
import com.yandex.go.dto.response.d0;
import com.yandex.go.dto.response.d1;
import com.yandex.go.dto.response.e;
import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.e1;
import com.yandex.go.dto.response.f;
import com.yandex.go.dto.response.g;
import com.yandex.go.dto.response.g0;
import com.yandex.go.dto.response.i;
import com.yandex.go.dto.response.i0;
import com.yandex.go.dto.response.j;
import com.yandex.go.dto.response.m0;
import com.yandex.go.dto.response.q;
import com.yandex.go.dto.response.q0;
import com.yandex.go.dto.response.r0;
import com.yandex.go.dto.response.s;
import com.yandex.go.dto.response.s0;
import com.yandex.go.dto.response.t0;
import com.yandex.go.dto.response.u0;
import com.yandex.go.dto.response.w0;
import com.yandex.go.dto.response.x;
import com.yandex.go.dto.response.x0;
import com.yandex.go.dto.response.z0;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final /* synthetic */ class jn implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jn(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.persuggest.api.finalsuggest.Action", Action.values(), new String[]{"pin_drop", "finalize", "redirect", "geomagnet", "coord_providers_poll", "photo_flow"}, new Annotation[][]{null, null, null, null, null, null});
            case 1:
                return new o4o("com.yandex.go.dto.response.Action.CarTech", a.INSTANCE, new Annotation[0]);
            case 2:
                return new o4o("com.yandex.go.dto.response.Action.ChargersDvizhSubscription", e.INSTANCE, new Annotation[0]);
            case 3:
                return new o4o("com.yandex.go.dto.response.Action.ChargersPartnerSubscription", f.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("com.yandex.go.dto.response.Action.ChargersPasses", g.INSTANCE, new Annotation[0]);
            case 5:
                return new o4o("com.yandex.go.dto.response.Action.ChargersQrScan", i.INSTANCE, new Annotation[0]);
            case 6:
                return new o4o("com.yandex.go.dto.response.Action.ChargersSubscription", j.INSTANCE, new Annotation[0]);
            case 7:
                return new o4o("com.yandex.go.dto.response.Action.Close", q.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.dto.response.Action.DeliveryDashboard", s.INSTANCE, new Annotation[0]);
            case 9:
                x xVar = Action$Marketplace.Companion;
                return Action$Marketplace.MarketplaceTargetScreenDto.Companion.serializer();
            case 10:
                a0 a0Var = Action$MediaStory.Companion;
                return Action$MediaStory.Prefetch.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.dto.response.Action.MediaStory.Prefetch", Action$MediaStory.Prefetch.values(), new String[]{"disable_media", "images", "all_media"}, new Annotation[][]{null, null, null});
            case 12:
                return new o4o("com.yandex.go.dto.response.Action.Navigator", d0.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.dto.response.Action.None", e0.INSTANCE, new Annotation[0]);
            case 14:
                return new o4o("com.yandex.go.dto.response.Action.OpenTariffCard", g0.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.dto.response.Action.OrganizationsDiscovery", i0.INSTANCE, new Annotation[0]);
            case 16:
                return vez0.g("com.yandex.go.dto.response.Action.Payload.Mode", Action$Payload.Mode.values(), new String[]{"all_object_types"}, new Annotation[][]{null});
            case 17:
                return vez0.g("com.yandex.go.dto.response.Action.Payload.ObjectType", Action$Payload.ObjectType.values(), new String[]{"shuttle_route", null}, new Annotation[][]{null, null});
            case 18:
                return new o4o("com.yandex.go.dto.response.Action.Refresh", m0.INSTANCE, new Annotation[0]);
            case 19:
                return new o4o("com.yandex.go.dto.response.Action.ScootersActiveSuperPasses", q0.INSTANCE, new Annotation[0]);
            case 20:
                return new o4o("com.yandex.go.dto.response.Action.ScootersCoupons", r0.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.dto.response.Action.ScootersInsurance", s0.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("com.yandex.go.dto.response.Action.ScootersMosRu", t0.INSTANCE, new Annotation[0]);
            case 23:
                return new o4o("com.yandex.go.dto.response.Action.ScootersPasses", u0.INSTANCE, new Annotation[0]);
            case 24:
                return new o4o("com.yandex.go.dto.response.Action.ScootersSuperPasses", w0.INSTANCE, new Annotation[0]);
            case 25:
                return new o4o("com.yandex.go.dto.response.Action.ScrollUp", x0.INSTANCE, new Annotation[0]);
            case 26:
                z0 z0Var = Action$SdcRouteSelection.Companion;
                return new p53(Action$SdcRouteSelection$Screen$$serializer.INSTANCE, 0);
            case 27:
                return new o4o("com.yandex.go.dto.response.Action.SelectPointA", c1.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("com.yandex.go.dto.response.Action.ServiceCatalog", d1.INSTANCE, new Annotation[0]);
            default:
                e1 e1Var = Action$SummaryRedirect.Companion;
                return Action$SummaryRedirect.State.Companion.serializer();
        }
    }
}
