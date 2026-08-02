package defpackage;

import android.content.Context;
import com.yandex.go.payments.domain.q0;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import com.yandex.go.taxi.order.provider.chat.c;
import com.yandex.go.taxi.order.repositories.n;
import com.yandex.go.taxi.order.superapp.orders.h;
import com.yandex.go.taxi.tariffs.interactor.b;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.internal.core.accounts.d;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.push.a0;
import com.yandex.passport.internal.push.c0;
import com.yandex.passport.internal.push.d0;
import com.yandex.passport.internal.push.e0;
import com.yandex.passport.internal.push.i0;
import com.yandex.passport.internal.report.reporters.r0;
import com.yandex.passport.internal.report.reporters.s0;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.usecase.y;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.delivery.preorder.a;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.personalstate.domain.interactor.i;
import ru.yandex.taxi.personalstate.domain.o;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes9.dex */
public final class cui implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;
    public final yvf0 l;
    public final yvf0 m;
    public final yvf0 n;
    public final yvf0 o;
    public final yvf0 p;
    public final yvf0 q;
    public final yvf0 r;
    public final yvf0 s;

    public /* synthetic */ cui(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar2, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar3, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, v7p v7pVar4, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, v7p v7pVar5, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = v7pVar2;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = v7pVar3;
        this.j = xvf0Var6;
        this.k = xvf0Var7;
        this.l = xvf0Var8;
        this.m = v7pVar4;
        this.n = xvf0Var9;
        this.o = xvf0Var10;
        this.p = xvf0Var11;
        this.q = xvf0Var12;
        this.r = xvf0Var13;
        this.s = v7pVar5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        yvf0 yvf0Var = this.s;
        yvf0 yvf0Var2 = this.r;
        yvf0 yvf0Var3 = this.q;
        yvf0 yvf0Var4 = this.p;
        yvf0 yvf0Var5 = this.o;
        yvf0 yvf0Var6 = this.n;
        yvf0 yvf0Var7 = this.m;
        yvf0 yvf0Var8 = this.l;
        yvf0 yvf0Var9 = this.k;
        yvf0 yvf0Var10 = this.j;
        yvf0 yvf0Var11 = this.i;
        yvf0 yvf0Var12 = this.h;
        yvf0 yvf0Var13 = this.g;
        yvf0 yvf0Var14 = this.f;
        yvf0 yvf0Var15 = this.e;
        yvf0 yvf0Var16 = this.d;
        yvf0 yvf0Var17 = this.c;
        switch (i) {
            case 0:
                return new bui((gf41) xvf0Var.get(), (qsi) ((xvf0) yvf0Var17).get(), (a) ((xvf0) yvf0Var16).get(), (ru.yandex.taxi.logistics.deliveries.a) ((xvf0) yvf0Var15).get(), (xvf0) yvf0Var14, (wsi) ((xvf0) yvf0Var12).get(), (w030) ((xvf0) yvf0Var11).get(), (xvf0) yvf0Var10, (xvf0) yvf0Var9, (n3h) ((xvf0) yvf0Var8).get(), (xvf0) yvf0Var7, (cda0) ((xvf0) yvf0Var6).get(), (xvf0) yvf0Var5, (xvf0) yvf0Var4, (xvf0) yvf0Var3, (com.yandex.go.delivery.tracking.a) ((lx6) yvf0Var).get(), (oep0) ((xvf0) yvf0Var2).get());
            case 1:
                return new e((Context) xvf0Var.get(), (wut) ((xvf0) yvf0Var17).get(), i5m.a((xvf0) yvf0Var16), i5m.a((xvf0) yvf0Var15), (q0) ((xvf0) yvf0Var14).get(), (raa0) ((xvf0) yvf0Var13).get(), (l9z) ((xvf0) yvf0Var12).get(), i5m.a((xvf0) yvf0Var11), (tt2) ((xvf0) yvf0Var10).get(), (fw4) ((xvf0) yvf0Var9).get(), (m6i0) ((xvf0) yvf0Var8).get(), i5m.a((xvf0) yvf0Var7), (fga0) ((xvf0) yvf0Var6).get(), (tvt) ((xvf0) yvf0Var5).get(), (rs2) ((xvf0) yvf0Var4).get(), (chh) ((xvf0) yvf0Var3).get(), (irs) ((xvf0) yvf0Var2).get(), i5m.a((eqh) yvf0Var));
            case 2:
                return new h((yk21) xvf0Var.get(), (c) ((xvf0) yvf0Var17).get(), (OrderCancelProcessingObserver) ((xvf0) yvf0Var16).get(), (zuj0) ((xvf0) yvf0Var15).get(), (k7x0) ((xvf0) yvf0Var14).get(), (jgv) ((xvf0) yvf0Var13).get(), (spl0) ((xvf0) yvf0Var12).get(), (com.yandex.go.taxi.order.repositories.c) ((xvf0) yvf0Var11).get(), (ci70) ((xvf0) yvf0Var10).get(), (eg7) ((xvf0) yvf0Var9).get(), (n) ((xvf0) yvf0Var8).get(), (kvp0) ((xvf0) yvf0Var7).get(), (ba80) ((xvf0) yvf0Var6).get(), (iup0) ((xvf0) yvf0Var5).get(), (gs70) ((xvf0) yvf0Var4).get(), (uw40) ((xvf0) yvf0Var3).get(), (kyx0) ((abx0) yvf0Var).get(), (xdf) ((xvf0) yvf0Var2).get());
            case 3:
                return new y180((q280) xvf0Var.get(), (zuj0) ((xvf0) yvf0Var17).get(), (xzi0) ((xvf0) yvf0Var16).get(), (l) ((xvf0) yvf0Var15).get(), (yhz0) ((xvf0) yvf0Var14).get(), (u880) ((xvf0) yvf0Var13).get(), (vze0) ((xvf0) yvf0Var12).get(), (iom0) ((xvf0) yvf0Var11).get(), (xdf) ((xvf0) yvf0Var10).get(), (ec11) ((xvf0) yvf0Var9).get(), (j5z) ((xvf0) yvf0Var8).get(), (mzx0) ((xvf0) yvf0Var7).get(), (hxo) ((xvf0) yvf0Var6).get(), (ixo) ((xvf0) yvf0Var5).get(), (mxo) ((xvf0) yvf0Var4).get(), (jxo) ((xvf0) yvf0Var3).get(), (kug) ((eqf0) yvf0Var2).get(), (fb7) ((c660) yvf0Var).get());
            case 4:
                return new o((i) xvf0Var.get(), (dqe0) ((xvf0) yvf0Var17).get(), (ru.yandex.taxi.personalstate.data.remote.a) ((xvf0) yvf0Var16).get(), (com.yandex.go.zone.repository.o) ((xvf0) yvf0Var15).get(), (g) ((xvf0) yvf0Var14).get(), (mo40) ((xvf0) yvf0Var13).get(), (s7b0) ((xvf0) yvf0Var12).get(), i5m.a((xvf0) yvf0Var11), (wiq0) ((xvf0) yvf0Var10).get(), (q7b0) ((xvf0) yvf0Var9).get(), (o0m0) ((xvf0) yvf0Var8).get(), (RequirementsChangedNotifier) ((xvf0) yvf0Var7).get(), (ru.yandex.taxi.launch.c) ((xvf0) yvf0Var6).get(), (amc) ((xvf0) yvf0Var5).get(), (c8r) ((xvf0) yvf0Var4).get(), (b) ((xv2) yvf0Var).get(), (m) ((xvf0) yvf0Var3).get(), (f6b0) ((xvf0) yvf0Var2).get());
            case 5:
                return new com.yandex.go.environment.i((ru.yandex.taxi.search.suggest.i) xvf0Var.get(), (y9y0) ((xvf0) yvf0Var17).get(), (wu30) ((xvf0) yvf0Var16).get(), (ra00) ((xvf0) yvf0Var15).get(), (tse) ((xvf0) yvf0Var14).get(), (tt2) ((xvf0) yvf0Var13).get(), (rmv0) yvf0Var3, i5m.a((xvf0) yvf0Var12), (ru.yandex.taxi.am.token.a) ((xvf0) yvf0Var11).get(), (hs50) ((xvf0) yvf0Var10).get(), (x2p) ((xvf0) yvf0Var9).get(), (com.yandex.go.order.external.tracking.h) ((xvf0) yvf0Var8).get(), (xvf0) yvf0Var7, (oep0) ((xvf0) yvf0Var6).get(), (com.yandex.go.environment.b) ((gb0) yvf0Var2).get(), (com.yandex.go.taxi.order.provider.a) ((xvf0) yvf0Var5).get(), (rx2) ((p7w0) yvf0Var).get(), (com.yandex.go.navigation.screen.c) ((xvf0) yvf0Var4).get());
            default:
                return new com.yandex.passport.internal.push.h((Context) yvf0Var17.get(), (d) yvf0Var16.get(), (s0) yvf0Var15.get(), (u0) yvf0Var14.get(), (com.yandex.passport.common.analytics.d) yvf0Var13.get(), (com.yandex.passport.common.common.a) yvf0Var12.get(), (i0) yvf0Var11.get(), (d8) yvf0Var10.get(), (a0) yvf0Var9.get(), (com.yandex.passport.common.coroutine.a) yvf0Var8.get(), (j) yvf0Var7.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var6.get(), (d0) yvf0Var5.get(), (e0) yvf0Var4.get(), (c0) yvf0Var3.get(), (com.yandex.passport.internal.push.i) yvf0Var2.get(), (y) yvf0Var.get(), (r0) xvf0Var.get());
        }
    }

    public /* synthetic */ cui(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, v7p v7pVar3, xvf0 xvf0Var15, int i) {
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
        this.l = v7pVar;
        this.m = v7pVar2;
        this.n = xvf0Var11;
        this.o = xvf0Var12;
        this.p = xvf0Var13;
        this.q = xvf0Var14;
        this.s = v7pVar3;
        this.r = xvf0Var15;
    }

    public cui(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, yvf0 yvf0Var13, yvf0 yvf0Var14, yvf0 yvf0Var15, yvf0 yvf0Var16, yvf0 yvf0Var17, xvf0 xvf0Var) {
        this.a = 6;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.k = yvf0Var9;
        this.l = yvf0Var10;
        this.m = yvf0Var11;
        this.n = yvf0Var12;
        this.o = yvf0Var13;
        this.p = yvf0Var14;
        this.q = yvf0Var15;
        this.r = yvf0Var16;
        this.s = yvf0Var17;
        this.b = xvf0Var;
    }

    public cui(xvf0 xvf0Var, jwx0 jwx0Var, s730 s730Var, eqh eqhVar, xvf0 xvf0Var2, xvf0 xvf0Var3, rmv0 rmv0Var, eqh eqhVar2, eqh eqhVar3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, dld0 dld0Var, eqh eqhVar4, gb0 gb0Var, eqh eqhVar5, p7w0 p7w0Var, xvf0 xvf0Var7) {
        this.a = 5;
        this.b = xvf0Var;
        this.c = jwx0Var;
        this.d = s730Var;
        this.e = eqhVar;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.q = rmv0Var;
        this.h = eqhVar2;
        this.i = eqhVar3;
        this.j = xvf0Var4;
        this.k = xvf0Var5;
        this.l = xvf0Var6;
        this.m = dld0Var;
        this.n = eqhVar4;
        this.r = gb0Var;
        this.o = eqhVar5;
        this.s = p7w0Var;
        this.p = xvf0Var7;
    }

    public cui(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, qta0 qta0Var, swo0 swo0Var, xvf0 xvf0Var6, i0b0 i0b0Var, xvf0 xvf0Var7, xvf0 xvf0Var8, eqh eqhVar2, xvf0 xvf0Var9, xvf0 xvf0Var10, xv2 xv2Var, xvf0 xvf0Var11, xvf0 xvf0Var12) {
        this.a = 4;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = qta0Var;
        this.i = swo0Var;
        this.j = xvf0Var6;
        this.k = i0b0Var;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = eqhVar2;
        this.o = xvf0Var9;
        this.p = xvf0Var10;
        this.s = xv2Var;
        this.q = xvf0Var11;
        this.r = xvf0Var12;
    }
}
