package com.yandex.go.navigator.driving;

import defpackage.bkm;
import defpackage.bxl;
import defpackage.czo0;
import defpackage.gci0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.mth;
import defpackage.nyw;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.uyw;
import defpackage.vxr;
import defpackage.wb50;
import defpackage.xb50;
import defpackage.zuj0;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes12.dex */
public final class f {
    public final bkm a;
    public final com.yandex.go.navigator.repository.o b;
    public final wb50 c;
    public final com.yandex.go.navigator.domain.e d;
    public final vxr e;
    public final zuj0 f;
    public final nyw g;
    public final xb50 h;
    public final uyw i;
    public final hbp0 j;
    public final i3y k;
    public boolean l;
    public boolean m;

    public f(bkm bkmVar, com.yandex.go.navigator.repository.o oVar, wb50 wb50Var, com.yandex.go.navigator.domain.e eVar, vxr vxrVar, zuj0 zuj0Var, nyw nywVar, xb50 xb50Var, uyw uywVar) {
        this.a = bkmVar;
        this.b = oVar;
        this.c = wb50Var;
        this.d = eVar;
        this.e = vxrVar;
        this.f = zuj0Var;
        this.g = nywVar;
        this.h = xb50Var;
        this.i = uywVar;
        String c = qoi0.a(f.class).c();
        int i = 14;
        this.j = new hbp0(new czo0(i), c == null ? "" : c, null);
        this.k = kotlin.a.b(LazyThreadSafetyMode.NONE, new bxl(i, this));
        this.l = true;
    }

    public final void a() {
        hbp0 hbp0Var = this.j;
        hbp0Var.a();
        vxr vxrVar = this.e;
        hbp0 hbp0Var2 = vxrVar.e;
        hbp0Var2.a();
        com.yandex.go.coroutines.b.h(hbp0Var2.c(), new kotlinx.coroutines.flow.m0(kotlinx.coroutines.flow.e.t(vxrVar.c.h), new mth(new kotlinx.coroutines.flow.j0(null, vxrVar.b.c, new FollowModeInteractor$attach$$inlined$withPreviousEmit$1(3, null)), 6), new FollowModeInteractor$attach$1(vxrVar, null)));
        tje.N(hbp0Var, null, null, new DrivingModalFocusManager$observeUserInteractions$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(this.b.f), null, this), 3);
        com.yandex.go.coroutines.b.h(hbp0Var, kotlinx.coroutines.flow.e.n((gci0) this.g.b, new mth((gci0) this.a.b, 6), (gci0) this.i.b, new DrivingModalFocusManager$dispatchFollowingFocus$1(this, null)));
    }

    public final void b() {
        this.e.e.b();
        this.c.g(null);
        this.m = false;
        this.j.b();
    }
}
