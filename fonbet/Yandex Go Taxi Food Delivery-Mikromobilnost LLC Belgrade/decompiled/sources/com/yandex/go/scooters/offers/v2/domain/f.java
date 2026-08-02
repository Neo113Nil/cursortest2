package com.yandex.go.scooters.offers.v2.domain;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import com.yandex.go.scooters.domain.model.ScootersOfferCreateException;
import com.yandex.go.scooters.domain.r;
import com.yandex.go.scooters.domain.x;
import defpackage.arm0;
import defpackage.bvn0;
import defpackage.hbn0;
import defpackage.i5n0;
import defpackage.jst;
import defpackage.krl0;
import defpackage.m6a0;
import defpackage.mxm0;
import defpackage.ny61;
import defpackage.o1b1;
import defpackage.o4o0;
import defpackage.oe7;
import defpackage.q4o0;
import defpackage.r7p0;
import defpackage.xby;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public final class f {
    public final ru.yandex.taxi.scooters.data.mapper.c a;
    public final com.yandex.go.scooters.data.a b;
    public final r c;
    public final bvn0 d;
    public final com.yandex.go.scooters.offers.v2.data.a e;
    public final x f;
    public final krl0 g;
    public final com.yandex.go.scooters.payments.data.c h;
    public final i5n0 i;
    public final com.yandex.go.scooters.offers.v2.data.b j;
    public final com.yandex.go.scooters.offers.v2.analytics.c k;
    public final q4o0 l;
    public final mxm0 m;

    public f(ru.yandex.taxi.scooters.data.mapper.c cVar, com.yandex.go.scooters.data.a aVar, r rVar, bvn0 bvn0Var, com.yandex.go.scooters.offers.v2.data.a aVar2, x xVar, krl0 krl0Var, com.yandex.go.scooters.payments.data.c cVar2, i5n0 i5n0Var, com.yandex.go.scooters.offers.v2.data.b bVar, com.yandex.go.scooters.offers.v2.analytics.c cVar3, q4o0 q4o0Var, mxm0 mxm0Var) {
        this.a = cVar;
        this.b = aVar;
        this.c = rVar;
        this.d = bvn0Var;
        this.e = aVar2;
        this.f = xVar;
        this.g = krl0Var;
        this.h = cVar2;
        this.i = i5n0Var;
        this.j = bVar;
        this.k = cVar3;
        this.l = q4o0Var;
        this.m = mxm0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|(2:14|15)(1:17))(2:18|19))(2:20|21))(3:28|29|(2:31|32))|22|(1:24)(2:25|26)))|42|6|7|(0)(0)|22|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0049, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
    
        r14 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        r2 = defpackage.s8o.M(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        r2 = r2.intValue();
        r6 = r12.g;
        r7 = (defpackage.p2o0) r6.a;
        r14 = r14.a;
        r6 = (defpackage.q4o0) r6.b;
        r8 = r6.a().c.b;
        r6 = r6.a().c.a;
        r7.getClass();
        r9 = new java.util.HashMap();
        r9.put("scooter_number", r14);
        r9.put("open_reason", r8);
        r9.put("from_screen", r6);
        r9.put("http_error_code", java.lang.Integer.valueOf(r2));
        r7.a.a("ScootersOfferCard.Error", r9, 1, new java.util.HashMap());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
    
        r14 = r12.a;
        r0.L$0 = null;
        r0.L$1 = r13;
        r0.L$2 = null;
        r0.label = 2;
        r14 = r14.b(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r14 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0049, CancellationException -> 0x00e1, TryCatch #2 {CancellationException -> 0x00e1, all -> 0x0049, blocks: (B:21:0x0045, B:22:0x0060, B:25:0x006b, B:26:0x0072, B:29:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, r7p0 r7p0Var, ContinuationImpl continuationImpl) {
        ScootersCreateOfferInteractor$getSingleOffer$1 scootersCreateOfferInteractor$getSingleOffer$1;
        int i;
        hbn0 hbn0Var;
        fVar.getClass();
        if (continuationImpl instanceof ScootersCreateOfferInteractor$getSingleOffer$1) {
            scootersCreateOfferInteractor$getSingleOffer$1 = (ScootersCreateOfferInteractor$getSingleOffer$1) continuationImpl;
            int i2 = scootersCreateOfferInteractor$getSingleOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCreateOfferInteractor$getSingleOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCreateOfferInteractor$getSingleOffer$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCreateOfferInteractor$getSingleOffer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List singletonList = Collections.singletonList(r7p0Var);
                    scootersCreateOfferInteractor$getSingleOffer$1.L$0 = r7p0Var;
                    scootersCreateOfferInteractor$getSingleOffer$1.label = 1;
                    obj = fVar.c(singletonList, scootersCreateOfferInteractor$getSingleOffer$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) scootersCreateOfferInteractor$getSingleOffer$1.L$1;
                        kotlin.b.b(obj);
                        if (obj == ScootersErrorCode.CAR_IS_BUSY) {
                            throw fVar.d.a(th);
                        }
                        throw th;
                    }
                    r7p0Var = (r7p0) scootersCreateOfferInteractor$getSingleOffer$1.L$0;
                    kotlin.b.b(obj);
                }
                hbn0Var = (hbn0) obj;
                if (hbn0Var.d.isEmpty()) {
                    return hbn0Var;
                }
                throw new IllegalStateException("No available tariffs for scooter.");
            }
        }
        scootersCreateOfferInteractor$getSingleOffer$1 = new ScootersCreateOfferInteractor$getSingleOffer$1(fVar, continuationImpl);
        Object obj3 = scootersCreateOfferInteractor$getSingleOffer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCreateOfferInteractor$getSingleOffer$1.label;
        if (i != 0) {
        }
        hbn0Var = (hbn0) obj3;
        if (hbn0Var.d.isEmpty()) {
        }
    }

    public static final ScootersComeFrom b(f fVar) {
        o4o0 a = fVar.l.a();
        return (a.b == ScootersOffersPresentationState$LaunchContext.ON_CAMERA && fVar.m.b) ? ScootersComeFrom.ANOTHER : a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2 A[Catch: all -> 0x00fe, CancellationException -> 0x0100, TryCatch #2 {CancellationException -> 0x0100, all -> 0x00fe, blocks: (B:14:0x0044, B:20:0x0056, B:22:0x00c8, B:24:0x00d2, B:28:0x00f6, B:29:0x00fd, B:31:0x0060, B:33:0x0088, B:36:0x008d, B:40:0x0068), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6 A[Catch: all -> 0x00fe, CancellationException -> 0x0100, TryCatch #2 {CancellationException -> 0x0100, all -> 0x00fe, blocks: (B:14:0x0044, B:20:0x0056, B:22:0x00c8, B:24:0x00d2, B:28:0x00f6, B:29:0x00fd, B:31:0x0060, B:33:0x0088, B:36:0x008d, B:40:0x0068), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x00fe, CancellationException -> 0x0100, TryCatch #2 {CancellationException -> 0x0100, all -> 0x00fe, blocks: (B:14:0x0044, B:20:0x0056, B:22:0x00c8, B:24:0x00d2, B:28:0x00f6, B:29:0x00fd, B:31:0x0060, B:33:0x0088, B:36:0x008d, B:40:0x0068), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        ScootersCreateOfferInteractor$getScooterOffers$1 scootersCreateOfferInteractor$getScooterOffers$1;
        int i;
        List list2;
        hbn0 hbn0Var;
        Object obj;
        hbn0 hbn0Var2;
        List list3 = list;
        q4o0 q4o0Var = this.l;
        try {
            if (continuationImpl instanceof ScootersCreateOfferInteractor$getScooterOffers$1) {
                scootersCreateOfferInteractor$getScooterOffers$1 = (ScootersCreateOfferInteractor$getScooterOffers$1) continuationImpl;
                int i2 = scootersCreateOfferInteractor$getScooterOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCreateOfferInteractor$getScooterOffers$1.label = i2 - Integer.MIN_VALUE;
                    ScootersCreateOfferInteractor$getScooterOffers$1 scootersCreateOfferInteractor$getScooterOffers$12 = scootersCreateOfferInteractor$getScooterOffers$1;
                    Object obj2 = scootersCreateOfferInteractor$getScooterOffers$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCreateOfferInteractor$getScooterOffers$12.label;
                    int i3 = 9;
                    com.yandex.go.scooters.offers.v2.data.a aVar = this.e;
                    int i4 = 2;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        TreeSet treeSet = new TreeSet(new oe7(i3, new arm0(i4)));
                        kotlin.collections.a.F0(list3, treeSet);
                        scootersCreateOfferInteractor$getScooterOffers$12.L$0 = list3;
                        scootersCreateOfferInteractor$getScooterOffers$12.label = 1;
                        obj2 = aVar.a(treeSet, scootersCreateOfferInteractor$getScooterOffers$12);
                        if (obj2 == coroutineSingletons) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                hbn0 hbn0Var3 = (hbn0) scootersCreateOfferInteractor$getScooterOffers$12.L$2;
                                kotlin.b.b(obj2);
                                return hbn0Var3;
                            }
                            List list4 = (List) scootersCreateOfferInteractor$getScooterOffers$12.L$0;
                            kotlin.b.b(obj2);
                            list2 = list4;
                            obj = null;
                            hbn0Var2 = (hbn0) obj2;
                            if (!hbn0Var2.c.isEmpty()) {
                                throw new IllegalStateException("No offers in response");
                            }
                            TreeSet treeSet2 = new TreeSet(new oe7(i3, new arm0(i4)));
                            kotlin.collections.a.F0(list2, treeSet2);
                            scootersCreateOfferInteractor$getScooterOffers$12.L$0 = obj;
                            scootersCreateOfferInteractor$getScooterOffers$12.L$1 = obj;
                            scootersCreateOfferInteractor$getScooterOffers$12.L$2 = hbn0Var2;
                            scootersCreateOfferInteractor$getScooterOffers$12.label = 3;
                            return aVar.c(treeSet2, hbn0Var2, scootersCreateOfferInteractor$getScooterOffers$12) == coroutineSingletons ? coroutineSingletons : hbn0Var2;
                        }
                        list3 = (List) scootersCreateOfferInteractor$getScooterOffers$12.L$0;
                        kotlin.b.b(obj2);
                    }
                    list2 = list3;
                    hbn0Var = (hbn0) obj2;
                    if (hbn0Var == null) {
                        return hbn0Var;
                    }
                    com.yandex.go.scooters.data.a aVar2 = this.b;
                    m6a0 c = this.h.c();
                    q4o0Var.a().getClass();
                    String a = this.i.a();
                    ScootersInsuranceType scootersInsuranceType = this.c.d().a;
                    boolean a2 = o1b1.a(q4o0Var.a().a());
                    scootersCreateOfferInteractor$getScooterOffers$12.L$0 = list2;
                    scootersCreateOfferInteractor$getScooterOffers$12.L$1 = null;
                    scootersCreateOfferInteractor$getScooterOffers$12.label = 2;
                    obj = null;
                    obj2 = aVar2.c(a, scootersInsuranceType, c, list2, a2, scootersCreateOfferInteractor$getScooterOffers$12);
                    if (obj2 == coroutineSingletons) {
                    }
                    hbn0Var2 = (hbn0) obj2;
                    if (!hbn0Var2.c.isEmpty()) {
                    }
                }
            }
            if (i != 0) {
            }
            list2 = list3;
            hbn0Var = (hbn0) obj2;
            if (hbn0Var == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "Scooters.Offer: create failed", null, new ScootersOfferCreateException(), String.valueOf(th.getMessage()), 2);
            throw th;
        }
        scootersCreateOfferInteractor$getScooterOffers$1 = new ScootersCreateOfferInteractor$getScooterOffers$1(this, continuationImpl);
        ScootersCreateOfferInteractor$getScooterOffers$1 scootersCreateOfferInteractor$getScooterOffers$122 = scootersCreateOfferInteractor$getScooterOffers$1;
        Object obj22 = scootersCreateOfferInteractor$getScooterOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCreateOfferInteractor$getScooterOffers$122.label;
        int i32 = 9;
        com.yandex.go.scooters.offers.v2.data.a aVar3 = this.e;
        int i42 = 2;
    }
}
