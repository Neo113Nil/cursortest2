package com.yandex.go.due_timetable.domain.interactor;

import com.yandex.go.due_timetable.domain.model.CalculationsStatus;
import defpackage.b580;
import defpackage.b8z0;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.e8z0;
import defpackage.ffx;
import defpackage.ike;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.np60;
import defpackage.ny61;
import defpackage.qhw0;
import defpackage.r1e0;
import defpackage.rsg;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.unm0;
import defpackage.uyj;
import defpackage.xy40;
import defpackage.zy11;
import java.util.Calendar;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class b {
    public final com.yandex.go.due_timetable.data.repository.a a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final ike c;
    public final ConcurrentHashMap d;

    public b(tt2 tt2Var, com.yandex.go.due_timetable.data.repository.a aVar) {
        this.a = aVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(cvw.U(a, mdh.b));
        this.d = new ConcurrentHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(14:5|6|7|8|(2:38|(1:(3:(1:(1:43)(2:44|45))(2:46|47)|26|27)(10:48|49|50|51|21|(1:23)(1:30)|24|(1:28)|26|27))(3:54|55|56))(4:10|11|12|(1:35)(1:14))|15|16|(2:18|19)|21|(0)(0)|24|(0)|26|27))|60|6|7|8|(0)(0)|15|16|(0)|21|(0)(0)|24|(0)|26|27|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df A[Catch: all -> 0x00fd, CancellationException -> 0x0120, TryCatch #0 {CancellationException -> 0x0120, blocks: (B:47:0x0063, B:50:0x007c, B:21:0x00db, B:23:0x00df, B:24:0x00e6, B:55:0x0092, B:16:0x00c2, B:12:0x009d), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, rsg rsgVar, boolean z, b580 b580Var, boolean z2, ContinuationImpl continuationImpl) {
        ScheduledOrderCalculationsLoader$makePollingRequest$1 scheduledOrderCalculationsLoader$makePollingRequest$1;
        ScheduledOrderCalculationsLoader$makePollingRequest$1 scheduledOrderCalculationsLoader$makePollingRequest$12;
        Object obj;
        boolean z3;
        boolean z4;
        Object obj2;
        r1e0 r1e0Var;
        unm0 unm0Var;
        long longValue;
        unm0 unm0Var2;
        rsg rsgVar2 = rsgVar;
        bVar.getClass();
        try {
            if (continuationImpl instanceof ScheduledOrderCalculationsLoader$makePollingRequest$1) {
                scheduledOrderCalculationsLoader$makePollingRequest$1 = (ScheduledOrderCalculationsLoader$makePollingRequest$1) continuationImpl;
                int i = scheduledOrderCalculationsLoader$makePollingRequest$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    scheduledOrderCalculationsLoader$makePollingRequest$1.label = i - Integer.MIN_VALUE;
                    scheduledOrderCalculationsLoader$makePollingRequest$12 = scheduledOrderCalculationsLoader$makePollingRequest$1;
                    Object obj3 = scheduledOrderCalculationsLoader$makePollingRequest$12.result;
                    obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    z3 = scheduledOrderCalculationsLoader$makePollingRequest$12.label;
                    if (z3 == 0) {
                        try {
                        } catch (Throwable unused) {
                            z4 = rsgVar2;
                            rsgVar2 = 1;
                        }
                        if (z3 != 1) {
                            if (z3 != 2) {
                                if (z3 == 3) {
                                    boolean z5 = scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1;
                                    boolean z6 = scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0;
                                    kotlin.b.b(obj3);
                                } else {
                                    if (z3 != 4) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    kotlin.b.b(obj3);
                                }
                                return zy11.a;
                            }
                            boolean z7 = scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1;
                            z3 = scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0;
                            r1e0Var = (r1e0) scheduledOrderCalculationsLoader$makePollingRequest$12.L$2;
                            rsg rsgVar3 = (rsg) scheduledOrderCalculationsLoader$makePollingRequest$12.L$0;
                            try {
                                kotlin.b.b(obj3);
                                z4 = z7;
                                rsgVar2 = rsgVar3;
                                z3 = z3;
                                Long l = r1e0Var.b;
                                longValue = l != null ? l.longValue() : 4000L;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = rsgVar2;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = null;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.label = 3;
                                if (kotlinx.coroutines.a.i(longValue, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
                                    return obj;
                                }
                            } catch (Throwable unused2) {
                                z4 = z7;
                                rsgVar2 = rsgVar3;
                                unm0Var = new unm0(rsgVar2.a, CalculationsStatus.FINISHED, np60.b);
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = null;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = null;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.L$3 = null;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
                                scheduledOrderCalculationsLoader$makePollingRequest$12.label = 4;
                                if (bVar.c(rsgVar2, unm0Var, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
                                    return obj;
                                }
                                return zy11.a;
                            }
                            return zy11.a;
                        }
                        boolean z8 = scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1;
                        boolean z9 = scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0;
                        rsg rsgVar4 = (rsg) scheduledOrderCalculationsLoader$makePollingRequest$12.L$0;
                        kotlin.b.b(obj3);
                        z4 = z8;
                        rsgVar2 = rsgVar4;
                        obj2 = obj3;
                        z3 = z9;
                    } else {
                        kotlin.b.b(obj3);
                        try {
                            com.yandex.go.due_timetable.data.repository.a aVar = bVar.a;
                            Calendar calendar = rsgVar2.a;
                            xy40 b = b(rsgVar2);
                            scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = rsgVar2;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z2;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.label = 1;
                            Object a = aVar.a(calendar, b, z, b580Var, z2, scheduledOrderCalculationsLoader$makePollingRequest$12);
                            if (a == obj) {
                                return obj;
                            }
                            z3 = z;
                            obj2 = a;
                            z4 = z2;
                        } catch (Throwable unused3) {
                            z3 = z;
                            z4 = z2;
                            unm0Var = new unm0(rsgVar2.a, CalculationsStatus.FINISHED, np60.b);
                            scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = null;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = null;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.L$3 = null;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
                            scheduledOrderCalculationsLoader$makePollingRequest$12.label = 4;
                            if (bVar.c(rsgVar2, unm0Var, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
                            }
                            return zy11.a;
                        }
                    }
                    r1e0Var = (r1e0) obj2;
                    unm0Var2 = (unm0) r1e0Var.a;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = rsgVar2;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = r1e0Var;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.label = 2;
                    z4 = z4;
                    z3 = z3;
                    if (bVar.c(rsgVar2, unm0Var2, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
                        return obj;
                    }
                    Long l2 = r1e0Var.b;
                    if (l2 != null) {
                    }
                    scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = rsgVar2;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = null;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
                    scheduledOrderCalculationsLoader$makePollingRequest$12.label = 3;
                    if (kotlinx.coroutines.a.i(longValue, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
                    }
                    return zy11.a;
                }
            }
            if (z3 == 0) {
            }
            r1e0Var = (r1e0) obj2;
            unm0Var2 = (unm0) r1e0Var.a;
            scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = rsgVar2;
            scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
            scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = r1e0Var;
            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
            scheduledOrderCalculationsLoader$makePollingRequest$12.label = 2;
            z4 = z4;
            z3 = z3;
            if (bVar.c(rsgVar2, unm0Var2, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
            }
            Long l22 = r1e0Var.b;
            if (l22 != null) {
            }
            scheduledOrderCalculationsLoader$makePollingRequest$12.L$0 = rsgVar2;
            scheduledOrderCalculationsLoader$makePollingRequest$12.L$1 = null;
            scheduledOrderCalculationsLoader$makePollingRequest$12.L$2 = null;
            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$0 = z3;
            scheduledOrderCalculationsLoader$makePollingRequest$12.Z$1 = z4;
            scheduledOrderCalculationsLoader$makePollingRequest$12.label = 3;
            if (kotlinx.coroutines.a.i(longValue, scheduledOrderCalculationsLoader$makePollingRequest$12) == obj) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        scheduledOrderCalculationsLoader$makePollingRequest$1 = new ScheduledOrderCalculationsLoader$makePollingRequest$1(bVar, continuationImpl);
        scheduledOrderCalculationsLoader$makePollingRequest$12 = scheduledOrderCalculationsLoader$makePollingRequest$1;
        Object obj32 = scheduledOrderCalculationsLoader$makePollingRequest$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        z3 = scheduledOrderCalculationsLoader$makePollingRequest$12.label;
    }

    public static xy40 b(rsg rsgVar) {
        xy40 xy40Var = new xy40(rsgVar.c.b);
        xy40 xy40Var2 = rsgVar.c;
        Object[] objArr = xy40Var2.a;
        int i = xy40Var2.b;
        for (int i2 = 0; i2 < i; i2++) {
            e8z0 e8z0Var = (e8z0) objArr[i2];
            if (e8z0Var instanceof b8z0) {
                b8z0 b8z0Var = (b8z0) e8z0Var;
                if (!b8z0Var.e) {
                    xy40Var.g(b8z0Var.b);
                }
            }
        }
        return xy40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rsg rsgVar, unm0 unm0Var, ContinuationImpl continuationImpl) {
        ScheduledOrderCalculationsLoader$handleResponse$1 scheduledOrderCalculationsLoader$handleResponse$1;
        int i;
        l8x l8xVar;
        if (continuationImpl instanceof ScheduledOrderCalculationsLoader$handleResponse$1) {
            scheduledOrderCalculationsLoader$handleResponse$1 = (ScheduledOrderCalculationsLoader$handleResponse$1) continuationImpl;
            int i2 = scheduledOrderCalculationsLoader$handleResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scheduledOrderCalculationsLoader$handleResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scheduledOrderCalculationsLoader$handleResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduledOrderCalculationsLoader$handleResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scheduledOrderCalculationsLoader$handleResponse$1.L$0 = rsgVar;
                    scheduledOrderCalculationsLoader$handleResponse$1.L$1 = unm0Var;
                    scheduledOrderCalculationsLoader$handleResponse$1.label = 1;
                    if (this.b.emit(unm0Var, scheduledOrderCalculationsLoader$handleResponse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    unm0Var = (unm0) scheduledOrderCalculationsLoader$handleResponse$1.L$1;
                    rsgVar = (rsg) scheduledOrderCalculationsLoader$handleResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                if (unm0Var.b == CalculationsStatus.FINISHED && (l8xVar = (l8x) this.d.get(rsgVar.e)) != null) {
                    l8xVar.a(null);
                }
                return zy11.a;
            }
        }
        scheduledOrderCalculationsLoader$handleResponse$1 = new ScheduledOrderCalculationsLoader$handleResponse$1(this, continuationImpl);
        Object obj2 = scheduledOrderCalculationsLoader$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduledOrderCalculationsLoader$handleResponse$1.label;
        if (i != 0) {
        }
        if (unm0Var.b == CalculationsStatus.FINISHED) {
            l8xVar.a(null);
        }
        return zy11.a;
    }

    public final void d(rsg rsgVar, boolean z, b580 b580Var, boolean z2) {
        String str = rsgVar.e;
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        concurrentHashMap.put(str, com.yandex.go.coroutines.b.g(this.c, null, null, new ScheduledOrderCalculationsLoader$calculationsPollingJob$1(this, rsgVar, z, b580Var, z2, null), 3));
    }
}
