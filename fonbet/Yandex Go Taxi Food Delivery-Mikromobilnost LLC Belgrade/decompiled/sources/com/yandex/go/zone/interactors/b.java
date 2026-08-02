package com.yandex.go.zone.interactors;

import com.yandex.go.zone.repository.o;
import com.yandex.go.zone.repository.r;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final r a;
    public final o b;
    public final ru.yandex.taxi.launch.c c;

    public b(r rVar, o oVar, ru.yandex.taxi.launch.c cVar) {
        this.a = rVar;
        this.b = oVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        FetchZoneInteractorImpl$fetchZone$1 fetchZoneInteractorImpl$fetchZone$1;
        int i;
        o oVar;
        if (continuation instanceof FetchZoneInteractorImpl$fetchZone$1) {
            fetchZoneInteractorImpl$fetchZone$1 = (FetchZoneInteractorImpl$fetchZone$1) continuation;
            int i2 = fetchZoneInteractorImpl$fetchZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchZoneInteractorImpl$fetchZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchZoneInteractorImpl$fetchZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchZoneInteractorImpl$fetchZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fetchZoneInteractorImpl$fetchZone$1.L$0 = str;
                    o oVar2 = this.b;
                    fetchZoneInteractorImpl$fetchZone$1.L$1 = oVar2;
                    fetchZoneInteractorImpl$fetchZone$1.label = 1;
                    Object c = this.c.c(fetchZoneInteractorImpl$fetchZone$1);
                    if (c != coroutineSingletons) {
                        obj = c;
                        oVar = oVar2;
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
                oVar = (o) fetchZoneInteractorImpl$fetchZone$1.L$1;
                str = (String) fetchZoneInteractorImpl$fetchZone$1.L$0;
                kotlin.b.b(obj);
                fetchZoneInteractorImpl$fetchZone$1.L$0 = null;
                fetchZoneInteractorImpl$fetchZone$1.L$1 = null;
                fetchZoneInteractorImpl$fetchZone$1.label = 2;
                Object d = oVar.d((String) obj, str, fetchZoneInteractorImpl$fetchZone$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        fetchZoneInteractorImpl$fetchZone$1 = new FetchZoneInteractorImpl$fetchZone$1(this, continuation);
        Object obj2 = fetchZoneInteractorImpl$fetchZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchZoneInteractorImpl$fetchZone$1.label;
        if (i != 0) {
        }
        fetchZoneInteractorImpl$fetchZone$1.L$0 = null;
        fetchZoneInteractorImpl$fetchZone$1.L$1 = null;
        fetchZoneInteractorImpl$fetchZone$1.label = 2;
        Object d2 = oVar.d((String) obj2, str, fetchZoneInteractorImpl$fetchZone$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, Continuation continuation) {
        FetchZoneInteractorImpl$fetchZoneByGeoPoint$1 fetchZoneInteractorImpl$fetchZoneByGeoPoint$1;
        int i;
        if (continuation instanceof FetchZoneInteractorImpl$fetchZoneByGeoPoint$1) {
            fetchZoneInteractorImpl$fetchZoneByGeoPoint$1 = (FetchZoneInteractorImpl$fetchZoneByGeoPoint$1) continuation;
            int i2 = fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.L$0 = null;
                    fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label = 1;
                    obj = this.a.b(zzsVar, fetchZoneInteractorImpl$fetchZoneByGeoPoint$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.L$0 = null;
                fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.L$1 = null;
                fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label = 2;
                Object a = a((String) obj, fetchZoneInteractorImpl$fetchZoneByGeoPoint$1);
                return a != obj2 ? obj2 : a;
            }
        }
        fetchZoneInteractorImpl$fetchZoneByGeoPoint$1 = new FetchZoneInteractorImpl$fetchZoneByGeoPoint$1(this, continuation);
        Object obj3 = fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label;
        if (i != 0) {
        }
        fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.L$0 = null;
        fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.L$1 = null;
        fetchZoneInteractorImpl$fetchZoneByGeoPoint$1.label = 2;
        Object a2 = a((String) obj3, fetchZoneInteractorImpl$fetchZoneByGeoPoint$1);
        if (a2 != obj22) {
        }
    }

    public final Object c(mo21 mo21Var, ContinuationImpl continuationImpl) {
        return b(mo21Var.a(), continuationImpl);
    }

    public final Object d(String str, zzs zzsVar, Continuation continuation) {
        return (str == null || str.length() == 0) ? b(zzsVar, continuation) : a(str, continuation);
    }
}
