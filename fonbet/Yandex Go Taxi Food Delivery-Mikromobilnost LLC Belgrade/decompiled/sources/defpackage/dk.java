package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.address_map_picker.panorama.d;
import com.yandex.go.chargers.e;
import com.yandex.go.drive.delegates.b;
import com.yandex.go.shortcuts.impl.interactors.m;
import com.yandex.go.shortcuts.impl.interactors.n;
import com.yandex.go.shortcuts.impl.interactors.q;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.yb.domain.y;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.zalogin.j;

/* loaded from: classes9.dex */
public final class dk implements v7p {
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
    public final xvf0 k;

    public /* synthetic */ dk(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.k;
        xvf0 xvf0Var6 = this.j;
        xvf0 xvf0Var7 = this.h;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.b;
        switch (i) {
            case 0:
                return new f((on2) xvf0Var10.get(), (Activity) xvf0Var4.get(), (g) xvf0Var9.get(), (y50) xvf0Var8.get(), (h) xvf0Var3.get(), (c) xvf0Var.get(), (pux) xvf0Var7.get(), (fhz) xvf0Var2.get(), (tse) xvf0Var6.get(), (ep90) xvf0Var5.get());
            case 1:
                return new d((tse) xvf0Var10.get(), (l) xvf0Var4.get(), (e8y0) xvf0Var9.get(), (a8y0) xvf0Var8.get(), (c9y0) xvf0Var3.get(), (b8y0) xvf0Var.get(), (rpb0) xvf0Var7.get(), (g21) xvf0Var2.get(), (com.yandex.go.address.address_map_picker.domain.c) xvf0Var6.get(), (r11) xvf0Var5.get());
            case 2:
                return new n49((tt2) xvf0Var10.get(), (ru.yandex.taxi.cashback.l) xvf0Var4.get(), (cda0) xvf0Var9.get(), (ru.yandex.taxi.cashback.international.c) xvf0Var8.get(), (ru.yandex.taxi.plus.repository.c) xvf0Var3.get(), (f0) xvf0Var.get(), (wb1) xvf0Var7.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get(), (x1f0) xvf0Var6.get(), (jvz) xvf0Var5.get());
            case 3:
                return new e((fva0) xvf0Var10.get(), (i6r) xvf0Var4.get(), (ru.yandex.taxi.location.user.c) xvf0Var9.get(), (qya) xvf0Var8.get(), this.f, this.g, (ol9) xvf0Var7.get(), this.i, (com.yandex.go.chargers.data.e) xvf0Var6.get(), (oj9) xvf0Var5.get());
            case 4:
                return new ru.yandex.taxi.sharedpayments.c((tse) xvf0Var10.get(), (j) xvf0Var4.get(), (ComponentActivity) xvf0Var9.get(), (ru.yandex.taxi.activity.g) xvf0Var8.get(), (y50) xvf0Var3.get(), (sjy) xvf0Var.get(), (com.yandex.go.payments.shared.c) xvf0Var7.get(), (pav) xvf0Var2.get(), (aap) xvf0Var6.get(), (xbp) xvf0Var5.get());
            case 5:
                return new com.yandex.go.drive.launch.e((acz) xvf0Var10.get(), (lx4) xvf0Var4.get(), (kb20) xvf0Var9.get(), (gwx) xvf0Var8.get(), (h7u0) xvf0Var3.get(), (u02) xvf0Var.get(), (b) xvf0Var7.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var6.get(), (kfm) xvf0Var5.get());
            case 6:
                return new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.l((a) xvf0Var10.get(), (c4r0) xvf0Var4.get(), (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j) xvf0Var9.get(), (klw) xvf0Var8.get(), (ck31) xvf0Var3.get(), (ibn) xvf0Var.get(), (axm) xvf0Var7.get(), (dqe0) xvf0Var2.get(), (y1s) xvf0Var6.get(), (w3r0) xvf0Var5.get());
            case 7:
                return new ru.yandex.taxi.statebar.controller.b((tse) xvf0Var10.get(), (tt2) xvf0Var4.get(), (ukh) xvf0Var9.get(), (x8z) xvf0Var8.get(), (l3w0) xvf0Var3.get(), (r8h) xvf0Var.get(), (v8z) xvf0Var7.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get(), (y3u0) xvf0Var6.get(), (v3u0) xvf0Var5.get());
            case 8:
                return new ru.yandex.taxi.viewholder.b(i5m.a(xvf0Var10), (p) xvf0Var4.get(), (ah00) xvf0Var9.get(), (te61) xvf0Var8.get(), (Lifecycle) xvf0Var3.get(), (tse) xvf0Var.get(), (hcs) xvf0Var7.get(), (fc5) xvf0Var2.get(), i5m.a(xvf0Var6), (el00) xvf0Var5.get());
            case 9:
                return new ru.yandex.taxi.settings.main.j((DrawerLayout) xvf0Var10.get(), this.c, (com.yandex.go.mainscreen.superapp.impl.header.presentation.drawer.a) xvf0Var9.get(), (k) xvf0Var8.get(), (a850) xvf0Var3.get(), (tse) xvf0Var.get(), (Lifecycle) xvf0Var7.get(), i5m.a(xvf0Var2), (mhf) xvf0Var6.get(), (lx4) xvf0Var5.get());
            case 10:
                return new com.yandex.go.payments.notifications.a((Context) xvf0Var10.get(), (Lifecycle) xvf0Var4.get(), (tse) xvf0Var9.get(), (tj60) xvf0Var8.get(), (com.yandex.go.payments.notifications.d) xvf0Var3.get(), (k7x0) xvf0Var.get(), (g9a0) xvf0Var7.get(), (pav) xvf0Var2.get(), (tt2) xvf0Var6.get(), (y50) xvf0Var5.get());
            case 11:
                return new com.yandex.go.personal_goals_v2.router.c((Context) xvf0Var10.get(), (w030) xvf0Var4.get(), (y50) xvf0Var9.get(), (e4b0) xvf0Var8.get(), (com.yandex.go.personal_goals_v2.data.b) xvf0Var3.get(), (com.yandex.go.personal_goals_v2.data.a) xvf0Var.get(), (a850) xvf0Var7.get(), (u4b0) xvf0Var2.get(), (f4b0) xvf0Var6.get(), (ru.yandex.taxi.summary.promotions.repository.e) xvf0Var5.get());
            case 12:
                x2d0 x2d0Var = (x2d0) xvf0Var10.get();
                return new xe20(x2d0Var.e, (v0r0) xvf0Var4.get(), (n5c) xvf0Var9.get(), (rg20) xvf0Var8.get(), (ru.yandex.taxi.plus.repository.mappers.a) xvf0Var3.get(), (aqp0) xvf0Var.get(), (ekd0) xvf0Var7.get(), (ru.yandex.taxi.plus.repository.mappers.c) xvf0Var2.get(), (ru.yandex.taxi.plus.repository.d) xvf0Var6.get(), (x1d0) xvf0Var5.get(), x2d0Var.b);
            case 13:
                tzf0 tzf0Var = (tzf0) xvf0Var10.get();
                ru.yandex.taxi.plus.repository.c cVar = (ru.yandex.taxi.plus.repository.c) xvf0Var4.get();
                com.yandex.go.payments.plus.domain.c cVar2 = (com.yandex.go.payments.plus.domain.c) xvf0Var9.get();
                b1v0 b1v0Var = (b1v0) xvf0Var8.get();
                q0v0 q0v0Var = (q0v0) xvf0Var3.get();
                return new qid0(tzf0Var, cVar, cVar2, b1v0Var, q0v0Var, (z0a0) xvf0Var7.get(), (String) xvf0Var2.get(), (l9y0) xvf0Var6.get(), (ru.yandex.taxi.plus.sdk.domain.a) xvf0Var5.get());
            case 14:
                return new com.yandex.go.preorder.zone.d((o) xvf0Var10.get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var4.get(), (znj) xvf0Var9.get(), (bk1) xvf0Var8.get(), (ru.yandex.taxi.launch.c) xvf0Var3.get(), (com.yandex.go.route.interactor.c) xvf0Var.get(), (com.yandex.go.zone.interactors.b) xvf0Var7.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get(), (jd) xvf0Var6.get(), (tt2) xvf0Var5.get());
            case 15:
                return new q((m) xvf0Var10.get(), (abf0) xvf0Var4.get(), (com.yandex.go.navigation.screen.c) xvf0Var9.get(), (t9f0) xvf0Var8.get(), (hay0) xvf0Var3.get(), (jc00) xvf0Var.get(), (n) xvf0Var7.get(), (a5s0) xvf0Var2.get(), (e2t) xvf0Var6.get(), (tt2) xvf0Var5.get());
            case 16:
                return new ru.yandex.taxi.sdc.router.e((tse) xvf0Var10.get(), (fif) xvf0Var4.get(), (c4r0) xvf0Var9.get(), (b8r) xvf0Var8.get(), (com.yandex.go.route.interactor.c) xvf0Var3.get(), (com.yandex.go.route.interactor.b) xvf0Var.get(), (pte0) xvf0Var7.get(), (qlp0) xvf0Var2.get(), (yp2) xvf0Var6.get(), (ck31) xvf0Var5.get());
            case 17:
                return new ru.yandex.taxi.preorder.source.points.a((Context) xvf0Var10.get(), (zuj0) xvf0Var4.get(), (ru.yandex.taxi.design.utils.a) xvf0Var9.get(), (ru.yandex.taxi.address.repository.f) xvf0Var8.get(), (wiq0) xvf0Var3.get(), (f1c0) xvf0Var.get(), (pav) xvf0Var7.get(), (k7x0) xvf0Var2.get(), i5m.a(xvf0Var6), (pwy0) xvf0Var5.get());
            case 18:
                return new lgv0((wiq0) xvf0Var10.get(), (mgv0) xvf0Var4.get(), (com.yandex.go.route.interactor.c) xvf0Var9.get(), (ah00) xvf0Var8.get(), (urv0) xvf0Var3.get(), (zyb0) xvf0Var.get(), (mzb) xvf0Var7.get(), (yfv0) xvf0Var2.get(), (dqe0) xvf0Var6.get(), (rqo) xvf0Var5.get());
            case 19:
                return new com.yandex.go.superapp.discovery.map.scooters.impl.navigation.a((cin0) xvf0Var10.get(), (rxn0) xvf0Var4.get(), (com.yandex.go.superapp.discovery.map.scooters.impl.experiments.c) xvf0Var9.get(), (yz4) xvf0Var8.get(), (avv0) xvf0Var3.get(), this.g, (cyx) xvf0Var7.get(), (fif) xvf0Var2.get(), (com.yandex.go.scooters.domain.p) xvf0Var6.get(), (r3v) xvf0Var5.get());
            case 20:
                return new com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.a((tt2) xvf0Var10.get(), (tse) xvf0Var4.get(), (pav) xvf0Var9.get(), (pwy0) xvf0Var8.get(), (k7x0) xvf0Var3.get(), (ju6) xvf0Var.get(), (zuj0) xvf0Var7.get(), (ru.yandex.taxi.map_common.image.a) xvf0Var2.get(), (wnt) xvf0Var6.get(), (rqo) xvf0Var5.get());
            case 21:
                return new com.yandex.go.taxi.tariffs.internal.interactor.f((com.yandex.go.taxi.tariffs.internal.repository.a) xvf0Var10.get(), (m4r0) xvf0Var4.get(), (uvw) xvf0Var9.get(), (ru.yandex.taxi.preorder.tollroad.a) xvf0Var8.get(), (opz0) xvf0Var3.get(), (mqz0) xvf0Var.get(), (ae61) xvf0Var7.get(), (nrx0) xvf0Var2.get(), (tt2) xvf0Var6.get(), (jaq0) xvf0Var5.get());
            case 22:
                return new ru.yandex.taxi.preorder.source.userposition.e((acz) xvf0Var10.get(), (hit) xvf0Var4.get(), (ru.yandex.taxi.location.zerokm.a) xvf0Var9.get(), (ru.yandex.taxi.preorder.source.userposition.repository.a) xvf0Var8.get(), (ru.yandex.taxi.preorder.source.userposition.repository.d) xvf0Var3.get(), (ru.yandex.taxi.systemrequeirements.location.n) xvf0Var.get(), (ru.yandex.taxi.main.map.autoupdatelocationthrottle.e) xvf0Var7.get(), (c34) xvf0Var2.get(), (ccz) xvf0Var6.get(), (tt2) xvf0Var5.get());
            default:
                return new y((com.yandex.go.yb.data.e) xvf0Var10.get(), (jj3) xvf0Var4.get(), (mq4) xvf0Var9.get(), (lr51) xvf0Var8.get(), (hit) xvf0Var3.get(), (tt2) xvf0Var.get(), i5m.a(xvf0Var7), (c170) xvf0Var2.get(), (ExternalSchemesInteractor) xvf0Var6.get(), (Lifecycle) xvf0Var5.get());
        }
    }
}
