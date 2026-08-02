package com.yandex.mob.domain;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.bvf0;
import defpackage.co2;
import defpackage.em20;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.ha4;
import defpackage.j10;
import defpackage.lq20;
import defpackage.mq20;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pl20;
import defpackage.pr20;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.rot;
import defpackage.tcc;
import defpackage.wwg;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final t a;
    public final com.yandex.mob.datastore.f b;
    public final com.yandex.mob.data.c c;
    public final com.yandex.mob.datastore.d d;
    public final com.yandex.mob.reporting.a e;
    public final rot f;
    public final l g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();
    public final kotlinx.coroutines.sync.a i = gtq0.a();
    public final kotlinx.coroutines.sync.a j = gtq0.a();

    public c(t tVar, com.yandex.mob.datastore.f fVar, com.yandex.mob.data.c cVar, com.yandex.mob.datastore.d dVar, com.yandex.mob.reporting.a aVar, rot rotVar, l lVar) {
        this.a = tVar;
        this.b = fVar;
        this.c = cVar;
        this.d = dVar;
        this.e = aVar;
        this.f = rotVar;
        this.g = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ha4 ha4Var, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$notifyCheckStarted$1 availabilityCheckProcessor$notifyCheckStarted$1;
        int i;
        rot rotVar;
        cVar.getClass();
        if (continuationImpl instanceof AvailabilityCheckProcessor$notifyCheckStarted$1) {
            availabilityCheckProcessor$notifyCheckStarted$1 = (AvailabilityCheckProcessor$notifyCheckStarted$1) continuationImpl;
            int i2 = availabilityCheckProcessor$notifyCheckStarted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availabilityCheckProcessor$notifyCheckStarted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = availabilityCheckProcessor$notifyCheckStarted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckProcessor$notifyCheckStarted$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rot rotVar2 = cVar.f;
                    com.yandex.mob.reporting.a aVar = cVar.e;
                    MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = ha4Var.a;
                    MobTrigger mobTrigger = ha4Var.b;
                    availabilityCheckProcessor$notifyCheckStarted$1.L$0 = null;
                    availabilityCheckProcessor$notifyCheckStarted$1.L$1 = rotVar2;
                    availabilityCheckProcessor$notifyCheckStarted$1.label = 1;
                    Serializable a = aVar.a(mobAvailabilityCheckStrategyName, mobTrigger, availabilityCheckProcessor$notifyCheckStarted$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    rotVar = rotVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rotVar = (rot) availabilityCheckProcessor$notifyCheckStarted$1.L$1;
                    kotlin.b.b(obj);
                }
                rotVar.b((Pair) obj);
                return zy11.a;
            }
        }
        availabilityCheckProcessor$notifyCheckStarted$1 = new AvailabilityCheckProcessor$notifyCheckStarted$1(cVar, continuationImpl);
        Object obj2 = availabilityCheckProcessor$notifyCheckStarted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$notifyCheckStarted$1.label;
        if (i != 0) {
        }
        rotVar.b((Pair) obj2);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$notifySelectionCompleted$1 availabilityCheckProcessor$notifySelectionCompleted$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        com.yandex.mob.reporting.a aVar;
        MobTrigger mobTrigger2;
        rot rotVar;
        rot rotVar2;
        cVar.getClass();
        if (continuationImpl instanceof AvailabilityCheckProcessor$notifySelectionCompleted$1) {
            availabilityCheckProcessor$notifySelectionCompleted$1 = (AvailabilityCheckProcessor$notifySelectionCompleted$1) continuationImpl;
            int i2 = availabilityCheckProcessor$notifySelectionCompleted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availabilityCheckProcessor$notifySelectionCompleted$1.label = i2 - Integer.MIN_VALUE;
                obj = availabilityCheckProcessor$notifySelectionCompleted$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckProcessor$notifySelectionCompleted$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rot rotVar3 = cVar.f;
                    com.yandex.mob.reporting.a aVar2 = cVar.e;
                    com.yandex.mob.datastore.f fVar = cVar.b;
                    availabilityCheckProcessor$notifySelectionCompleted$1.L$0 = mobTrigger;
                    availabilityCheckProcessor$notifySelectionCompleted$1.L$1 = rotVar3;
                    availabilityCheckProcessor$notifySelectionCompleted$1.L$2 = aVar2;
                    availabilityCheckProcessor$notifySelectionCompleted$1.label = 1;
                    Object b = fVar.b(availabilityCheckProcessor$notifySelectionCompleted$1);
                    if (b != coroutineSingletons) {
                        obj = b;
                        aVar = aVar2;
                        mobTrigger2 = mobTrigger;
                        rotVar = rotVar3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rotVar2 = (rot) availabilityCheckProcessor$notifySelectionCompleted$1.L$1;
                    kotlin.b.b(obj);
                    rotVar2.b((Pair) obj);
                    return zy11.a;
                }
                aVar = (com.yandex.mob.reporting.a) availabilityCheckProcessor$notifySelectionCompleted$1.L$2;
                rotVar = (rot) availabilityCheckProcessor$notifySelectionCompleted$1.L$1;
                mobTrigger2 = (MobTrigger) availabilityCheckProcessor$notifySelectionCompleted$1.L$0;
                kotlin.b.b(obj);
                availabilityCheckProcessor$notifySelectionCompleted$1.L$0 = null;
                availabilityCheckProcessor$notifySelectionCompleted$1.L$1 = rotVar;
                availabilityCheckProcessor$notifySelectionCompleted$1.L$2 = null;
                availabilityCheckProcessor$notifySelectionCompleted$1.label = 2;
                obj = aVar.r(mobTrigger2, (List) obj, availabilityCheckProcessor$notifySelectionCompleted$1);
                if (obj != coroutineSingletons) {
                    rotVar2 = rotVar;
                    rotVar2.b((Pair) obj);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        availabilityCheckProcessor$notifySelectionCompleted$1 = new AvailabilityCheckProcessor$notifySelectionCompleted$1(cVar, continuationImpl);
        obj = availabilityCheckProcessor$notifySelectionCompleted$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$notifySelectionCompleted$1.label;
        if (i != 0) {
        }
        availabilityCheckProcessor$notifySelectionCompleted$1.L$0 = null;
        availabilityCheckProcessor$notifySelectionCompleted$1.L$1 = rotVar;
        availabilityCheckProcessor$notifySelectionCompleted$1.L$2 = null;
        availabilityCheckProcessor$notifySelectionCompleted$1.label = 2;
        obj = aVar.r(mobTrigger2, (List) obj, availabilityCheckProcessor$notifySelectionCompleted$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r7v2, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$persistCheckCompleted$1 availabilityCheckProcessor$persistCheckCompleted$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        Throwable th;
        g050 g050Var;
        com.yandex.mob.datastore.d dVar;
        em20 em20Var;
        cVar.getClass();
        try {
            if (continuationImpl instanceof AvailabilityCheckProcessor$persistCheckCompleted$1) {
                availabilityCheckProcessor$persistCheckCompleted$1 = (AvailabilityCheckProcessor$persistCheckCompleted$1) continuationImpl;
                int i3 = availabilityCheckProcessor$persistCheckCompleted$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    availabilityCheckProcessor$persistCheckCompleted$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = availabilityCheckProcessor$persistCheckCompleted$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = availabilityCheckProcessor$persistCheckCompleted$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.j;
                        availabilityCheckProcessor$persistCheckCompleted$1.L$0 = aVar;
                        availabilityCheckProcessor$persistCheckCompleted$1.I$0 = 0;
                        availabilityCheckProcessor$persistCheckCompleted$1.label = 1;
                        if (aVar.a(availabilityCheckProcessor$persistCheckCompleted$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) availabilityCheckProcessor$persistCheckCompleted$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    i2 = availabilityCheckProcessor$persistCheckCompleted$1.I$0;
                    ?? r7 = (g050) availabilityCheckProcessor$persistCheckCompleted$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r7;
                    dVar = cVar.d;
                    em20Var = new em20(true, EmptySet.a, false, false);
                    availabilityCheckProcessor$persistCheckCompleted$1.L$0 = aVar;
                    availabilityCheckProcessor$persistCheckCompleted$1.I$0 = i2;
                    availabilityCheckProcessor$persistCheckCompleted$1.I$1 = 0;
                    availabilityCheckProcessor$persistCheckCompleted$1.label = 2;
                    if (dVar.o(em20Var, availabilityCheckProcessor$persistCheckCompleted$1) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            dVar = cVar.d;
            em20Var = new em20(true, EmptySet.a, false, false);
            availabilityCheckProcessor$persistCheckCompleted$1.L$0 = aVar;
            availabilityCheckProcessor$persistCheckCompleted$1.I$0 = i2;
            availabilityCheckProcessor$persistCheckCompleted$1.I$1 = 0;
            availabilityCheckProcessor$persistCheckCompleted$1.label = 2;
            if (dVar.o(em20Var, availabilityCheckProcessor$persistCheckCompleted$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        availabilityCheckProcessor$persistCheckCompleted$1 = new AvailabilityCheckProcessor$persistCheckCompleted$1(cVar, continuationImpl);
        Object obj2 = availabilityCheckProcessor$persistCheckCompleted$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$persistCheckCompleted$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0095, LOOP:0: B:27:0x0083->B:29:0x0089, LOOP_END, TryCatch #0 {all -> 0x0095, blocks: (B:26:0x0070, B:27:0x0083, B:29:0x0089, B:31:0x0098, B:33:0x009d, B:34:0x00a8), top: B:25:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:26:0x0070, B:27:0x0083, B:29:0x0089, B:31:0x0098, B:33:0x009d, B:34:0x00a8), top: B:25:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, ha4 ha4Var, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$persistCheckStarted$1 availabilityCheckProcessor$persistCheckStarted$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        Throwable th;
        g050 g050Var;
        boolean z;
        Iterator it;
        com.yandex.mob.datastore.d dVar;
        em20 em20Var;
        cVar.getClass();
        try {
            try {
                if (continuationImpl instanceof AvailabilityCheckProcessor$persistCheckStarted$1) {
                    availabilityCheckProcessor$persistCheckStarted$1 = (AvailabilityCheckProcessor$persistCheckStarted$1) continuationImpl;
                    int i3 = availabilityCheckProcessor$persistCheckStarted$1.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        availabilityCheckProcessor$persistCheckStarted$1.label = i3 - Integer.MIN_VALUE;
                        Object obj = availabilityCheckProcessor$persistCheckStarted$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = availabilityCheckProcessor$persistCheckStarted$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            aVar = cVar.j;
                            availabilityCheckProcessor$persistCheckStarted$1.L$0 = ha4Var;
                            availabilityCheckProcessor$persistCheckStarted$1.L$1 = aVar;
                            availabilityCheckProcessor$persistCheckStarted$1.I$0 = 0;
                            availabilityCheckProcessor$persistCheckStarted$1.label = 1;
                            if (aVar.a(availabilityCheckProcessor$persistCheckStarted$1) != coroutineSingletons) {
                                i2 = 0;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) availabilityCheckProcessor$persistCheckStarted$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                g050Var.d(null);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        int i4 = availabilityCheckProcessor$persistCheckStarted$1.I$0;
                        ?? r2 = (g050) availabilityCheckProcessor$persistCheckStarted$1.L$1;
                        ha4 ha4Var2 = (ha4) availabilityCheckProcessor$persistCheckStarted$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                        i2 = i4;
                        ha4Var = ha4Var2;
                        SetBuilder setBuilder = new SetBuilder();
                        ArrayList arrayList = ha4Var.g;
                        z = ha4Var.c;
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((co2) it.next()).a);
                        }
                        setBuilder.addAll(arrayList2);
                        if (z) {
                            setBuilder.addAll(ha4Var.f.keySet());
                        }
                        SetBuilder b = setBuilder.b();
                        dVar = cVar.d;
                        em20Var = new em20(false, b, z, ha4Var.d);
                        availabilityCheckProcessor$persistCheckStarted$1.L$0 = null;
                        availabilityCheckProcessor$persistCheckStarted$1.L$1 = aVar;
                        availabilityCheckProcessor$persistCheckStarted$1.L$2 = null;
                        availabilityCheckProcessor$persistCheckStarted$1.I$0 = i2;
                        availabilityCheckProcessor$persistCheckStarted$1.I$1 = 0;
                        availabilityCheckProcessor$persistCheckStarted$1.label = 2;
                        if (dVar.o(em20Var, availabilityCheckProcessor$persistCheckStarted$1) != coroutineSingletons) {
                            g050Var = aVar;
                            g050Var.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                }
                ArrayList arrayList3 = ha4Var.g;
                z = ha4Var.c;
                ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                setBuilder.addAll(arrayList22);
                if (z) {
                }
                SetBuilder b2 = setBuilder.b();
                dVar = cVar.d;
                em20Var = new em20(false, b2, z, ha4Var.d);
                availabilityCheckProcessor$persistCheckStarted$1.L$0 = null;
                availabilityCheckProcessor$persistCheckStarted$1.L$1 = aVar;
                availabilityCheckProcessor$persistCheckStarted$1.L$2 = null;
                availabilityCheckProcessor$persistCheckStarted$1.I$0 = i2;
                availabilityCheckProcessor$persistCheckStarted$1.I$1 = 0;
                availabilityCheckProcessor$persistCheckStarted$1.label = 2;
                if (dVar.o(em20Var, availabilityCheckProcessor$persistCheckStarted$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                g050Var = aVar;
                g050Var.d(null);
                throw th;
            }
            SetBuilder setBuilder2 = new SetBuilder();
        } catch (Throwable th4) {
            th = th4;
        }
        availabilityCheckProcessor$persistCheckStarted$1 = new AvailabilityCheckProcessor$persistCheckStarted$1(cVar, continuationImpl);
        Object obj2 = availabilityCheckProcessor$persistCheckStarted$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$persistCheckStarted$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00bf -> B:11:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, pl20 pl20Var, ha4 ha4Var, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$processCheckReport$1 availabilityCheckProcessor$processCheckReport$1;
        int i;
        pr20 pr20Var;
        pr20 pr20Var2;
        Iterator it;
        ha4 ha4Var2;
        pr20 pr20Var3;
        int i2;
        cVar.getClass();
        if (continuationImpl instanceof AvailabilityCheckProcessor$processCheckReport$1) {
            availabilityCheckProcessor$processCheckReport$1 = (AvailabilityCheckProcessor$processCheckReport$1) continuationImpl;
            int i3 = availabilityCheckProcessor$processCheckReport$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                availabilityCheckProcessor$processCheckReport$1.label = i3 - Integer.MIN_VALUE;
                Object obj = availabilityCheckProcessor$processCheckReport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckProcessor$processCheckReport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!ha4Var.c || (pr20Var2 = pl20Var.c) == null) {
                        pr20Var = null;
                        it = pl20Var.b.iterator();
                        ha4Var2 = ha4Var;
                        pr20Var3 = pr20Var;
                        i2 = 0;
                        if (it.hasNext()) {
                        }
                    } else {
                        availabilityCheckProcessor$processCheckReport$1.L$0 = pl20Var;
                        availabilityCheckProcessor$processCheckReport$1.L$1 = ha4Var;
                        availabilityCheckProcessor$processCheckReport$1.label = 1;
                        Object p = cVar.c.p(pr20Var2, availabilityCheckProcessor$processCheckReport$1);
                        if (p != coroutineSingletons) {
                            p = zy11.a;
                        }
                    }
                } else if (i == 1) {
                    ha4Var = (ha4) availabilityCheckProcessor$processCheckReport$1.L$1;
                    pl20Var = (pl20) availabilityCheckProcessor$processCheckReport$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = availabilityCheckProcessor$processCheckReport$1.I$0;
                    rot rotVar = (rot) availabilityCheckProcessor$processCheckReport$1.L$7;
                    it = (Iterator) availabilityCheckProcessor$processCheckReport$1.L$4;
                    pr20Var3 = (pr20) availabilityCheckProcessor$processCheckReport$1.L$2;
                    ha4Var2 = (ha4) availabilityCheckProcessor$processCheckReport$1.L$1;
                    kotlin.b.b(obj);
                    rotVar.b((Pair) obj);
                    if (it.hasNext()) {
                        mq20 mq20Var = (mq20) it.next();
                        rot rotVar2 = cVar.f;
                        com.yandex.mob.reporting.a aVar = cVar.e;
                        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = ha4Var2.a;
                        availabilityCheckProcessor$processCheckReport$1.L$0 = null;
                        availabilityCheckProcessor$processCheckReport$1.L$1 = ha4Var2;
                        availabilityCheckProcessor$processCheckReport$1.L$2 = pr20Var3;
                        availabilityCheckProcessor$processCheckReport$1.L$3 = null;
                        availabilityCheckProcessor$processCheckReport$1.L$4 = it;
                        availabilityCheckProcessor$processCheckReport$1.L$5 = null;
                        availabilityCheckProcessor$processCheckReport$1.L$6 = null;
                        availabilityCheckProcessor$processCheckReport$1.L$7 = rotVar2;
                        availabilityCheckProcessor$processCheckReport$1.I$0 = i2;
                        availabilityCheckProcessor$processCheckReport$1.I$1 = 0;
                        availabilityCheckProcessor$processCheckReport$1.label = 2;
                        Serializable b = aVar.b(mq20Var, mobAvailabilityCheckStrategyName, availabilityCheckProcessor$processCheckReport$1);
                        if (b != coroutineSingletons) {
                            obj = b;
                            rotVar = rotVar2;
                            rotVar.b((Pair) obj);
                            if (it.hasNext()) {
                                return pr20Var3;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                pr20Var = pl20Var.c;
                it = pl20Var.b.iterator();
                ha4Var2 = ha4Var;
                pr20Var3 = pr20Var;
                i2 = 0;
                if (it.hasNext()) {
                }
            }
        }
        availabilityCheckProcessor$processCheckReport$1 = new AvailabilityCheckProcessor$processCheckReport$1(cVar, continuationImpl);
        Object obj2 = availabilityCheckProcessor$processCheckReport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$processCheckReport$1.label;
        if (i != 0) {
        }
        pr20Var = pl20Var.c;
        it = pl20Var.b.iterator();
        ha4Var2 = ha4Var;
        pr20Var3 = pr20Var;
        i2 = 0;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(c cVar, ha4 ha4Var, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$processChecks$1 availabilityCheckProcessor$processChecks$1;
        int i;
        ha4 ha4Var2;
        String str;
        cVar.getClass();
        if (continuationImpl instanceof AvailabilityCheckProcessor$processChecks$1) {
            availabilityCheckProcessor$processChecks$1 = (AvailabilityCheckProcessor$processChecks$1) continuationImpl;
            int i2 = availabilityCheckProcessor$processChecks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availabilityCheckProcessor$processChecks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = availabilityCheckProcessor$processChecks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckProcessor$processChecks$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = cVar.g;
                    availabilityCheckProcessor$processChecks$1.L$0 = ha4Var;
                    availabilityCheckProcessor$processChecks$1.L$1 = "mobcf";
                    availabilityCheckProcessor$processChecks$1.label = 1;
                    obj = lVar.e(availabilityCheckProcessor$processChecks$1);
                    if (obj != coroutineSingletons) {
                        ha4Var2 = ha4Var;
                        str = "mobcf";
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                str = (String) availabilityCheckProcessor$processChecks$1.L$1;
                ha4Var2 = (ha4) availabilityCheckProcessor$processChecks$1.L$0;
                kotlin.b.b(obj);
                oq20 oq20Var = new oq20(Collections.singletonList(new Pair(str, obj)));
                t tVar = cVar.a;
                ArrayList arrayList = ha4Var2.g;
                List list = ha4Var2.e;
                tVar.getClass();
                j10 j10Var = new j10(new kotlinx.coroutines.flow.o(!arrayList.isEmpty() ? pvn.a : new rol0(new SharedParallelApiNameAvailabilityReportProcessor$process$1(arrayList, tVar, oq20Var, list, null)), new AvailabilityCheckProcessor$processChecks$2(cVar, null)), cVar, ha4Var2, i3);
                availabilityCheckProcessor$processChecks$1.L$0 = null;
                availabilityCheckProcessor$processChecks$1.L$1 = null;
                availabilityCheckProcessor$processChecks$1.label = 2;
                Object W = kotlinx.coroutines.flow.e.W(j10Var, availabilityCheckProcessor$processChecks$1);
                return W != coroutineSingletons ? coroutineSingletons : W;
            }
        }
        availabilityCheckProcessor$processChecks$1 = new AvailabilityCheckProcessor$processChecks$1(cVar, continuationImpl);
        Object obj2 = availabilityCheckProcessor$processChecks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$processChecks$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        oq20 oq20Var2 = new oq20(Collections.singletonList(new Pair(str, obj2)));
        t tVar2 = cVar.a;
        ArrayList arrayList2 = ha4Var2.g;
        List list2 = ha4Var2.e;
        tVar2.getClass();
        j10 j10Var2 = new j10(new kotlinx.coroutines.flow.o(!arrayList2.isEmpty() ? pvn.a : new rol0(new SharedParallelApiNameAvailabilityReportProcessor$process$1(arrayList2, tVar2, oq20Var2, list2, null)), new AvailabilityCheckProcessor$processChecks$2(cVar, null)), cVar, ha4Var2, i32);
        availabilityCheckProcessor$processChecks$1.L$0 = null;
        availabilityCheckProcessor$processChecks$1.L$1 = null;
        availabilityCheckProcessor$processChecks$1.label = 2;
        Object W2 = kotlinx.coroutines.flow.e.W(j10Var2, availabilityCheckProcessor$processChecks$1);
        if (W2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b3 -> B:10:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(c cVar, Map map, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$processForcedSelections$1 availabilityCheckProcessor$processForcedSelections$1;
        int i;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        cVar.getClass();
        if (continuationImpl instanceof AvailabilityCheckProcessor$processForcedSelections$1) {
            availabilityCheckProcessor$processForcedSelections$1 = (AvailabilityCheckProcessor$processForcedSelections$1) continuationImpl;
            int i4 = availabilityCheckProcessor$processForcedSelections$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                availabilityCheckProcessor$processForcedSelections$1.label = i4 - Integer.MIN_VALUE;
                Object obj = availabilityCheckProcessor$processForcedSelections$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckProcessor$processForcedSelections$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList(map.size());
                    it = map.entrySet().iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = availabilityCheckProcessor$processForcedSelections$1.I$1;
                    i3 = availabilityCheckProcessor$processForcedSelections$1.I$0;
                    collection = (Collection) availabilityCheckProcessor$processForcedSelections$1.L$8;
                    pr20 pr20Var = (pr20) availabilityCheckProcessor$processForcedSelections$1.L$7;
                    it = (Iterator) availabilityCheckProcessor$processForcedSelections$1.L$4;
                    Collection collection2 = (Collection) availabilityCheckProcessor$processForcedSelections$1.L$3;
                    kotlin.b.b(obj);
                    collection.add(pr20Var);
                    collection = collection2;
                    if (it.hasNext()) {
                        pr20Var = new pr20((lq20) ((Map.Entry) it.next()).getValue(), false);
                        availabilityCheckProcessor$processForcedSelections$1.L$0 = null;
                        availabilityCheckProcessor$processForcedSelections$1.L$1 = null;
                        availabilityCheckProcessor$processForcedSelections$1.L$2 = null;
                        availabilityCheckProcessor$processForcedSelections$1.L$3 = collection;
                        availabilityCheckProcessor$processForcedSelections$1.L$4 = it;
                        availabilityCheckProcessor$processForcedSelections$1.L$5 = null;
                        availabilityCheckProcessor$processForcedSelections$1.L$6 = null;
                        availabilityCheckProcessor$processForcedSelections$1.L$7 = pr20Var;
                        availabilityCheckProcessor$processForcedSelections$1.L$8 = collection;
                        availabilityCheckProcessor$processForcedSelections$1.I$0 = i3;
                        availabilityCheckProcessor$processForcedSelections$1.I$1 = i2;
                        availabilityCheckProcessor$processForcedSelections$1.I$2 = 0;
                        availabilityCheckProcessor$processForcedSelections$1.label = 1;
                        Object p = cVar.c.p(pr20Var, availabilityCheckProcessor$processForcedSelections$1);
                        if (p != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            p = zy11.a;
                        }
                        if (p == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add(pr20Var);
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        availabilityCheckProcessor$processForcedSelections$1 = new AvailabilityCheckProcessor$processForcedSelections$1(cVar, continuationImpl);
        Object obj2 = availabilityCheckProcessor$processForcedSelections$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$processForcedSelections$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        if (r0.a(r15, r1) == r2) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x004a, LOOP:0: B:27:0x00c2->B:29:0x00c8, LOOP_END, TryCatch #1 {all -> 0x004a, blocks: (B:13:0x0045, B:23:0x00a6, B:26:0x00b9, B:27:0x00c2, B:29:0x00c8, B:31:0x00d9, B:34:0x00e7, B:35:0x00f0, B:37:0x00f6, B:39:0x0107, B:49:0x0094), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6 A[Catch: all -> 0x004a, LOOP:1: B:35:0x00f0->B:37:0x00f6, LOOP_END, TryCatch #1 {all -> 0x004a, blocks: (B:13:0x0045, B:23:0x00a6, B:26:0x00b9, B:27:0x00c2, B:29:0x00c8, B:31:0x00d9, B:34:0x00e7, B:35:0x00f0, B:37:0x00f6, B:39:0x0107, B:49:0x0094), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.yandex.mob.domain.c] */
    /* JADX WARN: Type inference failed for: r13v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(c cVar, List list, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$saveAllSelectedProxies$1 availabilityCheckProcessor$saveAllSelectedProxies$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g050 g050Var;
        List list2;
        int i2;
        int d;
        int d2;
        com.yandex.mob.datastore.f fVar = cVar.b;
        try {
            if (continuationImpl instanceof AvailabilityCheckProcessor$saveAllSelectedProxies$1) {
                availabilityCheckProcessor$saveAllSelectedProxies$1 = (AvailabilityCheckProcessor$saveAllSelectedProxies$1) continuationImpl;
                int i3 = availabilityCheckProcessor$saveAllSelectedProxies$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    availabilityCheckProcessor$saveAllSelectedProxies$1.label = i3 - Integer.MIN_VALUE;
                    obj = availabilityCheckProcessor$saveAllSelectedProxies$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = availabilityCheckProcessor$saveAllSelectedProxies$1.label;
                    int i4 = 0;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = cVar.i;
                        availabilityCheckProcessor$saveAllSelectedProxies$1.L$0 = list;
                        availabilityCheckProcessor$saveAllSelectedProxies$1.L$1 = g050Var;
                        availabilityCheckProcessor$saveAllSelectedProxies$1.I$0 = 0;
                        availabilityCheckProcessor$saveAllSelectedProxies$1.label = 1;
                        if (g050Var.a(availabilityCheckProcessor$saveAllSelectedProxies$1) != coroutineSingletons) {
                            list2 = list;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        int i5 = availabilityCheckProcessor$saveAllSelectedProxies$1.I$0;
                        g050 g050Var2 = (g050) availabilityCheckProcessor$saveAllSelectedProxies$1.L$1;
                        list2 = (List) availabilityCheckProcessor$saveAllSelectedProxies$1.L$0;
                        kotlin.b.b(obj);
                        i2 = i5;
                        g050Var = g050Var2;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) availabilityCheckProcessor$saveAllSelectedProxies$1.L$1;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        }
                        i4 = availabilityCheckProcessor$saveAllSelectedProxies$1.I$1;
                        int i6 = availabilityCheckProcessor$saveAllSelectedProxies$1.I$0;
                        g050 g050Var3 = (g050) availabilityCheckProcessor$saveAllSelectedProxies$1.L$1;
                        list2 = (List) availabilityCheckProcessor$saveAllSelectedProxies$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            i2 = i6;
                            g050Var = g050Var3;
                            List list3 = (List) obj;
                            d = gw00.d(tcc.n(list3, 10));
                            int i7 = 16;
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                            for (Object obj2 : list3) {
                                linkedHashMap.put(wwg.j(((pr20) obj2).a), obj2);
                            }
                            List list4 = list2;
                            d2 = gw00.d(tcc.n(list4, 10));
                            if (d2 >= 16) {
                                i7 = d2;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i7);
                            for (Object obj3 : list4) {
                                linkedHashMap2.put(wwg.j(((pr20) obj3).a), obj3);
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
                            linkedHashMap3.putAll(linkedHashMap2);
                            List J0 = kotlin.collections.a.J0(linkedHashMap3.values());
                            availabilityCheckProcessor$saveAllSelectedProxies$1.L$0 = null;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.L$1 = g050Var;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.L$2 = null;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.L$3 = null;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.L$4 = null;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.L$5 = null;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.I$0 = i2;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.I$1 = i4;
                            availabilityCheckProcessor$saveAllSelectedProxies$1.label = 3;
                        } catch (Throwable th) {
                            th = th;
                            cVar = g050Var3;
                            cVar.d(null);
                            throw th;
                        }
                    }
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$0 = list2;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$1 = g050Var;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.I$0 = i2;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.I$1 = 0;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.label = 2;
                    obj = fVar.b(availabilityCheckProcessor$saveAllSelectedProxies$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list32 = (List) obj;
                    d = gw00.d(tcc.n(list32, 10));
                    int i72 = 16;
                    if (d < 16) {
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(d);
                    while (r15.hasNext()) {
                    }
                    List list42 = list2;
                    d2 = gw00.d(tcc.n(list42, 10));
                    if (d2 >= 16) {
                    }
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap(i72);
                    while (r3.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap(linkedHashMap4);
                    linkedHashMap32.putAll(linkedHashMap22);
                    List J02 = kotlin.collections.a.J0(linkedHashMap32.values());
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$0 = null;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$1 = g050Var;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$2 = null;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$3 = null;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$4 = null;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.L$5 = null;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.I$0 = i2;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.I$1 = i4;
                    availabilityCheckProcessor$saveAllSelectedProxies$1.label = 3;
                }
            }
            if (i != 0) {
            }
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$0 = list2;
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$1 = g050Var;
            availabilityCheckProcessor$saveAllSelectedProxies$1.I$0 = i2;
            availabilityCheckProcessor$saveAllSelectedProxies$1.I$1 = 0;
            availabilityCheckProcessor$saveAllSelectedProxies$1.label = 2;
            obj = fVar.b(availabilityCheckProcessor$saveAllSelectedProxies$1);
            if (obj == coroutineSingletons) {
            }
            List list322 = (List) obj;
            d = gw00.d(tcc.n(list322, 10));
            int i722 = 16;
            if (d < 16) {
            }
            LinkedHashMap linkedHashMap42 = new LinkedHashMap(d);
            while (r15.hasNext()) {
            }
            List list422 = list2;
            d2 = gw00.d(tcc.n(list422, 10));
            if (d2 >= 16) {
            }
            LinkedHashMap linkedHashMap222 = new LinkedHashMap(i722);
            while (r3.hasNext()) {
            }
            LinkedHashMap linkedHashMap322 = new LinkedHashMap(linkedHashMap42);
            linkedHashMap322.putAll(linkedHashMap222);
            List J022 = kotlin.collections.a.J0(linkedHashMap322.values());
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$0 = null;
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$1 = g050Var;
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$2 = null;
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$3 = null;
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$4 = null;
            availabilityCheckProcessor$saveAllSelectedProxies$1.L$5 = null;
            availabilityCheckProcessor$saveAllSelectedProxies$1.I$0 = i2;
            availabilityCheckProcessor$saveAllSelectedProxies$1.I$1 = i4;
            availabilityCheckProcessor$saveAllSelectedProxies$1.label = 3;
        } catch (Throwable th2) {
            th = th2;
        }
        availabilityCheckProcessor$saveAllSelectedProxies$1 = new AvailabilityCheckProcessor$saveAllSelectedProxies$1(cVar, continuationImpl);
        obj = availabilityCheckProcessor$saveAllSelectedProxies$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$saveAllSelectedProxies$1.label;
        int i42 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ha4 ha4Var, ContinuationImpl continuationImpl) {
        AvailabilityCheckProcessor$processPlan$1 availabilityCheckProcessor$processPlan$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        g050 g050Var;
        AvailabilityCheckProcessor$processPlan$2$1 availabilityCheckProcessor$processPlan$2$1;
        try {
            if (continuationImpl instanceof AvailabilityCheckProcessor$processPlan$1) {
                availabilityCheckProcessor$processPlan$1 = (AvailabilityCheckProcessor$processPlan$1) continuationImpl;
                int i3 = availabilityCheckProcessor$processPlan$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    availabilityCheckProcessor$processPlan$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = availabilityCheckProcessor$processPlan$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = availabilityCheckProcessor$processPlan$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        availabilityCheckProcessor$processPlan$1.L$0 = ha4Var;
                        aVar = this.h;
                        availabilityCheckProcessor$processPlan$1.L$1 = aVar;
                        availabilityCheckProcessor$processPlan$1.I$0 = 0;
                        availabilityCheckProcessor$processPlan$1.label = 1;
                        if (aVar.a(availabilityCheckProcessor$processPlan$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) availabilityCheckProcessor$processPlan$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    int i4 = availabilityCheckProcessor$processPlan$1.I$0;
                    ?? r2 = (g050) availabilityCheckProcessor$processPlan$1.L$1;
                    ha4 ha4Var2 = (ha4) availabilityCheckProcessor$processPlan$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r2;
                    i2 = i4;
                    ha4Var = ha4Var2;
                    availabilityCheckProcessor$processPlan$2$1 = new AvailabilityCheckProcessor$processPlan$2$1(ha4Var, this, null);
                    availabilityCheckProcessor$processPlan$1.L$0 = null;
                    availabilityCheckProcessor$processPlan$1.L$1 = aVar;
                    availabilityCheckProcessor$processPlan$1.I$0 = i2;
                    availabilityCheckProcessor$processPlan$1.I$1 = 0;
                    availabilityCheckProcessor$processPlan$1.label = 2;
                    if (bvf0.n(availabilityCheckProcessor$processPlan$2$1, availabilityCheckProcessor$processPlan$1) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            availabilityCheckProcessor$processPlan$2$1 = new AvailabilityCheckProcessor$processPlan$2$1(ha4Var, this, null);
            availabilityCheckProcessor$processPlan$1.L$0 = null;
            availabilityCheckProcessor$processPlan$1.L$1 = aVar;
            availabilityCheckProcessor$processPlan$1.I$0 = i2;
            availabilityCheckProcessor$processPlan$1.I$1 = 0;
            availabilityCheckProcessor$processPlan$1.label = 2;
            if (bvf0.n(availabilityCheckProcessor$processPlan$2$1, availabilityCheckProcessor$processPlan$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        availabilityCheckProcessor$processPlan$1 = new AvailabilityCheckProcessor$processPlan$1(this, continuationImpl);
        Object obj2 = availabilityCheckProcessor$processPlan$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$processPlan$1.label;
        if (i != 0) {
        }
    }
}
