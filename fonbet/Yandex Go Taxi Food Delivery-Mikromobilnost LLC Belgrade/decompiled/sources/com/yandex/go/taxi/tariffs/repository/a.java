package com.yandex.go.taxi.tariffs.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.zone.model.Zone;
import defpackage.bbl0;
import defpackage.cwd;
import defpackage.dwj0;
import defpackage.g7j0;
import defpackage.gqe0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.scc;
import defpackage.xby;
import defpackage.yal0;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.taxi.tariffs.internal.interactor.f a;
    public final com.yandex.go.taxi.tariffs.factory.a b;
    public final com.yandex.go.taxi.tariffs.internal.routestats.interactor.c c;

    public a(com.yandex.go.taxi.tariffs.internal.interactor.f fVar, com.yandex.go.taxi.tariffs.factory.a aVar, com.yandex.go.taxi.tariffs.internal.routestats.interactor.c cVar) {
        this.a = fVar;
        this.b = aVar;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r4 == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gqe0 gqe0Var, ContinuationImpl continuationImpl) {
        DueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1 dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1;
        int i;
        gqe0 gqe0Var2;
        Object a;
        dwj0 dwj0Var;
        bbl0 bbl0Var;
        List list;
        Zone zone;
        com.yandex.go.taxi.tariffs.factory.a aVar;
        if (continuationImpl instanceof DueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1) {
            dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1 = (DueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1) continuationImpl;
            int i2 = dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gqe0Var2 = gqe0Var;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$0 = gqe0Var2;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label = 1;
                    a = this.a.a.a(dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        Zone zone2 = (Zone) dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$6;
                        com.yandex.go.taxi.tariffs.factory.a aVar2 = (com.yandex.go.taxi.tariffs.factory.a) dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$5;
                        list = (List) dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$4;
                        bbl0Var = (bbl0) dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$3;
                        kotlin.b.b(obj);
                        zone = zone2;
                        aVar = aVar2;
                        Address address = (Address) kotlin.collections.a.P(list);
                        Address address2 = (Address) kotlin.collections.a.Z(list);
                        String str = bbl0Var.n;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$0 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$1 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$2 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$3 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$4 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$5 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$6 = null;
                        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label = 3;
                        cwd b = aVar.b(zone, (yal0) obj, address, address2, str);
                        return b != coroutineSingletons ? coroutineSingletons : b;
                    }
                    gqe0 gqe0Var3 = (gqe0) dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$0;
                    kotlin.b.b(obj);
                    a = obj;
                    gqe0Var2 = gqe0Var3;
                }
                dwj0Var = (dwj0) a;
                if (dwj0Var != null) {
                    return null;
                }
                g7j0 g7j0Var = dwj0Var.a;
                g7j0 a2 = g7j0.a(g7j0Var, bbl0.a(g7j0Var.a, gqe0Var2, false, null, 131007));
                bbl0Var = a2.a;
                List list2 = bbl0Var.c.b;
                Zone zone3 = bbl0Var.b;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$0 = null;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$1 = null;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$2 = null;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$3 = bbl0Var;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$4 = list2;
                com.yandex.go.taxi.tariffs.factory.a aVar3 = this.b;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$5 = aVar3;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$6 = zone3;
                dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label = 2;
                obj = this.c.d(a2, null, dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1);
                if (obj != coroutineSingletons) {
                    list = list2;
                    zone = zone3;
                    aVar = aVar3;
                    Address address3 = (Address) kotlin.collections.a.P(list);
                    Address address22 = (Address) kotlin.collections.a.Z(list);
                    String str2 = bbl0Var.n;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$0 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$1 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$2 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$3 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$4 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$5 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.L$6 = null;
                    dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label = 3;
                    cwd b2 = aVar.b(zone, (yal0) obj, address3, address22, str2);
                    if (b2 != coroutineSingletons) {
                    }
                }
            }
        }
        dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1 = new DueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1(this, continuationImpl);
        Object obj2 = dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dueTariffsInfoRepositoryImpl$executeTariffsInfoRequest$1.label;
        if (i != 0) {
        }
        dwj0Var = (dwj0) a;
        if (dwj0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1 dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1;
        int i;
        try {
            if (continuationImpl instanceof DueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1) {
                dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1 = (DueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1) continuationImpl;
                int i2 = dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        gqe0 gqe0Var = new gqe0(null, null, null, true, null, null);
                        dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.label = 1;
                        obj = a(gqe0Var, dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (cwd) obj;
                }
            }
            if (i != 0) {
            }
            return (cwd) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, kotlin.collections.a.X(scc.g("DUE_TARIFFS_ERROR_TOKEN", "Error fetching on demand tariffs info"), ":", null, null, null, 62), null, th, "Error fetching on demand tariffs info", 2);
            return null;
        }
        dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1 = new DueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1(this, continuationImpl);
        Object obj3 = dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dueTariffsInfoRepositoryImpl$getOnDemandTariffsInfo$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Calendar calendar, String str, Integer num, ContinuationImpl continuationImpl) {
        DueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1 dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1;
        int i;
        try {
            if (continuationImpl instanceof DueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1) {
                dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1 = (DueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1) continuationImpl;
                int i2 = dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    gqe0 gqe0Var = new gqe0(calendar, str, null, false, calendar, num);
                    dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.L$0 = null;
                    dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.L$1 = null;
                    dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.L$2 = null;
                    dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.label = 1;
                    Object a = a(gqe0Var, dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1);
                    return a == obj2 ? obj2 : a;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, kotlin.collections.a.X(scc.g("DUE_TARIFFS_ERROR_TOKEN", "Error fetching due time tariffs info"), ":", null, null, null, 62), null, th, "Error fetching due time tariffs info", 2);
            return null;
        }
        dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1 = new DueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1(this, continuationImpl);
        Object obj3 = dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dueTariffsInfoRepositoryImpl$getScheduledOrderTariffsInfo$1.label;
    }
}
