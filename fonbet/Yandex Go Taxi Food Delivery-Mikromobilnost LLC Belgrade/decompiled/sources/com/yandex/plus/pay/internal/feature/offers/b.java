package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayTestId;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.gio;
import defpackage.i3y;
import defpackage.jbd0;
import defpackage.k2d0;
import defpackage.kpd;
import defpackage.kqd;
import defpackage.lqd;
import defpackage.lyc;
import defpackage.mdd0;
import defpackage.nqd;
import defpackage.ny61;
import defpackage.qqd;
import defpackage.qqx0;
import defpackage.rqd;
import defpackage.tls;
import defpackage.ut91;
import defpackage.vqb;
import defpackage.wfd0;
import defpackage.xca1;
import defpackage.yad0;
import defpackage.zdd0;
import defpackage.zio;
import defpackage.zqx0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class b implements nqd {
    public final com.yandex.plus.pay.graphql.offers.a a;
    public final List b;
    public final com.yandex.plus.experiments.impl.providers.a c;
    public final mdd0 d;
    public final qqx0 e;
    public final wfd0 f;
    public final i3y g = kotlin.a.a(new kpd(3));
    public final i3y h = kotlin.a.a(new kpd(4));
    public final i3y i = kotlin.a.a(new lyc(8, this));

    public b(com.yandex.plus.pay.graphql.offers.a aVar, List list, com.yandex.plus.experiments.impl.providers.a aVar2, mdd0 mdd0Var, qqx0 qqx0Var, wfd0 wfd0Var) {
        this.a = aVar;
        this.b = list;
        this.c = aVar2;
        this.d = mdd0Var;
        this.e = qqx0Var;
        this.f = wfd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|8|(1:(1:(1:(1:(7:14|15|(1:19)|(1:23)|24|(1:28)|29)(2:31|32))(7:33|34|35|(2:37|(1:39))|40|(7:43|15|(2:17|19)|(2:21|23)|24|(2:26|28)|29)|42))(12:44|45|46|47|48|49|50|(1:52)|53|(1:55)|56|(2:58|(3:60|(6:62|34|35|(0)|40|(0))|42)(6:63|35|(0)|40|(0)|42))(2:64|65)))(1:74))(3:93|(1:95)|42)|75|76|77|78|79|80|(9:82|48|49|50|(0)|53|(0)|56|(0)(0))|42))|98|6|7|8|(0)(0)|75|76|77|78|79|80|(0)|42|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0187, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0188, code lost:
    
        r4 = r16;
        r7 = r17;
        r11 = r18;
        r12 = r19;
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        r4 = r16;
        r7 = r17;
        r11 = r18;
        r12 = r19;
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:
    
        r19 = r4;
        r17 = r5;
        r20 = r8;
        r15 = null;
        r16 = r11;
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0193, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0194, code lost:
    
        r19 = r4;
        r17 = r5;
        r20 = r8;
        r15 = null;
        r16 = r11;
        r18 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f4  */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.yandex.plus.pay.internal.feature.offers.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, PlusPayAnalyticsParams plusPayAnalyticsParams, zdd0 zdd0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        CompositeOffersInteractorImpl$getCompositeOffers$1 compositeOffersInteractorImpl$getCompositeOffers$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        tls tlsVar2;
        Object b;
        Ref$BooleanRef ref$BooleanRef;
        boolean z;
        PlusPayAnalyticsParams plusPayAnalyticsParams2;
        wfd0 wfd0Var;
        Object obj;
        boolean z2;
        rqd rqdVar;
        Ref$BooleanRef ref$BooleanRef2;
        tls tlsVar3;
        PlusPayAnalyticsParams plusPayAnalyticsParams3;
        Object e;
        Throwable a;
        Throwable a2;
        PlusPayCompositeOffers d;
        int i2;
        PlusPayAnalyticsParams plusPayAnalyticsParams4;
        Ref$BooleanRef ref$BooleanRef3;
        tls tlsVar4;
        Ref$BooleanRef ref$BooleanRef4;
        int i3;
        ?? r5;
        tls tlsVar5;
        PlusPayAnalyticsParams plusPayAnalyticsParams5;
        PlusPayCompositeOffers plusPayCompositeOffers;
        zqx0 zqx0Var;
        PlusPayCompositeOffers copy$default;
        try {
            if (continuationImpl instanceof CompositeOffersInteractorImpl$getCompositeOffers$1) {
                compositeOffersInteractorImpl$getCompositeOffers$1 = (CompositeOffersInteractorImpl$getCompositeOffers$1) continuationImpl;
                int i4 = compositeOffersInteractorImpl$getCompositeOffers$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    compositeOffersInteractorImpl$getCompositeOffers$1.label = i4 - Integer.MIN_VALUE;
                    CompositeOffersInteractorImpl$getCompositeOffers$1 compositeOffersInteractorImpl$getCompositeOffers$12 = compositeOffersInteractorImpl$getCompositeOffers$1;
                    Object obj2 = compositeOffersInteractorImpl$getCompositeOffers$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = compositeOffersInteractorImpl$getCompositeOffers$12.label;
                    mdd0 mdd0Var = this.d;
                    wfd0 wfd0Var2 = this.f;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        mdd0.c(mdd0Var, PayCoreLogTag.OFFERS, "Start loading composite offers");
                        Ref$BooleanRef ref$BooleanRef5 = new Ref$BooleanRef();
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = null;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = null;
                        tlsVar2 = tlsVar;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar2;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef5;
                        compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = false;
                        compositeOffersInteractorImpl$getCompositeOffers$12.label = 1;
                        b = b(str, zdd0Var, plusPayAnalyticsParams, compositeOffersInteractorImpl$getCompositeOffers$12);
                        if (b != coroutineSingletons) {
                            ref$BooleanRef = ref$BooleanRef5;
                            z = false;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ref$BooleanRef3 = (Ref$BooleanRef) compositeOffersInteractorImpl$getCompositeOffers$12.L$4;
                                tlsVar5 = (tls) compositeOffersInteractorImpl$getCompositeOffers$12.L$3;
                                plusPayAnalyticsParams5 = (PlusPayAnalyticsParams) compositeOffersInteractorImpl$getCompositeOffers$12.L$1;
                                kotlin.b.b(obj2);
                                wfd0Var = wfd0Var2;
                                plusPayCompositeOffers = (PlusPayCompositeOffers) obj2;
                                ((zio) this.e).d(plusPayCompositeOffers, plusPayAnalyticsParams5);
                                if (!ref$BooleanRef3.element && plusPayCompositeOffers.getOffers().isEmpty()) {
                                    ref$BooleanRef3.element = true;
                                    ((zqx0) wfd0Var).a.c(plusPayCompositeOffers.getSessionId(), EvgenOffersAnalytics$LoadReason.Default, plusPayCompositeOffers.getTarget(), "In-app store returned empty list of offers");
                                }
                                if (tlsVar5 != null && (copy$default = PlusPayCompositeOffers.copy$default(plusPayCompositeOffers, null, null, (List) tlsVar5.invoke(plusPayCompositeOffers.getOffers()), null, 11, null)) != null) {
                                    plusPayCompositeOffers = copy$default;
                                }
                                zqx0Var = (zqx0) wfd0Var;
                                zqx0Var.a(plusPayCompositeOffers);
                                if (!ref$BooleanRef3.element && plusPayCompositeOffers.getOffers().isEmpty()) {
                                    zqx0Var.a.c(plusPayCompositeOffers.getSessionId(), EvgenOffersAnalytics$LoadReason.Default, plusPayCompositeOffers.getTarget(), "Client filtered and got empty list of offers");
                                }
                                return plusPayCompositeOffers;
                            }
                            i3 = compositeOffersInteractorImpl$getCompositeOffers$12.I$1;
                            int i5 = compositeOffersInteractorImpl$getCompositeOffers$12.I$0;
                            z2 = compositeOffersInteractorImpl$getCompositeOffers$12.Z$0;
                            d = (PlusPayCompositeOffers) compositeOffersInteractorImpl$getCompositeOffers$12.L$7;
                            ref$BooleanRef4 = (Ref$BooleanRef) compositeOffersInteractorImpl$getCompositeOffers$12.L$4;
                            tlsVar4 = (tls) compositeOffersInteractorImpl$getCompositeOffers$12.L$3;
                            plusPayAnalyticsParams4 = (PlusPayAnalyticsParams) compositeOffersInteractorImpl$getCompositeOffers$12.L$1;
                            kotlin.b.b(obj2);
                            wfd0Var = wfd0Var2;
                            i2 = i5;
                            obj = null;
                            r5 = i3;
                            ref$BooleanRef3 = ref$BooleanRef4;
                            if (d.getOffers().isEmpty()) {
                                ref$BooleanRef3.element = true;
                                if (r5 != 0) {
                                    ((zqx0) wfd0Var).a.c(d.getSessionId(), EvgenOffersAnalytics$LoadReason.Default, d.getTarget(), "Backend returned empty list of offers");
                                }
                            }
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams4;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar4;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef3;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$5 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$6 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$7 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$8 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = z2;
                            compositeOffersInteractorImpl$getCompositeOffers$12.I$0 = i2;
                            compositeOffersInteractorImpl$getCompositeOffers$12.I$1 = r5;
                            compositeOffersInteractorImpl$getCompositeOffers$12.label = 4;
                            obj2 = c(d, compositeOffersInteractorImpl$getCompositeOffers$12);
                            if (obj2 != coroutineSingletons) {
                                tlsVar5 = tlsVar4;
                                plusPayAnalyticsParams5 = plusPayAnalyticsParams4;
                                plusPayCompositeOffers = (PlusPayCompositeOffers) obj2;
                                ((zio) this.e).d(plusPayCompositeOffers, plusPayAnalyticsParams5);
                                if (!ref$BooleanRef3.element) {
                                    ref$BooleanRef3.element = true;
                                    ((zqx0) wfd0Var).a.c(plusPayCompositeOffers.getSessionId(), EvgenOffersAnalytics$LoadReason.Default, plusPayCompositeOffers.getTarget(), "In-app store returned empty list of offers");
                                }
                                if (tlsVar5 != null) {
                                    plusPayCompositeOffers = copy$default;
                                }
                                zqx0Var = (zqx0) wfd0Var;
                                zqx0Var.a(plusPayCompositeOffers);
                                if (!ref$BooleanRef3.element) {
                                    zqx0Var.a.c(plusPayCompositeOffers.getSessionId(), EvgenOffersAnalytics$LoadReason.Default, plusPayCompositeOffers.getTarget(), "Client filtered and got empty list of offers");
                                }
                                return plusPayCompositeOffers;
                            }
                            return coroutineSingletons;
                        }
                        z2 = compositeOffersInteractorImpl$getCompositeOffers$12.Z$0;
                        rqdVar = (rqd) compositeOffersInteractorImpl$getCompositeOffers$12.L$5;
                        ref$BooleanRef2 = (Ref$BooleanRef) compositeOffersInteractorImpl$getCompositeOffers$12.L$4;
                        tlsVar3 = (tls) compositeOffersInteractorImpl$getCompositeOffers$12.L$3;
                        plusPayAnalyticsParams3 = (PlusPayAnalyticsParams) compositeOffersInteractorImpl$getCompositeOffers$12.L$1;
                        try {
                            kotlin.b.b(obj2);
                            wfd0Var = wfd0Var2;
                            obj = null;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            wfd0Var = wfd0Var2;
                            obj = null;
                            obj2 = new Result.Failure(e);
                            PlusPayAnalyticsParams plusPayAnalyticsParams6 = plusPayAnalyticsParams3;
                            if (!(obj2 instanceof Result.Failure)) {
                            }
                            a = Result.a(obj2);
                            if (a != null) {
                            }
                            a2 = Result.a(obj2);
                            if (a2 == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            wfd0Var = wfd0Var2;
                            obj = null;
                            obj2 = new Result.Failure(th);
                            PlusPayAnalyticsParams plusPayAnalyticsParams62 = plusPayAnalyticsParams3;
                            if (!(obj2 instanceof Result.Failure)) {
                            }
                            a = Result.a(obj2);
                            if (a != null) {
                            }
                            a2 = Result.a(obj2);
                            if (a2 == null) {
                            }
                        }
                        PlusPayAnalyticsParams plusPayAnalyticsParams622 = plusPayAnalyticsParams3;
                        if (!(obj2 instanceof Result.Failure)) {
                            mdd0.c(mdd0Var, PayCoreLogTag.OFFERS, "Got composite offers successfully");
                        }
                        a = Result.a(obj2);
                        if (a != null) {
                            mdd0.g(mdd0Var, PayCoreLogTag.OFFERS, "Error when receiving composite offers.", a, 8);
                        }
                        a2 = Result.a(obj2);
                        if (a2 == null) {
                            throw xca1.e(a2);
                        }
                        lqd lqdVar = (lqd) obj2;
                        boolean z3 = lqdVar instanceof kqd;
                        d = ((yad0) this.i.getValue()).d(rqdVar.a, lqdVar.a());
                        if (!z3) {
                            i2 = 0;
                            tls tlsVar6 = tlsVar3;
                            plusPayAnalyticsParams4 = plusPayAnalyticsParams622;
                            ref$BooleanRef3 = ref$BooleanRef2;
                            tlsVar4 = tlsVar6;
                            r5 = z3;
                            if (d.getOffers().isEmpty()) {
                            }
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams4;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar4;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef3;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$5 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$6 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$7 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$8 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = z2;
                            compositeOffersInteractorImpl$getCompositeOffers$12.I$0 = i2;
                            compositeOffersInteractorImpl$getCompositeOffers$12.I$1 = r5;
                            compositeOffersInteractorImpl$getCompositeOffers$12.label = 4;
                            obj2 = c(d, compositeOffersInteractorImpl$getCompositeOffers$12);
                            if (obj2 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = obj;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams622;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = obj;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar3;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef2;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$5 = obj;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$6 = obj;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$7 = d;
                        compositeOffersInteractorImpl$getCompositeOffers$12.L$8 = obj;
                        compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = z2;
                        i2 = 0;
                        compositeOffersInteractorImpl$getCompositeOffers$12.I$0 = 0;
                        compositeOffersInteractorImpl$getCompositeOffers$12.I$1 = z3 ? 1 : 0;
                        compositeOffersInteractorImpl$getCompositeOffers$12.label = 3;
                        if (d(d, plusPayAnalyticsParams622, compositeOffersInteractorImpl$getCompositeOffers$12) != coroutineSingletons) {
                            ref$BooleanRef4 = ref$BooleanRef2;
                            tlsVar4 = tlsVar3;
                            plusPayAnalyticsParams4 = plusPayAnalyticsParams622;
                            i3 = z3 ? 1 : 0;
                            r5 = i3;
                            ref$BooleanRef3 = ref$BooleanRef4;
                            if (d.getOffers().isEmpty()) {
                            }
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams4;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar4;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef3;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$5 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$6 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$7 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.L$8 = obj;
                            compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = z2;
                            compositeOffersInteractorImpl$getCompositeOffers$12.I$0 = i2;
                            compositeOffersInteractorImpl$getCompositeOffers$12.I$1 = r5;
                            compositeOffersInteractorImpl$getCompositeOffers$12.label = 4;
                            obj2 = c(d, compositeOffersInteractorImpl$getCompositeOffers$12);
                            if (obj2 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    boolean z4 = compositeOffersInteractorImpl$getCompositeOffers$12.Z$0;
                    Ref$BooleanRef ref$BooleanRef6 = (Ref$BooleanRef) compositeOffersInteractorImpl$getCompositeOffers$12.L$4;
                    tls tlsVar7 = (tls) compositeOffersInteractorImpl$getCompositeOffers$12.L$3;
                    PlusPayAnalyticsParams plusPayAnalyticsParams7 = (PlusPayAnalyticsParams) compositeOffersInteractorImpl$getCompositeOffers$12.L$1;
                    kotlin.b.b(obj2);
                    b = obj2;
                    plusPayAnalyticsParams2 = plusPayAnalyticsParams7;
                    ref$BooleanRef = ref$BooleanRef6;
                    tlsVar2 = tlsVar7;
                    z = z4;
                    rqd rqdVar2 = (rqd) b;
                    vqb vqbVar = new vqb(14, this);
                    CompositeOffersInteractorImpl$getCompositeOffers$2$2 compositeOffersInteractorImpl$getCompositeOffers$2$2 = new CompositeOffersInteractorImpl$getCompositeOffers$2$2(this, plusPayAnalyticsParams2, rqdVar2, null);
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = null;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams2;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = null;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar2;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$5 = rqdVar2;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$6 = null;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$7 = null;
                    compositeOffersInteractorImpl$getCompositeOffers$12.L$8 = null;
                    compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = z;
                    compositeOffersInteractorImpl$getCompositeOffers$12.I$0 = 0;
                    compositeOffersInteractorImpl$getCompositeOffers$12.I$1 = 0;
                    compositeOffersInteractorImpl$getCompositeOffers$12.label = 2;
                    rqd rqdVar3 = rqdVar2;
                    Ref$BooleanRef ref$BooleanRef7 = ref$BooleanRef;
                    tls tlsVar8 = tlsVar2;
                    wfd0Var = wfd0Var2;
                    boolean z5 = z;
                    obj = null;
                    e = com.yandex.plus.home.common.utils.a.e(15, 5000L, 5000L, 1.0d, vqbVar, compositeOffersInteractorImpl$getCompositeOffers$2$2, compositeOffersInteractorImpl$getCompositeOffers$12);
                    if (e != coroutineSingletons) {
                        z2 = z5;
                        rqdVar = rqdVar3;
                        ref$BooleanRef2 = ref$BooleanRef7;
                        tlsVar3 = tlsVar8;
                        plusPayAnalyticsParams3 = plusPayAnalyticsParams2;
                        obj2 = e;
                        PlusPayAnalyticsParams plusPayAnalyticsParams6222 = plusPayAnalyticsParams3;
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        a2 = Result.a(obj2);
                        if (a2 == null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            rqd rqdVar22 = (rqd) b;
            vqb vqbVar2 = new vqb(14, this);
            CompositeOffersInteractorImpl$getCompositeOffers$2$2 compositeOffersInteractorImpl$getCompositeOffers$2$22 = new CompositeOffersInteractorImpl$getCompositeOffers$2$2(this, plusPayAnalyticsParams2, rqdVar22, null);
            compositeOffersInteractorImpl$getCompositeOffers$12.L$0 = null;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams2;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$2 = null;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$3 = tlsVar2;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$4 = ref$BooleanRef;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$5 = rqdVar22;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$6 = null;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$7 = null;
            compositeOffersInteractorImpl$getCompositeOffers$12.L$8 = null;
            compositeOffersInteractorImpl$getCompositeOffers$12.Z$0 = z;
            compositeOffersInteractorImpl$getCompositeOffers$12.I$0 = 0;
            compositeOffersInteractorImpl$getCompositeOffers$12.I$1 = 0;
            compositeOffersInteractorImpl$getCompositeOffers$12.label = 2;
            rqd rqdVar32 = rqdVar22;
            Ref$BooleanRef ref$BooleanRef72 = ref$BooleanRef;
            tls tlsVar82 = tlsVar2;
            wfd0Var = wfd0Var2;
            boolean z52 = z;
            obj = null;
            e = com.yandex.plus.home.common.utils.a.e(15, 5000L, 5000L, 1.0d, vqbVar2, compositeOffersInteractorImpl$getCompositeOffers$2$22, compositeOffersInteractorImpl$getCompositeOffers$12);
            if (e != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e3) {
            throw e3;
        }
        compositeOffersInteractorImpl$getCompositeOffers$1 = new CompositeOffersInteractorImpl$getCompositeOffers$1(this, continuationImpl);
        CompositeOffersInteractorImpl$getCompositeOffers$1 compositeOffersInteractorImpl$getCompositeOffers$122 = compositeOffersInteractorImpl$getCompositeOffers$1;
        Object obj22 = compositeOffersInteractorImpl$getCompositeOffers$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeOffersInteractorImpl$getCompositeOffers$122.label;
        mdd0 mdd0Var2 = this.d;
        wfd0 wfd0Var22 = this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rqd b(String str, zdd0 zdd0Var, PlusPayAnalyticsParams plusPayAnalyticsParams, ContinuationImpl continuationImpl) {
        CompositeOffersInteractorImpl$prepareArguments$1 compositeOffersInteractorImpl$prepareArguments$1;
        int i;
        rqd rqdVar;
        Iterator it;
        int i2;
        boolean z;
        if (continuationImpl instanceof CompositeOffersInteractorImpl$prepareArguments$1) {
            compositeOffersInteractorImpl$prepareArguments$1 = (CompositeOffersInteractorImpl$prepareArguments$1) continuationImpl;
            int i3 = compositeOffersInteractorImpl$prepareArguments$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                compositeOffersInteractorImpl$prepareArguments$1.label = i3 - Integer.MIN_VALUE;
                Object obj = compositeOffersInteractorImpl$prepareArguments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeOffersInteractorImpl$prepareArguments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rqdVar = new rqd(str, zdd0Var, plusPayAnalyticsParams);
                    it = EmptyList.a.iterator();
                    i2 = 0;
                    z = false;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = compositeOffersInteractorImpl$prepareArguments$1.I$0;
                    z = compositeOffersInteractorImpl$prepareArguments$1.Z$0;
                    if (compositeOffersInteractorImpl$prepareArguments$1.L$8 != null) {
                        ny61.u();
                        return null;
                    }
                    it = (Iterator) compositeOffersInteractorImpl$prepareArguments$1.L$6;
                    kotlin.b.b(obj);
                    rqdVar = (rqd) obj;
                }
                if (it.hasNext()) {
                    return rqdVar;
                }
                if (it.next() != null) {
                    ny61.u();
                    return null;
                }
                compositeOffersInteractorImpl$prepareArguments$1.L$0 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$1 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$2 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$3 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$4 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$5 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$6 = it;
                compositeOffersInteractorImpl$prepareArguments$1.L$7 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$8 = null;
                compositeOffersInteractorImpl$prepareArguments$1.L$9 = null;
                compositeOffersInteractorImpl$prepareArguments$1.Z$0 = z;
                compositeOffersInteractorImpl$prepareArguments$1.I$0 = i2;
                compositeOffersInteractorImpl$prepareArguments$1.I$1 = 0;
                compositeOffersInteractorImpl$prepareArguments$1.label = 1;
                throw null;
            }
        }
        compositeOffersInteractorImpl$prepareArguments$1 = new CompositeOffersInteractorImpl$prepareArguments$1(this, continuationImpl);
        Object obj2 = compositeOffersInteractorImpl$prepareArguments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeOffersInteractorImpl$prepareArguments$1.label;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0081 -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayCompositeOffers plusPayCompositeOffers, ContinuationImpl continuationImpl) {
        CompositeOffersInteractorImpl$prepareOffers$1 compositeOffersInteractorImpl$prepareOffers$1;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers2;
        Iterator it;
        int i2;
        if (continuationImpl instanceof CompositeOffersInteractorImpl$prepareOffers$1) {
            compositeOffersInteractorImpl$prepareOffers$1 = (CompositeOffersInteractorImpl$prepareOffers$1) continuationImpl;
            int i3 = compositeOffersInteractorImpl$prepareOffers$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                compositeOffersInteractorImpl$prepareOffers$1.label = i3 - Integer.MIN_VALUE;
                Object obj = compositeOffersInteractorImpl$prepareOffers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeOffersInteractorImpl$prepareOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPayCompositeOffers2 = plusPayCompositeOffers;
                    it = this.b.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = compositeOffersInteractorImpl$prepareOffers$1.I$0;
                    it = (Iterator) compositeOffersInteractorImpl$prepareOffers$1.L$4;
                    kotlin.b.b(obj);
                    plusPayCompositeOffers2 = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        qqd qqdVar = (qqd) it.next();
                        compositeOffersInteractorImpl$prepareOffers$1.L$0 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.L$1 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.L$2 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.L$3 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.L$4 = it;
                        compositeOffersInteractorImpl$prepareOffers$1.L$5 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.L$6 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.L$7 = null;
                        compositeOffersInteractorImpl$prepareOffers$1.I$0 = i2;
                        compositeOffersInteractorImpl$prepareOffers$1.I$1 = 0;
                        compositeOffersInteractorImpl$prepareOffers$1.label = 1;
                        obj = qqdVar.a(plusPayCompositeOffers2, compositeOffersInteractorImpl$prepareOffers$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plusPayCompositeOffers2 = (PlusPayCompositeOffers) obj;
                        if (it.hasNext()) {
                            return plusPayCompositeOffers2;
                        }
                    }
                }
            }
        }
        compositeOffersInteractorImpl$prepareOffers$1 = new CompositeOffersInteractorImpl$prepareOffers$1(this, continuationImpl);
        Object obj2 = compositeOffersInteractorImpl$prepareOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeOffersInteractorImpl$prepareOffers$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlusPayCompositeOffers plusPayCompositeOffers, PlusPayAnalyticsParams plusPayAnalyticsParams, ContinuationImpl continuationImpl) {
        CompositeOffersInteractorImpl$reportSessionStart$1 compositeOffersInteractorImpl$reportSessionStart$1;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers2;
        PlusPayAnalyticsParams plusPayAnalyticsParams2;
        String str;
        String str2;
        if (continuationImpl instanceof CompositeOffersInteractorImpl$reportSessionStart$1) {
            compositeOffersInteractorImpl$reportSessionStart$1 = (CompositeOffersInteractorImpl$reportSessionStart$1) continuationImpl;
            int i2 = compositeOffersInteractorImpl$reportSessionStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositeOffersInteractorImpl$reportSessionStart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compositeOffersInteractorImpl$reportSessionStart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeOffersInteractorImpl$reportSessionStart$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPayCompositeOffers2 = plusPayCompositeOffers;
                    compositeOffersInteractorImpl$reportSessionStart$1.L$0 = plusPayCompositeOffers2;
                    compositeOffersInteractorImpl$reportSessionStart$1.L$1 = plusPayAnalyticsParams;
                    compositeOffersInteractorImpl$reportSessionStart$1.label = 1;
                    if (this.c.g(compositeOffersInteractorImpl$reportSessionStart$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayAnalyticsParams2 = (PlusPayAnalyticsParams) compositeOffersInteractorImpl$reportSessionStart$1.L$1;
                    PlusPayCompositeOffers plusPayCompositeOffers3 = (PlusPayCompositeOffers) compositeOffersInteractorImpl$reportSessionStart$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    plusPayCompositeOffers2 = plusPayCompositeOffers3;
                }
                String externalAnalyticsId = plusPayAnalyticsParams2.getExternalAnalyticsId();
                Set<PlusPayTestId> externalTestIds = plusPayAnalyticsParams2.getExternalTestIds();
                String m = externalTestIds == null ? ut91.m(externalTestIds) : null;
                Set<PlusPayTestId> externalTriggeredTestIds = plusPayAnalyticsParams2.getExternalTriggeredTestIds();
                String m2 = externalTriggeredTestIds != null ? ut91.m(externalTriggeredTestIds) : null;
                Map<String, String> clientParams = plusPayAnalyticsParams2.getClientParams();
                zqx0 zqx0Var = (zqx0) this.f;
                jbd0 jbd0Var = zqx0Var.b;
                gio gioVar = zqx0Var.a;
                String sessionId = plusPayCompositeOffers2.getSessionId();
                String str3 = zqx0Var.c;
                String str4 = zqx0Var.d;
                String str5 = str4 != null ? "no_value" : str4;
                String str6 = externalAnalyticsId != null ? "no_value" : externalAnalyticsId;
                k2d0 k2d0Var = (k2d0) jbd0Var.invoke();
                String str7 = (k2d0Var != null || (str2 = k2d0Var.a) == null) ? "no_value" : str2;
                k2d0 k2d0Var2 = (k2d0) jbd0Var.invoke();
                gioVar.b(sessionId, str3, str5, str6, str7, (k2d0Var2 != null || (str = k2d0Var2.b) == null) ? "no_value" : str, m != null ? "no_value" : m, m2 != null ? "no_value" : m2, clientParams);
                return zy11.a;
            }
        }
        compositeOffersInteractorImpl$reportSessionStart$1 = new CompositeOffersInteractorImpl$reportSessionStart$1(this, continuationImpl);
        Object obj2 = compositeOffersInteractorImpl$reportSessionStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeOffersInteractorImpl$reportSessionStart$1.label;
        if (i != 0) {
        }
        String externalAnalyticsId2 = plusPayAnalyticsParams2.getExternalAnalyticsId();
        Set<PlusPayTestId> externalTestIds2 = plusPayAnalyticsParams2.getExternalTestIds();
        if (externalTestIds2 == null) {
        }
        Set<PlusPayTestId> externalTriggeredTestIds2 = plusPayAnalyticsParams2.getExternalTriggeredTestIds();
        if (externalTriggeredTestIds2 != null) {
        }
        Map<String, String> clientParams2 = plusPayAnalyticsParams2.getClientParams();
        zqx0 zqx0Var2 = (zqx0) this.f;
        jbd0 jbd0Var2 = zqx0Var2.b;
        gio gioVar2 = zqx0Var2.a;
        String sessionId2 = plusPayCompositeOffers2.getSessionId();
        String str32 = zqx0Var2.c;
        String str42 = zqx0Var2.d;
        if (str42 != null) {
        }
        if (externalAnalyticsId2 != null) {
        }
        k2d0 k2d0Var3 = (k2d0) jbd0Var2.invoke();
        if (k2d0Var3 != null) {
        }
        k2d0 k2d0Var22 = (k2d0) jbd0Var2.invoke();
        gioVar2.b(sessionId2, str32, str5, str6, str7, (k2d0Var22 != null || (str = k2d0Var22.b) == null) ? "no_value" : str, m != null ? "no_value" : m, m2 != null ? "no_value" : m2, clientParams2);
        return zy11.a;
    }
}
