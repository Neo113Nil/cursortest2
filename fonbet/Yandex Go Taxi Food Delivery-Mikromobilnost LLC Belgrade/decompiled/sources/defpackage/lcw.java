package defpackage;

import android.content.Context;
import android.location.LocationManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.delivery.live.location.impl.repository.b;
import com.yandex.go.flex.main_screen.data.network.e;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.g;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.am.internal.d;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.am.y;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.layers.domain.u;
import ru.yandex.taxi.layers.experiments.p;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.preorder.source.userposition.repository.c;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes8.dex */
public final class lcw implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public lcw(x4 x4Var, eqh eqhVar, c660 c660Var, xvf0 xvf0Var, if9 if9Var, xvf0 xvf0Var2, etx etxVar) {
        this.a = 8;
        this.b = x4Var;
        this.c = eqhVar;
        this.g = c660Var;
        this.d = xvf0Var;
        this.e = if9Var;
        this.f = xvf0Var2;
        this.h = etxVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.g;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.c;
        switch (i) {
            case 0:
                return new wrr((zuj0) xvf0Var2.get(), (nf7) xvf0Var7.get(), (ole0) xvf0Var4.get(), (j5z) xvf0Var.get(), (y1s) xvf0Var3.get(), (dqe0) xvf0Var5.get(), (ibn) ((alm) xvf0Var6).get(), 3);
            case 1:
                return new g((gay0) ((dqx0) xvf0Var3).get(), (a) xvf0Var2.get(), (axm) xvf0Var7.get(), (y1s) xvf0Var4.get(), (apw) ((rqt) xvf0Var5).get(), (j) ((vw2) xvf0Var6).get(), (amc) xvf0Var.get());
            case 2:
                return new iiw((tfw) xvf0Var, (rqt) xvf0Var3, (mwq) xvf0Var5, i5m.a((ziv) xvf0Var6), (ycq0) xvf0Var2.get(), (kpi0) xvf0Var7.get(), (ifw) xvf0Var4.get());
            case 3:
                return new gkw((i) ((bt2) xvf0Var5).get(), (y1s) xvf0Var2.get(), (axm) xvf0Var7.get(), (dqe0) xvf0Var4.get(), (wiq0) xvf0Var.get(), (w3r0) xvf0Var3.get(), (miw) ((ove) xvf0Var6).get());
            case 4:
                return new y((k) xvf0Var2.get(), (u02) xvf0Var7.get(), (ru.yandex.taxi.am.g) xvf0Var4.get(), (ru.yandex.taxi.am.token.a) ((eqh) xvf0Var5).get(), (d) xvf0Var.get(), (ep90) xvf0Var3.get(), (fhz) ((axy) xvf0Var6).get());
            case 5:
                return new dky((ru.yandex.taxi.zalogin.j) xvf0Var2.get(), (ru.yandex.taxi.activity.g) xvf0Var7.get(), (y50) xvf0Var4.get(), (sjy) ((w7u) xvf0Var6).get(), (fhz) xvf0Var.get(), (u7j0) xvf0Var3.get(), (tt2) xvf0Var5.get());
            case 6:
                return new n1d((st2) ((kwf) xvf0Var2).get(), (AppVisibilitySubscriptionImpl) ((kwf) xvf0Var7).get(), (t0k0) ((kwf) xvf0Var4).get(), (b) ((kwf) xvf0Var).get(), (f) ((kwf) xvf0Var3).get(), (jwh) ((kwf) xvf0Var5).get(), (Context) ((kwf) xvf0Var6).get());
            case 7:
                return new c((f8y) xvf0Var2.get(), (LocationManager) xvf0Var7.get(), (hsx) xvf0Var4.get(), (ai4) xvf0Var.get(), (gp50) ((qy0) xvf0Var6).get(), (qfr0) xvf0Var3.get(), (ru.yandex.taxi.location.lbs.b) xvf0Var5.get());
            case 8:
                return new com.yandex.go.safety.center.lost_item.push.a((ru.yandex.taxi.deeplinks.f) xvf0Var2.get(), (xk60) xvf0Var7.get(), (ru.yandex.taxi.notifications.c) ((c660) xvf0Var5).get(), (wnt) xvf0Var4.get(), (n3h) xvf0Var.get(), (MainUiAvailabilityMonitor) xvf0Var3.get(), (com.yandex.go.safety.center.lost_item.data.a) ((etx) xvf0Var6).get());
            case 9:
                return new ru.yandex.taxi.maas.impl.ride.metropick.a((on2) xvf0Var2.get(), (mk50) xvf0Var7.get(), (tt2) xvf0Var4.get(), (r1s) ((bhx) xvf0Var6).get(), (y9y0) xvf0Var.get(), (atd0) xvf0Var3.get(), (svd0) xvf0Var5.get());
            case 10:
                return new ru.yandex.taxi.maas.impl.a((ru.yandex.taxi.launch.c) xvf0Var2.get(), (rqo) xvf0Var7.get(), (on2) xvf0Var4.get(), (tt2) xvf0Var.get(), (ru.yandex.taxi.maas.impl.ride.c) xvf0Var3.get(), (au50) ((kqz) xvf0Var6).get(), (w100) xvf0Var5.get());
            case 11:
                return new s300((h) xvf0Var2.get(), i5m.a(xvf0Var7), (ly01) xvf0Var4.get(), (ra00) xvf0Var.get(), (NotificationStackComponent) ((kqz) xvf0Var5).get(), (NotificationStackComponent) ((kqz) xvf0Var6).get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var3.get());
            case 12:
                return new e((nsx) xvf0Var2.get(), (ksx) xvf0Var7.get(), (ajr) xvf0Var4.get(), i5m.a((r2i) xvf0Var5), (com.yandex.go.flex.main_screen.experiments.j) xvf0Var.get(), (k0b0) xvf0Var3.get(), (zd1) ((y2g) xvf0Var6).get());
            case 13:
                return new ru.yandex.taxi.layers.presentation.optimalview.c((dne0) ((n2g) xvf0Var).get(), (ah00) ((m2g) xvf0Var3).get(), (ru.yandex.taxi.layers.source.k) xvf0Var2.get(), (u) xvf0Var7.get(), (com.yandex.go.layers.domain.g) ((m2g) xvf0Var5).get(), (p) ((n6o0) xvf0Var6).get(), (t4e0) xvf0Var4.get());
            case 14:
                return new ru.yandex.taxi.map_common.style.source.e((wnt) xvf0Var2.get(), (tt2) xvf0Var7.get(), (ss00) xvf0Var4.get(), (qv00) xvf0Var.get(), (td7) xvf0Var3.get(), (vs00) xvf0Var5.get(), (qc20) ((c660) xvf0Var6).get());
            case 15:
                return new lui((w030) xvf0Var2.get(), (b750) xvf0Var7.get(), (zk10) xvf0Var4.get(), (dl10) ((n3w) xvf0Var5).a, this.e, this.f, (bi4) xvf0Var6);
            case 16:
                return new com.yandex.go.messenger_native.interactors.a((u02) xvf0Var2.get(), (Context) xvf0Var7.get(), (tt2) xvf0Var4.get(), (com.yandex.go.messenger_native.marketplace.repositories.a) ((sp00) xvf0Var6).get(), (t350) xvf0Var.get(), (m) xvf0Var3.get(), (k) xvf0Var5.get());
            case 17:
                return new ru.yandex.taxi.masstransit.detailedroute.interactor.a((tt2) xvf0Var2.get(), (pwy0) xvf0Var7.get(), (ru.yandex.taxi.masstransit.domain.f) ((xkw) xvf0Var5).get(), (ru.yandex.taxi.masstransit.detailedroute.mapper.a) ((bhx) xvf0Var6).get(), (l5r) xvf0Var4.get(), (d0) xvf0Var.get(), (dz00) xvf0Var3.get());
            case 18:
                return new ru.yandex.taxi.masstransit.detailedroute.ui.v2.d((yw30) xvf0Var2.get(), (ls30) xvf0Var7.get(), (ah00) xvf0Var4.get(), (tt2) xvf0Var.get(), (ru.yandex.taxi.masstransit.userlocation.a) xvf0Var3.get(), (y110) xvf0Var5.get(), (uk10) ((dt00) xvf0Var6).get());
            case 19:
                return new com.yandex.go.multimodal_route.ui.detailed_card.a((uu40) xvf0Var2.get(), (com.yandex.go.multimodal_route.repositories.a) ((s730) xvf0Var6).get(), (yu40) xvf0Var7.get(), (tt2) xvf0Var4.get(), (qt40) xvf0Var.get(), (atd0) xvf0Var3.get(), (lfl0) xvf0Var5.get());
            case 20:
                return new ru.yandex.taxi.logistics.ndd_map.router.f((w030) xvf0Var2.get(), (lx4) xvf0Var7.get(), (w5i) xvf0Var4.get(), (a3v) xvf0Var.get(), (y9y0) xvf0Var3.get(), (i6r) xvf0Var5.get(), (ru.yandex.taxi.logistics.ndd_map.layers.a) ((if9) xvf0Var6).get());
            case 21:
                return new xi60((tse) xvf0Var2.get(), (tt2) xvf0Var7.get(), (m) xvf0Var4.get(), (k40) xvf0Var.get(), (yvi0) ((c660) xvf0Var5).get(), (kjz) ((g430) xvf0Var6).get(), (Lifecycle) xvf0Var3.get());
            case 22:
                return new q180((dm21) xvf0Var2.get(), (pdc) xvf0Var7.get(), (ru.yandex.taxi.styling.c) xvf0Var4.get(), (bd11) xvf0Var.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), i5m.a((kqz) xvf0Var6), (lpf0) xvf0Var5.get());
            case 23:
                return new com.yandex.go.agreement.photoupload.a((on2) xvf0Var2.get(), (rqo) xvf0Var7.get(), (o) xvf0Var4.get(), (ijb0) xvf0Var.get(), (tan) ((upj) xvf0Var6).get(), (tt2) xvf0Var3.get(), (hit) xvf0Var5.get());
            case 24:
                return new vgc0((gf41) xvf0Var2.get(), (ru.yandex.taxi.am.token.a) xvf0Var7.get(), (fn21) xvf0Var4.get(), (ngc0) ((n3w) xvf0Var6).a, (j5z) xvf0Var.get(), (xes0) xvf0Var3.get(), (ru.yandex.taxi.am.o) xvf0Var5.get());
            case 25:
                return new x5d0((l) xvf0Var2.get(), (hay0) xvf0Var7.get(), (cda0) xvf0Var4.get(), (i3b0) xvf0Var.get(), i5m.a((qta0) xvf0Var6), (ru.yandex.taxi.plus.repository.c) xvf0Var3.get(), (tpr) xvf0Var5.get());
            case 26:
                return new com.yandex.go.preorder.navigation.b(this.b, (mf4) xvf0Var7.get(), (com.yandex.go.zone.interactors.e) xvf0Var4.get(), (com.yandex.go.preorder.tariffs.a) ((vd) xvf0Var5).get(), (com.yandex.go.preorder.address.f) ((y0y0) xvf0Var6).get(), (vre0) xvf0Var.get(), (com.yandex.go.taxi.tariffs.interactor.b) xvf0Var3.get());
            case 27:
                return new w((qmp) xvf0Var2.get(), i5m.a((pqd0) xvf0Var6), (bfp0) xvf0Var7.get(), (tt2) xvf0Var4.get(), (m8f0) xvf0Var.get(), (bg5) xvf0Var3.get(), (o8h) xvf0Var5.get());
            case 28:
                return new com.yandex.go.promocodes.d((gb0) xvf0Var3, this.b, (qqj) xvf0Var7.get(), this.d, (l3e) xvf0Var5, this.e, (zlf0) xvf0Var6);
            default:
                return new dfj0((Context) xvf0Var2.get(), (w030) xvf0Var7.get(), (gwe) ((vd) xvf0Var6).get(), (cda0) xvf0Var4.get(), (zuj0) xvf0Var.get(), (zwe) xvf0Var3.get(), (wwe) xvf0Var5.get());
        }
    }

    public /* synthetic */ lcw(int i, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.h = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ lcw(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar2, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.h = v7pVar2;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    public /* synthetic */ lcw(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.h = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ lcw(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar2, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = v7pVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.h = v7pVar2;
        this.g = xvf0Var5;
    }

    public /* synthetic */ lcw(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.h = xvf0Var6;
    }

    public /* synthetic */ lcw(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ lcw(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = v7pVar;
        this.g = v7pVar2;
        this.h = v7pVar3;
        this.f = xvf0Var4;
    }

    public lcw(dqx0 dqx0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, rqt rqtVar, vw2 vw2Var, xvf0 xvf0Var4) {
        this.a = 1;
        this.f = dqx0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = rqtVar;
        this.h = vw2Var;
        this.e = xvf0Var4;
    }

    public lcw(gb0 gb0Var, ea0 ea0Var, upj upjVar, ea0 ea0Var2, l3e l3eVar, ea0 ea0Var3, zlf0 zlf0Var) {
        this.a = 28;
        this.f = gb0Var;
        this.b = ea0Var;
        this.c = upjVar;
        this.d = ea0Var2;
        this.g = l3eVar;
        this.e = ea0Var3;
        this.h = zlf0Var;
    }

    public lcw(n2g n2gVar, m2g m2gVar, xvf0 xvf0Var, xvf0 xvf0Var2, m2g m2gVar2, n6o0 n6o0Var, xvf0 xvf0Var3) {
        this.a = 13;
        this.e = n2gVar;
        this.f = m2gVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = m2gVar2;
        this.h = n6o0Var;
        this.d = xvf0Var3;
    }

    public lcw(bt2 bt2Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, uwn0 uwn0Var, ove oveVar) {
        this.a = 3;
        this.g = bt2Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = uwn0Var;
        this.h = oveVar;
    }

    public lcw(dld0 dld0Var, xvf0 xvf0Var, dby0 dby0Var, vd vdVar, y0y0 y0y0Var, xvf0 xvf0Var2, xv2 xv2Var) {
        this.a = 26;
        this.b = dld0Var;
        this.c = xvf0Var;
        this.d = dby0Var;
        this.g = vdVar;
        this.h = y0y0Var;
        this.e = xvf0Var2;
        this.f = xv2Var;
    }

    public lcw(xvf0 xvf0Var, xvf0 xvf0Var2, xkw xkwVar, bhx bhxVar, xvf0 xvf0Var3, d701 d701Var, sp00 sp00Var) {
        this.a = 17;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = xkwVar;
        this.h = bhxVar;
        this.d = xvf0Var3;
        this.e = d701Var;
        this.f = sp00Var;
    }

    public lcw(tfw tfwVar, rqt rqtVar, mwq mwqVar, ziv zivVar, e8b0 e8b0Var, pqd0 pqd0Var, xvf0 xvf0Var) {
        this.a = 2;
        this.e = tfwVar;
        this.f = rqtVar;
        this.g = mwqVar;
        this.h = zivVar;
        this.b = e8b0Var;
        this.c = pqd0Var;
        this.d = xvf0Var;
    }

    public lcw(xvf0 xvf0Var, eqh eqhVar, vd vdVar, eqh eqhVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 29;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.h = vdVar;
        this.d = eqhVar2;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
    }
}
