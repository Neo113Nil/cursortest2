package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class oh70 {
    public final w030 a;
    public final f b;
    public final x980 c;
    public final b d;
    public final c e;
    public final ru.yandex.taxi.search.address.view.c f;
    public final m61 g = new m61(2, this);

    public oh70(w030 w030Var, f fVar, x980 x980Var, b bVar, c cVar, ru.yandex.taxi.search.address.view.c cVar2) {
        this.a = w030Var;
        this.b = fVar;
        this.c = x980Var;
        this.d = bVar;
        this.e = cVar;
        this.f = cVar2;
    }

    public final void a(PointType pointType, pv0 pv0Var, zzs zzsVar) {
        int i = mh70.a[pointType.ordinal()];
        int i2 = 5;
        hxx hxxVar = hxx.a;
        x980 x980Var = this.c;
        int i3 = 1;
        if (i == 1) {
            ru.yandex.taxi.order.f fVar = (ru.yandex.taxi.order.f) x980Var;
            fVar.E((m950) fVar.A0.get(), new kh70(kyh0.address_search_modal_view_from, pointType, null, pv0Var, zzsVar), new phm(new tb(i2, this, pointType), fVar, "multiorder_src_map_picker", i3), hxxVar);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        ru.yandex.taxi.order.f fVar2 = (ru.yandex.taxi.order.f) x980Var;
        fVar2.E((m950) fVar2.A0.get(), new kh70(kyh0.address_search_modal_view_to, pointType, null, pv0Var, zzsVar), new phm(new tb(i2, this, pointType), fVar2, "multiorder_dest_map_picker", i3), hxxVar);
    }

    public final void b(SourcePicker sourcePicker, PointType pointType) {
        z700 z700Var = (z700) ((zxf0) pwf0.c(z700.class));
        d82 d82Var = pwf0.c;
        ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
        ru.yandex.taxi.search.address.view.c cVar = this.f;
        xk2 xk2Var = cVar.d;
        RoutePointType routePointType = RoutePointType.POINT_B;
        String str = cVar.e.b() == Screen.MAIN_V4 ? "superapp_main" : "pickup_location";
        xk2Var.getClass();
        h0j h0jVar = new h0j(kzi.a, str, true);
        i6r i6rVar = xk2Var.a;
        ddf ddfVar = new ddf(routePointType);
        DecideLaterConfig decideLaterConfig = DecideLaterConfig.a;
        r51 r51Var = new r51(sourcePicker, decideLaterConfig, null);
        m3o m3oVar = m3o.b;
        i6rVar.getClass();
        m3oVar.getClass();
        iwf iwfVar = new iwf(h0jVar, ddfVar, r51Var, m3oVar, i6rVar);
        dsd dsdVar = cVar.a;
        tjt0 tjt0Var = cVar.b;
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar2 = new ddf(RoutePointType.POINT_A);
        r51 r51Var2 = new r51(SourcePicker.NONE, decideLaterConfig, null);
        y9y0 y9y0Var = cVar.c;
        apf a = uub1.a(new p1b(fh4.c(r51Var2, ddfVar2, m3oVar, tjt0Var.a, new aye0(20, y9y0Var), ujt0Var), iwfVar), dsdVar.a, y9y0Var);
        CompositeAddressSearchView.Companion.getClass();
        fjd fjdVar = new fjd(a);
        fjdVar.j = wch0.addresses_picker;
        fjdVar.k = true;
        fjdVar.p = pointType;
        fjdVar.n = this.g;
        CompositeAddressSearchModalView.Companion.getClass();
        CompositeAddressSearchModalView.a aVar = new CompositeAddressSearchModalView.a();
        aVar.a = z700Var;
        aVar.b = 6;
        aVar.c = d82Var;
        this.a.s(new CompositeAddressSearchModalView(fjdVar, aVar, cVar.f, null), true);
    }
}
