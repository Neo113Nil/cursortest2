package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.taxi.order.chat.data.TaxiOrderChatApi;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.domain.interactors.c;
import com.yandex.go.taxi.order.r;
import com.yandex.go.taxi.order.z;
import com.yandex.messaging.data.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.analytics.n;
import ru.yandex.taxi.analytics.o;
import ru.yandex.taxi.analytics.p;
import ru.yandex.taxi.communications.i;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.search.address.view.a;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;
import ru.yandex.taxi.utils.b;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes8.dex */
public final class p00 implements v7p {
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
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;

    public /* synthetic */ p00(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, int i) {
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
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.m;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.n;
        xvf0 xvf0Var5 = this.l;
        xvf0 xvf0Var6 = this.k;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.h;
        xvf0 xvf0Var9 = this.g;
        xvf0 xvf0Var10 = this.e;
        xvf0 xvf0Var11 = this.d;
        xvf0 xvf0Var12 = this.c;
        xvf0 xvf0Var13 = this.b;
        switch (i) {
            case 0:
                h3y a = i5m.a(xvf0Var13);
                h3y a2 = i5m.a(xvf0Var12);
                h3y a3 = i5m.a(xvf0Var11);
                k020 k020Var = (k020) xvf0Var10.get();
                e eVar = (e) xvf0Var3.get();
                at2 at2Var = (at2) xvf0Var9.get();
                x22 x22Var = (x22) xvf0Var8.get();
                o150 o150Var = (o150) xvf0Var2.get();
                wff0 wff0Var = (wff0) xvf0Var7.get();
                ai80 ai80Var = (ai80) xvf0Var6.get();
                return new b00(a, a2, a3, k020Var, eVar, at2Var, x22Var, o150Var, wff0Var, ai80Var, (apq0) xvf0Var4.get());
            case 1:
                return new a((w030) xvf0Var13.get(), (dsd) xvf0Var12.get(), (tjt0) xvf0Var11.get(), (lmw) xvf0Var10.get(), (zuj0) xvf0Var3.get(), (jj3) xvf0Var9.get(), (dqe0) xvf0Var8.get(), (kpi0) xvf0Var2.get(), (icv0) xvf0Var7.get(), (y9y0) xvf0Var6.get(), (ciw) xvf0Var5.get(), this.m, (oep0) xvf0Var4.get());
            case 2:
                return new d((tse) xvf0Var13.get(), (g) xvf0Var12.get(), i5m.a(xvf0Var11), i5m.a(xvf0Var10), (Activity) xvf0Var3.get(), (eky) xvf0Var9.get(), (y50) xvf0Var8.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var7), (ru.yandex.taxi.activity.g) xvf0Var6.get(), (zky) xvf0Var5.get(), (tt2) xvf0Var.get(), (im51) xvf0Var4.get());
            case 3:
                return new com.yandex.go.geosharing.controller.e((tse) xvf0Var13.get(), (tt2) xvf0Var12.get(), (b) xvf0Var11.get(), (po21) xvf0Var10.get(), (h) xvf0Var3.get(), (l) xvf0Var9.get(), (jtq0) xvf0Var8.get(), (bg5) xvf0Var2.get(), (k0b0) xvf0Var7.get(), (vpk0) xvf0Var6.get(), (ky2) xvf0Var5.get(), (n20) xvf0Var.get(), (on2) xvf0Var4.get());
            case 4:
                return new ru.yandex.taxi.location.g((on2) xvf0Var13.get(), (v551) xvf0Var12.get(), (q7y) xvf0Var11.get(), (ru.yandex.taxi.location.a) xvf0Var10.get(), (t3u) xvf0Var3.get(), (ru.yandex.taxi.location.lbs.b) xvf0Var9.get(), (ru.yandex.taxi.location.lbs.gsm.a) xvf0Var8.get(), (p) xvf0Var2.get(), (ru.yandex.taxi.location.lbs.wifi.a) xvf0Var7.get(), i5m.a(xvf0Var6), (tt2) xvf0Var5.get(), (n) xvf0Var.get(), (o) xvf0Var4.get());
            case 5:
                return new com.yandex.go.navigation.activity.a((tse) xvf0Var13.get(), (Lifecycle) xvf0Var12.get(), (ly01) xvf0Var11.get(), (com.yandex.go.preload.e) xvf0Var10.get(), this.f, (qx60) xvf0Var9.get(), (pep0) xvf0Var8.get(), this.i, (s300) xvf0Var7.get(), (MainUiAvailabilityMonitor) xvf0Var6.get(), (t9f0) xvf0Var5.get(), i5m.a(xvf0Var), i5m.a(xvf0Var4));
            case 6:
                return new z((ysg) xvf0Var13.get(), (bd80) xvf0Var12.get(), (com.yandex.go.taxi.order.performer.a) xvf0Var11.get(), (r) xvf0Var10.get(), (l) xvf0Var3.get(), i5m.a(xvf0Var9), i5m.a(xvf0Var8), (j78) xvf0Var2.get(), (com.yandex.go.taxi.order.factory.a) xvf0Var7.get(), (c) xvf0Var6.get(), (i) xvf0Var5.get(), (com.yandex.go.taxi.order.domain.interactors.i) xvf0Var.get(), (m) xvf0Var4.get());
            case 7:
                return new com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.e((Context) xvf0Var13.get(), (tt2) xvf0Var12.get(), (pdc) xvf0Var11.get(), (zuj0) xvf0Var10.get(), (k7x0) xvf0Var3.get(), (n2s) xvf0Var9.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var8.get(), (oxu0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var7.get(), (gei) xvf0Var6.get(), (y) xvf0Var5.get(), (d501) xvf0Var.get(), (com.yandex.go.superapp.tracking.data.a) xvf0Var4.get());
            case 8:
                Context context = (Context) xvf0Var13.get();
                w030 w030Var = (w030) xvf0Var12.get();
                tt2 tt2Var = (tt2) xvf0Var11.get();
                pav pavVar = (pav) xvf0Var10.get();
                pwy0 pwy0Var = (pwy0) xvf0Var3.get();
                k7x0 k7x0Var = (k7x0) xvf0Var9.get();
                ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) xvf0Var8.get();
                pdc pdcVar = (pdc) xvf0Var2.get();
                lx4 lx4Var = (lx4) xvf0Var7.get();
                ip11 ip11Var = (ip11) xvf0Var6.get();
                return new st0(context, w030Var, tt2Var, pavVar, pwy0Var, k7x0Var, cVar, pdcVar, lx4Var, ip11Var, (pg7) xvf0Var4.get());
            default:
                return new com.yandex.go.taxi.order.chat.domain.a((tse) xvf0Var13.get(), (ru.yandex.taxi.launch.c) xvf0Var12.get(), (jtq0) xvf0Var11.get(), (TaxiOrderChatApi) xvf0Var10.get(), (dne0) xvf0Var3.get(), (com.yandex.go.taxi.order.chat.data.db.a) xvf0Var9.get(), (com.yandex.go.taxi.order.chat.data.db.b) xvf0Var8.get(), (j5z) xvf0Var2.get(), (com.yandex.go.messenger_native.repositories.c) xvf0Var7.get(), (s350) xvf0Var6.get(), (com.yandex.go.taxi.order.chat.experiments.b) xvf0Var5.get(), (z221) xvf0Var.get(), (tt2) xvf0Var4.get());
        }
    }
}
