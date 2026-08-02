package defpackage;

import android.content.Context;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.dvizh_subscription.data.ChargersDvizhSubscriptionUrlApi;
import com.yandex.go.quark.ai_assistant.impl.router.d;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.am.internal.e;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.search.a;
import ru.yandex.taxi.search.b;

/* loaded from: classes8.dex */
public final class nf implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ nf(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new mf(i5m.a((lf) xvf0Var2), (fyn) ((uq2) xvf0Var).get());
            case 1:
                ((im51) xvf0Var2.get()).getClass();
                return (yw60) ((yly) xvf0Var).get();
            case 2:
                return new gv0((oep0) xvf0Var2.get(), (ee) xvf0Var);
            case 3:
                return new b((AddressInputView) ((lf) xvf0Var2).get(), (a) ((oe) xvf0Var).get());
            case 4:
                return new ej1((w030) xvf0Var2.get(), (j4n) ((bt2) xvf0Var).get());
            case 5:
                return new d((pw) xvf0Var2, (vgg0) xvf0Var.get());
            case 6:
                return new j02((mf00) ((y500) xvf0Var2).get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var.get(), 0);
            case 7:
                cot cotVar = (cot) ((cnt) xvf0Var2).get();
                hzk hzkVar = ((qu2) ((n3w) xvf0Var).a).a;
                n1d n1dVar = (n1d) cotVar.b;
                n1dVar.getClass();
                int i3 = 1;
                p2g p2gVar = new p2g(n1dVar, i3);
                com.yandex.delivery.live.location.api.a aVar = (com.yandex.delivery.live.location.api.a) i5m.b(new c8w(p2gVar, new p2g(n1dVar, 5), i5m.b(new ove(new q2g(i3, hzkVar), i5m.b(new bwy(i5m.b(new cnt(new p2g(n1dVar, 6), 17)), i2)), new p2g(n1dVar, 2), new p2g(n1dVar, i2), p2gVar)), new p2g(n1dVar, 4), new cnt(new p2g(n1dVar, 3), 19), new q2g(i2, hzkVar))).get();
                return aVar != null ? aVar : cvn.a;
            case 8:
                return new lb7(8, (cot) ((xv2) xvf0Var2).get(), (cxq0) ((alm) xvf0Var).get());
            case 9:
                return com.yandex.messaging.audio.b.a((Context) xvf0Var2.get(), (x7g) ((o8g) xvf0Var).get());
            case 10:
                return new com.yandex.go.intentprocessor.a((o) xvf0Var2.get(), (yn3) ((xv2) xvf0Var).get());
            case 11:
                return new o((c) xvf0Var2.get(), (e) ((jc60) xvf0Var).get());
            case 12:
                Context context = (Context) xvf0Var2.get();
                qp90 qp90Var = (qp90) ((jc60) xvf0Var).get();
                am2 am2Var = new am2();
                am2Var.a = context;
                am2Var.b = qp90Var;
                am2Var.c = kotlin.a.a(new d9(21, am2Var));
                return am2Var;
            case 13:
                return new com.yandex.go.taxi.order.promo_plaques.domain.c((ru.yandex.taxi.communications.b) ((qzb) xvf0Var2).get(), (ru.yandex.taxi.communications.data.a) xvf0Var.get());
            case 14:
                return new yg4((dne0) xvf0Var2.get(), (fwx) ((bvx) xvf0Var).get());
            case 15:
                jb7 jb7Var = (jb7) ((aj0) xvf0Var2).get();
                ((ck4) xvf0Var.get()).getClass();
                ln4 ln4Var = new ln4();
                vmw0 vmw0Var = (vmw0) jb7Var.c;
                q5z.h(vmw0Var);
                ru.yandex.taxi.badge.a aVar2 = (ru.yandex.taxi.badge.a) jb7Var.w;
                q5z.h(aVar2);
                cxq0 cxq0Var = (cxq0) jb7Var.b;
                q5z.h(cxq0Var);
                return new ru.yandex.taxi.badge.b(ln4Var, vmw0Var, aVar2, new au50(7, cxq0Var));
            case 16:
                return new sy4((oic) ((w8g) xvf0Var2).get(), (ny4) xvf0Var.get());
            case 17:
                return new com.yandex.go.beginners.analytics.a((o61) ((bi4) xvf0Var2).get(), (dho) xvf0Var.get());
            case 18:
                return new com.yandex.go.benefits_center.activation.data.a((wnt) xvf0Var2.get(), (bi4) xvf0Var);
            case 19:
                return new h0w(27, (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var2.get(), (bo5) ((fn5) xvf0Var).get());
            case 20:
                return new com.yandex.go.benefits_center.claim.data.a((wnt) xvf0Var2.get(), (fn5) xvf0Var);
            case 21:
                return new w76((pdc) ((m2g) xvf0Var).get(), (Context) ((m2g) xvf0Var2).get());
            case 22:
                return new ru.yandex.taxi.widgets.domain.a((k7x0) xvf0Var2.get(), (ru.yandex.taxi.widgets.domain.c) ((jqz0) xvf0Var).get());
            case 23:
                return new lb7(13, (tt2) ((m2g) xvf0Var2).get(), (ah00) ((m2g) xvf0Var).get());
            case 24:
                return new u48((com.yandex.go.taxi.order.repositories.c) xvf0Var2.get(), (t48) ((gw7) xvf0Var).get());
            case 25:
                return new com.yandex.go.logistics.cargo_flow.route_selector.a((com.yandex.go.logistics.cargo_flow.route_selector.b) ((vw2) xvf0Var2).get(), (a3v) xvf0Var.get());
            case 26:
                return new com.yandex.go.logistics.cargo_flow.route_selector.c((com.yandex.go.pin.api.widget.b) ((b900) xvf0Var2).get(), (k7x0) xvf0Var.get());
            case 27:
                return new a29((z19) xvf0Var2.get(), (b1) ((ig7) xvf0Var).get());
            case 28:
                return new ap9((m19) xvf0Var2, (nl9) xvf0Var);
            default:
                return new com.yandex.go.chargers.dvizh_subscription.data.a((f) ((fr3) xvf0Var2).get(), (ChargersDvizhSubscriptionUrlApi) ((nl9) xvf0Var).get());
        }
    }
}
