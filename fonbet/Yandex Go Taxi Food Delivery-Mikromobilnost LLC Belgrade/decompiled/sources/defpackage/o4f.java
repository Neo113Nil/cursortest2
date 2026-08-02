package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.repositories.n;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.delivery.interactors.a;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.management.j;

/* loaded from: classes14.dex */
public final class o4f implements v7p {
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

    public /* synthetic */ o4f(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, int i) {
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
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.o;
        xvf0 xvf0Var2 = this.n;
        xvf0 xvf0Var3 = this.m;
        xvf0 xvf0Var4 = this.l;
        xvf0 xvf0Var5 = this.k;
        xvf0 xvf0Var6 = this.j;
        xvf0 xvf0Var7 = this.i;
        xvf0 xvf0Var8 = this.h;
        xvf0 xvf0Var9 = this.g;
        xvf0 xvf0Var10 = this.f;
        xvf0 xvf0Var11 = this.e;
        xvf0 xvf0Var12 = this.d;
        xvf0 xvf0Var13 = this.c;
        xvf0 xvf0Var14 = this.b;
        switch (i) {
            case 0:
                return new a((tse) xvf0Var14.get(), (dqe0) xvf0Var13.get(), (ybi) xvf0Var12.get(), (f) xvf0Var11.get(), (y5i) xvf0Var10.get(), (gdi) xvf0Var9.get(), (j) xvf0Var8.get(), (xku0) xvf0Var7.get(), (t8i) xvf0Var6.get(), (l8i) xvf0Var5.get(), (wt90) xvf0Var4.get(), (e) xvf0Var3.get(), (aji) xvf0Var2.get(), (g) xvf0Var.get());
            case 1:
                Context context = (Context) xvf0Var14.get();
                bts0 bts0Var = (bts0) xvf0Var11.get();
                k7x0 k7x0Var = (k7x0) xvf0Var8.get();
                oxu0 oxu0Var = (oxu0) xvf0Var7.get();
                pwy0 pwy0Var = (pwy0) xvf0Var6.get();
                return new bu0(context, bts0Var, k7x0Var, oxu0Var, pwy0Var, (ru.yandex.taxi.widget.utils.e) xvf0Var4.get(), (p2y0) xvf0Var3.get(), (irs0) xvf0Var2.get(), (wsc) xvf0Var.get());
            case 2:
                return new d980((o2y0) xvf0Var14.get(), (u48) xvf0Var13.get(), (crg) xvf0Var12.get(), (c) xvf0Var11.get(), (jtq0) xvf0Var10.get(), (zuj0) xvf0Var9.get(), (s86) xvf0Var8.get(), (ysg) xvf0Var7.get(), (ney) xvf0Var6.get(), (n) xvf0Var5.get(), (ru.yandex.taxi.widget.c) xvf0Var4.get(), (onz) xvf0Var3.get(), (e980) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                Context context2 = (Context) xvf0Var14.get();
                yze0 yze0Var = (yze0) xvf0Var11.get();
                tt2 tt2Var = (tt2) xvf0Var10.get();
                xdf xdfVar = (xdf) xvf0Var9.get();
                return new st0(context2, yze0Var, tt2Var, xdfVar, (com.yandex.go.taxi.order.recalculation.domain.a) xvf0Var7.get(), (of9) xvf0Var6.get(), (w4y0) xvf0Var5.get(), (Activity) xvf0Var4.get(), (pho) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (pav) xvf0Var.get());
            default:
                return new tt((dqe0) xvf0Var14.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var13.get(), (wiq0) xvf0Var12.get(), (com.yandex.go.route.interactor.c) xvf0Var11.get(), (tit0) xvf0Var10.get(), (c9l0) xvf0Var9.get(), (com.yandex.go.navigation.screen.c) xvf0Var8.get(), (q4) xvf0Var7.get(), (evr) xvf0Var6.get(), (lgv0) xvf0Var5.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var4.get(), (iv70) xvf0Var3.get(), (xvw) xvf0Var2.get(), (com.yandex.go.taxi.summary.map.walkingroute.e) xvf0Var.get());
        }
    }
}
