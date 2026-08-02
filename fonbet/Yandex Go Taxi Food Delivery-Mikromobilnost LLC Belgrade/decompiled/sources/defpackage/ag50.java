package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.navigator.address.NavigatorFullscreenDestinationSearchModalView;
import com.yandex.go.navigator.address.NavigatorRouteStopsSearchView;
import com.yandex.go.search.model.DecideLaterConfig;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.ModalSourceSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes12.dex */
public final class ag50 extends a {
    public final w030 F;
    public final yb50 G;
    public final ac50 H;
    public final e100 I;
    public final zuj0 J;
    public final boolean K;

    public ag50(w030 w030Var, yb50 yb50Var, ac50 ac50Var, e100 e100Var, zuj0 zuj0Var) {
        super("NavigatorAddressDestinationRouter.scope");
        this.F = w030Var;
        this.G = yb50Var;
        this.H = ac50Var;
        this.I = e100Var;
        this.J = zuj0Var;
        this.K = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.K;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        String str;
        String D1;
        xf50 xf50Var = ((yf50) obj).a;
        boolean z = xf50Var instanceof wf50;
        final int i = 0;
        final int i2 = 1;
        yb50 yb50Var = this.G;
        ac50 ac50Var = this.H;
        zuj0 zuj0Var = this.J;
        if (z) {
            wf50 wf50Var = (wf50) xf50Var;
            boolean z2 = wf50Var.a;
            Address address = wf50Var.b;
            tjs tjsVar = new tjs(yb50Var.a());
            tjsVar.C = true;
            tjsVar.D = true;
            avj0 avj0Var = (avj0) zuj0Var;
            tjsVar.B = avj0Var.h(kyh0.navigator_route_from);
            tjsVar.D = false;
            tjsVar.C = false;
            tjsVar.A = new fl10(this);
            tjsVar.u = PointType.DESTINATION;
            tjsVar.n = avj0Var.h(kyh0.navigator_route_to);
            tjsVar.i = avj0Var.h(kyh0.summary_error_destination_required);
            tjsVar.q = new dx4(this) { // from class: sf50
                public final /* synthetic */ ag50 b;

                {
                    this.b = this;
                }

                @Override // defpackage.dx4
                public final void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
                    int i3 = i2;
                    ag50 ag50Var = this.b;
                    switch (i3) {
                        case 0:
                            ag50Var.r(new yid(PointType.SOURCE, pv0Var, 2));
                            break;
                        default:
                            ag50Var.r(new yid(PointType.DESTINATION, pv0Var, 2));
                            break;
                    }
                }
            };
            if (address != null && (D1 = address.D1()) != null) {
                tjsVar.l.oh(D1);
            }
            tjsVar.k = true;
            NavigatorFullscreenDestinationSearchModalView navigatorFullscreenDestinationSearchModalView = new NavigatorFullscreenDestinationSearchModalView(tjsVar, z2 ? SlideableModalView.CardMode.FULLSCREEN : SlideableModalView.CardMode.SLIDEABLE_CARD, (dc50) ((bc50) ac50Var).a.a.get());
            final int i3 = 2;
            navigatorFullscreenDestinationSearchModalView.setOnAddressPickedListener(new ax4(this) { // from class: tf50
                public final /* synthetic */ ag50 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ax4
                public final void t(pv0 pv0Var) {
                    int i4 = i3;
                    ag50 ag50Var = this.b;
                    switch (i4) {
                        case 0:
                            ag50Var.r(new t71(pv0Var, PointType.SOURCE));
                            break;
                        case 1:
                            ag50Var.r(new t71(pv0Var, PointType.DESTINATION));
                            break;
                        default:
                            ag50Var.r(new t71(pv0Var, PointType.DESTINATION));
                            break;
                    }
                }
            });
            return navigatorFullscreenDestinationSearchModalView;
        }
        if (xf50Var instanceof uf50) {
            uf50 uf50Var = (uf50) xf50Var;
            String str2 = uf50Var.a;
            Address address2 = uf50Var.b;
            ue50 ue50Var = NavigatorRouteStopsSearchView.Companion;
            i4g a = yb50Var.a();
            ue50Var.getClass();
            te50 te50Var = new te50(a);
            te50Var.A = new zf50(this);
            te50Var.B = str2;
            te50Var.n = ((avj0) zuj0Var).h(kyh0.navigator_route_to);
            te50Var.q = new h2r(15, address2, this);
            te50Var.u = PointType.DESTINATION;
            if (address2 == null || (str = address2.d()) == null) {
                str = "";
            }
            te50Var.l.oh(str);
            NavigatorFullscreenDestinationSearchModalView navigatorFullscreenDestinationSearchModalView2 = new NavigatorFullscreenDestinationSearchModalView(te50Var, SlideableModalView.CardMode.SLIDEABLE_CARD, (dc50) ((bc50) ac50Var).a.a.get());
            navigatorFullscreenDestinationSearchModalView2.setOnAddressPickedListener(new ax4(this) { // from class: tf50
                public final /* synthetic */ ag50 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ax4
                public final void t(pv0 pv0Var) {
                    int i4 = i2;
                    ag50 ag50Var = this.b;
                    switch (i4) {
                        case 0:
                            ag50Var.r(new t71(pv0Var, PointType.SOURCE));
                            break;
                        case 1:
                            ag50Var.r(new t71(pv0Var, PointType.DESTINATION));
                            break;
                        default:
                            ag50Var.r(new t71(pv0Var, PointType.DESTINATION));
                            break;
                    }
                }
            });
            return navigatorFullscreenDestinationSearchModalView2;
        }
        if (!xf50Var.equals(vf50.a)) {
            w511.b();
            return null;
        }
        pz20 pz20Var = ModalSourceSearchView.Companion;
        e100 e100Var = this.I;
        i6r i6rVar = (i6r) e100Var.b;
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.SERVICE_NAVIGATOR_A);
        r51 r51Var = new r51(SourcePicker.A_FROM_HOME, DecideLaterConfig.a, null);
        m3o m3oVar = m3o.b;
        qyv qyvVar = new qyv(i2, e100Var);
        y9y0 y9y0Var = (y9y0) e100Var.w;
        i6rVar.getClass();
        m3oVar.getClass();
        y9y0Var.getClass();
        kxf kxfVar = new kxf(ujt0Var, ddfVar, r51Var, m3oVar, i6rVar, qyvVar, y9y0Var);
        pz20Var.getClass();
        oz20 oz20Var = new oz20(kxfVar);
        oz20Var.B = false;
        oz20Var.n = ((avj0) zuj0Var).h(kyh0.navigator_route_from);
        oz20Var.q = new dx4(this) { // from class: sf50
            public final /* synthetic */ ag50 b;

            {
                this.b = this;
            }

            @Override // defpackage.dx4
            public final void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
                int i32 = i;
                ag50 ag50Var = this.b;
                switch (i32) {
                    case 0:
                        ag50Var.r(new yid(PointType.SOURCE, pv0Var, 2));
                        break;
                    default:
                        ag50Var.r(new yid(PointType.DESTINATION, pv0Var, 2));
                        break;
                }
            }
        };
        oz20Var.p = true;
        oz20Var.u = PointType.SOURCE;
        NavigatorFullscreenDestinationSearchModalView navigatorFullscreenDestinationSearchModalView3 = new NavigatorFullscreenDestinationSearchModalView(oz20Var, SlideableModalView.CardMode.SLIDEABLE_CARD, (dc50) ((bc50) ac50Var).a.a.get());
        navigatorFullscreenDestinationSearchModalView3.setOnAddressPickedListener(new ax4(this) { // from class: tf50
            public final /* synthetic */ ag50 b;

            {
                this.b = this;
            }

            @Override // defpackage.ax4
            public final void t(pv0 pv0Var) {
                int i4 = i;
                ag50 ag50Var = this.b;
                switch (i4) {
                    case 0:
                        ag50Var.r(new t71(pv0Var, PointType.SOURCE));
                        break;
                    case 1:
                        ag50Var.r(new t71(pv0Var, PointType.DESTINATION));
                        break;
                    default:
                        ag50Var.r(new t71(pv0Var, PointType.DESTINATION));
                        break;
                }
            }
        });
        return navigatorFullscreenDestinationSearchModalView3;
    }
}
