package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.composite.navigation.a;
import com.yandex.go.payments.data.PaymentsApi;
import com.yandex.go.payments.data.c;
import com.yandex.go.payments.data.h;
import com.yandex.go.payments.domain.m;
import com.yandex.go.payments.paymentlist.details.d;
import com.yandex.go.payments.paymentlist.ui.b;
import com.yandex.go.safety.center.experiment.p;
import com.yandex.go.safety.center.k;
import com.yandex.go.scooters.domain.h0;
import com.yandex.go.shortcuts.impl.interactors.n;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.shortcuts.impl.interactors.x;
import com.yandex.go.zone.repository.o;
import java.util.Set;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.cashback.router.f;
import ru.yandex.taxi.settings.api.PushSettingsApi;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes8.dex */
public final class m9a0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public m9a0(m2g m2gVar, n2g n2gVar, n2g n2gVar2, m2g m2gVar2, xvf0 xvf0Var) {
        this.a = 9;
        this.c = m2gVar;
        this.d = n2gVar;
        this.e = n2gVar2;
        this.f = m2gVar2;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.f;
        switch (i) {
            case 0:
                return new b((tt2) xvf0Var3.get(), (b600) xvf0Var4.get(), (d) ((tj70) xvf0Var5).get(), (k7x0) xvf0Var.get(), (pdc) xvf0Var2.get());
            case 1:
                return new a((oaa0) ((n3w) xvf0Var2).a, (paa0) ((xkw) xvf0Var5).get(), this.b, (vj4) xvf0Var4.get(), (f9y0) xvf0Var.get());
            case 2:
                return new mba0((jb7) ((zw30) xvf0Var4).get(), (kt51) ((i5g) xvf0Var).get(), (v9a0) ((i5g) xvf0Var2).get(), (pmn) xvf0Var3.get(), (uba0) ((n3w) xvf0Var5).a);
            case 3:
                return new h((String) xvf0Var3.get(), (PaymentsApi) xvf0Var4.get(), (m) ((bvx) xvf0Var2).get(), (fc7) xvf0Var.get(), (c) ((c3g) xvf0Var5).get());
            case 4:
                return new ru.yandex.taxi.personalstate.data.remote.a((w6b0) xvf0Var3.get(), (c6b0) xvf0Var4.get(), (z6b0) xvf0Var.get(), (xku0) xvf0Var2.get(), i5m.a((g970) xvf0Var5));
            case 5:
                return new bqb0((ah00) xvf0Var3.get(), (sxx) ((etx) xvf0Var5).get(), (pdc) xvf0Var4.get(), (tt2) xvf0Var.get(), (Context) xvf0Var2.get());
            case 6:
                return new stc0((tt2) xvf0Var3.get(), (k1w0) ((alv0) xvf0Var).get(), (tig0) ((yvr0) xvf0Var2).get(), (com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a) ((l20) xvf0Var5).get(), (com.yandex.go.flex.main_screen.domain.h) xvf0Var4.get());
            case 7:
                return new vqd0(i5m.a((u5g) xvf0Var3), i5m.a((i5g) xvf0Var4), i5m.a((u5g) xvf0Var), i5m.a((i5g) xvf0Var2), i5m.a((i5g) xvf0Var5));
            case 8:
                return new xus((ney) xvf0Var3.get(), (vw2) xvf0Var5, (f) xvf0Var4.get(), this.d, (oqd0) xvf0Var2.get());
            case 9:
                return new ru.yandex.taxi.layers.source.factory.d((Context) ((m2g) xvf0Var4).get(), (ol40) ((n2g) xvf0Var).get(), (e) ((n2g) xvf0Var2).get(), (ru.yandex.taxi.widget.c) ((m2g) xvf0Var5).get(), (zyx) xvf0Var3.get());
            case 10:
                return new com.yandex.go.preload.f((dld0) xvf0Var5, (MainUiAvailabilityMonitor) xvf0Var3.get(), (ru.yandex.taxi.startup.launch.response.e) xvf0Var4.get(), (com.yandex.go.preload.a) xvf0Var.get(), (zuj0) xvf0Var2.get());
            case 11:
                return new com.yandex.go.route.interactor.b((dqe0) xvf0Var3.get(), (t41) xvf0Var4.get(), (l0j) xvf0Var.get(), i5m.a(xvf0Var2), (Set) ((y2r0) xvf0Var5).get());
            case 12:
                return new com.yandex.go.shortcuts.impl.factory.e((com.yandex.go.route.interactor.b) xvf0Var3.get(), (v5c0) ((xyd0) xvf0Var5).get(), (com.yandex.go.shortcuts.impl.experiments.f) xvf0Var4.get(), (c0z0) xvf0Var.get(), (xv11) xvf0Var2.get());
            case 13:
                return new n((com.yandex.go.route.interactor.b) xvf0Var3.get(), (c0z0) xvf0Var4.get(), (com.yandex.go.shortcuts.impl.factory.e) ((m9a0) xvf0Var2).get(), (v5c0) ((xyd0) xvf0Var5).get(), (tt2) xvf0Var.get());
            case 14:
                return new ddf0((ru.yandex.taxi.profile.a) xvf0Var3.get(), (g) xvf0Var4.get(), (u8w) ((xyd0) xvf0Var2).get(), (jj10) xvf0Var.get(), (ps21) ((im21) xvf0Var5).get());
            case 15:
                return new jef0((mir) xvf0Var3.get(), (jp50) xvf0Var4.get(), (fxl) xvf0Var.get(), (o370) ((edf0) xvf0Var2).get(), (fgl0) ((u5g) xvf0Var5).get());
            case 16:
                return new l4g0((PushSettingsApi) xvf0Var3.get(), (wnt) xvf0Var4.get(), (tt2) xvf0Var.get(), (q3g0) xvf0Var2.get(), (m4g0) ((n4g0) xvf0Var5).get());
            case 17:
                return new qfl0((pdi) ((z5i) xvf0Var2).get(), (b2l0) ((gwb0) xvf0Var5).get(), (tt2) xvf0Var3.get(), (leh) xvf0Var4.get(), (o) xvf0Var.get());
            case 18:
                return new k((qmp) xvf0Var3.get(), (p2y0) xvf0Var4.get(), (gqc) xvf0Var5, this.d, (p) xvf0Var2.get());
            case 19:
                return new oy7((Context) xvf0Var3.get(), (w030) xvf0Var4.get(), (com.yandex.go.beginners.safety.name.ui.b) ((lwl0) xvf0Var).get(), (com.yandex.go.beginners.safety.name.ui.a) ((z4k0) xvf0Var2).get(), (epl0) ((ggl0) xvf0Var5).get());
            case 20:
                return new com.yandex.go.scooters.domain.p((ky11) xvf0Var3.get(), (iy11) xvf0Var4.get(), (h0) ((z4k0) xvf0Var2).get(), (tqm0) ((lwl0) xvf0Var5).get(), (ru.yandex.taxi.scooters.data.g) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.scooters.data.data_source.b((tt2) xvf0Var3.get(), (tse) xvf0Var4.get(), (ru.yandex.taxi.launch.c) xvf0Var.get(), (ru.yandex.taxi.scooters.data.a) ((rxm0) xvf0Var2).get(), i5m.a((yxm0) xvf0Var5));
            case 22:
                return new com.yandex.go.scooters.zones.info.a((w030) xvf0Var3.get(), (fva0) xvf0Var4.get(), (s9p0) xvf0Var.get(), (w9p0) xvf0Var2.get(), (rxm0) xvf0Var5);
            case 23:
                return new ru.yandex.taxi.superapp.shortcuts.b((s721) xvf0Var3.get(), (w) xvf0Var4.get(), (tt2) xvf0Var.get(), (x) ((g970) xvf0Var2).get(), (com.yandex.go.shortcuts.impl.view.adapter.model.a) ((l20) xvf0Var5).get());
            case 24:
                return new ru.yandex.taxi.sdc.domain.c((tse) xvf0Var3.get(), (Lifecycle) xvf0Var4.get(), (srj0) ((zlf0) xvf0Var2).get(), (com.yandex.go.navigation.screen.c) xvf0Var.get(), (tmp0) ((swo0) xvf0Var5).get());
            case 25:
                return new xzq0(i5m.a(xvf0Var3), (lx4) xvf0Var4.get(), (iay0) xvf0Var.get(), this.e, i5m.a((gga0) xvf0Var5));
            case 26:
                return new m4r0((nrx0) xvf0Var3.get(), (com.yandex.go.taxi.tariffs.factory.a) ((l20) xvf0Var2).get(), (dqe0) xvf0Var4.get(), (com.yandex.go.taxi.tariffs.internal.repository.k) xvf0Var.get(), (yx1) ((n4j0) xvf0Var5).get());
            case 27:
                return new yrr0((rsr0) ((z4k0) xvf0Var2).get(), (com.yandex.go.sharing_personal_goals.c) ((awp0) xvf0Var5).get(), (Context) xvf0Var3.get(), (w030) xvf0Var4.get(), (y50) xvf0Var.get());
            case 28:
                return new com.yandex.go.shortcuts.impl.router.b(i5m.a(xvf0Var3), (hwz0) xvf0Var4.get(), (Context) ((u9g) xvf0Var).get(), (tse) ((u9g) xvf0Var2).get(), (wdz) ((sxn0) xvf0Var5).get());
            default:
                ((vrt0) xvf0Var5).get();
                com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) xvf0Var3.get();
                return new g2s0(bVar, (q960) xvf0Var2.get());
        }
    }

    public /* synthetic */ m9a0(v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.e = v7pVar;
        this.f = v7pVar2;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ m9a0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.f = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ m9a0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.f = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ m9a0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.f = v7pVar2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ m9a0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = v7pVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ m9a0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public m9a0(zw30 zw30Var, i5g i5gVar, i5g i5gVar2, kgn kgnVar, n3w n3wVar) {
        this.a = 2;
        this.c = zw30Var;
        this.d = i5gVar;
        this.e = i5gVar2;
        this.b = kgnVar;
        this.f = n3wVar;
    }

    public /* synthetic */ m9a0(int i, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
    }

    public m9a0(y2g y2gVar, alv0 alv0Var, yvr0 yvr0Var, l20 l20Var, p7w0 p7w0Var) {
        this.a = 6;
        this.b = y2gVar;
        this.d = alv0Var;
        this.e = yvr0Var;
        this.f = l20Var;
        this.c = p7w0Var;
    }

    public m9a0(xvf0 xvf0Var, l20 l20Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n4j0 n4j0Var) {
        this.a = 26;
        this.b = xvf0Var;
        this.e = l20Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = n4j0Var;
    }
}
