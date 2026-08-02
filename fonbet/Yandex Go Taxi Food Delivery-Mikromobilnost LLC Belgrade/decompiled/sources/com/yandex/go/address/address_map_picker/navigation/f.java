package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.ah00;
import defpackage.dmb0;
import defpackage.f11;
import defpackage.fmb0;
import defpackage.g11;
import defpackage.g21;
import defpackage.gl;
import defpackage.h55;
import defpackage.i11;
import defpackage.j11;
import defpackage.jqr;
import defpackage.l110;
import defpackage.lp00;
import defpackage.m01;
import defpackage.m110;
import defpackage.mf00;
import defpackage.n01;
import defpackage.o31;
import defpackage.ooa1;
import defpackage.p01;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.v5;
import defpackage.x11;
import defpackage.ysd0;
import defpackage.zy11;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class f extends h55 implements n01 {
    public final mf00 D;
    public final ah00 E;
    public final x11 F;
    public final com.yandex.go.address.address_map_picker.pin.g G;
    public final com.yandex.go.address.address_map_picker.domain.c H;
    public final p01 I;
    public final AddressMapPickerAddressStateRepository J;
    public final g21 K;
    public final com.yandex.go.address.address_map_picker.domain.f L;
    public final com.yandex.go.address.address_map_picker.domain.e M;
    public final l110 N;
    public final j11 O;
    public final ysd0 P;
    public final o31 Q;
    public final a R;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.go.address.address_map_picker.navigation.a] */
    public f(mf00 mf00Var, ah00 ah00Var, x11 x11Var, com.yandex.go.address.address_map_picker.pin.g gVar, com.yandex.go.address.address_map_picker.domain.c cVar, p01 p01Var, AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository, g21 g21Var, com.yandex.go.address.address_map_picker.domain.f fVar, com.yandex.go.address.address_map_picker.domain.e eVar, l110 l110Var, j11 j11Var, ysd0 ysd0Var, o31 o31Var) {
        super(null);
        this.D = mf00Var;
        this.E = ah00Var;
        this.F = x11Var;
        this.G = gVar;
        this.H = cVar;
        this.I = p01Var;
        this.J = addressMapPickerAddressStateRepository;
        this.K = g21Var;
        this.L = fVar;
        this.M = eVar;
        this.N = l110Var;
        this.O = j11Var;
        this.P = ysd0Var;
        this.Q = o31Var;
        this.R = new sls() { // from class: com.yandex.go.address.address_map_picker.navigation.a
            @Override // defpackage.sls
            public final Object invoke() {
                f fVar2 = f.this;
                tje.N(fVar2.o(), null, null, new AddressMapPickerMapLayerRouterImpl$massTransitStopMovePinCallback$1$1(fVar2, null), 3);
                return zy11.a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0063, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // defpackage.h55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Object obj) {
        RoutePointType e;
        m01 m01Var = (m01) obj;
        AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository = this.J;
        addressMapPickerAddressStateRepository.b.g(null);
        this.D.a(this, new v5(9, this, m01Var));
        int i = 3;
        kotlinx.coroutines.flow.e.H(o(), new jqr(addressMapPickerAddressStateRepository.d, new AddressMapPickerMapLayerRouterImpl$observeCorrectedGeoPoint$1(this, null), i));
        kotlinx.coroutines.flow.e.H(o(), new jqr(this.Q.b, new AddressMapPickerMapLayerRouterImpl$observeUserLocationRequests$1(this, null), i));
        tse o = o();
        com.yandex.go.address.address_map_picker.domain.f fVar = this.L;
        fVar.a(o);
        i11 a = this.O.a();
        if (a != null) {
            e = a.equals(f11.a) ? RoutePointType.FAVORITE : ooa1.e(ooa1.b(a));
        }
        e = ooa1.e(m01Var.b);
        this.M.a(o(), e, fVar);
        ((m110) this.N).b(this.R);
        ((ru.yandex.taxi.map_common.b) this.P).a(s.class, new e(this));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ((m110) this.N).a(this.R);
        ((ru.yandex.taxi.map_common.b) this.P).b(s.class);
        com.yandex.go.address.address_map_picker.domain.e eVar = this.M;
        pzt0 pzt0Var = eVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = eVar.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        eVar.d = null;
        eVar.e = null;
        com.yandex.go.address.address_map_picker.domain.f fVar = this.L;
        gl glVar = fVar.d;
        glVar.a = false;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) ((lp00) glVar.b);
        aVar.j(Participant.PIN);
        aVar.j(Participant.ONLY_STEM_OF_PIN);
        com.yandex.go.address.address_map_picker.domain.g gVar = fVar.a;
        ru.yandex.taxi.map.overlay.pickup.d dVar = gVar.e;
        if (dVar != null) {
            dVar.pause();
        }
        gVar.e = null;
        gVar.b.g(new fmb0(new dmb0()));
        fVar.b.a.Jg();
        fVar.c.detach();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        m01 m01Var = (m01) obj;
        i11 a = this.O.a();
        if (a == null) {
            a = g11.a;
        }
        tje.N(o(), null, null, new AddressMapPickerMapLayerRouterImpl$onLaunch$1(this, m01Var, a, null), 3);
    }
}
