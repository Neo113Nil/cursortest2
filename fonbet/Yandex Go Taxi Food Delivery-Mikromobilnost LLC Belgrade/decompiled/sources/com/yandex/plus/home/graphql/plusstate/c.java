package com.yandex.plus.home.graphql.plusstate;

import com.yandex.plus.home.api.location.GeoPoint;
import com.yandex.plus.home.datasource.openapi.apis.PlusStateControllerApi;
import com.yandex.plus.home.internal.di.d;
import com.yandex.plus.log.api.LogPriority;
import defpackage.bvf0;
import defpackage.cmd0;
import defpackage.dmd0;
import defpackage.e6d0;
import defpackage.emd0;
import defpackage.fmd0;
import defpackage.gyy;
import defpackage.ha2;
import defpackage.hmd0;
import defpackage.hyy;
import defpackage.i6d0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.jyy;
import defpackage.jzs;
import defpackage.kyy;
import defpackage.l6d0;
import defpackage.lzs;
import defpackage.m6d0;
import defpackage.mdh;
import defpackage.my50;
import defpackage.nw50;
import defpackage.ny61;
import defpackage.py50;
import defpackage.rkd0;
import defpackage.s8x;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uwj0;
import defpackage.vq50;
import defpackage.vwj0;
import defpackage.w511;
import defpackage.wyj;
import defpackage.xyj;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c {
    public final PlusStateControllerApi a;
    public final m6d0 b;
    public final lzs c;
    public final d d;
    public final xyj e;
    public final ike f;
    public final rkd0 g;
    public final vwj0 h = new vwj0();
    public final r0 i = bvf0.c(null);
    public final s8x j = kotlinx.coroutines.a.a();

    public c(PlusStateControllerApi plusStateControllerApi, m6d0 m6d0Var, lzs lzsVar, d dVar, xyj xyjVar, ike ikeVar, rkd0 rkd0Var) {
        this.a = plusStateControllerApi;
        this.b = m6d0Var;
        this.c = lzsVar;
        this.d = dVar;
        this.e = xyjVar;
        this.f = ikeVar;
        this.g = rkd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:48|49))(4:50|(5:52|(1:54)(1:64)|55|(1:57)(1:63)|58)(1:65)|59|(1:61)(1:62))|10|11|12|(2:14|(1:16)(2:38|39))(2:40|(1:42)(2:43|44))|17|(3:19|(2:21|(2:23|(1:25)(2:30|31))(1:32))(1:33)|26)(2:34|(2:36|37))|27|28))|66|6|(0)(0)|10|11|12|(0)(0)|17|(0)(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        r15 = new e6d0.a.c(r15.getB(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x009b, B:14:0x009f, B:16:0x00aa, B:38:0x00b8, B:39:0x00bf, B:40:0x00c0, B:43:0x00c5, B:44:0x00ca), top: B:11:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x009b, B:14:0x009f, B:16:0x00aa, B:38:0x00b8, B:39:0x00bf, B:40:0x00c0, B:43:0x00c5, B:44:0x00ca), top: B:11:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        PlusStateRepositoryImpl$makeRequest$1 plusStateRepositoryImpl$makeRequest$1;
        int i;
        nw50 nw50Var;
        l6d0 l6d0Var;
        e6d0 e6d0Var;
        Object emd0Var;
        vwj0 vwj0Var = cVar.h;
        if (continuationImpl instanceof PlusStateRepositoryImpl$makeRequest$1) {
            plusStateRepositoryImpl$makeRequest$1 = (PlusStateRepositoryImpl$makeRequest$1) continuationImpl;
            int i2 = plusStateRepositoryImpl$makeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusStateRepositoryImpl$makeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusStateRepositoryImpl$makeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusStateRepositoryImpl$makeRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jzs a = cVar.c.a();
                    vwj0Var.getClass();
                    if (a != null) {
                        GeoPoint geoPoint = a.a;
                        vq50 vq50Var = geoPoint != null ? new vq50(geoPoint.getLat(), geoPoint.getLon(), geoPoint.getAccuracy()) : null;
                        GeoPoint geoPoint2 = a.b;
                        nw50Var = new nw50(vq50Var, geoPoint2 != null ? new vq50(geoPoint2.getLat(), geoPoint2.getLon(), geoPoint2.getAccuracy()) : null);
                    } else {
                        nw50Var = new nw50(null, null);
                    }
                    PlusStateControllerApi plusStateControllerApi = cVar.a;
                    plusStateRepositoryImpl$makeRequest$1.L$0 = null;
                    plusStateRepositoryImpl$makeRequest$1.L$1 = null;
                    l6d0 l6d0Var2 = l6d0.a;
                    plusStateRepositoryImpl$makeRequest$1.L$2 = l6d0Var2;
                    plusStateRepositoryImpl$makeRequest$1.label = 1;
                    obj = plusStateControllerApi.a(nw50Var, plusStateRepositoryImpl$makeRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l6d0Var = l6d0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l6d0Var = (l6d0) plusStateRepositoryImpl$makeRequest$1.L$2;
                    kotlin.b.b(obj);
                }
                e6d0Var = (e6d0) obj;
                if (!(e6d0Var instanceof e6d0.b)) {
                    my50 my50Var = ((py50) ((e6d0.b) e6d0Var).a).b;
                    if (my50Var == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    e6d0Var = new e6d0.b(my50Var, ((e6d0.b) e6d0Var).b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m6d0 m6d0Var = cVar.b;
                l6d0Var.getClass();
                m6d0Var.a(e6d0Var);
                if (!(e6d0Var instanceof e6d0.b)) {
                    e6d0.b bVar = (e6d0.b) e6d0Var;
                    my50 my50Var2 = (my50) bVar.a;
                    vwj0Var.getClass();
                    cmd0 cmd0Var = new cmd0(my50Var2.a().a().doubleValue(), my50Var2.a().b().name());
                    int i3 = uwj0.a[my50Var2.b().ordinal()];
                    if (i3 == 1) {
                        emd0Var = new emd0(cmd0Var);
                    } else if (i3 == 2) {
                        emd0Var = new fmd0(cmd0Var);
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        emd0Var = new dmd0(cmd0Var);
                    }
                    e6d0Var = new e6d0.b(emd0Var, bVar.b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    w511.b();
                    return null;
                }
                return i6d0.a(e6d0Var);
            }
        }
        plusStateRepositoryImpl$makeRequest$1 = new PlusStateRepositoryImpl$makeRequest$1(cVar, continuationImpl);
        Object obj2 = plusStateRepositoryImpl$makeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusStateRepositoryImpl$makeRequest$1.label;
        if (i != 0) {
        }
        e6d0Var = (e6d0) obj2;
        if (!(e6d0Var instanceof e6d0.b)) {
        }
        m6d0 m6d0Var2 = cVar.b;
        l6d0Var.getClass();
        m6d0Var2.a(e6d0Var);
        if (!(e6d0Var instanceof e6d0.b)) {
        }
        return i6d0.a(e6d0Var);
    }

    public final void b() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.i;
            value = r0Var.getValue();
            LogPriority logPriority = LogPriority.DEBUG;
            rkd0 rkd0Var = this.g;
            if (rkd0Var.e(logPriority)) {
                rkd0Var.b(logPriority, "PlusStateRepositoryImpl", "clearCache()", null);
            }
            kotlinx.coroutines.a.h(this.j);
        } while (!r0Var.k(value, null));
    }

    public final hmd0 c() {
        hmd0 hmd0Var;
        Object a;
        kyy kyyVar = (kyy) this.i.getValue();
        if (kyyVar != null) {
            if (!(kyyVar instanceof hyy)) {
                if (kyyVar instanceof jyy) {
                    a = ((jyy) kyyVar).a();
                    hmd0Var = (hmd0) a;
                } else if (!(kyyVar instanceof gyy)) {
                    w511.b();
                    return null;
                }
            }
            a = null;
            hmd0Var = (hmd0) a;
        } else {
            hmd0Var = null;
        }
        LogPriority logPriority = LogPriority.DEBUG;
        rkd0 rkd0Var = this.g;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusStateRepositoryImpl", "getCurrentPlusState(): " + hmd0Var, null);
        }
        return hmd0Var;
    }

    public final tpr d() {
        jqr jqrVar = new jqr(e.t(new ha2(14, this.i, this)), new PlusStateRepositoryImpl$getPlusStateFlow$2(this, null), 3);
        ((wyj) this.e).getClass();
        return e.F(jqrVar, wyj.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PlusStateRepositoryImpl$waitForPlusState$1 plusStateRepositoryImpl$waitForPlusState$1;
        int i;
        if (continuationImpl instanceof PlusStateRepositoryImpl$waitForPlusState$1) {
            plusStateRepositoryImpl$waitForPlusState$1 = (PlusStateRepositoryImpl$waitForPlusState$1) continuationImpl;
            int i2 = plusStateRepositoryImpl$waitForPlusState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusStateRepositoryImpl$waitForPlusState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusStateRepositoryImpl$waitForPlusState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusStateRepositoryImpl$waitForPlusState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((wyj) this.e).getClass();
                    mdh mdhVar = wyj.e;
                    PlusStateRepositoryImpl$waitForPlusState$2 plusStateRepositoryImpl$waitForPlusState$2 = new PlusStateRepositoryImpl$waitForPlusState$2(this, null);
                    plusStateRepositoryImpl$waitForPlusState$1.label = 1;
                    obj = tje.k0(mdhVar, plusStateRepositoryImpl$waitForPlusState$2, plusStateRepositoryImpl$waitForPlusState$1);
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
                return ((Result) obj).getValue();
            }
        }
        plusStateRepositoryImpl$waitForPlusState$1 = new PlusStateRepositoryImpl$waitForPlusState$1(this, continuationImpl);
        Object obj2 = plusStateRepositoryImpl$waitForPlusState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusStateRepositoryImpl$waitForPlusState$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
