package com.yandex.go.taxi.order.search.overlay.ordinary.mvp;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.mapkit.geometry.Point;
import defpackage.a3y0;
import defpackage.cms;
import defpackage.d0l0;
import defpackage.f2e0;
import defpackage.h5l0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jms;
import defpackage.jst;
import defpackage.m58;
import defpackage.o2y0;
import defpackage.pb30;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse0;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.vpr;
import defpackage.z1e0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements vpr, jms {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        m58 m58Var;
        List singletonList;
        f2e0 f2e0Var = (f2e0) obj;
        b bVar = this.a;
        o2y0 o2y0Var = bVar.x;
        a3y0 a3y0Var = bVar.D;
        if (f2e0Var == null) {
            bVar.Ng();
            a3y0Var.getClass();
            a3y0.h(new String[]{"handlePollingUpdates"});
            hst hstVar = jst.e;
        } else {
            String str = f2e0Var.a;
            a3y0Var.getClass();
            a3y0.h(new String[]{"handlePollingUpdates"});
            hst hstVar2 = jst.e;
            z1e0 z1e0Var = bVar.H;
            if (z1e0Var != null) {
                m58 m58Var2 = z1e0Var.a;
                if (jl40.l(m58Var2 != null ? m58Var2.a : null, str)) {
                    a3y0.h(new String[]{"handlePollingUpdates"});
                }
            }
            Iterator it = bVar.E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((m58) obj2).a, str)) {
                    break;
                }
            }
            m58 m58Var3 = (m58) obj2;
            pb30 pb30Var = f2e0Var.b;
            bVar.Ng();
            if (m58Var3 != null) {
                ud80 ud80Var = bVar.B;
                SearchState k = ((n) ud80Var.d).k(o2y0Var.b().a);
                if (k != null) {
                    u8w u8wVar = ud80Var.e;
                    String Hg = ud80Var.c.b.Hg();
                    String str2 = k.a;
                    String str3 = k.b;
                    String format = ud80Var.g.format(new Date());
                    u8wVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (Hg != null) {
                        hashMap.put("user_phone_id", Hg);
                    }
                    hashMap.put("order_id", str2);
                    if (str3 != null) {
                        hashMap.put("tariff_zone", str3);
                    }
                    u8wVar.a.a("SearchAnimation.PollingCandidateFromNearestDrivers", hashMap, 1, tse0.r(ClidProvider.TIMESTAMP, hashMap, format));
                }
                m58Var3.b.y = pb30Var.y;
                m58Var = m58Var3;
            } else {
                Point point = pb30Var.x;
                if (point == null) {
                    a3y0.h(new String[]{"handlePollingUpdates"});
                    hst hstVar3 = jst.e;
                } else {
                    m58Var = new m58(str, pb30Var, point);
                }
            }
            bVar.y.b(m58Var.b.a, false);
            a3y0.h(new String[]{"handlePollingUpdates"});
            hst hstVar4 = jst.e;
            boolean z = m58Var3 == null;
            a3y0.h(new String[]{"startPolling"});
            zzs E = ru.yandex.taxi.map.utils.a.E(m58Var.c, null);
            zzs Mg = bVar.Mg();
            List i = o2y0Var.b().V().i();
            if (i.isEmpty()) {
                d0l0 d0l0Var = h5l0.a;
                singletonList = Collections.singletonList(Mg == null ? Collections.singletonList(E) : scc.g(E, Mg));
            } else {
                zzs zzsVar = (zzs) kotlin.collections.a.P(i);
                d0l0 d0l0Var2 = h5l0.a;
                singletonList = scc.g(zzsVar == null ? Collections.singletonList(E) : scc.g(zzsVar, Mg, E), Mg == null ? Collections.singletonList(E) : scc.g(Mg, (zzs) kotlin.collections.a.P(i), E));
            }
            List list = singletonList;
            pzt0 pzt0Var = bVar.F;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            bVar.F = tje.N(bVar.Jg(), null, null, new OrdinarySearchMVPPresenter$showPollingCarWithRoutes$1(list, bVar, m58Var, z, null), 3);
        }
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, b.class, "handlePollingUpdates", "handlePollingUpdates(Lcom/yandex/go/taxi/order/search/v2/domain/model/PollingModel;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
