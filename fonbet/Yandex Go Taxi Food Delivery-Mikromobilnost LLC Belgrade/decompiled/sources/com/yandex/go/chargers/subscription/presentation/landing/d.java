package com.yandex.go.chargers.subscription.presentation.landing;

import defpackage.ahd0;
import defpackage.ata;
import defpackage.b64;
import defpackage.bta;
import defpackage.cta;
import defpackage.cy9;
import defpackage.eed0;
import defpackage.em9;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.nta;
import defpackage.ny61;
import defpackage.qta;
import defpackage.qu;
import defpackage.rta;
import defpackage.sta;
import defpackage.ted0;
import defpackage.tta;
import defpackage.uta;
import defpackage.w511;
import defpackage.zta;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final em9 a;
    public final h3y b;
    public final com.yandex.go.chargers.error.data.a c;
    public final zta d;

    public d(em9 em9Var, h3y h3yVar, com.yandex.go.chargers.error.data.a aVar, zta ztaVar) {
        this.a = em9Var;
        this.b = h3yVar;
        this.c = aVar;
        this.d = ztaVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:18|19))(3:20|21|22))(2:23|24))(3:25|26|27))(2:31|(1:33)(2:34|(1:36)(3:37|(2:39|40)(2:42|(2:44|(2:46|14))(2:47|48))|29)))|15|16))|52|6|7|(0)(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        if (kotlinx.coroutines.a.i(500, r4) == r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if (b(r1, r18, r4) == r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        r4.L$0 = null;
        r4.L$1 = null;
        r4.L$2 = r0;
        r4.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        if (kotlinx.coroutines.a.i(500, r4) != r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uta utaVar, nta ntaVar, ContinuationImpl continuationImpl) {
        ChargersSubscriptionLandingUiActionInteractor$handleAction$1 chargersSubscriptionLandingUiActionInteractor$handleAction$1;
        int i;
        nta ntaVar2;
        if (continuationImpl instanceof ChargersSubscriptionLandingUiActionInteractor$handleAction$1) {
            chargersSubscriptionLandingUiActionInteractor$handleAction$1 = (ChargersSubscriptionLandingUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = chargersSubscriptionLandingUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSubscriptionLandingUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersSubscriptionLandingUiActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSubscriptionLandingUiActionInteractor$handleAction$1.label;
                zta ztaVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = utaVar instanceof tta;
                    em9 em9Var = this.a;
                    if (z) {
                        em9Var.a.a("Chargers.PlusOptionOfferDetail.Shown", b64.w(em9Var), 1, new HashMap());
                    } else {
                        if (!(utaVar instanceof qta)) {
                            if (utaVar instanceof sta) {
                                em9Var.a.a("Chargers.PlusOptionOfferDetail.Tapped", b64.w(em9Var), 1, new HashMap());
                                ztaVar.a(true);
                                cta ctaVar = ((sta) utaVar).a;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$0 = null;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$1 = null;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.label = 1;
                            } else {
                                if (!(utaVar instanceof rta)) {
                                    w511.b();
                                    return null;
                                }
                                Throwable th = ((rta) utaVar).a;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$0 = null;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$1 = null;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$2 = ntaVar;
                                chargersSubscriptionLandingUiActionInteractor$handleAction$1.label = 4;
                                obj = this.c.a(th, chargersSubscriptionLandingUiActionInteractor$handleAction$1);
                                if (obj != obj2) {
                                    ntaVar2 = ntaVar;
                                    ntaVar2.a((cy9) obj);
                                }
                            }
                            return obj2;
                        }
                        ztaVar.a(false);
                        em9Var.getClass();
                        em9Var.a.a("Chargers.PlusOptionOfferDetail.Closed", new HashMap(), 1, new HashMap());
                        ntaVar.a.r(new qu(9));
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                    chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$0 = null;
                    chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$1 = null;
                    chargersSubscriptionLandingUiActionInteractor$handleAction$1.label = 2;
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    ztaVar.a(false);
                } else {
                    if (i == 3) {
                        th = (Throwable) chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$2;
                        kotlin.b.b(obj);
                        ztaVar.a(false);
                        throw th;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ntaVar2 = (nta) chargersSubscriptionLandingUiActionInteractor$handleAction$1.L$2;
                    kotlin.b.b(obj);
                    ntaVar2.a((cy9) obj);
                }
                return zy11.a;
            }
        }
        chargersSubscriptionLandingUiActionInteractor$handleAction$1 = new ChargersSubscriptionLandingUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = chargersSubscriptionLandingUiActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSubscriptionLandingUiActionInteractor$handleAction$1.label;
        zta ztaVar2 = this.d;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(2:22|(2:24|(2:26|27))(2:28|(3:30|13|14)(2:31|32)))|20|13|14))|39|6|7|(0)(0)|20|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = r8;
        r0.label = 2;
        r9 = r6.c.a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cta ctaVar, nta ntaVar, ContinuationImpl continuationImpl) {
        ChargersSubscriptionLandingUiActionInteractor$handleButtonAction$1 chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1;
        int i;
        if (continuationImpl instanceof ChargersSubscriptionLandingUiActionInteractor$handleButtonAction$1) {
            chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1 = (ChargersSubscriptionLandingUiActionInteractor$handleButtonAction$1) continuationImpl;
            int i2 = chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ctaVar instanceof ata)) {
                        if (jl40.l(ctaVar, bta.a)) {
                            ntaVar.a.r(new qu(9));
                            return zy11.a;
                        }
                        w511.b();
                        return null;
                    }
                    ahd0 ahd0Var = (ahd0) this.b.get();
                    eed0 eed0Var = ((ata) ctaVar).a;
                    chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.L$0 = null;
                    chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.L$1 = ntaVar;
                    chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.label = 1;
                    obj = ((com.yandex.go.plus.pay.a) ahd0Var).a(eed0Var, chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nta ntaVar2 = (nta) chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.L$4;
                        kotlin.b.b(obj);
                        ntaVar2.a((cy9) obj);
                        return zy11.a;
                    }
                    ntaVar = (nta) chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.L$1;
                    kotlin.b.b(obj);
                }
                ntaVar.b((ted0) obj);
                return zy11.a;
            }
        }
        chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1 = new ChargersSubscriptionLandingUiActionInteractor$handleButtonAction$1(this, continuationImpl);
        Object obj2 = chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSubscriptionLandingUiActionInteractor$handleButtonAction$1.label;
        if (i != 0) {
        }
        ntaVar.b((ted0) obj2);
        return zy11.a;
    }
}
