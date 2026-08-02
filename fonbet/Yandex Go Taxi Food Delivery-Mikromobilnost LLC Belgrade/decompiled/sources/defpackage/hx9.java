package defpackage;

import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.linked_order.router.LinkedOrderScreen;
import com.yandex.go.preorder.mode.SourcePointMode;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.linked_order.a;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes12.dex */
public final class hx9 extends h55 {
    public final /* synthetic */ int D = 1;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public Object Q;

    public hx9(biv0 biv0Var, c9l0 c9l0Var, zqz0 zqz0Var, e eVar, rut rutVar, a aVar, a3v a3vVar, xvw xvwVar, kjt0 kjt0Var, ah00 ah00Var, tft0 tft0Var, uq40 uq40Var, sni0 sni0Var) {
        super(null);
        this.E = biv0Var;
        this.F = c9l0Var;
        this.G = zqz0Var;
        this.H = eVar;
        this.I = rutVar;
        this.J = aVar;
        this.K = a3vVar;
        this.L = xvwVar;
        this.M = kjt0Var;
        this.N = ah00Var;
        this.O = tft0Var;
        this.P = uq40Var;
        this.Q = sni0Var;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        Object value;
        switch (this.D) {
            case 0:
                ax9 ax9Var = (ax9) obj;
                vn9 vn9Var = (vn9) this.I;
                vn9Var.b();
                r0 r0Var = vn9Var.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wn9.a((wn9) value, false, true, false, false, false, 29)));
                ((cyx) this.O).b(new byx(Screen.DISCOVERY, new c430(Mode.CHARGERS, (b) null, (un0) null)));
                ru.yandex.taxi.discovery.b bVar = (ru.yandex.taxi.discovery.b) this.F;
                jx9 jx9Var = (jx9) this.J;
                jx9Var.j = ax9Var.a;
                jx9Var.k = new c29(6, this);
                this.Q = bVar.b(new mwj("charger", "discovery_chargers", null, new sw80(jx9Var)), new ex9(this, 0));
                fva0.b((fva0) this.H, ChargersPerfEvent.DISCOVERY.getKey(), null, null, 6);
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        Object value;
        Object value2;
        switch (this.D) {
            case 0:
                vn9 vn9Var = (vn9) this.I;
                r0 r0Var = vn9Var.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wn9.a((wn9) value, false, false, false, false, false, 29)));
                r0 r0Var2 = vn9Var.a;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, wn9.a((wn9) value2, false, false, false, false, false, 30)));
                e90 e90Var = (e90) this.Q;
                if (e90Var != null) {
                    e90Var.f();
                }
                this.Q = null;
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        LinkedOrderScreen linkedOrderScreen;
        switch (this.D) {
            case 1:
                sny snyVar = (sny) obj;
                jpv0 b = ((biv0) this.E).b();
                b.getClass();
                if ((b instanceof fpv0) && !((c9l0) this.F).b() && !((zqz0) this.G).a()) {
                    xni0 xni0Var = ((com.yandex.go.promocodes.referral.impl.ui.b) ((sni0) this.Q)).a;
                    xni0Var.F = true;
                    xni0Var.Lg(xni0Var.B, xni0Var.z.a.b());
                    uq40 uq40Var = (uq40) this.P;
                    if (uq40Var.d()) {
                        uq40Var.b();
                    }
                    ((e) this.H).h(SourcePointMode.LINKED_ORDER, false, false);
                    int i = dpy.a[snyVar.b.ordinal()];
                    if (i == 1) {
                        linkedOrderScreen = LinkedOrderScreen.ORDER_INFO;
                    } else if (i != 2) {
                        w511.b();
                        break;
                    } else {
                        linkedOrderScreen = LinkedOrderScreen.AMBULANCE_ORDER;
                    }
                    E((m950) ((rut) this.I).get(), new poy(snyVar.a, linkedOrderScreen, (a3v) this.K, ((a) this.J).s), new j2f(this, 3), hxx.a);
                    break;
                } else {
                    r(new qu(9));
                    break;
                }
                break;
        }
    }

    public hx9(zuj0 zuj0Var, ru.yandex.taxi.discovery.b bVar, w030 w030Var, fva0 fva0Var, vn9 vn9Var, ut utVar, jx9 jx9Var, pxf pxfVar, cyx cyxVar, ba9 ba9Var, h3y h3yVar, yc ycVar, com.yandex.go.chargers.data.e eVar, g6 g6Var, yc ycVar2) {
        super(null);
        this.E = zuj0Var;
        this.F = bVar;
        this.G = w030Var;
        this.H = fva0Var;
        this.I = vn9Var;
        this.J = jx9Var;
        this.K = pxfVar;
        this.O = cyxVar;
        this.L = ba9Var;
        this.P = h3yVar;
        this.M = ycVar;
        this.N = ycVar2;
    }
}
