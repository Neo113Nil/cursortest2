package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.route.interactor.c;
import com.yandex.go.search.model.DecideLaterConfig;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.address.view.b;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes6.dex */
public final class k83 extends a implements d83 {
    public final i130 F;
    public final g51 G;
    public final zuj0 H;
    public final yvf0 I;
    public final c J;
    public final ah00 K;
    public final yvf0 L;
    public final rjt0 M;
    public final yv0 N;
    public final y9y0 O;
    public final y4k0 P;

    public k83(i130 i130Var, g51 g51Var, zuj0 zuj0Var, yvf0 yvf0Var, c cVar, ah00 ah00Var, yvf0 yvf0Var2, rjt0 rjt0Var, yv0 yv0Var, y9y0 y9y0Var, y4k0 y4k0Var) {
        super(null);
        this.F = i130Var;
        this.G = g51Var;
        this.H = zuj0Var;
        this.I = yvf0Var;
        this.J = cVar;
        this.K = ah00Var;
        this.L = yvf0Var2;
        this.M = rjt0Var;
        this.N = yv0Var;
        this.O = y9y0Var;
        this.P = y4k0Var;
    }

    public static String U(ModalViewOrigin modalViewOrigin) {
        return modalViewOrigin == ModalViewOrigin.SUMMARY ? "summary" : "pickup_location";
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F.a();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        Uri uri;
        c83 c83Var = (c83) obj;
        gzi gziVar = c83Var.e;
        SourcePicker sourcePicker = c83Var.b;
        ModalViewOrigin modalViewOrigin = c83Var.c;
        final int i = 0;
        e83 e83Var = new e83(i, new AtomicReference(gziVar));
        b83 b83Var = c83Var.a;
        boolean z = b83Var instanceof s80;
        final int i2 = 1;
        g51 g51Var = this.G;
        if (z) {
            wyf a = g51Var.a(U(modalViewOrigin), sourcePicker, true);
            p51 p51Var = AddressSearchModalView.Companion;
            b61 T = T(a);
            T.q = new f83(this, modalViewOrigin, (s80) b83Var, e83Var, 1);
            p51Var.getClass();
            AddressSearchModalView a2 = p51.a(T);
            a2.setOnAddressPickedListener(new ax4(this) { // from class: g83
                public final /* synthetic */ k83 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ax4
                public final void t(pv0 pv0Var) {
                    int i3 = i2;
                    k83 k83Var = this.b;
                    switch (i3) {
                        case 0:
                            k83Var.r(new qu(9));
                            break;
                        default:
                            k83Var.r(new qu(9));
                            break;
                    }
                }
            });
            a2.setAnimateOnAppearing(true);
            return a2;
        }
        if (b83Var instanceof t621) {
            t621 t621Var = (t621) b83Var;
            int i3 = t621Var.b;
            dzi dziVar = new dzi(i3);
            String U = U(modalViewOrigin);
            g51Var.getClass();
            wyf a3 = g51Var.b.a(new h0j(dziVar, i3, U, true), new ddf(11, new rwp0(g51Var.b(dziVar, i3), false)), new r51(0), m3o.b, g51Var.a);
            p51 p51Var2 = AddressSearchModalView.Companion;
            b61 T2 = T(a3);
            T2.q = new f83(this, modalViewOrigin, t621Var, e83Var, 0);
            p51Var2.getClass();
            AddressSearchModalView a4 = p51.a(T2);
            a4.setOnAddressPickedListener(new ax4(this) { // from class: g83
                public final /* synthetic */ k83 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ax4
                public final void t(pv0 pv0Var) {
                    int i32 = i;
                    k83 k83Var = this.b;
                    switch (i32) {
                        case 0:
                            k83Var.r(new qu(9));
                            break;
                        default:
                            k83Var.r(new qu(9));
                            break;
                    }
                }
            });
            a4.setAnimateOnAppearing(true);
            return a4;
        }
        if (!(b83Var instanceof ojd)) {
            w511.b();
            return null;
        }
        ojd ojdVar = (ojd) b83Var;
        ModalViewOrigin modalViewOrigin2 = c83Var.c;
        boolean z2 = c83Var.d;
        u0j u0jVar = ojdVar.b;
        Address d = this.J.d();
        DecideLaterConfig decideLaterConfig = ojdVar.d;
        String U2 = U(modalViewOrigin2);
        g51Var.getClass();
        SourcePicker b = sourcePicker.b(true);
        tjt0 tjt0Var = g51Var.d;
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.POINT_A);
        r51 r51Var = new r51(b, DecideLaterConfig.a, null);
        m3o m3oVar = new m3o(g51Var.e.a(true));
        y9y0 y9y0Var = g51Var.a;
        cag c = fh4.c(r51Var, ddfVar, m3oVar, tjt0Var.a, new aye0(20, y9y0Var), ujt0Var);
        boolean z3 = false;
        SourcePicker b2 = sourcePicker.b(false);
        apf a5 = uub1.a(new p1b(c, g51Var.b.a(new h0j(u0jVar, d, U2, true, false), new ddf(11, new rwp0(g51Var.b(u0jVar, 0), false)), new r51(b2, decideLaterConfig, null), m3o.b, g51Var.a)), g51Var.c.a, y9y0Var);
        CompositeAddressSearchView.Companion.getClass();
        fjd fjdVar = new fjd(a5);
        fjdVar.j = wch0.addresses_picker;
        PointType pointType = ojdVar.c;
        fjdVar.p = pointType;
        fjdVar.n = new i83(ojdVar, modalViewOrigin2, this, e83Var, z2);
        yv0 yv0Var = this.N;
        Uri uri2 = yv0Var.a;
        if (uri2 != null) {
            yv0Var.a = null;
        } else {
            uri2 = null;
        }
        fjdVar.q = uri2;
        this.P.getClass();
        CompositeAddressSearchModalView.Companion.getClass();
        CompositeAddressSearchModalView.a aVar = new CompositeAddressSearchModalView.a();
        if (modalViewOrigin2 == ModalViewOrigin.SUMMARY && z2) {
            z3 = true;
        }
        aVar.d = z3;
        CompositeAddressSearchModalView b3 = b.b(fjdVar, aVar);
        b3.setAnimateOnAppearing(true);
        b3.setOnAppearingListener(new sc(2, this));
        Uri uri3 = yv0Var.a;
        if (uri3 != null) {
            yv0Var.a = null;
            uri = uri3;
        } else {
            uri = null;
        }
        if (uri != null) {
            b3.showEditAddress(uri);
        } else {
            b3.showEditAddress(pointType);
        }
        rjt0 rjt0Var = this.M;
        rjt0Var.getClass();
        rjt0.b(rjt0Var, "SourceLocationSuggest");
        return b3;
    }

    public final b61 T(wyf wyfVar) {
        AddressSearchView.Companion.getClass();
        b61 b61Var = new b61(wyfVar);
        b61Var.j = wch0.suggested_destinations;
        b61Var.p = false;
        b61Var.u = PointType.DESTINATION;
        b61Var.n = ((avj0) this.H).h(kyh0.search_destination_address_hint);
        return b61Var;
    }
}
