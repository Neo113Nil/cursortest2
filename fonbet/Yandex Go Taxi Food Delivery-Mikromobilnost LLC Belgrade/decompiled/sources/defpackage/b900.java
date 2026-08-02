package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.main_screen.presentation.feed.e;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.payments.menu.domain.c;
import com.yandex.go.promocodes.referral.impl.provider.k;
import com.yandex.go.route.interactor.b;
import com.yandex.go.shortcuts.impl.interactors.m;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.taxi.order.repositories.n;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.internal.storage.folders.d;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.io.File;
import ru.yandex.taxi.cashback.sdk.t;
import ru.yandex.taxi.logistics.sdk.management.deliveries.h;
import ru.yandex.taxi.logistics.sdk.management.i;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.notifications.g;

/* loaded from: classes.dex */
public final class b900 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public /* synthetic */ b900(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.d;
        xvf0 xvf0Var7 = this.c;
        switch (i) {
            case 0:
                return new a900((yzv0) xvf0Var2.get(), (qcw0) xvf0Var7.get(), (q0z) xvf0Var6.get(), (t2m) xvf0Var5.get(), (a) xvf0Var4.get(), (e) xvf0Var.get(), (lzy) xvf0Var3.get());
            case 1:
                return new com.yandex.go.route.interactor.a((wiq0) xvf0Var2.get(), (b) xvf0Var7.get(), (tt2) xvf0Var6.get(), (ru.yandex.taxi.walkroute.a) xvf0Var5.get(), (mo5) xvf0Var4.get(), (noe) xvf0Var.get(), (rqo) xvf0Var3.get());
            case 2:
                rqo rqoVar = (rqo) xvf0Var2.get();
                g9a0 g9a0Var = (g9a0) xvf0Var7.get();
                return new c(rqoVar, g9a0Var, (i0) xvf0Var5.get(), (lw90) xvf0Var4.get(), (k0) xvf0Var.get(), (qw6) xvf0Var3.get());
            case 3:
                return new r100();
            case 4:
                return new i((h) xvf0Var2.get(), (AppVisibilitySubscriptionImpl) xvf0Var7.get(), (ce7) xvf0Var6.get(), (com.yandex.delivery.utils.auth.impl.a) xvf0Var5.get(), (st2) xvf0Var4.get(), (l7i) xvf0Var.get(), (v2e0) xvf0Var3.get());
            case 5:
                return new o270((ru.yandex.taxi.persuggest.api.a) xvf0Var2.get(), (sta0) xvf0Var7.get(), (v5v0) xvf0Var6.get(), (tt2) xvf0Var5.get(), (ru.yandex.taxi.persuggest.source.a) xvf0Var4.get(), (yiq0) xvf0Var.get(), (w6r) xvf0Var3.get());
            case 6:
                return new t870(this.b, (paq0) xvf0Var7.get(), (dqe0) xvf0Var6.get(), (arv0) xvf0Var5.get(), (lgv0) xvf0Var4.get(), (kpi0) xvf0Var.get(), (oep0) xvf0Var3.get());
            case 7:
                return new g((pav) xvf0Var2.get(), (k7x0) xvf0Var7.get(), (hit) xvf0Var6.get(), (tt2) xvf0Var5.get(), (ohf0) xvf0Var4.get(), (zuj0) xvf0Var.get(), (mxo) xvf0Var3.get());
            case 8:
                return new n((Context) xvf0Var2.get(), (crg) xvf0Var7.get(), (jtq0) xvf0Var6.get(), (zuj0) xvf0Var5.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var4.get(), (xdf) xvf0Var.get(), (tt2) xvf0Var3.get());
            case 9:
                return new n1d((r8h) xvf0Var2.get(), (sfa0) xvf0Var7.get(), (ru.yandex.taxi.preorder.repositories.g) xvf0Var6.get(), (x1f0) xvf0Var5.get(), (wtx) xvf0Var4.get(), (usx) xvf0Var.get(), (stx) xvf0Var3.get());
            case 10:
                Context context = (Context) xvf0Var2.get();
                w4o w4oVar = (w4o) xvf0Var7.get();
                f fVar = (f) xvf0Var6.get();
                return new k1x0(new jn2((ria0) xvf0Var.get(), context, w4oVar, (com.ybsdk.common.repositiories.auth.b) xvf0Var5.get(), fVar, (com.ybsdk.rconfig.b) xvf0Var3.get(), (xop0) xvf0Var4.get(), 1));
            case 11:
                return new com.yandex.go.pin.api.widget.b((Context) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var7.get(), (com.yandex.go.pin.api.widget.a) xvf0Var6.get(), (tt2) xvf0Var5.get(), (r0c0) xvf0Var4.get(), (eco) xvf0Var.get(), i5m.a(xvf0Var3));
            case 12:
                return new t((tse) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var7.get(), (n20) xvf0Var6.get(), (o) xvf0Var5.get(), (e2t) xvf0Var4.get(), (pwy0) xvf0Var.get(), (acz) xvf0Var3.get());
            case 13:
                return new xus((Activity) xvf0Var2.get(), (u02) xvf0Var7.get(), (jj3) xvf0Var6.get(), (dqe0) xvf0Var5.get(), (ra00) xvf0Var4.get(), this.g, (com.yandex.go.preorder.confirm.a) xvf0Var3.get());
            case 14:
                return new com.yandex.messaging.profile.c((ydf0) xvf0Var2.get(), (n8g) xvf0Var7.get(), (kse) xvf0Var6.get(), (zff0) xvf0Var5.get(), (nff0) xvf0Var4.get(), (lff0) xvf0Var.get(), (m120) xvf0Var3.get());
            case 15:
                return new c370((h5o) xvf0Var2.get(), (xf7) xvf0Var7.get(), (ouf0) xvf0Var6.get(), (Moshi) xvf0Var5.get(), (String) xvf0Var4.get(), ((rz10) xvf0Var.get()).b, new r0d0(25, (gsu) xvf0Var3.get()));
            case 16:
                return new ru.yandex.taxi.main_screen_custom.domain.f((tt2) xvf0Var2.get(), (dqf0) xvf0Var7.get(), (ru.yandex.taxi.main_screen_custom.domain.a) xvf0Var6.get(), (m) xvf0Var5.get(), (w) xvf0Var4.get(), (com.yandex.go.promocodes.referral.impl.data.c) xvf0Var.get(), (cyx) xvf0Var3.get());
            case 17:
                return new com.yandex.go.notifications.acknowledge.domain.a((fn21) xvf0Var2.get(), (vaj) xvf0Var7.get(), i5m.a(xvf0Var6), (ru.yandex.taxi.jobs.b) xvf0Var5.get(), (m0g0) xvf0Var4.get(), i5m.a(xvf0Var), i5m.a(xvf0Var3));
            case 18:
                return new k((on2) xvf0Var2.get(), (as21) xvf0Var7.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var6.get(), (pav) xvf0Var5.get(), i5m.a(xvf0Var4), (tt2) xvf0Var.get(), (mni0) xvf0Var3.get());
            case 19:
                return new twi0((com.yandex.messaging.domain.actions.a) xvf0Var2.get(), (d) xvf0Var7.get(), (k020) xvf0Var6.get(), (el21) xvf0Var5.get(), (xw50) xvf0Var4.get(), (zwr) xvf0Var.get(), (kse) xvf0Var3.get());
            case 20:
                return new ru.yandex.taxi.favorites.rides.save_modal.routers.c((tse) xvf0Var2.get(), (tt2) xvf0Var7.get(), (Context) xvf0Var6.get(), (u500) xvf0Var5.get(), (wip) xvf0Var4.get(), (w030) xvf0Var.get(), (ru.yandex.taxi.favorites.rides.save_modal.domain.b) xvf0Var3.get());
            case 21:
                gff gffVar = (gff) xvf0Var2.get();
                f fVar2 = (f) xvf0Var7.get();
                com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) xvf0Var6.get();
                com.ybsdk.rconfig.retriever.a aVar = (com.ybsdk.rconfig.retriever.a) xvf0Var5.get();
                nbp0 nbp0Var = (nbp0) xvf0Var4.get();
                return new com.ybsdk.rconfig.retriever.d(gffVar, fVar2, nbp0Var.a, bVar, aVar, i5m.a(xvf0Var), (AppAnalyticsReporter) xvf0Var3.get());
            case 22:
                return new rpp0((a1b0) xvf0Var2.get(), (com.ybsdk.common.repositiories.user.a) xvf0Var7.get(), (com.ybsdk.common.repositiories.agreements.a) xvf0Var6.get(), (com.ybsdk.common.domain.b) xvf0Var5.get(), (r6a0) xvf0Var4.get(), (AppAnalyticsReporter) xvf0Var.get(), (y1r0) xvf0Var3.get());
            case 23:
                return new uxr0((lx4) xvf0Var2.get(), (r22) xvf0Var7.get(), (ma1) xvf0Var6.get(), (t4s0) xvf0Var5.get(), (z660) xvf0Var4.get(), (ru.yandex.taxi.credentials.e) xvf0Var.get(), (tt2) xvf0Var3.get());
            case 24:
                return new i0s0((n170) xvf0Var2.get(), (c1f) xvf0Var7.get(), (x1s0) xvf0Var6.get(), (t4s0) xvf0Var5.get(), (k3s0) xvf0Var4.get(), (mqv0) xvf0Var.get(), (ip11) xvf0Var3.get());
            case 25:
                Context context2 = (Context) xvf0Var2.get();
                pav pavVar = (pav) xvf0Var7.get();
                return new uio0(context2, pavVar, (ed) xvf0Var5.get(), (k7x0) xvf0Var4.get(), (bk1) xvf0Var.get(), (zuj0) xvf0Var3.get());
            case 26:
                return new com.yandex.messaging.internal.storage.i((Context) xvf0Var2.get(), (lff0) xvf0Var7.get(), (File) xvf0Var6.get(), (x22) xvf0Var5.get(), (SharedPreferences) xvf0Var4.get(), (kse) xvf0Var.get(), (Looper) xvf0Var3.get());
            case 27:
                return new ru.yandex.taxi.persuggest.source.h((ru.yandex.taxi.persuggest.api.a) xvf0Var2.get(), (sta0) xvf0Var7.get(), (v5v0) xvf0Var6.get(), (tt2) xvf0Var5.get(), (ru.yandex.taxi.persuggest.source.a) xvf0Var4.get(), (o2s) xvf0Var.get(), (w7v0) xvf0Var3.get());
            case 28:
                return new dz70(new o2w0(), new ceu0(3), (n170) xvf0Var2.get(), (c1f) xvf0Var7.get(), (x1s0) xvf0Var6.get(), (t4s0) xvf0Var5.get(), (k3s0) xvf0Var4.get(), (mqv0) xvf0Var.get(), (ip11) xvf0Var3.get());
            default:
                return new ru.yandex.taxi.masstransit.address.interactor.i((b) xvf0Var2.get(), (tu30) xvf0Var7.get(), (tt2) xvf0Var6.get(), (atd0) xvf0Var5.get(), (b0x0) xvf0Var4.get(), (po21) xvf0Var.get(), (o) xvf0Var3.get());
        }
    }

    public /* synthetic */ b900(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = v7pVar;
        this.h = xvf0Var6;
    }
}
