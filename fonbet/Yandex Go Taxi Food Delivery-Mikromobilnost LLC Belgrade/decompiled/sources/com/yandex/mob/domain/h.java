package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.dq20;
import defpackage.jr20;
import defpackage.lq20;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rot;
import defpackage.tcc;
import defpackage.vng;
import defpackage.zm20;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h {
    public final l a;
    public final com.yandex.mob.k b;
    public final com.yandex.mob.datastore.d c;
    public final com.yandex.mob.cron.a d;
    public final jr20 e;
    public final com.yandex.mob.reporting.a f;
    public final rot g;
    public pzt0 h;

    public h(l lVar, com.yandex.mob.k kVar, com.yandex.mob.datastore.d dVar, com.yandex.mob.cron.a aVar, jr20 jr20Var, com.yandex.mob.reporting.a aVar2, rot rotVar) {
        this.a = lVar;
        this.b = kVar;
        this.c = dVar;
        this.d = aVar;
        this.e = jr20Var;
        this.f = aVar2;
        this.g = rotVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0155, code lost:
    
        if (r17.c(r3, r1, r4) == r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0143, code lost:
    
        if (r2.t(r1, r4) != r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (r2 != r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        if (r6 == r5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117 A[LOOP:0: B:25:0x0111->B:27:0x0117, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        DetailReportUseCase$restartJob$1 detailReportUseCase$restartJob$1;
        int i;
        rot rotVar;
        Object i2;
        MobTrigger mobTrigger2;
        List list;
        Iterator it;
        List L0;
        MobTrigger mobTrigger3 = mobTrigger;
        l lVar = hVar.a;
        if (continuationImpl instanceof DetailReportUseCase$restartJob$1) {
            detailReportUseCase$restartJob$1 = (DetailReportUseCase$restartJob$1) continuationImpl;
            int i3 = detailReportUseCase$restartJob$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailReportUseCase$restartJob$1.label = i3 - Integer.MIN_VALUE;
                Object obj = detailReportUseCase$restartJob$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailReportUseCase$restartJob$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var = hVar.h;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    hVar.h = null;
                    rotVar = hVar.g;
                    com.yandex.mob.reporting.a aVar = hVar.f;
                    detailReportUseCase$restartJob$1.L$0 = mobTrigger3;
                    detailReportUseCase$restartJob$1.L$1 = rotVar;
                    detailReportUseCase$restartJob$1.label = 1;
                    i2 = aVar.i(mobTrigger3, detailReportUseCase$restartJob$1);
                } else if (i == 1) {
                    rot rotVar2 = (rot) detailReportUseCase$restartJob$1.L$1;
                    MobTrigger mobTrigger4 = (MobTrigger) detailReportUseCase$restartJob$1.L$0;
                    kotlin.b.b(obj);
                    rotVar = rotVar2;
                    mobTrigger3 = mobTrigger4;
                    i2 = obj;
                } else {
                    if (i == 2) {
                        mobTrigger3 = (MobTrigger) detailReportUseCase$restartJob$1.L$0;
                        kotlin.b.b(obj);
                        Iterable<lq20> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                        for (lq20 lq20Var : iterable) {
                            zm20 i4 = vng.i(lq20Var);
                            arrayList.add(new dq20(lq20Var.b, lq20Var.d, i4.b, i4.a));
                        }
                        detailReportUseCase$restartJob$1.L$0 = mobTrigger3;
                        detailReportUseCase$restartJob$1.L$1 = arrayList;
                        detailReportUseCase$restartJob$1.label = 3;
                        obj = lVar.a(detailReportUseCase$restartJob$1);
                        if (obj != obj2) {
                            mobTrigger2 = mobTrigger3;
                            list = arrayList;
                            Iterable iterable2 = (Iterable) obj;
                            ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
                            it = iterable2.iterator();
                            while (it.hasNext()) {
                            }
                            L0 = kotlin.collections.a.L0(kotlin.collections.a.m0(arrayList2, list));
                            Collections.shuffle(L0);
                            com.yandex.mob.datastore.d dVar = hVar.c;
                            detailReportUseCase$restartJob$1.L$0 = mobTrigger2;
                            detailReportUseCase$restartJob$1.L$1 = null;
                            detailReportUseCase$restartJob$1.L$2 = null;
                            detailReportUseCase$restartJob$1.L$3 = L0;
                            detailReportUseCase$restartJob$1.label = 4;
                        }
                        return obj2;
                    }
                    if (i == 3) {
                        list = (List) detailReportUseCase$restartJob$1.L$1;
                        mobTrigger2 = (MobTrigger) detailReportUseCase$restartJob$1.L$0;
                        kotlin.b.b(obj);
                        Iterable iterable22 = (Iterable) obj;
                        ArrayList arrayList22 = new ArrayList(tcc.n(iterable22, 10));
                        it = iterable22.iterator();
                        while (it.hasNext()) {
                            arrayList22.add(new dq20((String) it.next()));
                        }
                        L0 = kotlin.collections.a.L0(kotlin.collections.a.m0(arrayList22, list));
                        Collections.shuffle(L0);
                        com.yandex.mob.datastore.d dVar2 = hVar.c;
                        detailReportUseCase$restartJob$1.L$0 = mobTrigger2;
                        detailReportUseCase$restartJob$1.L$1 = null;
                        detailReportUseCase$restartJob$1.L$2 = null;
                        detailReportUseCase$restartJob$1.L$3 = L0;
                        detailReportUseCase$restartJob$1.label = 4;
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        L0 = (List) detailReportUseCase$restartJob$1.L$3;
                        mobTrigger2 = (MobTrigger) detailReportUseCase$restartJob$1.L$0;
                        kotlin.b.b(obj);
                        detailReportUseCase$restartJob$1.L$0 = null;
                        detailReportUseCase$restartJob$1.L$1 = null;
                        detailReportUseCase$restartJob$1.L$2 = null;
                        detailReportUseCase$restartJob$1.L$3 = null;
                        detailReportUseCase$restartJob$1.label = 5;
                    }
                }
                rotVar.b((Pair) i2);
                detailReportUseCase$restartJob$1.L$0 = mobTrigger3;
                detailReportUseCase$restartJob$1.L$1 = null;
                detailReportUseCase$restartJob$1.label = 2;
                obj = lVar.m(detailReportUseCase$restartJob$1);
            }
        }
        detailReportUseCase$restartJob$1 = new DetailReportUseCase$restartJob$1(hVar, continuationImpl);
        Object obj3 = detailReportUseCase$restartJob$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailReportUseCase$restartJob$1.label;
        if (i != 0) {
        }
        rotVar.b((Pair) i2);
        detailReportUseCase$restartJob$1.L$0 = mobTrigger3;
        detailReportUseCase$restartJob$1.L$1 = null;
        detailReportUseCase$restartJob$1.label = 2;
        obj3 = lVar.m(detailReportUseCase$restartJob$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DetailReportUseCase$init$1 detailReportUseCase$init$1;
        int i;
        if (continuationImpl instanceof DetailReportUseCase$init$1) {
            detailReportUseCase$init$1 = (DetailReportUseCase$init$1) continuationImpl;
            int i2 = detailReportUseCase$init$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailReportUseCase$init$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailReportUseCase$init$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailReportUseCase$init$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailReportUseCase$init$1.label = 1;
                    if (d(detailReportUseCase$init$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.d.e(new DetailReportUseCase$init$2(this, null));
                return zy11.a;
            }
        }
        detailReportUseCase$init$1 = new DetailReportUseCase$init$1(this, continuationImpl);
        Object obj3 = detailReportUseCase$init$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailReportUseCase$init$1.label;
        if (i != 0) {
        }
        this.d.e(new DetailReportUseCase$init$2(this, null));
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009a -> B:10:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MobTrigger mobTrigger, List list, ContinuationImpl continuationImpl) {
        DetailReportUseCase$startReporting$1 detailReportUseCase$startReporting$1;
        int i;
        Iterator it;
        MobTrigger mobTrigger2;
        ArrayList arrayList;
        int i2;
        if (continuationImpl instanceof DetailReportUseCase$startReporting$1) {
            detailReportUseCase$startReporting$1 = (DetailReportUseCase$startReporting$1) continuationImpl;
            int i3 = detailReportUseCase$startReporting$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailReportUseCase$startReporting$1.label = i3 - Integer.MIN_VALUE;
                Object obj = detailReportUseCase$startReporting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailReportUseCase$startReporting$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList(list);
                    it = list.iterator();
                    mobTrigger2 = mobTrigger;
                    arrayList = arrayList2;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = detailReportUseCase$startReporting$1.I$0;
                    it = (Iterator) detailReportUseCase$startReporting$1.L$4;
                    ?? r2 = (List) detailReportUseCase$startReporting$1.L$2;
                    MobTrigger mobTrigger3 = (MobTrigger) detailReportUseCase$startReporting$1.L$0;
                    kotlin.b.b(obj);
                    h hVar = this;
                    arrayList = r2;
                    mobTrigger2 = mobTrigger3;
                    this = hVar;
                    if (it.hasNext()) {
                        dq20 dq20Var = (dq20) it.next();
                        kotlinx.coroutines.a.k(detailReportUseCase$startReporting$1.get_context());
                        hVar = this;
                        pzt0 b = jr20.b(hVar.e, null, new DetailReportUseCase$startReporting$2$1(hVar, dq20Var, mobTrigger2, arrayList, null), 3);
                        detailReportUseCase$startReporting$1.L$0 = mobTrigger2;
                        detailReportUseCase$startReporting$1.L$1 = null;
                        detailReportUseCase$startReporting$1.L$2 = arrayList;
                        detailReportUseCase$startReporting$1.L$3 = null;
                        detailReportUseCase$startReporting$1.L$4 = it;
                        detailReportUseCase$startReporting$1.L$5 = null;
                        detailReportUseCase$startReporting$1.L$6 = null;
                        detailReportUseCase$startReporting$1.I$0 = i2;
                        detailReportUseCase$startReporting$1.I$1 = 0;
                        detailReportUseCase$startReporting$1.label = 1;
                        if (b.u0(detailReportUseCase$startReporting$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this = hVar;
                        if (it.hasNext()) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        detailReportUseCase$startReporting$1 = new DetailReportUseCase$startReporting$1(this, continuationImpl);
        Object obj2 = detailReportUseCase$startReporting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailReportUseCase$startReporting$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        DetailReportUseCase$tryToRestoreReporting$1 detailReportUseCase$tryToRestoreReporting$1;
        int i;
        List list;
        List list2;
        if (continuationImpl instanceof DetailReportUseCase$tryToRestoreReporting$1) {
            detailReportUseCase$tryToRestoreReporting$1 = (DetailReportUseCase$tryToRestoreReporting$1) continuationImpl;
            int i2 = detailReportUseCase$tryToRestoreReporting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailReportUseCase$tryToRestoreReporting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailReportUseCase$tryToRestoreReporting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailReportUseCase$tryToRestoreReporting$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailReportUseCase$tryToRestoreReporting$1.label = 1;
                    obj = this.c.g(detailReportUseCase$tryToRestoreReporting$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                list2 = list;
                zy11 zy11Var = zy11.a;
                if (list2 != null && !list2.isEmpty()) {
                    this.h = jr20.b(this.e, null, new DetailReportUseCase$tryToRestoreReporting$2(this, list, null), 3);
                }
                return zy11Var;
            }
        }
        detailReportUseCase$tryToRestoreReporting$1 = new DetailReportUseCase$tryToRestoreReporting$1(this, continuationImpl);
        Object obj2 = detailReportUseCase$tryToRestoreReporting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailReportUseCase$tryToRestoreReporting$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        list2 = list;
        zy11 zy11Var2 = zy11.a;
        if (list2 != null) {
            this.h = jr20.b(this.e, null, new DetailReportUseCase$tryToRestoreReporting$2(this, list, null), 3);
        }
        return zy11Var2;
    }
}
