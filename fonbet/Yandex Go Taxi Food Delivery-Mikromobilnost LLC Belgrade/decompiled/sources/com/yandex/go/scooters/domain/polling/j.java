package com.yandex.go.scooters.domain.polling;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.utils.ScootersPreferencesExtensionsKt$listenKeyState$$inlined$simpleCallbackApiToFlow$1;
import com.yandex.go.scooters.utils.ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1;
import defpackage.a2e0;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.cwn0;
import defpackage.d3a;
import defpackage.e2e0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.hbp0;
import defpackage.hna;
import defpackage.jl40;
import defpackage.kdd0;
import defpackage.kko0;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pko0;
import defpackage.qwo0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class j implements e2e0, cwn0 {
    public final Lifecycle a;
    public final Set b;
    public final sls c;
    public final q d;
    public volatile boolean e;
    public final hbp0 f;
    public final r0 g;
    public final r0 h;
    public final kdd0 i;

    /* JADX WARN: Multi-variable type inference failed */
    public j(qwo0 qwo0Var, Lifecycle lifecycle, tt2 tt2Var, Set set, d3a d3aVar) {
        ScootersPollingInteractorImpl$1 scootersPollingInteractorImpl$1 = ScootersPollingInteractorImpl$1.b;
        this.a = lifecycle;
        this.b = set;
        this.c = scootersPollingInteractorImpl$1;
        this.d = d3aVar;
        this.f = new hbp0(new ScootersPollingInteractorImpl$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        this.g = bvf0.c(EmptySet.a);
        this.h = bvf0.c(kotlin.collections.b.f());
        kdd0 kdd0Var = new kdd0();
        kdd0Var.a = tt2Var;
        kdd0Var.b = scootersPollingInteractorImpl$1;
        kdd0Var.c = qwo0Var;
        kdd0Var.d = new Object();
        this.i = kdd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r15 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e A[LOOP:4: B:62:0x0138->B:64:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, Set set, Set set2, Continuation continuation) {
        ScootersPollingInteractorImpl$managePolls$1 scootersPollingInteractorImpl$managePolls$1;
        int i;
        Set<String> set3;
        Set set4;
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Iterator it2;
        Object obj;
        Long l;
        a aVar;
        Object obj2;
        Long valueOf;
        long j;
        jVar.getClass();
        if (continuation instanceof ScootersPollingInteractorImpl$managePolls$1) {
            scootersPollingInteractorImpl$managePolls$1 = (ScootersPollingInteractorImpl$managePolls$1) continuation;
            int i2 = scootersPollingInteractorImpl$managePolls$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPollingInteractorImpl$managePolls$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = scootersPollingInteractorImpl$managePolls$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPollingInteractorImpl$managePolls$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    q qVar = jVar.d;
                    scootersPollingInteractorImpl$managePolls$1.L$0 = set;
                    scootersPollingInteractorImpl$managePolls$1.L$1 = set2;
                    scootersPollingInteractorImpl$managePolls$1.label = 1;
                    obj3 = qVar.b(scootersPollingInteractorImpl$managePolls$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set3 = set;
                    set4 = set2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set4 = (Set) scootersPollingInteractorImpl$managePolls$1.L$1;
                    set3 = (Set) scootersPollingInteractorImpl$managePolls$1.L$0;
                    kotlin.b.b(obj3);
                }
                pko0 pko0Var = (pko0) obj3;
                r0Var = jVar.h;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (String str : set3) {
                        Map map = kko0.a;
                        String g0 = evu0.g0(str, ":", str);
                        Iterator it3 = jVar.b.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (((a2e0) obj).a.equals(g0)) {
                                break;
                            }
                        }
                        a2e0 a2e0Var = (a2e0) obj;
                        if (a2e0Var == null) {
                            aVar = null;
                        } else {
                            if (pko0Var.b) {
                                Iterator it4 = pko0Var.d.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it4.next();
                                    if (jl40.l(((pko0.a) obj2).a, g0)) {
                                        break;
                                    }
                                }
                                pko0.a aVar2 = (pko0.a) obj2;
                                if (aVar2 != null) {
                                    long j2 = aVar2.b;
                                    valueOf = Long.valueOf(j2);
                                    if (j2 < 1) {
                                        valueOf = null;
                                    }
                                }
                                long j3 = pko0Var.c;
                                valueOf = Long.valueOf(j3);
                                if (j3 < 1) {
                                    valueOf = null;
                                }
                                if (valueOf == null) {
                                    j = 3600;
                                    l = Long.valueOf(j * 1000);
                                }
                                j = valueOf.longValue();
                                l = Long.valueOf(j * 1000);
                            } else {
                                l = null;
                            }
                            aVar = new a(str, jVar.a, jVar.f, jVar.i, a2e0Var, l, jVar.c);
                        }
                        if (aVar != null) {
                            String str2 = aVar.a;
                            aVar.m = tje.N(aVar.c, null, null, new ScootersPolling$start$1(aVar, null), 3);
                            linkedHashMap.put(str2, aVar);
                        } else {
                            linkedHashSet.add(str);
                        }
                    }
                    kdd0 kdd0Var = jVar.i;
                    it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        kdd0Var.o((String) it.next());
                    }
                    it2 = set4.iterator();
                    while (it2.hasNext()) {
                        a aVar3 = (a) linkedHashMap.remove((String) it2.next());
                        if (aVar3 != null && !aVar3.j) {
                            ScootersPolling$stop$1 scootersPolling$stop$1 = new ScootersPolling$stop$1(aVar3, a.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
                            l8x l8xVar = (l8x) scootersPolling$stop$1.get();
                            scootersPolling$stop$1.i(null);
                            if (l8xVar != null) {
                                l8xVar.a(null);
                            }
                        }
                    }
                } while (!r0Var.k(value, linkedHashMap));
                return zy11.a;
            }
        }
        scootersPollingInteractorImpl$managePolls$1 = new ScootersPollingInteractorImpl$managePolls$1(jVar, continuation);
        Object obj32 = scootersPollingInteractorImpl$managePolls$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPollingInteractorImpl$managePolls$1.label;
        if (i != 0) {
        }
        pko0 pko0Var2 = (pko0) obj32;
        r0Var = jVar.h;
        do {
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            while (r9.hasNext()) {
            }
            kdd0 kdd0Var2 = jVar.i;
            it = linkedHashSet2.iterator();
            while (it.hasNext()) {
            }
            it2 = set4.iterator();
            while (it2.hasNext()) {
            }
        } while (!r0Var.k(value, linkedHashMap));
        return zy11.a;
    }

    @Override // defpackage.cwn0
    public final void b() {
        kdd0 kdd0Var = this.i;
        qwo0 qwo0Var = (qwo0) kdd0Var.c;
        Set n = qwo0Var.a.n("polling_execution_ids");
        Set<String> set = n;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(kdd0.k((String) it.next()));
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        for (String str : set) {
            String k = kdd0.k(str);
            if (!str.equals(k)) {
                cne0 cne0Var = qwo0Var.a;
                long j = cne0Var.j(kko0.a(str), 0L);
                if (j > 0) {
                    String a = kko0.a(k);
                    String a2 = kko0.a(str);
                    if (cne0Var.j(a, 0L) <= 0) {
                        cne0Var.q(j, a);
                    }
                    cne0Var.w(a2);
                }
            }
        }
        if (!N0.equals(n)) {
            qwo0Var.a.t("polling_execution_ids", N0);
        }
        Iterator it2 = N0.iterator();
        while (it2.hasNext()) {
            kdd0Var.l((String) it2.next());
        }
        this.f.a();
        kdd0 kdd0Var2 = this.i;
        cne0 cne0Var2 = ((qwo0) kdd0Var2.c).a;
        int i = 6;
        tpr d = com.yandex.go.coroutines.b.d(new mth(kotlinx.coroutines.flow.e.g(new ScootersPreferencesExtensionsKt$listenKeyState$$inlined$simpleCallbackApiToFlow$1(new hna(cne0Var2, 2), null)), i), new ScootersPreferencesExtensionsKt$listenStringSet$$inlined$start$1(null, cne0Var2, "polling_execution_ids"));
        ((tt2) kdd0Var2.a).getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.f, null, null, new ScootersPollingInteractorImpl$listenLaunchedPolls$$inlined$collectIn$1(new c(new e(new mth(new j0(null, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(d, mdh.b)), new ScootersPollingInteractorImpl$listenLaunchedPolls$$inlined$withPreviousEmit$1(3, null)), i), this)), null, this), 3);
        this.e = true;
    }

    @Override // defpackage.e2e0
    public final boolean c(String str) {
        Iterable<String> iterable = (Iterable) this.g.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (String str2 : iterable) {
                Map map = kko0.a;
                if (evu0.g0(str2, ":", str2).equals(str)) {
                    return true;
                }
            }
        }
        Map map2 = (Map) this.h.getValue();
        if (!map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                String str3 = (String) entry.getKey();
                a aVar = (a) entry.getValue();
                Map map3 = kko0.a;
                if (evu0.g0(str3, ":", str3).equals(str) && !aVar.j) {
                    return true;
                }
            }
        }
        Set n = ((qwo0) this.i.c).a.n("polling_execution_ids");
        if ((n instanceof Collection) && n.isEmpty()) {
            return false;
        }
        Iterator it = n.iterator();
        while (it.hasNext()) {
            String k = kdd0.k((String) it.next());
            if (evu0.g0(k, ":", k).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e2e0
    public final void d(String str, String str2) {
        Object value;
        if (!this.e) {
            zgz.a.j(new IllegalStateException("launchPolling called before onLaunch"));
            return;
        }
        Map map = kko0.a;
        String p = g8e.p(str, ":", str2);
        r0 r0Var = this.g;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.i((Set) value, p)));
        hbp0.e(this.f, null, null, new ScootersPollingInteractorImpl$launchPolling$2(this, p, null), 3);
    }

    @Override // defpackage.e2e0
    public final kotlinx.coroutines.flow.internal.g f(String str) {
        return kotlinx.coroutines.flow.e.X(this.h, new ScootersPollingInteractorImpl$listenPolling$$inlined$flatMapLatest$1(str, null));
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        Object value;
        this.e = false;
        r0 r0Var = this.g;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, EmptySet.a));
        this.f.b();
    }
}
