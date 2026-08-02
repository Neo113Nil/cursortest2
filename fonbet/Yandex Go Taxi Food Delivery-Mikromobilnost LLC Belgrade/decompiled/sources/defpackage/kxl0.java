package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.beginners.safety.photo.domain.a;
import com.yandex.go.beginners.safety.photo.domain.b;
import com.yandex.go.flex.main_screen.interactors.d;
import com.yandex.go.flex.main_screen.interactors.p;
import com.yandex.go.payments.domain.p0;
import com.yandex.go.repositories.e;
import com.yandex.go.screenshot_screencast_tracker.impl.trackers.h;
import com.yandex.go.taxi.order.domain.interactors.s;
import com.yandex.go.taxi.tariffs.internal.routestats.interactor.a0;
import com.yandex.go.timer.k;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.repository.o;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.g;
import java.util.Set;
import ru.yandex.taxi.favorites.rides.save_modal.domain.c;

/* loaded from: classes.dex */
public final class kxl0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public kxl0(vrt0 vrt0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, i5s0 i5s0Var, xvf0 xvf0Var4) {
        this.a = 12;
        this.f = vrt0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = i5s0Var;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new b((tt2) xvf0Var6.get(), (rc21) xvf0Var5.get(), (sq21) xvf0Var3.get(), (e) xvf0Var.get(), (d9v) xvf0Var2.get(), (ndl0) ((ggl0) xvf0Var4).get());
            case 1:
                return new com.yandex.go.beginners.safety.photo.upload.b((Context) xvf0Var6.get(), (w030) xvf0Var5.get(), (a) ((e8b0) xvf0Var3).get(), (com.yandex.go.beginners.safety.photo.upload.ui.b) ((lwl0) xvf0Var).get(), (com.yandex.go.beginners.safety.photo.upload.ui.a) ((z4k0) xvf0Var2).get(), (ji3) xvf0Var4);
            case 2:
                r660 r660Var = (r660) xvf0Var2.get();
                return new jyl0((rqo) xvf0Var6.get(), (epl0) xvf0Var5.get(), this.d, (npe0) xvf0Var4, this.e, r660Var);
            case 3:
                return new ru.yandex.taxi.favorites.rides.save_modal.domain.b((zuj0) xvf0Var6.get(), (c) xvf0Var5.get(), (f0m0) xvf0Var3.get(), (hqj0) xvf0Var.get(), (s6k0) ((lwl0) xvf0Var4).get(), (rqo) xvf0Var2.get());
            case 4:
                return new com.yandex.go.screenshot_screencast_tracker.impl.b((tse) xvf0Var6.get(), (Lifecycle) xvf0Var5.get(), (h) xvf0Var3.get(), (rfp0) xvf0Var.get(), i5m.a(xvf0Var2), i5m.a((y2r0) xvf0Var4));
            case 5:
                return new h((Context) xvf0Var6.get(), (Activity) xvf0Var5.get(), i5m.a((n6o0) xvf0Var2), i5m.a((sxn0) xvf0Var4), i5m.a(xvf0Var3), (tt2) xvf0Var.get());
            case 6:
                g gVar = (g) xvf0Var6.get();
                Moshi moshi = (Moshi) xvf0Var5.get();
                return new com.ybsdk.feature.pinstorage.internal.data.c((yop0) xvf0Var3.get(), gVar, (dxf0) ((lej) xvf0Var4).get(), moshi, new va90((AppAnalyticsReporter) xvf0Var.get()), new qc20((com.ybsdk.rconfig.b) xvf0Var2.get()));
            case 7:
                return new s6s0((f8v0) ((n3w) xvf0Var5).a, (mfw0) ((oag) xvf0Var3).get(), (u7r) ((p9p) xvf0Var).get(), (ogw0) ((n3w) xvf0Var2).a, (lg21) ((oag) xvf0Var4).get(), (swp0) xvf0Var6.get());
            case 8:
                return new p((d) xvf0Var6.get(), (lzy) xvf0Var5.get(), (q0z) ((bwy) xvf0Var2).get(), (zwy) ((axy) xvf0Var4).get(), (tt2) xvf0Var3.get(), (flex.engine.a) xvf0Var.get());
            case 9:
                return new com.yandex.go.something_wrong_screen.repository.b((k8t0) xvf0Var6.get(), (g8t0) ((i5s0) xvf0Var4).get(), (dne0) xvf0Var5.get(), (tt2) xvf0Var3.get(), (o) xvf0Var.get(), (j5z) xvf0Var2.get());
            case 10:
                return new gbt0((a821) xvf0Var6.get(), (kr0) xvf0Var5.get(), (a3t) xvf0Var3.get(), (z3g) ((eat0) xvf0Var4).get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var.get(), this.f);
            case 11:
                return new com.yandex.go.special_needs_menu.ui.a((qot0) xvf0Var6.get(), (n4j0) xvf0Var2, i5m.a(xvf0Var5), (oep0) xvf0Var3.get(), (oot0) ((i5s0) xvf0Var4).get(), (pwy0) xvf0Var.get());
            case 12:
                return new com.yandex.go.splash.v2.g((com.yandex.go.splash.v2.d) ((vrt0) xvf0Var2).get(), (pav) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (tt2) xvf0Var3.get(), (trt0) ((i5s0) xvf0Var4).get(), (oqt0) xvf0Var.get());
            case 13:
                mzb mzbVar = (mzb) xvf0Var2.get();
                return new ru.yandex.taxi.search.deeplink.a((jc00) xvf0Var6.get(), (yv0) xvf0Var5.get(), (fx60) xvf0Var3.get(), this.e, (ure0) xvf0Var4, mzbVar);
            case 14:
                return new h6v0((Context) xvf0Var6.get(), (oep0) xvf0Var5.get(), (gv0) xvf0Var3.get(), (ze0) ((e6v0) xvf0Var2).get(), (vd) xvf0Var4, this.e);
            case 15:
                return new p0((u) xvf0Var6.get(), (com.yandex.go.yb.domain.o) xvf0Var5.get(), (wiq0) xvf0Var3.get(), (qc20) ((nup0) xvf0Var4).get(), (xku0) xvf0Var.get(), (eq51) xvf0Var2.get());
            case 16:
                return new y0w0((w0w0) xvf0Var6.get(), (a1w0) xvf0Var5.get(), (com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.e) ((sku0) xvf0Var4).get(), (com.yandex.go.permission.location_with_agreement.interactor.e) xvf0Var3.get(), (gei0) xvf0Var.get(), (ney) xvf0Var2.get());
            case 17:
                return new w9w0((rs2) xvf0Var6.get(), i5m.a(xvf0Var5), (uew0) xvf0Var3.get(), (tew0) xvf0Var.get(), (ky2) xvf0Var2.get(), i5m.a((nup0) xvf0Var4));
            case 18:
                return new com.yandex.go.taxi.tariffs.internal.factory.a((wiq0) xvf0Var6.get(), (o370) ((xpj0) xvf0Var).get(), (a0) ((pn2) xvf0Var2).get(), (e1s) xvf0Var5.get(), (vo40) ((k220) xvf0Var4).get(), (oci) xvf0Var3.get());
            case 19:
                return new com.yandex.go.taxi.order.domain.a((Context) xvf0Var6.get(), (s) xvf0Var5.get(), i5m.a((axy) xvf0Var2), i5m.a((cg7) xvf0Var4), (k7x0) xvf0Var3.get(), (tt2) xvf0Var.get());
            case 20:
                return new com.yandex.go.taxi.order.network.e((tse) xvf0Var6.get(), (tt2) xvf0Var5.get(), i5m.a(xvf0Var3), i5m.a((abx0) xvf0Var4), i5m.a(xvf0Var), i5m.a(xvf0Var2));
            case 21:
                return new udy0((Context) xvf0Var6.get(), (d6i) ((w7y0) xvf0Var3).get(), (com.yandex.go.telemetry.domain.a) ((jqz0) xvf0Var).get(), (com.yandex.go.telemetry.domain.a) ((i0b0) xvf0Var2).get(), (com.yandex.go.telemetry.domain.a) ((upj) xvf0Var4).get(), (ney) xvf0Var5.get());
            case 22:
                return new com.yandex.go.superapp.tracking.domain.e((crg) xvf0Var6.get(), (pdc) xvf0Var5.get(), (k) ((jwx0) xvf0Var2).get(), (k7x0) xvf0Var3.get(), (xdf) xvf0Var.get(), (d501) ((jwx0) xvf0Var4).get());
            case 23:
                return new ru.yandex.taxi.persuggest.fingerprint.b((Context) xvf0Var6.get(), (zm21) xvf0Var5.get(), (tm21) xvf0Var3.get(), (adz) xvf0Var.get(), (ru.yandex.taxi.experiments.u) ((im21) xvf0Var4).get(), (olt) xvf0Var2.get());
            case 24:
                return new com.yandex.go.account.deeplink.b((ru.yandex.taxi.am.g) xvf0Var6.get(), i5m.a(xvf0Var5), (jj3) xvf0Var3.get(), (cot) ((gd) xvf0Var4).get(), i5m.a(xvf0Var), (p2y0) xvf0Var2.get());
            default:
                return new fs51((q0h) xvf0Var6.get(), (av51) xvf0Var5.get(), (a5c) xvf0Var3.get(), (Set) xvf0Var.get(), (Set) xvf0Var2.get(), (i4h) ((swb) xvf0Var4).get());
        }
    }

    public /* synthetic */ kxl0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ kxl0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
    }

    public /* synthetic */ kxl0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = v7pVar;
    }

    public /* synthetic */ kxl0(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.f = v7pVar2;
        this.g = v7pVar3;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
    }

    public kxl0(xvf0 xvf0Var, xvf0 xvf0Var2, jwx0 jwx0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, jwx0 jwx0Var2) {
        this.a = 22;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = jwx0Var;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = jwx0Var2;
    }

    public kxl0(xvf0 xvf0Var, w7y0 w7y0Var, jqz0 jqz0Var, i0b0 i0b0Var, upj upjVar, xvf0 xvf0Var2) {
        this.a = 21;
        this.b = xvf0Var;
        this.d = w7y0Var;
        this.e = jqz0Var;
        this.f = i0b0Var;
        this.g = upjVar;
        this.c = xvf0Var2;
    }

    public kxl0(n3w n3wVar, oag oagVar, p9p p9pVar, n3w n3wVar2, oag oagVar2, xvf0 xvf0Var) {
        this.a = 7;
        this.c = n3wVar;
        this.d = oagVar;
        this.e = p9pVar;
        this.f = n3wVar2;
        this.g = oagVar2;
        this.b = xvf0Var;
    }

    public kxl0(xvf0 xvf0Var, xvf0 xvf0Var2, sku0 sku0Var, zth zthVar, n4g0 n4g0Var, xvf0 xvf0Var3) {
        this.a = 16;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = sku0Var;
        this.d = zthVar;
        this.e = n4g0Var;
        this.f = xvf0Var3;
    }

    public kxl0(xvf0 xvf0Var, xpj0 xpj0Var, pn2 pn2Var, xvf0 xvf0Var2, k220 k220Var, xvf0 xvf0Var3) {
        this.a = 18;
        this.b = xvf0Var;
        this.e = xpj0Var;
        this.f = pn2Var;
        this.c = xvf0Var2;
        this.g = k220Var;
        this.d = xvf0Var3;
    }

    public kxl0(i5s0 i5s0Var, i5s0 i5s0Var2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 9;
        this.b = i5s0Var;
        this.g = i5s0Var2;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }

    public kxl0(wjr0 wjr0Var, n4j0 n4j0Var, eqh eqhVar, eqh eqhVar2, i5s0 i5s0Var, xvf0 xvf0Var) {
        this.a = 11;
        this.b = wjr0Var;
        this.f = n4j0Var;
        this.c = eqhVar;
        this.d = eqhVar2;
        this.g = i5s0Var;
        this.e = xvf0Var;
    }

    public kxl0(xvf0 xvf0Var, eqh eqhVar, nf nfVar, e6v0 e6v0Var, vd vdVar, ee eeVar) {
        this.a = 14;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = nfVar;
        this.f = e6v0Var;
        this.g = vdVar;
        this.e = eeVar;
    }

    public kxl0(epp0 epp0Var, swo0 swo0Var, xvf0 xvf0Var, fpp0 fpp0Var, lej lejVar, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 6;
        this.b = swo0Var;
        this.c = xvf0Var;
        this.d = fpp0Var;
        this.g = lejVar;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
    }
}
