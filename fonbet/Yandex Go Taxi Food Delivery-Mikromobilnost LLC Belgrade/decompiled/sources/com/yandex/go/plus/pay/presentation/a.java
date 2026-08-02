package com.yandex.go.plus.pay.presentation;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.apd0;
import defpackage.bpd0;
import defpackage.dad0;
import defpackage.fnb0;
import defpackage.fu91;
import defpackage.h55;
import defpackage.i3y;
import defpackage.k7d0;
import defpackage.lad0;
import defpackage.mgd0;
import defpackage.mpd0;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.qgd0;
import defpackage.ted0;
import defpackage.tje;
import defpackage.tt20;
import defpackage.ubd0;
import defpackage.v7d0;
import defpackage.vfd0;
import defpackage.vnd0;
import defpackage.w511;
import defpackage.wnd0;
import defpackage.yod0;
import defpackage.zod0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a extends h55 implements ted0 {
    public final v7d0 D;
    public final PlusPayCompositeOffers.Offer E;
    public final qgd0 F;
    public final lad0 G;

    public a(v7d0 v7d0Var, PlusPayCompositeOffers.Offer offer, qgd0 qgd0Var, lad0 lad0Var) {
        super(null);
        this.D = v7d0Var;
        this.E = offer;
        this.F = qgd0Var;
        this.G = lad0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        if (r1 != r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
    
        if (r1 == r6) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ContinuationImpl continuationImpl) {
        PlusPayRouterImpl$realLaunch$1 plusPayRouterImpl$realLaunch$1;
        int i;
        String str;
        String str2;
        String str3;
        PlusPayPaymentAnalyticsParams.a aVar2;
        String str4;
        String str5;
        String str6;
        lad0 lad0Var = aVar.G;
        PlusPayCompositeOffers.Offer offer = aVar.E;
        v7d0 v7d0Var = aVar.D;
        if (continuationImpl instanceof PlusPayRouterImpl$realLaunch$1) {
            plusPayRouterImpl$realLaunch$1 = (PlusPayRouterImpl$realLaunch$1) continuationImpl;
            int i2 = plusPayRouterImpl$realLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayRouterImpl$realLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPayRouterImpl$realLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayRouterImpl$realLaunch$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.pay.internal.b bVar = (com.yandex.plus.pay.internal.b) v7d0Var;
                    dad0 a = bVar.a();
                    PlusPayPaymentAnalyticsParams.Companion.getClass();
                    PlusPayPaymentAnalyticsParams.a aVar3 = new PlusPayPaymentAnalyticsParams.a();
                    if (lad0Var != null && (str3 = lad0Var.c) != null) {
                        aVar3.c = str3;
                    }
                    if (lad0Var != null && (str2 = lad0Var.a) != null) {
                        aVar3.a = str2;
                    }
                    if (lad0Var != null && (str = lad0Var.b) != null) {
                        aVar3.b = str;
                    }
                    ((ubd0) a).a(new PlusPayPaymentAnalyticsParams(aVar3.a, aVar3.b, aVar3.c, aVar3.d, null), offer);
                    dad0 a2 = bVar.a();
                    PlusPayAnalyticsParams.Companion.getClass();
                    ((ubd0) a2).b(offer, com.yandex.plus.pay.api.analytics.a.b());
                    ((vfd0) ((i3y) bVar.b.c.i).getValue()).a(aVar.E, 0, lad0Var != null ? lad0Var.a : null, lad0Var != null ? lad0Var.b : null, lad0Var != null ? lad0Var.c : null, kotlin.collections.b.f());
                    qgd0 qgd0Var = aVar.F;
                    plusPayRouterImpl$realLaunch$1.label = 1;
                    obj = (com.yandex.plus.pay.ui.core.internal.a) ((i3y) ((oo2) ((mgd0) qgd0Var).a.a).x).getValue();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        bpd0 bpd0Var = (bpd0) obj;
                        boolean z = bpd0Var instanceof yod0;
                        zy11 zy11Var = zy11.a;
                        if (z) {
                            aVar.r(new fnb0(24));
                            return zy11Var;
                        }
                        if (bpd0Var instanceof zod0) {
                            aVar.r(new fnb0(25));
                            return zy11Var;
                        }
                        if (bpd0Var instanceof apd0) {
                            aVar.r(new k7d0(i3, aVar));
                            return zy11Var;
                        }
                        w511.b();
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                mpd0 h = fu91.h((com.yandex.plus.pay.ui.core.internal.a) obj);
                PlusPayPaymentAnalyticsParams.Companion.getClass();
                aVar2 = new PlusPayPaymentAnalyticsParams.a();
                if (lad0Var != null && (str6 = lad0Var.c) != null) {
                    aVar2.c = str6;
                }
                if (lad0Var != null && (str5 = lad0Var.a) != null) {
                    aVar2.a = str5;
                }
                if (lad0Var != null && (str4 = lad0Var.b) != null) {
                    aVar2.b = str4;
                }
                PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams = new PlusPayPaymentAnalyticsParams(aVar2.a, aVar2.b, aVar2.c, aVar2.d, null);
                vnd0 vnd0Var = new vnd0();
                wnd0 wnd0Var = new wnd0(vnd0Var.a, vnd0Var.b);
                plusPayRouterImpl$realLaunch$1.L$0 = null;
                plusPayRouterImpl$realLaunch$1.label = 2;
                obj = ((tt20) h).a(offer, plusPayPaymentAnalyticsParams, wnd0Var, plusPayRouterImpl$realLaunch$1);
            }
        }
        plusPayRouterImpl$realLaunch$1 = new PlusPayRouterImpl$realLaunch$1(aVar, continuationImpl);
        Object obj2 = plusPayRouterImpl$realLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayRouterImpl$realLaunch$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        mpd0 h2 = fu91.h((com.yandex.plus.pay.ui.core.internal.a) obj2);
        PlusPayPaymentAnalyticsParams.Companion.getClass();
        aVar2 = new PlusPayPaymentAnalyticsParams.a();
        if (lad0Var != null) {
            aVar2.c = str6;
        }
        if (lad0Var != null) {
            aVar2.a = str5;
        }
        if (lad0Var != null) {
            aVar2.b = str4;
        }
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams2 = new PlusPayPaymentAnalyticsParams(aVar2.a, aVar2.b, aVar2.c, aVar2.d, null);
        vnd0 vnd0Var2 = new vnd0();
        wnd0 wnd0Var2 = new wnd0(vnd0Var2.a, vnd0Var2.b);
        plusPayRouterImpl$realLaunch$1.L$0 = null;
        plusPayRouterImpl$realLaunch$1.label = 2;
        obj2 = ((tt20) h2).a(offer, plusPayPaymentAnalyticsParams2, wnd0Var2, plusPayRouterImpl$realLaunch$1);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PlusPayRouterImpl$onLaunch$1(this, null), 3);
    }
}
