package defpackage;

import android.content.Context;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.navigator.events.e;
import com.yandex.go.navigator.f;
import com.yandex.go.navigator.favorites.repository.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.u;

/* loaded from: classes5.dex */
public final class pp0 implements v7p {
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

    public /* synthetic */ pp0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, int i) {
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
        this.p = xvf0Var15;
        this.q = xvf0Var16;
        this.r = xvf0Var17;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.k;
        xvf0 xvf0Var2 = this.n;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.e;
        xvf0 xvf0Var7 = this.r;
        xvf0 xvf0Var8 = this.q;
        xvf0 xvf0Var9 = this.p;
        xvf0 xvf0Var10 = this.o;
        xvf0 xvf0Var11 = this.m;
        xvf0 xvf0Var12 = this.l;
        xvf0 xvf0Var13 = this.j;
        xvf0 xvf0Var14 = this.i;
        xvf0 xvf0Var15 = this.d;
        xvf0 xvf0Var16 = this.c;
        xvf0 xvf0Var17 = this.b;
        switch (i) {
            case 0:
                return new op0((Context) xvf0Var17.get(), (a3v) xvf0Var16.get(), (mhf) xvf0Var15.get(), (n050) xvf0Var6.get(), (yit0) xvf0Var5.get(), (e56) xvf0Var4.get(), (biv0) xvf0Var3.get(), (i130) xvf0Var14.get(), (svw) xvf0Var13.get(), (bq0) xvf0Var.get(), (rp0) xvf0Var12.get(), (a) xvf0Var11.get(), (tb1) xvf0Var2.get(), (tit0) xvf0Var10.get(), (h56) xvf0Var9.get(), (exu0) xvf0Var8.get(), (pwy0) xvf0Var7.get());
            case 1:
                c cVar = (c) xvf0Var17.get();
                Context context = (Context) xvf0Var16.get();
                ah00 ah00Var = (ah00) xvf0Var15.get();
                tt2 tt2Var = (tt2) xvf0Var6.get();
                b2l0 b2l0Var = (b2l0) xvf0Var5.get();
                leh lehVar = (leh) xvf0Var4.get();
                xm00 xm00Var = (xm00) xvf0Var3.get();
                o oVar = (o) xvf0Var14.get();
                el00 el00Var = (el00) xvf0Var13.get();
                sgu0 sgu0Var = (sgu0) xvf0Var.get();
                cv00 cv00Var = (cv00) xvf0Var12.get();
                et00 et00Var = (et00) xvf0Var11.get();
                lr00 lr00Var = (lr00) xvf0Var2.get();
                return new z31(tt2Var, lehVar, (rqo) xvf0Var10.get(), ah00Var, el00Var, xm00Var, lr00Var, et00Var, cv00Var, b2l0Var, (rjt0) xvf0Var7.get(), sgu0Var, (opz0) xvf0Var9.get(), (iqz0) xvf0Var8.get(), context, cVar, oVar);
            case 2:
                return new uj00((f) xvf0Var17.get(), (com.yandex.go.navigator.map_interactions.c) xvf0Var16.get(), (e) xvf0Var15.get(), this.e, i5m.a(xvf0Var5), this.g, this.h, i5m.a(xvf0Var14), (com.yandex.go.navigator.events.f) xvf0Var13.get(), this.k, (ah00) xvf0Var12.get(), (wb50) xvf0Var11.get(), this.n, (lgq0) xvf0Var10.get(), (ru.yandex.taxi.deeplinks.e) xvf0Var9.get(), (b) xvf0Var8.get(), (oc50) xvf0Var7.get());
            case 3:
                return new dd50((liq0) xvf0Var17.get(), (com.yandex.go.navigator.domain.e) xvf0Var16.get(), (com.yandex.go.navigator.repository.f) xvf0Var15.get(), (bp4) xvf0Var6.get(), (m901) xvf0Var5.get(), (com.yandex.go.navigator.repository.o) xvf0Var4.get(), (com.yandex.go.navigator.map_interactions.parkings.c) xvf0Var3.get(), (oc50) xvf0Var14.get(), (tzw0) xvf0Var13.get(), (yr21) xvf0Var.get(), (z950) xvf0Var12.get(), (ah00) xvf0Var11.get(), (bzw) xvf0Var2.get(), (com.yandex.go.navigator.analitycs.a) xvf0Var10.get(), (v) xvf0Var9.get(), (e) xvf0Var8.get(), (el00) xvf0Var7.get());
            case 4:
                return new uet0((wc11) xvf0Var17.get(), (xcv0) xvf0Var16.get(), (oep0) xvf0Var15.get(), (arv0) xvf0Var6.get(), this.f, (ru.yandex.taxi.logistics.utils.a) xvf0Var4.get(), (mf4) xvf0Var3.get(), (u670) xvf0Var14.get(), (rft0) xvf0Var13.get(), (c9l0) xvf0Var.get(), (net0) xvf0Var12.get(), (ou7) xvf0Var11.get(), i5m.a(xvf0Var2), (r) xvf0Var10.get(), (tft0) xvf0Var9.get(), (ah00) xvf0Var8.get(), i5m.a(xvf0Var7));
            default:
                return new u((ra00) xvf0Var17.get(), (yit0) xvf0Var16.get(), (biv0) xvf0Var15.get(), (wiq0) xvf0Var6.get(), (rjt0) xvf0Var5.get(), (tit0) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.domain.a) xvf0Var3.get(), (ou7) xvf0Var14.get(), (wb1) xvf0Var13.get(), this.k, (oep0) xvf0Var12.get(), (uet0) xvf0Var11.get(), (p) xvf0Var2.get(), (avd0) xvf0Var10.get(), (xit0) xvf0Var9.get(), (j) xvf0Var8.get(), (pzb) xvf0Var7.get());
        }
    }
}
