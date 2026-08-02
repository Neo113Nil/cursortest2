package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.account.phonish_upgrade.j;
import com.yandex.go.account.phonish_upgrade.p;
import com.yandex.go.delivery.tracking.map_overlay.l;
import com.yandex.go.loyalty.impl.common.domain.h;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.i;
import com.ybsdk.network.Api;
import com.ybsdk.network.UzApi;
import ru.yandex.taxi.am.y;
import ru.yandex.taxi.layers.source.requesttrigger.g;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.management.k;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.push.handlers.b;

/* loaded from: classes8.dex */
public final class ove implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public ove(lej lejVar, xvf0 xvf0Var, xvf0 xvf0Var2, awp0 awp0Var, vrt0 vrt0Var) {
        this.a = 8;
        this.d = lejVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = awp0Var;
        this.f = vrt0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new a((Activity) xvf0Var5.get(), (due) xvf0Var3.get(), (kve) xvf0Var2.get(), (rve) ((sve) xvf0Var).get(), (sae) ((gw7) xvf0Var4).get());
            case 1:
                return new d((ru.yandex.taxi.logistics.sdk.management.deliveries.d) xvf0Var5.get(), (k) xvf0Var3.get(), (c) xvf0Var2.get(), (e) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.a) ((l20) xvf0Var4).get());
            case 2:
                Api api = (Api) xvf0Var5.get();
                UzApi uzApi = (UzApi) xvf0Var3.get();
                ((lf) xvf0Var2).get();
                ((vve) xvf0Var).get();
                ((vve) xvf0Var4).get();
                return new com.ybsdk.common.repositiories.creditlimit.a(api, uzApi);
            case 3:
                return new com.yandex.messaging.domain.folders.c((sff) xvf0Var5.get(), (zwr) ((cer) xvf0Var).get(), (w5t) xvf0Var3.get(), (xdf0) xvf0Var2.get(), (kse) xvf0Var4.get());
            case 4:
                return new ru.yandex.taxi.favorites.rides.delete_modal.c((Context) xvf0Var5.get(), (w030) xvf0Var3.get(), (tt2) xvf0Var2.get(), (wip) xvf0Var.get(), (ru.yandex.taxi.favorites.rides.delete_modal.domain.a) ((m19) xvf0Var4).get());
            case 5:
                return new l((f) xvf0Var5.get(), this.c, (tt2) xvf0Var2.get(), this.e, (odi) ((nma) xvf0Var4).get());
            case 6:
                return new k1i((ast0) xvf0Var5.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), (oo2) ((r2i) xvf0Var).get(), (oep0) xvf0Var4.get());
            case 7:
                return new k1a((w030) xvf0Var5.get(), ((if9) xvf0Var).get(), xvf0Var3.get(), xvf0Var2.get(), xvf0Var4, 2);
            case 8:
                return new r6i((iv90) ((lej) xvf0Var2).get(), (l7x0) xvf0Var5.get(), (lv4) xvf0Var3.get(), (mus0) ((awp0) xvf0Var).get(), (qc20) ((vrt0) xvf0Var4).get());
            case 9:
                return new u7i((st2) xvf0Var5.get(), (com.yandex.delivery.utils.push.impl.a) xvf0Var3.get(), i5m.a((z5i) xvf0Var), (r7i) ((lyh) xvf0Var4).get(), (AppVisibilitySubscriptionImpl) xvf0Var2.get());
            case 10:
                return new lui((w030) xvf0Var5.get(), (xti) xvf0Var3.get(), (rii) xvf0Var2.get(), (zzg) xvf0Var, (gw7) xvf0Var4);
            case 11:
                return new qzi((nzi) ((ci3) xvf0Var2).get(), (jgq0) ((nup0) xvf0Var).get(), (com.yandex.go.route.interactor.c) xvf0Var5.get(), (v8l0) ((gwb0) xvf0Var4).get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get());
            case 12:
                return new vpj((pj) ((kyd) xvf0Var3).get(), (b1) ((kyd) xvf0Var2).get(), (b1) ((kyd) xvf0Var).get(), (o61) ((kyd) xvf0Var4).get(), (xku0) xvf0Var5.get());
            case 13:
                return new com.yandex.go.promocodes.base.impl.discounts.domain.interactors.a((zuj0) xvf0Var5.get(), (com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.a) ((zlf0) xvf0Var3).get(), (com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d) ((npe0) xvf0Var2).get(), (yzh) ((upj) xvf0Var).get(), (xjg) ((nma) xvf0Var4).get());
            case 14:
                return new b((wnt) xvf0Var5.get(), i5m.a((t6i) xvf0Var), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var4));
            case 15:
                return new ru.yandex.taxi.favorites.address.impl.domain.d((ru.yandex.taxi.favorites.data.repo.a) xvf0Var5.get(), (wip) ((cuo) xvf0Var).get(), (zuj0) xvf0Var3.get(), (u500) xvf0Var2.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var4.get());
            case 16:
                return new k1a((w030) xvf0Var5.get(), xvf0Var3.get(), ((n3w) xvf0Var).a, (Object) this.d, (Object) i5m.a((zw30) xvf0Var4), 3);
            case 17:
                return new com.yandex.go.loyalty.impl.common.domain.a((com.yandex.go.loyalty.impl.selector.data.a) xvf0Var5.get(), (h) xvf0Var3.get(), (nxz) xvf0Var2.get(), (zvz) xvf0Var.get(), (am2) ((gm) xvf0Var4).get());
            case 18:
                return new j((tse) xvf0Var5.get(), (f600) ((eqh) xvf0Var2).get(), (mhf) xvf0Var3.get(), (com.yandex.go.account.phonish_upgrade.d) ((cuo) xvf0Var).get(), (p) ((g3p) xvf0Var4).get());
            case 19:
                return new c9t((Context) xvf0Var5.get(), (uu10) xvf0Var3.get(), (kcy0) ((dby0) xvf0Var).get(), (n421) ((d701) xvf0Var4).get(), (kse) xvf0Var2.get());
            case 20:
                return new awt((Activity) ((gcg) xvf0Var5).get(), (tst) ((gcg) xvf0Var3).get(), (ru.yandex.taxi.h) ((gcg) xvf0Var2).get(), (rs2) ((gcg) xvf0Var).get(), (jw2) ((gd) xvf0Var4).get());
            case 21:
                return new ru.yandex.taxi.hiredriver.d((o7r0) ((nup0) xvf0Var).get(), (gku) xvf0Var5.get(), (xju) xvf0Var3.get(), (lg21) xvf0Var2.get(), (x4) xvf0Var4);
            case 22:
                return new ru.yandex.taxi.analytics.referrer.d((noi0) xvf0Var5.get(), (exc0) xvf0Var3.get(), (y2w) ((ziv) xvf0Var).get(), (tse) xvf0Var2.get(), (tt2) xvf0Var4.get());
            case 23:
                return new i((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var5.get(), (wiq0) xvf0Var3.get(), (w3r0) xvf0Var2.get(), (c9v) ((b8w) xvf0Var).get(), (dqe0) xvf0Var4.get());
            case 24:
                return new ru.yandex.taxi.intercity.b((w3i) ((l20) xvf0Var2).get(), (l9w) ((vd) xvf0Var).get(), (ru.yandex.taxi.intercity.domain.a) ((ziv) xvf0Var4).get(), (a3v) xvf0Var5.get(), (ciw) xvf0Var3.get());
            case 25:
                return new erx((Context) xvf0Var5.get(), (xam) xvf0Var3.get(), (nqb0) xvf0Var2.get(), (kn1) ((rqt) xvf0Var).get(), (uqx) xvf0Var4.get());
            case 26:
                return new oo2((pwy0) ((n2g) xvf0Var5).get(), (g) ((gd) xvf0Var3).get(), (z0c) ((qzb) xvf0Var2).get(), (cyx) ((m2g) xvf0Var).get(), (o370) ((g970) xvf0Var4).get());
            case 27:
                return new ru.yandex.taxi.zalogin.j((ru.yandex.taxi.am.internal.d) xvf0Var5.get(), (no90) xvf0Var3.get(), (y) ((lcw) xvf0Var).get(), (fhz) ((axy) xvf0Var4).get(), (tt2) xvf0Var2.get());
            case 28:
                return new ru.yandex.taxi.linked_order.provider.i((on2) xvf0Var5.get(), (tt2) xvf0Var3.get(), (uoy) ((bvx) xvf0Var).get(), (qoy) xvf0Var2.get(), (zuj0) xvf0Var4.get());
            default:
                return new com.yandex.delivery.live.location.impl.domain.a((ru.yandex.taxi.logistics.address.g) ((q2g) xvf0Var3).get(), (awy) xvf0Var5.get(), (AppVisibilitySubscriptionImpl) ((p2g) xvf0Var2).get(), (jwh) ((p2g) xvf0Var).get(), (st2) ((p2g) xvf0Var4).get());
        }
    }

    public /* synthetic */ ove(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
    }

    public /* synthetic */ ove(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.f = v7pVar2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ ove(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ ove(v7p v7pVar, xvf0 xvf0Var, v7p v7pVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.e = v7pVar2;
        this.d = xvf0Var2;
        this.f = xvf0Var3;
    }

    public ove(l20 l20Var, vd vdVar, ziv zivVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 24;
        this.d = l20Var;
        this.e = vdVar;
        this.f = zivVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public ove(xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, cuo cuoVar, g3p g3pVar) {
        this.a = 18;
        this.b = xvf0Var;
        this.d = eqhVar;
        this.c = xvf0Var2;
        this.e = cuoVar;
        this.f = g3pVar;
    }

    public ove(nup0 nup0Var, y1u y1uVar, y1u y1uVar2, xvf0 xvf0Var, x4 x4Var) {
        this.a = 21;
        this.e = nup0Var;
        this.b = y1uVar;
        this.c = y1uVar2;
        this.d = xvf0Var;
        this.f = x4Var;
    }

    public ove(ci3 ci3Var, nup0 nup0Var, qxu0 qxu0Var, gwb0 gwb0Var, xvf0 xvf0Var) {
        this.a = 11;
        this.d = ci3Var;
        this.e = nup0Var;
        this.b = qxu0Var;
        this.f = gwb0Var;
        this.c = xvf0Var;
    }

    public ove(kyd kydVar, kyd kydVar2, kyd kydVar3, kyd kydVar4, awp0 awp0Var) {
        this.a = 12;
        this.c = kydVar;
        this.d = kydVar2;
        this.e = kydVar3;
        this.f = kydVar4;
        this.b = awp0Var;
    }

    public ove(q2g q2gVar, xvf0 xvf0Var, p2g p2gVar, p2g p2gVar2, p2g p2gVar3) {
        this.a = 29;
        this.c = q2gVar;
        this.b = xvf0Var;
        this.d = p2gVar;
        this.e = p2gVar2;
        this.f = p2gVar3;
    }
}
