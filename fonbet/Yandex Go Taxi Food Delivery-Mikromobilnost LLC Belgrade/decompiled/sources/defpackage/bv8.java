package defpackage;

import android.content.Context;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.address.search.common.domain.interactor.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.preorder.map.n;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.presentation.finish_info.e;
import ru.yandex.taxi.search.c;

/* loaded from: classes6.dex */
public final class bv8 implements v7p {
    public final xvf0 A;
    public final xvf0 B;
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
    public final xvf0 v;
    public final xvf0 w;
    public final xvf0 x;
    public final xvf0 y;
    public final xvf0 z;

    public /* synthetic */ bv8(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, v7p v7pVar4, xvf0 xvf0Var9, v7p v7pVar5, v7p v7pVar6, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, v7p v7pVar7, xvf0 xvf0Var16, v7p v7pVar8, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.g = xvf0Var5;
        this.h = v7pVar2;
        this.i = v7pVar3;
        this.j = xvf0Var6;
        this.k = xvf0Var7;
        this.l = xvf0Var8;
        this.m = v7pVar4;
        this.n = xvf0Var9;
        this.o = v7pVar5;
        this.p = v7pVar6;
        this.q = xvf0Var10;
        this.r = xvf0Var11;
        this.s = xvf0Var12;
        this.t = xvf0Var13;
        this.u = xvf0Var14;
        this.v = xvf0Var15;
        this.w = v7pVar7;
        this.x = xvf0Var16;
        this.y = v7pVar8;
        this.z = xvf0Var17;
        this.A = xvf0Var18;
        this.B = xvf0Var19;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.r;
        xvf0 xvf0Var2 = this.q;
        xvf0 xvf0Var3 = this.p;
        xvf0 xvf0Var4 = this.n;
        xvf0 xvf0Var5 = this.j;
        xvf0 xvf0Var6 = this.i;
        xvf0 xvf0Var7 = this.h;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.c;
        xvf0 xvf0Var11 = this.B;
        xvf0 xvf0Var12 = this.z;
        xvf0 xvf0Var13 = this.x;
        xvf0 xvf0Var14 = this.v;
        xvf0 xvf0Var15 = this.u;
        xvf0 xvf0Var16 = this.o;
        xvf0 xvf0Var17 = this.m;
        xvf0 xvf0Var18 = this.l;
        xvf0 xvf0Var19 = this.k;
        xvf0 xvf0Var20 = this.g;
        xvf0 xvf0Var21 = this.f;
        xvf0 xvf0Var22 = this.b;
        switch (i) {
            case 0:
                return new av8((String) xvf0Var22.get(), (b) xvf0Var10.get(), (i) xvf0Var9.get(), (v7b0) xvf0Var8.get(), (mav0) xvf0Var21.get(), (mbv0) xvf0Var20.get(), (a) xvf0Var7.get(), (oxg) xvf0Var6.get(), (fhf) xvf0Var5.get(), (rwp0) xvf0Var19.get(), (s3o) xvf0Var18.get(), (f3o) xvf0Var17.get(), (y9y0) xvf0Var4.get(), (c) xvf0Var16.get(), (nbv0) xvf0Var3.get(), (h51) xvf0Var2.get(), (prj0) xvf0Var.get(), (qoi) this.s.get(), this.t, (oep0) xvf0Var15.get(), (d6v0) xvf0Var14.get(), (h4v0) this.w.get(), (dkv0) xvf0Var13.get(), (SourcePicker) this.y.get(), (mxb) xvf0Var12.get(), (pav0) this.A.get(), (com.yandex.go.address.search.perf.c) ((zwf) xvf0Var11).get());
            case 1:
                return new ru.yandex.taxi.preorder.source.routeoverlay.a((ah00) xvf0Var22.get(), this.c, (xm00) xvf0Var9.get(), (Context) xvf0Var8.get(), (n) xvf0Var21.get(), (tse) xvf0Var20.get(), (s0c0) xvf0Var7.get(), (ru.yandex.taxi.map_common.style.domain.a) xvf0Var6.get(), (b2l0) xvf0Var5.get(), (ney) xvf0Var19.get(), (toe) xvf0Var18.get(), (kt00) xvf0Var17.get(), (rjt0) xvf0Var4.get(), (com.yandex.go.pin.api.widget.b) xvf0Var16.get(), (f) xvf0Var3.get(), i5m.a(xvf0Var2), (ljc) xvf0Var.get(), (c6l0) this.s.get(), (ru.yandex.taxi.sdc.route.presentation.f) this.t.get(), (qr00) xvf0Var15.get(), (oyb0) xvf0Var14.get(), (j) this.w.get(), (ru.yandex.taxi.preorder.source.points.a) xvf0Var13.get(), (kdd0) ((s3f0) this.A).get(), (ru.yandex.taxi.preorder.map.interactor.a) this.y.get(), (nyb0) xvf0Var12.get(), (j0g) ((fwc) xvf0Var11).get());
            default:
                return new e((w030) xvf0Var22.get(), (fva0) xvf0Var10.get(), this.d, this.e, (p) xvf0Var21.get(), (ukn0) xvf0Var20.get(), this.h, this.i, this.j, (MapNotificationsMuteRepository) xvf0Var19.get(), (czn0) xvf0Var18.get(), (umn0) xvf0Var17.get(), this.n, (bnn0) xvf0Var16.get(), this.p, this.q, this.r, this.s, this.t, (vln0) xvf0Var15.get(), (tln0) xvf0Var14.get(), this.w, (ru.yandex.taxi.scooters.presentation.feedback.newbie.a) xvf0Var13.get(), this.y, (gnn0) xvf0Var12.get(), this.A, (pso0) xvf0Var11);
        }
    }

    public bv8(xvf0 xvf0Var, y0y0 y0y0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, zs0 zs0Var, xvf0 xvf0Var4, gwb0 gwb0Var, xvf0 xvf0Var5, gwb0 gwb0Var2, xvf0 xvf0Var6, swb swbVar, xvf0 xvf0Var7, xvf0 xvf0Var8, b900 b900Var, xvf0 xvf0Var9, sp00 sp00Var, ee eeVar, xvf0 xvf0Var10, xvf0 xvf0Var11, h0z h0zVar, xvf0 xvf0Var12, eqh eqhVar, xvf0 xvf0Var13, s3f0 s3f0Var, zo0 zo0Var, xvf0 xvf0Var14, fwc fwcVar) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = y0y0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = zs0Var;
        this.g = xvf0Var4;
        this.h = gwb0Var;
        this.i = xvf0Var5;
        this.j = gwb0Var2;
        this.k = xvf0Var6;
        this.l = swbVar;
        this.m = xvf0Var7;
        this.n = xvf0Var8;
        this.o = b900Var;
        this.p = xvf0Var9;
        this.q = sp00Var;
        this.r = eeVar;
        this.s = xvf0Var10;
        this.t = xvf0Var11;
        this.u = h0zVar;
        this.v = xvf0Var12;
        this.w = eqhVar;
        this.x = xvf0Var13;
        this.A = s3f0Var;
        this.y = zo0Var;
        this.z = xvf0Var14;
        this.B = fwcVar;
    }
}
