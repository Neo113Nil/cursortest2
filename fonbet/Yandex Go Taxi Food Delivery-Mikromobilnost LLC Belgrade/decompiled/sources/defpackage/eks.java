package defpackage;

import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.search.model.DecideLaterConfig;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.experiment.d;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchView;
import ru.yandex.taxi.search.address.view.ModalSourceSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final class eks extends a {
    public final hjs F;
    public final x51 G;
    public final zuj0 H;
    public final w030 I;
    public final rjs J;
    public final mjs K;

    public eks(hjs hjsVar, x51 x51Var, zuj0 zuj0Var, w030 w030Var, rjs rjsVar, mjs mjsVar) {
        super("FullscreenSuggestAddressSearchModalViewRouter.scope");
        this.F = hjsVar;
        this.G = x51Var;
        this.H = zuj0Var;
        this.I = w030Var;
        this.J = rjsVar;
        this.K = mjsVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        if (((wjs) obj).a) {
            T();
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.I;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        wjs wjsVar = (wjs) obj;
        ujs ujsVar = FullscreenDestinationSearchView.Companion;
        hjs hjsVar = this.F;
        String str = hjsVar.b.b() == Screen.MAIN_V4 ? "superapp_main" : "pickup_location";
        ev8 ev8Var = hjsVar.d;
        h0j h0jVar = new h0j(kzi.a, str, true);
        ddf ddfVar = new ddf(RoutePointType.POINT_B);
        r51 r51Var = new r51(SourcePicker.NONE, DecideLaterConfig.a, null);
        m3o m3oVar = m3o.b;
        y9y0 y9y0Var = hjsVar.a;
        i6r i6rVar = ev8Var.a;
        i6rVar.getClass();
        m3oVar.getClass();
        y9y0Var.getClass();
        r1g r1gVar = new r1g(h0jVar, ddfVar, r51Var, m3oVar, i6rVar, y9y0Var);
        ujsVar.getClass();
        tjs tjsVar = new tjs(r1gVar);
        tjsVar.C = true;
        tjsVar.D = true;
        tjsVar.A = new mum(this);
        tjsVar.u = PointType.DESTINATION;
        int i = kyh0.search_destination_address_hint;
        avj0 avj0Var = (avj0) this.H;
        tjsVar.n = avj0Var.h(i);
        tjsVar.i = avj0Var.h(kyh0.summary_error_destination_required);
        tjsVar.q = new cks(this, 0);
        tjsVar.v = new dks(this);
        qjs qjsVar = new qjs((d) ((alm) this.J.a.b).get());
        String str2 = wjsVar.c;
        this.K.a.getClass();
        FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView = new FullscreenDestinationSearchModalView(tjsVar, qjsVar, str2);
        fullscreenDestinationSearchModalView.setOnAddressPickedListener(new x71(5, this));
        fullscreenDestinationSearchModalView.withDirection(wjsVar.b);
        fullscreenDestinationSearchModalView.setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        return fullscreenDestinationSearchModalView;
    }

    public final void T() {
        pz20 pz20Var = ModalSourceSearchView.Companion;
        h6g a = this.F.a();
        pz20Var.getClass();
        oz20 oz20Var = new oz20(a);
        oz20Var.B = true;
        oz20Var.A = new dks(this);
        oz20Var.n = ((avj0) this.H).h(kyh0.search_source_address_hint);
        oz20Var.q = new cks(this, 1);
        oz20Var.u = PointType.SOURCE;
        oz20Var.v = new gym(this);
        A(new y71(oz20Var, (w030) this.G.a.a.get()), zy11.a, new v71(this, 1));
    }
}
