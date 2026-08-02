package com.yandex.go.navigator.alt_select;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.navigator.domain.t;
import defpackage.ad5;
import defpackage.ag31;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.e68;
import defpackage.ej40;
import defpackage.ffx;
import defpackage.hv1;
import defpackage.i650;
import defpackage.ig50;
import defpackage.jg50;
import defpackage.kip;
import defpackage.kyh0;
import defpackage.liq0;
import defpackage.m901;
import defpackage.m950;
import defpackage.n;
import defpackage.ne50;
import defpackage.ob31;
import defpackage.oc50;
import defpackage.ov1;
import defpackage.pe50;
import defpackage.pv1;
import defpackage.pwy0;
import defpackage.qe50;
import defpackage.r901;
import defpackage.re50;
import defpackage.rv1;
import defpackage.tje;
import defpackage.uyd;
import defpackage.wg50;
import defpackage.x1l0;
import defpackage.x240;
import defpackage.xb50;
import defpackage.xl10;
import defpackage.xng0;
import defpackage.ya50;
import defpackage.zuj0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class e extends ad5 {
    public final a A;
    public final com.yandex.go.navigator.address.e B;
    public final x1l0 C;
    public final com.yandex.go.navigator.domain.e D;
    public final ya50 E;
    public final m901 F;
    public final t G;
    public final liq0 H;
    public final uyd I;
    public final zuj0 J;
    public final com.yandex.go.navigator.a K;
    public final pwy0 L;
    public final ru.yandex.taxi.design.utils.b M;
    public final wg50 N;
    public final kip O;
    public final com.yandex.go.navigator.map_interactions.parkings.c P;
    public final ag31 Q;
    public final oc50 R;
    public final xb50 S;
    public final ah00 T;
    public final re50 U;
    public ob31 V;
    public final n0 W;
    public final xl10 x;
    public final boolean y;
    public final boolean z;

    public e(xl10 xl10Var, boolean z, boolean z2, a aVar, com.yandex.go.navigator.address.e eVar, x1l0 x1l0Var, com.yandex.go.navigator.domain.e eVar2, ya50 ya50Var, m901 m901Var, t tVar, liq0 liq0Var, uyd uydVar, zuj0 zuj0Var, com.yandex.go.navigator.a aVar2, pwy0 pwy0Var, ru.yandex.taxi.design.utils.b bVar, wg50 wg50Var, kip kipVar, com.yandex.go.navigator.map_interactions.parkings.c cVar, ag31 ag31Var, oc50 oc50Var, xb50 xb50Var, ah00 ah00Var, re50 re50Var) {
        super(hv1.class);
        this.x = xl10Var;
        this.y = z;
        this.z = z2;
        this.A = aVar;
        this.B = eVar;
        this.C = x1l0Var;
        this.D = eVar2;
        this.E = ya50Var;
        this.F = m901Var;
        this.G = tVar;
        this.H = liq0Var;
        this.I = uydVar;
        this.J = zuj0Var;
        this.K = aVar2;
        this.L = pwy0Var;
        this.M = bVar;
        this.N = wg50Var;
        this.O = kipVar;
        this.P = cVar;
        this.Q = ag31Var;
        this.R = oc50Var;
        this.S = xb50Var;
        this.T = ah00Var;
        this.U = re50Var;
        this.W = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public final rv1 Kg(qe50 qe50Var, e68 e68Var, r901 r901Var) {
        pe50 pe50Var;
        this.H.a(null);
        int i = kyh0.address_route_point_title;
        avj0 avj0Var = (avj0) this.J;
        AddressDTO addressDTO = new AddressDTO(null, null, null, null, avj0Var.h(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554399);
        PlainAddress.Companion.getClass();
        ((hv1) Dg()).render(new ov1(EmptyList.a, new qe50((qe50Var == null || (pe50Var = qe50Var.a) == null) ? null : pe50.a(pe50Var, null, Collections.singletonList(new ne50(new PlainAddress(addressDTO))), 1), qe50Var != null ? qe50Var.b : null, qe50Var != null ? qe50Var.c : null, new bdc(xng0.textMinor)), r901Var, e68Var));
        Lg();
        return new rv1(r901Var, new pv1(avj0Var.h(kyh0.mt_select_destination_address), avj0Var.h(kyh0.mt_will_show_routes), avj0Var.h(kyh0.delivery_form_add_address_button_title)));
    }

    public final void Lg() {
        tje.N(Jg(), null, null, new AltSelectPresenter$focusToSourceAddress$1(this, null), 3);
    }

    public final void Mg() {
        ((jg50) this.x.a).r(new ej40(24));
        i650 i650Var = this.E.a;
        i650Var.a.a("navigation.add_stop_to_route_plus_button.click", n.u(i650Var), 1, new HashMap());
    }

    public final void Ng() {
        jg50 jg50Var = (jg50) this.x.a;
        pe50 c = jg50Var.H.c();
        List list = c != null ? c.b : null;
        List list2 = list;
        int i = 23;
        if (list2 == null || list2.isEmpty()) {
            jg50Var.r(new ej40(i));
        } else if (list.size() > 1) {
            jg50Var.z((m950) jg50Var.I.get(), new ig50(jg50Var));
        } else {
            jg50Var.r(new x240(i, (ne50) kotlin.collections.a.P(list)));
        }
    }
}
