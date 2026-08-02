package com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp;

import com.yandex.mapkit.geometry.Point;
import defpackage.a3y0;
import defpackage.d0l0;
import defpackage.f2e0;
import defpackage.h5l0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m58;
import defpackage.pb30;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.tje;
import defpackage.vpr;
import defpackage.z1e0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, m58] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        T t;
        List singletonList;
        f2e0 f2e0Var = (f2e0) obj;
        c cVar = this.a;
        a3y0 a3y0Var = cVar.E;
        if (f2e0Var == null) {
            cVar.Mg();
            a3y0Var.getClass();
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            hst hstVar = jst.e;
        } else {
            String str = f2e0Var.a;
            a3y0Var.getClass();
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            hst hstVar2 = jst.e;
            z1e0 z1e0Var = cVar.Q;
            if (z1e0Var == null || !jl40.l(z1e0Var.a.a, str)) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Iterator it = cVar.P.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = 0;
                        break;
                    }
                    t = it.next();
                    if (jl40.l(((m58) t).a, str)) {
                        break;
                    }
                }
                ref$ObjectRef.element = t;
                cVar.Mg();
                T t2 = ref$ObjectRef.element;
                boolean z = t2 != 0;
                if (t2 != 0) {
                    cVar.D.b(((m58) t2).a);
                    a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                    hst hstVar3 = jst.e;
                } else {
                    pb30 pb30Var = f2e0Var.b;
                    Point point = pb30Var.x;
                    if (point == null) {
                        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                        hst hstVar4 = jst.e;
                    } else {
                        ref$ObjectRef.element = new m58(str, pb30Var, point);
                    }
                }
                cVar.B.b(((m58) ref$ObjectRef.element).b.a, false);
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                hst hstVar5 = jst.e;
                m58 m58Var = (m58) ref$ObjectRef.element;
                boolean z2 = !z;
                zzs E = ru.yandex.taxi.map.utils.a.E(m58Var.c, null);
                List i = cVar.x.b().V().i();
                if (i.isEmpty()) {
                    zzs Lg = cVar.Lg();
                    d0l0 d0l0Var = h5l0.a;
                    singletonList = Collections.singletonList(scc.g(Lg, E));
                } else {
                    zzs Lg2 = cVar.Lg();
                    zzs zzsVar = (zzs) kotlin.collections.a.P(i);
                    d0l0 d0l0Var2 = h5l0.a;
                    List singletonList2 = zzsVar == null ? Collections.singletonList(E) : scc.g(zzsVar, Lg2, E);
                    zzs zzsVar2 = (zzs) kotlin.collections.a.P(i);
                    zzs Lg3 = cVar.Lg();
                    singletonList = scc.g(singletonList2, Lg3 == null ? Collections.singletonList(E) : scc.g(Lg3, zzsVar2, E));
                }
                List list = singletonList;
                pzt0 pzt0Var = cVar.R;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                cVar.R = tje.N(cVar.Jg(), null, null, new LongSearchV2CarOverlayPresenter$showPollingCarWithRoutes$1(list, m58Var, z2, cVar, null), 3);
            } else {
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            }
        }
        return zy11.a;
    }
}
