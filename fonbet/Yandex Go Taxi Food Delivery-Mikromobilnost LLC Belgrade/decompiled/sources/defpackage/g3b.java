package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.yandex.go.scooters.domain.w;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.chat.e;
import com.yandex.messaging.domain.chat.h;
import com.yandex.messaging.internal.authorized.sync.d;
import com.yandex.messaging.internal.g;
import com.yandex.messaging.internal.menu.c;
import com.yandex.messaging.internal.translator.b;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.internal.view.chat.a;
import com.yandex.messaging.internal.view.chat.f;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.internal.view.timeline.l;
import com.yandex.messaging.internal.view.timeline.m;
import java.util.concurrent.Executor;

/* loaded from: classes14.dex */
public final class g3b implements v7p {
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
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;

    public /* synthetic */ g3b(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, v7p v7pVar, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, int i) {
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
        this.o = xvf0Var14;
        this.p = v7pVar;
        this.q = xvf0Var15;
        this.r = xvf0Var16;
        this.s = xvf0Var17;
        this.t = xvf0Var18;
        this.u = xvf0Var19;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.j;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.u;
        xvf0 xvf0Var4 = this.t;
        xvf0 xvf0Var5 = this.s;
        xvf0 xvf0Var6 = this.r;
        xvf0 xvf0Var7 = this.q;
        xvf0 xvf0Var8 = this.l;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.p;
        xvf0 xvf0Var11 = this.h;
        xvf0 xvf0Var12 = this.o;
        xvf0 xvf0Var13 = this.n;
        xvf0 xvf0Var14 = this.g;
        xvf0 xvf0Var15 = this.f;
        xvf0 xvf0Var16 = this.e;
        xvf0 xvf0Var17 = this.d;
        xvf0 xvf0Var18 = this.m;
        xvf0 xvf0Var19 = this.c;
        xvf0 xvf0Var20 = this.b;
        switch (i) {
            case 0:
                return new c((Activity) xvf0Var20.get(), (b00) xvf0Var19.get(), (c3b) ((vu) xvf0Var18).get(), (sfl0) xvf0Var17.get(), (y4b) xvf0Var16.get(), (com.yandex.messaging.ui.settings.c) ((f380) xvf0Var13).get(), (p4t) xvf0Var15.get(), (g) xvf0Var14.get(), (f) ((wrh) xvf0Var12).get(), (e) ((prq) xvf0Var10).get(), (h) ((ibz0) xvf0Var7).get(), (zrm) ((f9t) xvf0Var6).get(), (ab4) xvf0Var11.get(), (w270) xvf0Var2.get(), (key0) xvf0Var.get(), (io9) ((lu9) xvf0Var5).get(), (com.yandex.messaging.domain.folders.c) xvf0Var9.get(), (com.yandex.messaging.domain.statuses.e) ((zo0) xvf0Var4).get(), (i1b) ((mu7) xvf0Var3).get(), (lqo) xvf0Var8.get());
            case 1:
                m mVar = (m) xvf0Var20.get();
                mdb mdbVar = (mdb) xvf0Var19.get();
                k0b k0bVar = (k0b) xvf0Var17.get();
                ChatRequest chatRequest = (ChatRequest) xvf0Var16.get();
                g0 g0Var = (g0) xvf0Var15.get();
                jcz0 jcz0Var = (jcz0) xvf0Var14.get();
                l lVar = (l) xvf0Var11.get();
                c00 c00Var = (c00) xvf0Var9.get();
                w7b w7bVar = (w7b) xvf0Var8.get();
                bcb bcbVar = (bcb) xvf0Var18.get();
                ww10 ww10Var = (ww10) xvf0Var13.get();
                b bVar = (b) xvf0Var12.get();
                return new acb(mVar, mdbVar, k0bVar, chatRequest, g0Var, jcz0Var, lVar, this.i, this.j, c00Var, w7bVar, bcbVar, ww10Var, bVar, (p4t) xvf0Var7.get(), (e7v0) xvf0Var6.get(), (q6b) xvf0Var5.get(), (a) ((g6) xvf0Var4).get(), (com.yandex.messaging.internal.b) xvf0Var3.get());
            case 2:
                return new com.yandex.go.taxi.order.map.overlay.c((Context) xvf0Var20.get(), (tse) xvf0Var19.get(), (ah00) xvf0Var17.get(), (xm00) xvf0Var16.get(), (ru.yandex.taxi.map.a) xvf0Var15.get(), (c0) xvf0Var14.get(), i5m.a(xvf0Var11), i5m.a(xvf0Var2), (sz8) xvf0Var.get(), (a380) xvf0Var9.get(), (o2y0) xvf0Var8.get(), (com.yandex.go.pin.api.widget.b) ((v4g) xvf0Var18).get(), (sy1) ((t4g) xvf0Var13).get(), (no21) ((v4g) xvf0Var12).get(), (p370) ((zi60) xvf0Var10).get(), i5m.a((v4g) xvf0Var7), (ru.yandex.taxi.map_common.style.domain.a) ((u4g) xvf0Var6).get(), (ktk0) ((cta0) xvf0Var5).get(), (vgf) ((t4g) xvf0Var4).get(), (et00) ((u4g) xvf0Var3).get());
            case 3:
                return new com.yandex.go.scooters.offers.v2.f((qxm0) xvf0Var20.get(), (e2e0) xvf0Var19.get(), (pwy0) xvf0Var17.get(), (n6n0) xvf0Var16.get(), (b3n0) xvf0Var15.get(), (m0o0) xvf0Var14.get(), (qoo0) xvf0Var11.get(), (qr40) xvf0Var2.get(), (i5n0) xvf0Var.get(), (w) xvf0Var9.get(), (z2o0) xvf0Var8.get(), (w2o0) xvf0Var18.get(), (com.yandex.go.scooters.offers.v2.domain.a) ((q150) xvf0Var13).get(), (ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a) xvf0Var12.get(), (y6p0) xvf0Var10.get(), (com.yandex.go.scooters.offers.v2.domain.b) ((vfg0) xvf0Var7).get(), (ljn0) xvf0Var6.get(), (q4o0) xvf0Var5.get(), (mxm0) xvf0Var4.get(), (com.yandex.go.scooters.driver_license_notification.domain.c) xvf0Var3.get());
            case 4:
                Context context = (Context) xvf0Var20.get();
                to3 to3Var = (to3) xvf0Var17.get();
                k020 k020Var = (k020) xvf0Var16.get();
                wff0 wff0Var = (wff0) xvf0Var15.get();
                String str = (String) xvf0Var14.get();
                s2x0 s2x0Var = (s2x0) xvf0Var11.get();
                w1x0 w1x0Var = (w1x0) xvf0Var2.get();
                p1z p1zVar = (p1z) xvf0Var.get();
                u9e u9eVar = (u9e) xvf0Var9.get();
                cce cceVar = (cce) xvf0Var8.get();
                Handler handler = (Handler) xvf0Var18.get();
                Executor executor = (Executor) xvf0Var13.get();
                x22 x22Var = (x22) xvf0Var12.get();
                v vVar = (v) xvf0Var10.get();
                d dVar = (d) xvf0Var7.get();
                rz10 rz10Var = (rz10) xvf0Var6.get();
                lqo lqoVar = (lqo) xvf0Var5.get();
                return new com.yandex.messaging.contacts.sync.b(context, to3Var, k020Var, wff0Var, str, s2x0Var, w1x0Var, p1zVar, u9eVar, cceVar, handler, executor, x22Var, vVar, dVar, rz10Var, lqoVar, (xdf0) xvf0Var3.get());
            default:
                return new pbx0((zuj0) xvf0Var20.get(), (gu11) xvf0Var19.get(), (qbx0) ((rbx0) xvf0Var18).get(), (wk21) xvf0Var17.get(), (jgv) xvf0Var16.get(), (k7x0) xvf0Var15.get(), (unx0) xvf0Var14.get(), (lgx0) ((rbx0) xvf0Var13).get(), (i47) ((rbx0) xvf0Var12).get(), (pdc) xvf0Var11.get(), (ppw0) xvf0Var2.get(), (rqo) xvf0Var.get(), (kip) ((l180) xvf0Var10).get(), (mqv0) xvf0Var9.get(), (bg4) xvf0Var8.get(), (kgu) xvf0Var7.get(), (niv0) ((cys0) xvf0Var6).get(), (bgx0) xvf0Var5.get(), (lze0) xvf0Var4.get(), (mj6) xvf0Var3.get());
        }
    }

    public g3b(n3w n3wVar, xvf0 xvf0Var, vu vuVar, xvf0 xvf0Var2, xvf0 xvf0Var3, f380 f380Var, a4t a4tVar, a4t a4tVar2, wrh wrhVar, prq prqVar, ibz0 ibz0Var, f9t f9tVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, lu9 lu9Var, xvf0 xvf0Var7, zo0 zo0Var, mu7 mu7Var, h420 h420Var) {
        this.a = 0;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.m = vuVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.n = f380Var;
        this.f = a4tVar;
        this.g = a4tVar2;
        this.o = wrhVar;
        this.p = prqVar;
        this.q = ibz0Var;
        this.r = f9tVar;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
        this.j = xvf0Var6;
        this.s = lu9Var;
        this.k = xvf0Var7;
        this.t = zo0Var;
        this.u = mu7Var;
        this.l = h420Var;
    }

    public g3b(xvf0 xvf0Var, xvf0 xvf0Var2, rbx0 rbx0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, rbx0 rbx0Var2, rbx0 rbx0Var3, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, l180 l180Var, xvf0 xvf0Var10, s90 s90Var, xvf0 xvf0Var11, cys0 cys0Var, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14) {
        this.a = 5;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.m = rbx0Var;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.n = rbx0Var2;
        this.o = rbx0Var3;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.p = l180Var;
        this.k = xvf0Var10;
        this.l = s90Var;
        this.q = xvf0Var11;
        this.r = cys0Var;
        this.s = xvf0Var12;
        this.t = xvf0Var13;
        this.u = xvf0Var14;
    }
}
