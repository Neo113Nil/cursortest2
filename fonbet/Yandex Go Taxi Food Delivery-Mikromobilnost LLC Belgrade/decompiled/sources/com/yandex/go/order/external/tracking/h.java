package com.yandex.go.order.external.tracking;

import com.yandex.go.order.external.tracking.h;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.f3p;
import defpackage.ffx;
import defpackage.gtq0;
import defpackage.h3p;
import defpackage.h3y;
import defpackage.hdn;
import defpackage.i3p;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jy11;
import defpackage.ky11;
import defpackage.mj;
import defpackage.mth;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.qhw0;
import defpackage.r3p;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v1p;
import defpackage.x2p;
import defpackage.y7u;
import defpackage.yk;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.experiments.superapp.j;

/* loaded from: classes8.dex */
public final class h {
    public final jy11 a;
    public final ky11 b;
    public final tt2 c;
    public final x2p d;
    public final h3y e;
    public final ru.yandex.taxi.launch.c f;
    public final f3p g;
    public final v1p h;
    public final com.yandex.go.order.external.b i;
    public final r3p j;
    public final y7u k;
    public final i3y l;
    public final ike m;
    public final kotlinx.coroutines.sync.a n;
    public final r0 o;
    public final n0 p;
    public final n0 q;
    public List r;
    public final h3p s;
    public final i3p t;
    public pzt0 u;
    public final mth v;

    /* JADX WARN: Type inference failed for: r2v7, types: [h3p] */
    public h(h3y h3yVar, jy11 jy11Var, ky11 ky11Var, tt2 tt2Var, x2p x2pVar, h3y h3yVar2, ru.yandex.taxi.launch.c cVar, f3p f3pVar, v1p v1pVar, com.yandex.go.order.external.b bVar, r3p r3pVar, y7u y7uVar) {
        this.a = jy11Var;
        this.b = ky11Var;
        this.c = tt2Var;
        this.d = x2pVar;
        this.e = h3yVar2;
        this.f = cVar;
        this.g = f3pVar;
        this.h = v1pVar;
        this.i = bVar;
        this.j = r3pVar;
        this.k = y7uVar;
        this.l = kotlin.a.b(LazyThreadSafetyMode.NONE, new mj(h3yVar, 4));
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.m = bvf0.a(cvw.U(a, o400.a));
        this.n = gtq0.a();
        r0 c = bvf0.c(null);
        this.o = c;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.p = ffx.b(0, 1, bufferOverflow);
        this.q = ffx.b(0, 1, bufferOverflow);
        this.r = EmptyList.a;
        this.s = new hdn() { // from class: h3p
            @Override // defpackage.hdn
            public final void a(List list, boolean z, boolean z2) {
                h.this.b(list, z, z2);
            }
        };
        this.t = new i3p(this);
        this.v = new mth(c, 6);
    }

    public final void a() {
        pzt0 pzt0Var = this.u;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            ((c) this.l.getValue()).a(this.s);
            this.i.c.add(this.t);
            this.u = tje.N(this.m, null, null, new ExternalServiceOrdersTrackingRepositoryImpl$startTracking$$inlined$safeCollectIn$1(new m0(kotlinx.coroutines.flow.e.t(new e(new g(((j) this.e.get()).b()))), kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(this.f.b(), new yk(9)), new ExternalServiceOrdersTrackingRepositoryImpl$startTracking$$inlined$flatMapLatest$1(3, null)), new ExternalServiceOrdersTrackingRepositoryImpl$startTracking$1(3, null)), com.yandex.go.coroutines.b.e(), null, this), 3);
        }
    }

    public final void b(List list, boolean z, boolean z2) {
        this.r = list;
        this.c.getClass();
        tje.N(this.m, uyj.a, null, new ExternalServiceOrdersTrackingRepositoryImpl$updateOrders$1(this, list, z, z2, null), 2);
    }
}
