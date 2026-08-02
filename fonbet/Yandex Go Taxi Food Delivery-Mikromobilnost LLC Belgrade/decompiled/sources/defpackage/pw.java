package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.ai_widget.data.a;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.addmethod.domain.e;
import com.yandex.go.payments.data.p;
import com.yandex.go.route.interactor.b;
import com.yandex.go.zone.repository.r;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.authorized.j;
import java.util.Set;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.logistics.sdk.management.deliveries.d;

/* loaded from: classes.dex */
public final class pw implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public pw(xvf0 xvf0Var, qy0 qy0Var, p9p p9pVar, bi4 bi4Var, n4g0 n4g0Var, jqz0 jqz0Var, xvf0 xvf0Var2) {
        this.a = 28;
        this.b = xvf0Var;
        this.d = qy0Var;
        this.e = p9pVar;
        this.f = bi4Var;
        this.g = n4g0Var;
        this.h = jqz0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.b;
        xvf0 xvf0Var7 = this.h;
        switch (i) {
            case 0:
                return new ow((fw7) xvf0Var6.get(), (rsc) xvf0Var2.get(), i5m.a((v7p) xvf0Var4), i5m.a((lej) xvf0Var3), i5m.a(xvf0Var5), (gd3) xvf0Var.get(), (qc20) ((vrt0) xvf0Var7).get());
            case 1:
                return new e((b) xvf0Var6.get(), (fga0) xvf0Var2.get(), (syw) xvf0Var5.get(), (li0) ((x) xvf0Var4).get(), (m) xvf0Var.get(), (lw90) xvf0Var3.get(), (zuj0) xvf0Var7.get());
            case 2:
                y30 y30Var = (y30) xvf0Var2.get();
                qcp0 qcp0Var = (qcp0) xvf0Var5.get();
                hwy0 hwy0Var = (hwy0) xvf0Var.get();
                dci dciVar = (dci) xvf0Var4.get();
                jwh jwhVar = (jwh) xvf0Var3.get();
                ((vrt0) xvf0Var7).get();
                return new bc(y30Var, qcp0Var, hwy0Var, dciVar, jwhVar);
            case 3:
                return new ru.yandex.taxi.superapp.e((rqo) xvf0Var6.get(), (com.yandex.go.shortcuts.impl.interactors.m) xvf0Var2.get(), (c) xvf0Var5.get(), (jc00) xvf0Var.get(), (abf0) xvf0Var4.get(), i5m.a((x2b) xvf0Var3), (m2c0) xvf0Var7.get());
            case 4:
                return new com.yandex.go.quark.ai_assistant.impl.router.c((Context) xvf0Var6.get(), (w030) xvf0Var2.get(), (mjv0) xvf0Var5.get(), (aj0) xvf0Var4, this.e, (zuj0) xvf0Var3.get(), i5m.a((sxn0) xvf0Var7));
            case 5:
                return new com.yandex.go.ai_widget.router.b((Context) xvf0Var6.get(), (ra00) xvf0Var2.get(), (w030) xvf0Var5.get(), (a) xvf0Var.get(), (xn1) xvf0Var4.get(), (tp1) xvf0Var3.get(), (zp1) ((lk) xvf0Var7).get());
            case 6:
                return new com.yandex.go.overdraft.domain.b((tse) xvf0Var6.get(), (tt2) xvf0Var2.get(), (kug) ((e4f) xvf0Var4).get(), (p1m0) xvf0Var5.get(), (ql21) xvf0Var.get(), (p) xvf0Var3.get(), (ycq0) xvf0Var7.get());
            case 7:
                return new com.yandex.go.benefits_center.benefits.sdk.document.a((wnt) xvf0Var6.get(), (r) xvf0Var2.get(), (po21) xvf0Var5.get(), (cda0) xvf0Var.get(), (co5) xvf0Var4.get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var3.get(), (rz0) ((fn5) xvf0Var7).get());
            case 8:
                return new ru.yandex.taxi.layers.source.factory.componentfactory.r((Context) ((m2g) xvf0Var6).get(), (tt2) ((m2g) xvf0Var2).get(), (ru.yandex.taxi.map_common.map.utils.a) ((n2g) xvf0Var5).get(), (ru.yandex.taxi.widget.c) ((m2g) xvf0Var).get(), (sxx) ((etx) xvf0Var4).get(), (yuf0) ((r10) xvf0Var3).get(), (pwy0) ((n2g) xvf0Var7).get());
            case 9:
                return new qu7((Context) xvf0Var6.get(), (w030) xvf0Var2.get(), (c06) ((cg7) xvf0Var4).get(), (ra00) xvf0Var5.get(), this.e, (com.yandex.go.taxi.order.provider.a) xvf0Var3.get(), (n20) xvf0Var7.get());
            case 10:
                return new ru.yandex.taxi.logistics.sdk.management.delivery_tasks.cancel.a((com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var6.get(), (yuj0) xvf0Var2.get(), (d) xvf0Var5.get(), (ru.yandex.taxi.logistics.sdk.delivery.cancel.domain.b) ((o10) xvf0Var4).get(), (jwh) xvf0Var.get(), (j2s) ((cer) xvf0Var3).get(), (sfi) xvf0Var7.get());
            case 11:
                wi0 wi0Var = (wi0) xvf0Var7.get();
                return new com.yandex.go.payments.cards.pci_dss.verification.d((zuj0) xvf0Var6.get(), this.c, (v88) xvf0Var5.get(), (gf41) xvf0Var.get(), (aj0) xvf0Var4, (jwx0) xvf0Var3, wi0Var);
            case 12:
                return new com.yandex.go.cartech.navigation.b((w030) xvf0Var6.get(), (FragmentActivity) xvf0Var2.get(), (o19) xvf0Var5.get(), (ru.yandex.taxi.am.e) xvf0Var.get(), (g) xvf0Var4.get(), (a19) ((ur3) xvf0Var3).get(), (ru.yandex.taxi.deeplinks.b) xvf0Var7.get());
            case 13:
                return new com.yandex.go.chargers.order.domain.a((tt2) xvf0Var6.get(), (com.yandex.go.chargers.error.data.a) xvf0Var2.get(), (kl9) xvf0Var5.get(), (com.yandex.go.chargers.data.e) xvf0Var.get(), (com.yandex.go.chargers.order.domain.g) xvf0Var4.get(), (com.yandex.go.chargers.order.data.e) xvf0Var3.get(), (yvi0) ((of7) xvf0Var7).get());
            case 14:
                return new com.yandex.go.chargers.misc.support.b((fva0) xvf0Var6.get(), (w030) xvf0Var2.get(), (an41) xvf0Var5.get(), (com.yandex.go.chargers.data.g) xvf0Var.get(), this.f, (pva) ((n3w) xvf0Var3).a, (com.yandex.go.chargers.misc.support.c) ((w10) xvf0Var7).get());
            case 15:
                return new c2b((bst) xvf0Var6.get(), (yig0) xvf0Var2.get(), (ajg0) xvf0Var5.get(), (com.yandex.go.quark.dynamic.chat.c) xvf0Var.get(), (xiy0) xvf0Var4.get(), i5m.a(xvf0Var3), (com.yandex.go.quark.dynamic.chat.b) ((g970) xvf0Var7).get());
            case 16:
                return new com.yandex.messaging.internal.authorized.chat.b(i5m.a(xvf0Var6), (j) xvf0Var2.get(), (el21) xvf0Var5.get(), (p1b0) ((i0b0) xvf0Var4).get(), (i9b) ((o8g) xvf0Var3).get(), (kse) xvf0Var.get(), (xdf0) xvf0Var7.get());
            case 17:
                return new com.yandex.go.copter.city_tour.d((voe) xvf0Var6.get(), (yp2) xvf0Var2.get(), (wiq0) xvf0Var5.get(), (ru.yandex.taxi.widget.c) xvf0Var.get(), (pwb) xvf0Var4.get(), (com.yandex.go.copter.city_tour.c) ((swb) xvf0Var3).get(), (roe) xvf0Var7.get());
            case 18:
                return new com.yandex.messaging.internal.authorized.sync.d((Context) xvf0Var6.get(), (xdf0) xvf0Var2.get(), (SharedPreferences) xvf0Var5.get(), (SharedPreferences) xvf0Var.get(), (j) xvf0Var4.get(), (x22) xvf0Var3.get(), (eke) ((x2b) xvf0Var7).get());
            case 19:
                return new ore((dqe0) xvf0Var6.get(), (wiq0) xvf0Var2.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var5.get(), (ynm0) xvf0Var.get(), (hqj0) xvf0Var4.get(), (cjj0) ((my0) xvf0Var3).get(), (jjx0) xvf0Var7.get());
            case 20:
                return new com.yandex.go.mainscreen.superapp.impl.currentaddress.c((w030) xvf0Var6.get(), (yit) xvf0Var2.get(), (kr0) xvf0Var5.get(), (vef) ((vve) xvf0Var4).get(), (ref) xvf0Var.get(), this.g, (hnb0) xvf0Var7.get());
            case 21:
                return new com.yandex.go.delivery.push.a(i5m.a(xvf0Var6), i5m.a(xvf0Var2), i5m.a(xvf0Var5), i5m.a(xvf0Var), (wnt) xvf0Var4.get(), i5m.a(xvf0Var3), (eo5) ((qii) xvf0Var7).get());
            case 22:
                return new com.yandex.go.payments.drive.navigation.a((po21) xvf0Var6.get(), (cda0) xvf0Var2.get(), (com.yandex.go.payments.superapp.payment.b) xvf0Var5.get(), (apf) ((if9) xvf0Var4).get(), (kpi0) xvf0Var.get(), (apf) ((if9) xvf0Var3).get(), (raa0) xvf0Var7.get());
            case 23:
                return new zan((ru.yandex.taxi.am.g) xvf0Var6.get(), (com.yandex.go.preload.e) xvf0Var2.get(), (Lifecycle) xvf0Var5.get(), (tse) xvf0Var.get(), i5m.a(xvf0Var4), (dbn) xvf0Var3.get(), i5m.a((vd) xvf0Var7));
            case 24:
                return new ru.yandex.taxi.favorites.address.impl.ui.b((ru.yandex.taxi.favorites.address.impl.domain.b) xvf0Var6.get(), (ogp) xvf0Var2.get(), (ru.yandex.taxi.favorites.address.impl.domain.d) xvf0Var5.get(), (ru.yandex.taxi.favorites.address.impl.domain.a) ((p9p) xvf0Var).get(), (ru.yandex.taxi.favorites.address.impl.domain.c) ((cuo) xvf0Var4).get(), (ru.yandex.taxi.favorites.address.impl.domain.e) ((r2i) xvf0Var3).get(), (ndl0) ((zof0) xvf0Var7).get());
            case 25:
                Set set = (Set) xvf0Var6.get();
                Set set2 = (Set) xvf0Var2.get();
                Set set3 = (Set) xvf0Var5.get();
                return new com.yandex.go.flex.common.facade.modules.a(set, (com.yandex.go.flex.common.descriptors.action.a) xvf0Var.get(), (tt2) xvf0Var3.get(), set2, set3, (Set) xvf0Var4.get(), (Set) ((y2r0) xvf0Var7).get());
            case 26:
                return new com.yandex.messaging.internal.storage.folders.d((k020) xvf0Var6.get(), (lqo) xvf0Var2.get(), (sb7) xvf0Var5.get(), (kse) xvf0Var.get(), (at2) xvf0Var4.get(), (j) xvf0Var3.get(), (bxr) ((cuo) xvf0Var7).get());
            case 27:
                return new l7t((h2t) ((y1u) xvf0Var4).get(), (k020) xvf0Var6.get(), (w5t) xvf0Var2.get(), (zjt) ((a4t) xvf0Var3).get(), (o7t) xvf0Var5.get(), (el21) xvf0Var.get(), (kse) xvf0Var7.get());
            case 28:
                MessengerEnvironment messengerEnvironment = (MessengerEnvironment) xvf0Var6.get();
                ryh ryhVar = (ryh) ((qy0) xvf0Var5).get();
                e3r e3rVar = (e3r) ((p9p) xvf0Var).get();
                ((bi4) xvf0Var4).get();
                return new gsu(messengerEnvironment, ryhVar, e3rVar, (e3r) ((n4g0) xvf0Var3).get(), (to4) ((jqz0) xvf0Var7).get(), (gey0) xvf0Var2.get());
            default:
                return new com.yandex.go.taxi.summary.mobilityhub.deeplink.a((pn2) xvf0Var4, (k220) xvf0Var3, (o241) xvf0Var7, (ru.yandex.taxi.map_common.map.p) xvf0Var6.get(), (xes0) xvf0Var2.get(), (fx60) xvf0Var5.get(), (ru.yandex.taxi.deeplinks.e) xvf0Var.get());
        }
    }

    public /* synthetic */ pw(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = v7pVar;
        this.e = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
    }

    public /* synthetic */ pw(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ pw(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = v7pVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar2;
        this.h = v7pVar3;
    }

    public pw(gw7 gw7Var, xvf0 xvf0Var, v7p v7pVar, lej lejVar, xvf0 xvf0Var2, xvf0 xvf0Var3, vrt0 vrt0Var) {
        this.a = 0;
        this.b = gw7Var;
        this.c = xvf0Var;
        this.f = v7pVar;
        this.g = lejVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.h = vrt0Var;
    }

    public pw(y1u y1uVar, eqh eqhVar, xvf0 xvf0Var, a4t a4tVar, xvf0 xvf0Var2, edf0 edf0Var, xvf0 xvf0Var3) {
        this.a = 27;
        this.f = y1uVar;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.g = a4tVar;
        this.d = xvf0Var2;
        this.e = edf0Var;
        this.h = xvf0Var3;
    }

    public pw(pn2 pn2Var, k220 k220Var, o241 o241Var, xvf0 xvf0Var, i5s0 i5s0Var, g430 g430Var, if9 if9Var) {
        this.a = 29;
        this.f = pn2Var;
        this.g = k220Var;
        this.h = o241Var;
        this.b = xvf0Var;
        this.c = i5s0Var;
        this.d = g430Var;
        this.e = if9Var;
    }

    public pw(xvf0 xvf0Var, dby0 dby0Var, eqh eqhVar, i0b0 i0b0Var, o8g o8gVar, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 16;
        this.b = xvf0Var;
        this.c = dby0Var;
        this.d = eqhVar;
        this.f = i0b0Var;
        this.g = o8gVar;
        this.e = xvf0Var2;
        this.h = xvf0Var3;
    }
}
