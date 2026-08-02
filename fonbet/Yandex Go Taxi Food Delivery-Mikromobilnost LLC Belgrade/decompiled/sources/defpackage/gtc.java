package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.benefits_center.activation.data.b;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import com.yandex.go.payments.summary.domain.d;
import com.yandex.go.payments.summary.domain.f;
import com.yandex.go.rida.bids.router.g;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.order.y;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.communications.a;
import ru.yandex.taxi.communications.q;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes.dex */
public final class gtc implements v7p {
    public final /* synthetic */ int a = 0;
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
    public final v7p t;

    public gtc(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar, xvf0 xvf0Var5, xvf0 xvf0Var6, eqh eqhVar2, xvf0 xvf0Var7, eqh eqhVar3, lyh lyhVar, tj70 tj70Var, eqh eqhVar4, tj70 tj70Var2, rxm0 rxm0Var, g430 g430Var, eqh eqhVar5, nl9 nl9Var) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = n3wVar;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = eqhVar2;
        this.k = xvf0Var7;
        this.l = eqhVar3;
        this.m = lyhVar;
        this.n = tj70Var;
        this.o = eqhVar4;
        this.p = tj70Var2;
        this.q = rxm0Var;
        this.r = g430Var;
        this.s = eqhVar5;
        this.t = nl9Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.m;
        xvf0 xvf0Var2 = this.s;
        xvf0 xvf0Var3 = this.k;
        xvf0 xvf0Var4 = this.j;
        xvf0 xvf0Var5 = this.g;
        xvf0 xvf0Var6 = this.f;
        xvf0 xvf0Var7 = this.e;
        xvf0 xvf0Var8 = this.d;
        xvf0 xvf0Var9 = this.r;
        xvf0 xvf0Var10 = this.q;
        xvf0 xvf0Var11 = this.p;
        v7p v7pVar = this.t;
        xvf0 xvf0Var12 = this.o;
        xvf0 xvf0Var13 = this.n;
        xvf0 xvf0Var14 = this.l;
        xvf0 xvf0Var15 = this.i;
        xvf0 xvf0Var16 = this.h;
        xvf0 xvf0Var17 = this.c;
        xvf0 xvf0Var18 = this.b;
        switch (i) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) xvf0Var18.get();
                iu4 iu4Var = (iu4) xvf0Var17.get();
                ruc rucVar = (ruc) xvf0Var8.get();
                b850 b850Var = (b850) xvf0Var7.get();
                ywx0 ywx0Var = (ywx0) xvf0Var6.get();
                is4 is4Var = (is4) xvf0Var5.get();
                duc ducVar = (duc) xvf0Var16.get();
                erc ercVar = (erc) xvf0Var15.get();
                a aVar = (a) xvf0Var4.get();
                q qVar = (q) xvf0Var3.get();
                pwy0 pwy0Var = (pwy0) xvf0Var14.get();
                jpu0 jpu0Var = (jpu0) xvf0Var.get();
                rfw0 rfw0Var = (rfw0) ((jwx0) v7pVar).get();
                Lifecycle lifecycle = (Lifecycle) xvf0Var13.get();
                tse tseVar = (tse) xvf0Var12.get();
                b bVar = (b) xvf0Var11.get();
                return new qu4(iu4Var, componentActivity, rucVar, aVar, ywx0Var, ercVar.d, qVar, pwy0Var, is4Var, new b7(17, b850Var), ducVar, jpu0Var, rfw0Var, lifecycle, tseVar, (ru4) xvf0Var10.get(), (et4) xvf0Var9.get(), bVar, (zq4) xvf0Var2.get());
            case 1:
                Context context = (Context) xvf0Var18.get();
                o4i o4iVar = (o4i) xvf0Var17.get();
                com.yandex.go.zone.interactors.b bVar2 = (com.yandex.go.zone.interactors.b) xvf0Var8.get();
                jc00 jc00Var = (jc00) xvf0Var6.get();
                c cVar = (c) xvf0Var5.get();
                ((swb) v7pVar).get();
                com.yandex.go.route.interactor.b bVar3 = (com.yandex.go.route.interactor.b) xvf0Var16.get();
                ru.yandex.taxi.logistics.payment.a aVar2 = (ru.yandex.taxi.logistics.payment.a) xvf0Var15.get();
                c2x0 c2x0Var = (c2x0) xvf0Var4.get();
                n3h n3hVar = (n3h) xvf0Var14.get();
                ftx ftxVar = (ftx) xvf0Var12.get();
                return new g4i(context, o4iVar, bVar2, jc00Var, cVar, bVar3, aVar2, c2x0Var, n3hVar, ftxVar, (com.yandex.go.urbanads.b) xvf0Var9.get(), (pho) xvf0Var2.get());
            case 2:
                return new g((ysg) xvf0Var18.get(), (zuj0) xvf0Var17.get(), (ra00) xvf0Var8.get(), (ri1) xvf0Var7.get(), (j) xvf0Var6.get(), (i6r) xvf0Var5.get(), (com.yandex.go.blockeduser.data.c) xvf0Var16.get(), (uw40) xvf0Var15.get(), this.j, (p2y0) xvf0Var3.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var14.get(), this.m, (l880) xvf0Var13.get(), (y) xvf0Var12.get(), (yea0) xvf0Var11.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) xvf0Var10.get(), (rq70) xvf0Var9.get(), this.s, (kgb) ((nl9) v7pVar).get());
            case 3:
                return new f((d) ((umt0) xvf0Var9).get(), (kpi0) xvf0Var18.get(), (xma0) xvf0Var17.get(), this.d, this.e, this.f, this.g, (v920) ((yly) xvf0Var2).get(), (ere0) xvf0Var16.get(), (jj3) xvf0Var15.get(), (cgp0) xvf0Var4.get(), this.k, (jaa0) xvf0Var14.get(), (hhs0) ((yvr0) v7pVar).get(), (ahv0) xvf0Var.get(), (vj4) xvf0Var13.get(), (wiq0) xvf0Var12.get(), i5m.a(xvf0Var11), (f9y0) xvf0Var10.get());
            default:
                return new v((i) xvf0Var18.get(), (com.yandex.go.route.interactor.b) xvf0Var17.get(), (tt2) xvf0Var8.get(), (y2w0) xvf0Var7.get(), (o) xvf0Var6.get(), (po21) xvf0Var5.get(), (ru.yandex.taxi.main.map.f) xvf0Var16.get(), (wb1) xvf0Var15.get(), (wvv) xvf0Var4.get(), (kr0) xvf0Var3.get(), (fdz) xvf0Var14.get(), (dxf0) ((i5s0) xvf0Var2).get(), (sl50) xvf0Var.get(), i5m.a(xvf0Var13), (ru.yandex.taxi.main.map.d) xvf0Var12.get(), (u0w0) ((rmv0) v7pVar).get(), (ftx) xvf0Var11.get(), (jzb) xvf0Var10.get(), (ru.yandex.taxi.preorder.source.pickup.a) xvf0Var9.get());
        }
    }

    public gtc(xvf0 xvf0Var, xvf0 xvf0Var2, mwq mwqVar, eqh eqhVar, xvf0 xvf0Var3, qxu0 qxu0Var, swb swbVar, xvf0 xvf0Var4, qii qiiVar, xvf0 xvf0Var5, h90 h90Var, if9 if9Var, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, cuo cuoVar, d701 d701Var, eqh eqhVar2) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = mwqVar;
        this.e = eqhVar;
        this.f = xvf0Var3;
        this.g = qxu0Var;
        this.t = swbVar;
        this.h = xvf0Var4;
        this.i = qiiVar;
        this.j = xvf0Var5;
        this.k = h90Var;
        this.l = if9Var;
        this.m = xvf0Var6;
        this.n = xvf0Var7;
        this.o = xvf0Var8;
        this.p = xvf0Var9;
        this.q = cuoVar;
        this.r = d701Var;
        this.s = eqhVar2;
    }

    public gtc(umt0 umt0Var, pqd0 pqd0Var, gga0 gga0Var, x4 x4Var, jwx0 jwx0Var, dld0 dld0Var, qxu0 qxu0Var, yly ylyVar, npe0 npe0Var, xvf0 xvf0Var, n6o0 n6o0Var, tc tcVar, xvf0 xvf0Var2, yvr0 yvr0Var, wjr0 wjr0Var, sx2 sx2Var, xvf0 xvf0Var3, c7c0 c7c0Var, n3w n3wVar) {
        this.r = umt0Var;
        this.b = pqd0Var;
        this.c = gga0Var;
        this.d = x4Var;
        this.e = jwx0Var;
        this.f = dld0Var;
        this.g = qxu0Var;
        this.s = ylyVar;
        this.h = npe0Var;
        this.i = xvf0Var;
        this.j = n6o0Var;
        this.k = tcVar;
        this.l = xvf0Var2;
        this.t = yvr0Var;
        this.m = wjr0Var;
        this.n = sx2Var;
        this.o = xvf0Var3;
        this.p = c7c0Var;
        this.q = n3wVar;
    }

    public gtc(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, alv0 alv0Var, xvf0 xvf0Var4, eqh eqhVar, xvf0 xvf0Var5, eqh eqhVar2, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, i5s0 i5s0Var, xvf0 xvf0Var9, xvf0 xvf0Var10, b8w b8wVar, rmv0 rmv0Var, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = alv0Var;
        this.f = xvf0Var4;
        this.g = eqhVar;
        this.h = xvf0Var5;
        this.i = eqhVar2;
        this.j = xvf0Var6;
        this.k = xvf0Var7;
        this.l = xvf0Var8;
        this.s = i5s0Var;
        this.m = xvf0Var9;
        this.n = xvf0Var10;
        this.o = b8wVar;
        this.t = rmv0Var;
        this.p = xvf0Var11;
        this.q = xvf0Var12;
        this.r = xvf0Var13;
    }

    public gtc(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar2, qzb qzbVar, swb swbVar, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, kpp0 kpp0Var, jwx0 jwx0Var, xvf0 xvf0Var8, xvf0 xvf0Var9, gd gdVar, bi4 bi4Var, bi4 bi4Var2, sx2 sx2Var) {
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = n3wVar2;
        this.h = qzbVar;
        this.i = swbVar;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = xvf0Var7;
        this.m = kpp0Var;
        this.t = jwx0Var;
        this.n = xvf0Var8;
        this.o = xvf0Var9;
        this.p = gdVar;
        this.q = bi4Var;
        this.r = bi4Var2;
        this.s = sx2Var;
    }
}
