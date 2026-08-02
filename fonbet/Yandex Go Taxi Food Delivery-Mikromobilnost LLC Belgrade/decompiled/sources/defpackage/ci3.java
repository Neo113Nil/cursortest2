package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.antirobot.experiment.b;
import com.yandex.go.captcha.d;
import com.yandex.go.chargers.dvizh_subscription.data.a;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.go.taxi.order.change.source.interactor.b0;
import com.yandex.messaging.MessengerEnvironment;
import ru.yandex.taxi.altpins.order.p;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.cashback.interactors.i;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.map_common.map.n;

/* loaded from: classes.dex */
public final class ci3 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;

    public ci3(oag oagVar, xvf0 xvf0Var, xvf0 xvf0Var2, p9p p9pVar, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var3, n3w n3wVar3, xvf0 xvf0Var4) {
        this.a = 22;
        this.f = oagVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = p9pVar;
        this.h = n3wVar;
        this.i = n3wVar2;
        this.d = xvf0Var3;
        this.j = n3wVar3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.b;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.c;
        switch (i) {
            case 0:
                return new d((i38) xvf0Var6.get(), (jj3) xvf0Var9.get(), (ji3) xvf0Var7, (g) xvf0Var5.get(), (b) xvf0Var8.get(), (fb20) xvf0Var.get(), (oep0) xvf0Var4.get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get());
            case 1:
                return new com.yandex.go.chargers.dvizh_subscription.web.b((w030) xvf0Var6.get(), (sh41) xvf0Var9.get(), (gf41) xvf0Var5.get(), (lma) xvf0Var8.get(), this.f, this.g, (qx9) ((n3w) xvf0Var3).a, (a) ((nf) xvf0Var2).get(), (com.yandex.go.chargers.dvizh_subscription.web.a) ((w10) xvf0Var7).get());
            case 2:
                c cVar = (c) xvf0Var8.get();
                lux luxVar = (lux) xvf0Var.get();
                i iVar = (i) ((xyd0) xvf0Var7).get();
                ru.yandex.taxi.deeplinks.b bVar = (ru.yandex.taxi.deeplinks.b) xvf0Var4.get();
                i130 i130Var = (i130) xvf0Var3.get();
                return new com.yandex.go.tips.navigation.a((Activity) xvf0Var6.get(), (rgz0) xvf0Var9.get(), this.d, (jwx0) xvf0Var2, cVar, luxVar, iVar, bVar, i130Var);
            case 3:
                return new f((st2) xvf0Var6.get(), (ru.yandex.taxi.logistics.sdk.management.deliveries.d) xvf0Var9.get(), (duh) xvf0Var5.get(), (ru.yandex.taxi.logistics.sdk.management.delivery_tasks.cancel.a) xvf0Var8.get(), (ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d) xvf0Var.get(), (j2s) xvf0Var4.get(), (ru.yandex.taxi.logistics.sdk.performer_position.impl.a) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.management.a) ((bt2) xvf0Var7).get(), (aci) xvf0Var2.get());
            case 4:
                return new dgi((Moshi) xvf0Var6.get(), (xwa0) xvf0Var9.get(), (ow) xvf0Var5.get(), (ovd0) xvf0Var8.get(), (s701) xvf0Var.get(), (j5v) xvf0Var4.get(), (hxb0) xvf0Var3.get(), (ga90) xvf0Var2.get(), (gp50) ((of7) xvf0Var7).get());
            case 5:
                return new nzi((mzs) xvf0Var6.get(), (wiq0) xvf0Var9.get(), (com.yandex.go.route.interactor.c) xvf0Var5.get(), (l56) ((fn5) xvf0Var2).get(), (zuj0) xvf0Var8.get(), (rjt0) xvf0Var.get(), (avd0) ((g970) xvf0Var7).get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var4.get(), (oep0) xvf0Var3.get());
            case 6:
                return new bu0((Activity) xvf0Var6.get(), (xhm) ((lyh) xvf0Var2).get(), (pav) xvf0Var9.get(), (qmp) xvf0Var5.get(), (jgv) xvf0Var8.get(), (jim) xvf0Var.get(), (k48) xvf0Var4.get(), (bjm) xvf0Var3.get(), (x) xvf0Var7);
            case 7:
                return new ru.yandex.taxi.superapp.orders.eats.a((tt2) xvf0Var6.get(), (tse) xvf0Var9.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var5.get(), (wmh) xvf0Var8.get(), (k7x0) xvf0Var.get(), (hzk) ((can) xvf0Var2).get(), (com.yandex.go.order.ui.presentation.item_type.eats_order.mappers.timeline.a) ((t6i) xvf0Var7).get(), (j) xvf0Var4.get(), (d501) xvf0Var3.get());
            case 8:
                return new com.yandex.go.shortcuts.impl.repository.i((d60) xvf0Var6.get(), (Context) xvf0Var9.get(), (e) xvf0Var5.get(), (tj60) xvf0Var8.get(), (com.yandex.go.shortcuts.impl.repository.j) xvf0Var.get(), (gsv0) xvf0Var4.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (n3a) ((f870) xvf0Var7).get(), (h980) xvf0Var2.get());
            case 9:
                return new com.yandex.go.inapp_calls.repository.c((q) xvf0Var6.get(), (tt2) xvf0Var9.get(), (i7n) xvf0Var5.get(), (njv) xvf0Var8.get(), (Context) xvf0Var.get(), (zuj0) xvf0Var4.get(), (jkv) xvf0Var3.get(), (t270) xvf0Var2.get(), (com.yandex.go.proxyprovision.j) ((cnt) xvf0Var7).get());
            case 10:
                return new j800((MainScreenBehavior) xvf0Var6.get(), (bc00) xvf0Var9.get(), (lx4) xvf0Var5.get(), (ma1) xvf0Var8.get(), (as21) xvf0Var.get(), (ms2) xvf0Var4.get(), (t4s0) xvf0Var3.get(), (pa00) ((y500) xvf0Var7).get(), (e400) xvf0Var2.get());
            case 11:
                return new n((Application) xvf0Var6.get(), (tt2) xvf0Var9.get(), (bg00) xvf0Var5.get(), (v2u0) xvf0Var8.get(), (byn) xvf0Var.get(), (ru.yandex.taxi.map_common.map.experiment.a) xvf0Var4.get(), (fk00) xvf0Var3.get(), (ok00) xvf0Var2.get(), (hzk) ((can) xvf0Var7).get());
            case 12:
                return new com.yandex.messaging.a((Context) xvf0Var6.get(), (eke) xvf0Var9.get(), i5m.a(xvf0Var5), (MessengerEnvironment) xvf0Var8.get(), (SharedPreferences) xvf0Var.get(), (x22) xvf0Var4.get(), (q120) xvf0Var3.get(), (yz10) xvf0Var2.get(), (m2v) ((cg7) xvf0Var7).get());
            case 13:
                return new com.yandex.go.taxi.summary.mobilityhub.router.a(this.b, (bt00) xvf0Var9.get(), (com.yandex.go.route.interactor.b) xvf0Var5.get(), (nv20) xvf0Var8.get(), (c2v) xvf0Var.get(), (i6r) xvf0Var4.get(), this.h, (mum) ((p9p) xvf0Var7).get(), this.i);
            case 14:
                return new ru.yandex.taxi.masstransit.mapper.a((Context) xvf0Var6.get(), (zuj0) xvf0Var9.get(), (pwy0) xvf0Var5.get(), (wdt0) xvf0Var8.get(), (zzi) xvf0Var.get(), (h640) xvf0Var4.get(), (kj40) xvf0Var3.get(), (ru.yandex.taxi.masstransit.mapper.f) ((s730) xvf0Var2).get(), (hio) ((s730) xvf0Var7).get());
            case 15:
                return new com.yandex.go.lifecycle.processor.d(i5m.a((y2r0) xvf0Var2), (tt2) xvf0Var6.get(), (tse) xvf0Var9.get(), i5m.a(xvf0Var5), i5m.a(xvf0Var8), i5m.a(xvf0Var), (com.yandex.go.lifecycle.a) xvf0Var4.get(), i5m.a((mt2) xvf0Var7), i5m.a(xvf0Var3));
            case 16:
                return new com.yandex.go.taxi.order.push.handlers.a((tse) xvf0Var6.get(), i5m.a(xvf0Var9), i5m.a(xvf0Var5), i5m.a(xvf0Var8), i5m.a(xvf0Var), i5m.a((eqh) xvf0Var7), i5m.a(xvf0Var4), (wnt) xvf0Var3.get(), i5m.a(xvf0Var2));
            case 17:
                return new com.yandex.go.taxi.order.promotions.notification.a((n20) xvf0Var6.get(), (tj60) xvf0Var9.get(), (com.yandex.go.taxi.order.promotions.notification.ui.b) ((npe0) xvf0Var).get(), (j0g) ((lyh) xvf0Var4).get(), (qqv) ((mwq) xvf0Var3).get(), (ru.yandex.taxi.communications.data.a) xvf0Var5.get(), (q980) ((f870) xvf0Var2).get(), (com.yandex.go.navigation.screen.c) xvf0Var8.get(), (nw70) ((f870) xvf0Var7).get());
            case 18:
                return new com.yandex.go.profile.domain.divkit.variables.c((Context) ((i5g) xvf0Var9).get(), i5m.a((u5g) xvf0Var5), i5m.a((u5g) xvf0Var8), i5m.a((u5g) xvf0Var), (jb7) ((u5g) xvf0Var4).get(), (agf0) xvf0Var6.get(), i5m.a((i5g) xvf0Var3), i5m.a((u5g) xvf0Var2), i5m.a((u5g) xvf0Var7));
            case 19:
                return new pef0((Context) ((i5g) xvf0Var8).get(), (jef0) xvf0Var6.get(), (u5g) xvf0Var, (fxl) xvf0Var9.get(), (a850) ((u5g) xvf0Var4).get(), (w030) ((u5g) xvf0Var3).get(), (nni0) ((u5g) xvf0Var2).get(), (v3u0) ((u5g) xvf0Var7).get(), (com.yandex.div.core.expression.variables.a) xvf0Var5.get());
            case 20:
                return new mgf0((tse) ((u5g) xvf0Var3).get(), (jp50) xvf0Var6.get(), (x1f0) xvf0Var9.get(), (com.yandex.go.account.user_verification.domain.i) xvf0Var5.get(), i5m.a((i5g) xvf0Var2), i5m.a(xvf0Var8), i5m.a((u5g) xvf0Var7), i5m.a(xvf0Var), (tt2) xvf0Var4.get());
            case 21:
                return new t7j0((zuj0) xvf0Var6.get(), (cpw0) xvf0Var9.get(), (bko) xvf0Var5.get(), (xox0) ((m5v0) xvf0Var8).get(), (au50) ((kyd) xvf0Var).get(), (dmw0) ((m5v0) xvf0Var4).get(), (vo40) ((k220) xvf0Var3).get(), (am2) ((oe) xvf0Var2).get(), (nlw0) ((p7w0) xvf0Var7).get());
            case 22:
                return new com.yandex.go.suggest.impl.data.a((y9y0) ((oag) xvf0Var).get(), (com.yandex.div.core.expression.variables.a) xvf0Var6.get(), (gfw0) xvf0Var9.get(), (u7r) ((p9p) xvf0Var4).get(), (tse) ((n3w) xvf0Var3).a, (zvv) ((n3w) xvf0Var2).a, (dfw0) xvf0Var5.get(), (f8v0) ((n3w) xvf0Var7).a, (swp0) xvf0Var8.get());
            case 23:
                return new com.yandex.go.tappable_poi.b((ah00) xvf0Var6.get(), (gax0) ((p7w0) xvf0Var2).get(), (com.yandex.go.tappable_poi.experiments.c) ((p7w0) xvf0Var7).get(), (eax0) xvf0Var9.get(), i5m.a(xvf0Var5), (com.yandex.go.navigation.screen.c) xvf0Var8.get(), (bt00) xvf0Var.get(), (p2y0) xvf0Var4.get(), (tt2) xvf0Var3.get());
            case 24:
                l7s0 l7s0Var = (l7s0) ((abx0) xvf0Var7).get();
                uex0 uex0Var = (uex0) xvf0Var4.get();
                c2x0 c2x0Var = (c2x0) xvf0Var3.get();
                return new afx0((nfx0) xvf0Var6.get(), (rfx0) xvf0Var9.get(), (Context) xvf0Var5.get(), (w030) xvf0Var8.get(), this.f, (eqh) xvf0Var2, l7s0Var, uex0Var, c2x0Var);
            case 25:
                return new rg11((Context) xvf0Var6.get(), (w030) xvf0Var9.get(), (tt2) xvf0Var5.get(), (on2) xvf0Var8.get(), (zuj0) xvf0Var.get(), (ru.yandex.taxi.design.utils.a) xvf0Var4.get(), (ufb0) ((g430) xvf0Var7).get(), (pho) xvf0Var3.get(), (wnt) xvf0Var2.get());
            case 26:
                return new com.yandex.go.ugc.f((ru.yandex.taxi.deeplinks.b) xvf0Var6.get(), (ru.yandex.taxi.web.deeplink.a) xvf0Var9.get(), (po21) xvf0Var5.get(), (gf41) xvf0Var8.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get(), (bs11) ((n3w) xvf0Var2).a, (hlx0) ((umt0) xvf0Var7).get(), (lg21) xvf0Var4.get(), (rqo) xvf0Var3.get());
            case 27:
                return new b0((ru.yandex.taxi.persuggest.domain.g) xvf0Var6.get(), (com.yandex.go.taxi.order.change.common.domain.d) xvf0Var9.get(), (po21) xvf0Var5.get(), (v7j0) xvf0Var8.get(), (com.yandex.go.taxi.order.change.source.interactor.c) ((if9) xvf0Var7).get(), (ru.yandex.taxi.systemrequeirements.location.n) xvf0Var.get(), (com.yandex.go.taxi.order.change.source.data.e) xvf0Var4.get(), (com.yandex.go.taxi.order.change.source.interactor.e) xvf0Var3.get(), (rv0) xvf0Var2.get());
            case 28:
                Context context = (Context) xvf0Var6.get();
                kf21 kf21Var = (kf21) xvf0Var9.get();
                re21 re21Var = (re21) xvf0Var5.get();
                se21 se21Var = (se21) xvf0Var8.get();
                qe21 qe21Var = (qe21) xvf0Var.get();
                xf21 xf21Var = (xf21) xvf0Var4.get();
                return q501.B(qe21Var, re21Var, se21Var, (jf21) xvf0Var2.get(), kf21Var, (lf21) xvf0Var3.get(), xf21Var, (ag21) ((on11) xvf0Var7).get(), context);
            default:
                return new p((tt2) xvf0Var6.get(), (pdc) xvf0Var9.get(), (ru.yandex.taxi.altpins.order.f) xvf0Var5.get(), (hit) xvf0Var8.get(), (ysg) xvf0Var.get(), (e02) xvf0Var4.get(), (wt00) ((sp00) xvf0Var7).get(), (ru.yandex.taxi.design.utils.b) xvf0Var3.get(), (pwy0) xvf0Var2.get());
        }
    }

    public /* synthetic */ ci3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.i = v7pVar;
        this.j = v7pVar2;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ ci3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.j = v7pVar;
        this.h = v7pVar2;
        this.i = xvf0Var7;
    }

    public /* synthetic */ ci3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, v7p v7pVar, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.j = v7pVar;
        this.i = xvf0Var8;
    }

    public /* synthetic */ ci3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = v7pVar;
    }

    public /* synthetic */ ci3(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, v7p v7pVar4, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = v7pVar2;
        this.i = v7pVar3;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.j = v7pVar4;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
    }

    public ci3(eqh eqhVar, xvf0 xvf0Var, npe0 npe0Var, lyh lyhVar, mwq mwqVar, xvf0 xvf0Var2, f870 f870Var, xvf0 xvf0Var3, f870 f870Var2) {
        this.a = 17;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.f = npe0Var;
        this.g = lyhVar;
        this.h = mwqVar;
        this.d = xvf0Var2;
        this.i = f870Var;
        this.e = xvf0Var3;
        this.j = f870Var2;
    }

    public ci3(oj ojVar, xvf0 xvf0Var, eqh eqhVar, gwb0 gwb0Var, if9 if9Var, xvf0 xvf0Var2, of7 of7Var, r10 r10Var, lf lfVar) {
        this.a = 27;
        this.b = ojVar;
        this.c = xvf0Var;
        this.d = eqhVar;
        this.e = gwb0Var;
        this.j = if9Var;
        this.f = xvf0Var2;
        this.g = of7Var;
        this.h = r10Var;
        this.i = lfVar;
    }

    public ci3(n3w n3wVar, lyh lyhVar, xvf0 xvf0Var, xvf0 xvf0Var2, rqt rqtVar, xvf0 xvf0Var3, xvf0 xvf0Var4, upj upjVar, x xVar) {
        this.a = 6;
        this.b = n3wVar;
        this.i = lyhVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = rqtVar;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = upjVar;
        this.j = xVar;
    }

    public ci3(xvf0 xvf0Var, xvf0 xvf0Var2, ji3 ji3Var, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, eqh eqhVar2, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 0;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.j = ji3Var;
        this.d = eqhVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = eqhVar2;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
    }

    public ci3(u5g u5gVar, xvf0 xvf0Var, u5g u5gVar2, u5g u5gVar3, i5g i5gVar, i5g i5gVar2, u5g u5gVar4, xvf0 xvf0Var2, i5g i5gVar3) {
        this.a = 20;
        this.h = u5gVar;
        this.b = xvf0Var;
        this.c = u5gVar2;
        this.d = u5gVar3;
        this.i = i5gVar;
        this.e = i5gVar2;
        this.j = u5gVar4;
        this.f = xvf0Var2;
        this.g = i5gVar3;
    }

    public ci3(xvf0 xvf0Var, xvf0 xvf0Var2, cui cuiVar, xvf0 xvf0Var3, eqh eqhVar, eqh eqhVar2, eqh eqhVar3, xvf0 xvf0Var4, eqh eqhVar4) {
        this.a = 16;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = cuiVar;
        this.e = xvf0Var3;
        this.f = eqhVar;
        this.j = eqhVar2;
        this.g = eqhVar3;
        this.h = xvf0Var4;
        this.i = eqhVar4;
    }

    public ci3(xvf0 xvf0Var, p7w0 p7w0Var, p7w0 p7w0Var2, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7) {
        this.a = 23;
        this.b = xvf0Var;
        this.i = p7w0Var;
        this.j = p7w0Var2;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public ci3(i5g i5gVar, xvf0 xvf0Var, u5g u5gVar, xvf0 xvf0Var2, u5g u5gVar2, u5g u5gVar3, u5g u5gVar4, u5g u5gVar5, xvf0 xvf0Var3) {
        this.a = 19;
        this.e = i5gVar;
        this.b = xvf0Var;
        this.f = u5gVar;
        this.c = xvf0Var2;
        this.g = u5gVar2;
        this.h = u5gVar3;
        this.i = u5gVar4;
        this.j = u5gVar5;
        this.d = xvf0Var3;
    }

    public ci3(y2r0 y2r0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar, xvf0 xvf0Var4, xvf0 xvf0Var5, mt2 mt2Var, xvf0 xvf0Var6) {
        this.a = 15;
        this.i = y2r0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = eqhVar;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.j = mt2Var;
        this.h = xvf0Var6;
    }

    public ci3(i5g i5gVar, u5g u5gVar, u5g u5gVar2, u5g u5gVar3, u5g u5gVar4, xvf0 xvf0Var, i5g i5gVar2, u5g u5gVar5, u5g u5gVar6) {
        this.a = 18;
        this.c = i5gVar;
        this.d = u5gVar;
        this.e = u5gVar2;
        this.f = u5gVar3;
        this.g = u5gVar4;
        this.b = xvf0Var;
        this.h = i5gVar2;
        this.i = u5gVar5;
        this.j = u5gVar6;
    }
}
