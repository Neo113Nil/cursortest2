package defpackage;

import android.content.Context;
import com.yandex.go.flex.common.ui.theme.f;
import com.yandex.go.flex.main_screen.interactors.t;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.q;
import com.yandex.go.payments.shared.g;
import com.yandex.go.taxi.order.domain.interactors.p;
import com.yandex.go.taxi.order.experiments.h;
import com.yandex.go.taxi.order.repositories.c;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.communications.i;
import ru.yandex.taxi.personalstate.domain.interactor.e;
import ru.yandex.taxi.personalstate.domain.interactor.j;
import ru.yandex.taxi.settings.domain.factory.a;
import ru.yandex.taxi.utils.b;

/* loaded from: classes8.dex */
public final class awp0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ awp0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new p((h) ((swo0) xvf0Var).get(), (c) xvf0Var3.get(), (iup0) xvf0Var2.get());
            case 1:
                return new h4q0((f) ((a3g) xvf0Var).get(), (nsx) xvf0Var3.get(), (zxq0) ((a3g) xvf0Var2).get());
            case 2:
                return new j((e) ((sx2) xvf0Var).get(), (ru.yandex.taxi.personalstate.domain.interactor.f) xvf0Var3.get(), (s7b0) xvf0Var2.get());
            case 3:
                return new xuq0((tse) xvf0Var3.get(), (wgr) xvf0Var2.get(), (puq0) ((nup0) xvf0Var).get());
            case 4:
                return new ej1(19, (Context) xvf0Var3.get(), (w040) ((n4j0) xvf0Var).get(), (i130) xvf0Var2.get());
            case 5:
                return new a((po21) xvf0Var3.get(), (e3g0) xvf0Var2.get(), (i4u) ((wnw) xvf0Var).get());
            case 6:
                return new jer0((b) xvf0Var3.get(), (as21) xvf0Var2.get(), (x2r0) ((nup0) xvf0Var).get());
            case 7:
                return new g((tse) xvf0Var3.get(), (oep0) xvf0Var2.get(), (x2b) xvf0Var);
            case 8:
                return new com.yandex.go.sharing_personal_goals.c((com.yandex.go.sharing_personal_goals.data.a) ((wjr0) xvf0Var).get(), (hsr0) ((kpp0) xvf0Var2).get(), (dsr0) xvf0Var3.get());
            case 9:
                return new com.yandex.go.mainscreen.superapp.orders.presentation.color.c((t) ((rxm0) xvf0Var).get(), (zuj0) xvf0Var3.get(), (pwy0) xvf0Var2.get());
            case 10:
                return new mus0((ow) ((eqh) xvf0Var).get(), (gd3) xvf0Var3.get(), (iv90) ((lej) xvf0Var2).get());
            case 11:
                return new gqt0((lx4) xvf0Var3.get(), (dei0) xvf0Var2.get(), (e400) ((mvy) xvf0Var).get());
            case 12:
                return new abu0((w030) xvf0Var3.get(), (n3h) xvf0Var2.get(), (z4m0) ((xj) xvf0Var).get());
            case 13:
                z6h z6hVar = (z6h) xvf0Var3.get();
                ((upj) xvf0Var).get();
                return new ugu0(z6hVar, (zuj0) xvf0Var2.get());
            case 14:
                return new xku0((fga0) xvf0Var3.get(), (drd) ((bt2) xvf0Var).get(), (lz90) xvf0Var2.get());
            case 15:
                return new i((tse) xvf0Var3.get(), (ru.yandex.taxi.banners.model.g) ((qy0) xvf0Var).get(), (jtq0) xvf0Var2.get());
            case 16:
                return new ru.yandex.taxi.summary.promotions.repository.a((pav) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (ru.yandex.taxi.summary.promotions.models.a) ((alv0) xvf0Var).get());
            case 17:
                return new com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing.c((uwn0) xvf0Var, (u5w0) ((my0) xvf0Var2).get(), (oep0) xvf0Var3.get());
            case 18:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.g((gb0) xvf0Var, (oep0) xvf0Var3.get(), (com.yandex.go.shortcuts.impl.experiments.a) ((f870) xvf0Var2).get());
            case 19:
                return new r9w0((i6r) xvf0Var3.get(), i5m.a((p7w0) xvf0Var), xvf0Var2);
            case 20:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.b((c0z0) xvf0Var3.get(), (q) ((sku0) xvf0Var).get(), (tt2) xvf0Var2.get());
            case 21:
                return new com.yandex.go.suggest.impl.data.flex.a((Context) ((lag) xvf0Var).get(), (tt2) ((lag) xvf0Var2).get(), (k6x) xvf0Var3.get());
            case 22:
                return new ru.yandex.taxi.surge.repository.b((ky2) xvf0Var3.get(), (vpw0) ((m5v0) xvf0Var).get(), (on2) xvf0Var2.get());
            case 23:
                return new com.yandex.go.account.am.a((tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (com.yandex.go.account.am.domain.a) ((rxm0) xvf0Var).get());
            case 24:
                return new z9x0((com.yandex.go.tappable_poi.b) ((ci3) xvf0Var).get(), (cax0) ((awp0) xvf0Var3).get(), (gax0) ((p7w0) xvf0Var2).get());
            case 25:
                return new cax0((com.yandex.go.layers.domain.g) xvf0Var3.get(), (eax0) xvf0Var2.get(), (gax0) ((p7w0) xvf0Var).get());
            case 26:
                return new uex0((ubx0) ((uzu0) xvf0Var).get(), (vex0) xvf0Var3.get(), (com.yandex.go.analytics.b) xvf0Var2.get());
            case 27:
                return new tfx0((ck31) xvf0Var3.get(), (bfx0) xvf0Var2.get(), (n3a) ((i5s0) xvf0Var).get());
            case 28:
                return new hqx0((tt2) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (sfx0) ((awp0) xvf0Var).get());
            default:
                return new wwx0((c0) xvf0Var3.get(), (iic0) xvf0Var2.get(), (t61) ((on11) xvf0Var).get());
        }
    }

    public /* synthetic */ awp0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = v7pVar;
    }

    public /* synthetic */ awp0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ awp0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
    }
}
