package com.yandex.messaging.domain.experiments;

import com.yandex.messaging.analytics.ExperimentsReporter$ResolveSource;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.experiments.ExperimentName;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom;
import defpackage.el21;
import defpackage.jl40;
import defpackage.nqo;
import defpackage.ny61;
import defpackage.qcx;
import defpackage.qro;
import defpackage.rro;
import defpackage.tcc;
import defpackage.tgy0;
import defpackage.tje;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.xqo;
import defpackage.yqo;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes15.dex */
public final class a {
    public static final xqo i = new xqo(false, null);
    public final rro a;
    public final el21 b;
    public final xdf0 c;
    public final qro d;
    public final tgy0 e;
    public final yqo f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);

    public a(ExperimentsDatabaseRoom experimentsDatabaseRoom, rro rroVar, el21 el21Var, xdf0 xdf0Var, qro qroVar, tgy0 tgy0Var) {
        this.a = rroVar;
        this.b = el21Var;
        this.c = xdf0Var;
        this.d = qroVar;
        this.e = tgy0Var;
        this.f = experimentsDatabaseRoom.S0();
    }

    public static final void d(a aVar, ExperimentName experimentName, xqo xqoVar) {
        ConcurrentHashMap concurrentHashMap = aVar.g;
        concurrentHashMap.get(experimentName);
        z83.i();
        concurrentHashMap.put(experimentName, xqoVar);
        aVar.d.a.reportEvent("ab_experiment_resolved", b.i(new Pair("name", experimentName.getUaasId()), new Pair(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(xqoVar.a)), new Pair("source", aVar.h.get() ? ExperimentsReporter$ResolveSource.Network.getSource() : ExperimentsReporter$ResolveSource.Local.getSource())));
    }

    public final void e(GetExperimentsResponse getExperimentsResponse) {
        tje.N(this.c, null, null, new ExperimentsController$applyExperiments$1(this, getExperimentsResponse, null), 3);
    }

    public final void f() {
        tgy0 tgy0Var = this.e;
        tgy0Var.b.a.a((Set) tgy0Var.c.getValue());
        List b = this.f.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ExperimentName experimentName = ((nqo) it.next()).b;
            String uaasId = experimentName != null ? experimentName.getUaasId() : null;
            if (uaasId != null) {
                arrayList.add(uaasId);
            }
        }
        qro qroVar = this.d;
        x22 x22Var = qroVar.a;
        List list = (List) qroVar.b.b.getValue();
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ExperimentName) it2.next()).getUaasId());
        }
        x22Var.reportEvent("ab_state_info", b.i(new Pair("whiteList", arrayList2), new Pair("names", arrayList)));
        tje.N(this.c, null, null, new ExperimentsController$initExperiments$2(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(c cVar) {
        Object obj;
        String uaasId;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) this.a.b.getValue()).iterator();
        while (true) {
            c cVar2 = null;
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ExperimentName experimentName = (ExperimentName) it.next();
            String uaasId2 = experimentName.getUaasId();
            if (cVar.a.keySet().contains(uaasId2)) {
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(uaasId2);
                if (bVar instanceof d) {
                    Boolean f = qcx.f(qcx.n(bVar));
                    if (f != null) {
                        z = f.booleanValue();
                    }
                } else if ((bVar instanceof c) && !((Map) bVar).isEmpty()) {
                    cVar2 = (c) bVar;
                }
                if (!z) {
                    arrayList.add(new nqo(0L, experimentName, cVar2));
                }
            }
            z = false;
            if (!z) {
            }
        }
        this.f.e(arrayList);
        this.h.set(true);
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ExperimentName experimentName2 = ((nqo) it2.next()).b;
            if (experimentName2 == null || (uaasId = experimentName2.getUaasId()) == null) {
                ny61.r("name must not be null");
                return;
            }
            arrayList2.add(uaasId);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.g.entrySet()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (((nqo) obj).b == entry.getKey()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            nqo nqoVar = (nqo) obj;
            if (((xqo) entry.getValue()).a == (nqoVar != null)) {
                if (!jl40.l(((xqo) entry.getValue()).b, nqoVar != null ? nqoVar.c : null)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList3 = new ArrayList(tcc.n(keySet, 10));
        Iterator it4 = keySet.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((ExperimentName) it4.next()).getUaasId());
        }
        this.d.a.reportEvent("ab_experiments_saved", b.i(new Pair("savedNames", arrayList2), new Pair("outdatedNames", arrayList3)));
    }
}
