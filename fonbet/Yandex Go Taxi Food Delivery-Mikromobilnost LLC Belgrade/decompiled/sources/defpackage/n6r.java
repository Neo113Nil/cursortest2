package defpackage;

import com.yandex.go.flex.common.api.actions.ActionWithOnTapOnboarding;
import com.yandex.go.flex.common.api.actions.ActionWithOnTapOnboarding$$serializer;
import com.yandex.go.flex.common.api.actions.CityModeAction;
import com.yandex.go.flex.common.api.actions.CityModeAction$$serializer;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.CloseAction$$serializer;
import com.yandex.go.flex.common.api.actions.DiscoveryAction;
import com.yandex.go.flex.common.api.actions.DiscoveryAction$$serializer;
import com.yandex.go.flex.common.api.actions.IntercityMainAction;
import com.yandex.go.flex.common.api.actions.IntercityMainAction$$serializer;
import com.yandex.go.flex.common.api.actions.MarketPlaceAction;
import com.yandex.go.flex.common.api.actions.MarketPlaceAction$$serializer;
import com.yandex.go.flex.common.api.actions.OnboardingDeeplinkNavigationAction;
import com.yandex.go.flex.common.api.actions.OnboardingDeeplinkNavigationAction$$serializer;
import com.yandex.go.flex.common.api.actions.OpenOrganizationCardAction;
import com.yandex.go.flex.common.api.actions.OpenOrganizationCardAction$$serializer;
import com.yandex.go.flex.common.api.actions.OpenOrganizationsListAction;
import com.yandex.go.flex.common.api.actions.OpenOrganizationsListAction$$serializer;
import com.yandex.go.flex.common.api.actions.ShowOnboardingAction;
import com.yandex.go.flex.common.api.actions.ShowOnboardingAction$$serializer;
import com.yandex.go.flex.common.api.actions.SummaryRedirectAction;
import com.yandex.go.flex.common.api.actions.SummaryRedirectAction$$serializer;
import com.yandex.go.flex.common.api.actions.TaxiRouteInputAction;
import com.yandex.go.flex.common.api.actions.TaxiRouteInputAction$$serializer;
import com.yandex.go.flex.common.api.actions.WebCustomTabsAction;
import com.yandex.go.flex.common.api.actions.WebCustomTabsAction$$serializer;
import com.yandex.go.flex.common.api.actions.d;
import com.yandex.go.flex.common.api.actions.e0;
import com.yandex.go.flex.common.api.actions.i0;
import com.yandex.go.flex.common.api.actions.l;
import com.yandex.go.flex.common.api.actions.l0;
import com.yandex.go.flex.common.api.actions.n;
import com.yandex.go.flex.common.api.actions.r0;
import com.yandex.go.flex.common.api.actions.s0;
import com.yandex.go.flex.common.api.actions.z;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.experiments.f;

/* loaded from: classes9.dex */
public final /* synthetic */ class n6r implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ n6r(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return PositionInitAction.Companion.serializer();
            case 1:
                t6r t6rVar = u6r.Companion;
                return new p53(upb0.a, 0);
            case 2:
                t6r t6rVar2 = u6r.Companion;
                return new p53(gsw.a, 0);
            case 3:
                t6r t6rVar3 = u6r.Companion;
                return new p53(zsd0.f, 0);
            case 4:
                t6r t6rVar4 = u6r.Companion;
                return new p53(nxd.a, 0);
            case 5:
                t6r t6rVar5 = u6r.Companion;
                return new p53(dyd.a, 0);
            case 6:
                y8r y8rVar = z8r.Companion;
                return new p53(flt.a, 0);
            case 7:
                y8r y8rVar2 = z8r.Companion;
                return new p53(plt.a, 0);
            case 8:
                l9r l9rVar = m9r.Companion;
                return new p53(e6m.a, 0);
            case 9:
                l9r l9rVar2 = m9r.Companion;
                return new p53(e6m.a, 0);
            case 10:
                l9r l9rVar3 = m9r.Companion;
                return new p53(e6m.a, 0);
            case 11:
                return new o4o("ru.yandex.taxi.persuggest.api.fingerprint.FingerprintUnknown", p9r.INSTANCE, new Annotation[0]);
            case 12:
                t9r t9rVar = FinishCard.Companion;
                return jsq0.Companion.serializer(FinishCard.Section.Companion.serializer());
            case 13:
                t9r t9rVar2 = FinishCard.Companion;
                return new p53(h6w.a, 0);
            case 14:
                return vez0.g("ru.yandex.taxi.scooters.experiments.FinishCard.Section", FinishCard.Section.values(), new String[]{"feedback", "shortcuts", "info", "statistics"}, new Annotation[][]{null, null, null, null});
            case 15:
                f fVar = FinishCard.Statistics.Companion;
                return jsq0.Companion.serializer(FinishCard.Statistics.StatisticsItem.Companion.serializer());
            case 16:
                return vez0.g("ru.yandex.taxi.scooters.experiments.FinishCard.Statistics.StatisticsItem", FinishCard.Statistics.StatisticsItem.values(), new String[]{"distance", "speed", "duration", "price"}, new Annotation[][]{null, null, null, null});
            case 17:
                return new ssp0("com.yandex.go.flex.common.api.actions.FlexAction", qoi0.a(n.class), new lfx[]{qoi0.a(ActionWithOnTapOnboarding.class), qoi0.a(d.class), qoi0.a(CityModeAction.class), qoi0.a(CloseAction.class), qoi0.a(l.class), qoi0.a(DiscoveryAction.class), qoi0.a(IntercityMainAction.class), qoi0.a(MarketPlaceAction.class), qoi0.a(z.class), qoi0.a(OnboardingDeeplinkNavigationAction.class), qoi0.a(OpenOrganizationCardAction.class), qoi0.a(OpenOrganizationsListAction.class), qoi0.a(e0.class), qoi0.a(i0.class), qoi0.a(l0.class), qoi0.a(ShowOnboardingAction.class), qoi0.a(SummaryRedirectAction.class), qoi0.a(r0.class), qoi0.a(s0.class), qoi0.a(TaxiRouteInputAction.class), qoi0.a(WebCustomTabsAction.class)}, new KSerializer[]{ActionWithOnTapOnboarding$$serializer.INSTANCE, new o4o("CarTechAction", d.INSTANCE, new Annotation[]{new tfr()}), CityModeAction$$serializer.INSTANCE, CloseAction$$serializer.INSTANCE, new o4o("DeliveryDashboardAction", l.INSTANCE, new Annotation[]{new tfr()}), DiscoveryAction$$serializer.INSTANCE, IntercityMainAction$$serializer.INSTANCE, MarketPlaceAction$$serializer.INSTANCE, new o4o("NavigatorAction", z.INSTANCE, new Annotation[]{new tfr()}), OnboardingDeeplinkNavigationAction$$serializer.INSTANCE, OpenOrganizationCardAction$$serializer.INSTANCE, OpenOrganizationsListAction$$serializer.INSTANCE, new o4o("com.yandex.go.flex.common.api.actions.OpenSuperappSearchAction", e0.INSTANCE, new Annotation[]{new tfr()}), new o4o("OrganizationDiscoveryAction", i0.INSTANCE, new Annotation[]{new tfr()}), new o4o("com.yandex.go.flex.common.api.actions.ServiceCatalogAction", l0.INSTANCE, new Annotation[]{new tfr()}), ShowOnboardingAction$$serializer.INSTANCE, SummaryRedirectAction$$serializer.INSTANCE, new o4o("TaxiMainScreenAction", r0.INSTANCE, new Annotation[]{new tfr()}), new o4o("TaxiProceedAction", s0.INSTANCE, new Annotation[]{new tfr()}), TaxiRouteInputAction$$serializer.INSTANCE, WebCustomTabsAction$$serializer.INSTANCE}, new Annotation[]{new tfr()});
            case 18:
                return kui0.Companion.serializer();
            case 19:
                return l36.b;
            case 20:
                return ivi0.Companion.serializer();
            case 21:
                return wgp0.Companion.serializer();
            case 22:
                return gmm0.Companion.serializer();
            case 23:
                return iyd.Companion.serializer();
            case 24:
                return epe.Companion.serializer();
            case 25:
                return unq0.Companion.serializer();
            case 26:
                return f9s0.Companion.serializer();
            case 27:
                return b1j0.Companion.serializer();
            case 28:
                return l36.G;
            default:
                return l36.O;
        }
    }
}
