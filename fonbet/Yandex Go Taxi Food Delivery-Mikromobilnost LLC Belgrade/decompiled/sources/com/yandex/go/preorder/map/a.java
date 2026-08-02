package com.yandex.go.preorder.map;

import com.yandex.go.address.position_confirmation.j;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.biv0;
import defpackage.bvf0;
import defpackage.cvr;
import defpackage.czo0;
import defpackage.d6l0;
import defpackage.f0l0;
import defpackage.fi6;
import defpackage.g0l0;
import defpackage.hbp0;
import defpackage.pzt0;
import defpackage.su40;
import defpackage.tls;
import defpackage.xfv0;
import defpackage.zlm;
import defpackage.zqz0;
import java.util.ArrayList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes13.dex */
public final class a implements f0l0 {
    public final a3v a;
    public final ah00 b;
    public final d6l0 c;
    public final xfv0 d;
    public final j e;
    public final r f;
    public final com.yandex.go.route.interactor.b g;
    public final biv0 h;
    public final cvr i;
    public final zqz0 j;
    public g0l0 m;
    public pzt0 o;
    public boolean p;
    public final hbp0 k = new hbp0(new czo0(14), "", null);
    public final r0 l = bvf0.c(0);
    public boolean n = true;

    public a(a3v a3vVar, ah00 ah00Var, d6l0 d6l0Var, xfv0 xfv0Var, j jVar, r rVar, com.yandex.go.route.interactor.b bVar, biv0 biv0Var, cvr cvrVar, zqz0 zqz0Var) {
        this.a = a3vVar;
        this.b = ah00Var;
        this.c = d6l0Var;
        this.d = xfv0Var;
        this.e = jVar;
        this.f = rVar;
        this.g = bVar;
        this.h = biv0Var;
        this.i = cvrVar;
        this.j = zqz0Var;
    }

    public final void a(boolean z) {
        g0l0 g0l0Var = this.m;
        if (g0l0Var != null) {
            g0l0Var.onMoveFinished(z);
            this.m = null;
        }
    }

    public final void b(tls tlsVar, boolean z, boolean z2) {
        fi6 fi6Var;
        BoundingBox g;
        boolean isEmpty = this.g.c().b.isEmpty();
        if (this.h.c() || isEmpty) {
            return;
        }
        ru.yandex.taxi.preorder.source.routeoverlay.a aVar = (ru.yandex.taxi.preorder.source.routeoverlay.a) this.c;
        aVar.getClass();
        ArrayList arrayList = new ArrayList(aVar.V);
        if (arrayList.size() < 2) {
            fi6Var = null;
        } else {
            if (!aVar.q0) {
                arrayList.remove(arrayList.size() - 1);
            }
            fi6Var = new fi6();
            fi6Var.f(arrayList);
        }
        if (fi6Var == null) {
            g = null;
        } else {
            zlm zlmVar = aVar.g0;
            Polyline a = zlmVar != null ? zlmVar.a() : null;
            if (a != null) {
                fi6Var.d(a);
            }
            g = fi6Var.g();
        }
        g0l0 g0l0Var = new g0l0(this, z, z2);
        if (g == null) {
            g0l0Var.onMoveFinished(false);
            return;
        }
        this.n = false;
        a(false);
        this.n = true;
        this.m = g0l0Var;
        su40 su40Var = new su40(tlsVar, g, 1);
        pzt0 pzt0Var = this.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.o = hbp0.e(this.k, null, null, new RouteAnimationsHolderImpl$launchAnimationJob$1(this, su40Var, null), 3);
    }
}
