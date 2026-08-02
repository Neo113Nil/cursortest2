package com.yandex.go.payments.paymentlist.details;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.n9a0;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public final tt2 a;
    public final n9a0 b;
    public final List c = Collections.synchronizedList(new ArrayList());
    public final kotlinx.coroutines.sync.a d = gtq0.a();

    public d(tt2 tt2Var, n9a0 n9a0Var) {
        this.a = tt2Var;
        this.b = n9a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsBannersInfoInteractor$forceHideBanner$1 paymentMethodsBannersInfoInteractor$forceHideBanner$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        mdh mdhVar;
        PaymentMethodsBannersInfoInteractor$forceHideBanner$2$1 paymentMethodsBannersInfoInteractor$forceHideBanner$2$1;
        try {
            if (continuationImpl instanceof PaymentMethodsBannersInfoInteractor$forceHideBanner$1) {
                paymentMethodsBannersInfoInteractor$forceHideBanner$1 = (PaymentMethodsBannersInfoInteractor$forceHideBanner$1) continuationImpl;
                int i2 = paymentMethodsBannersInfoInteractor$forceHideBanner$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannersInfoInteractor$forceHideBanner$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentMethodsBannersInfoInteractor$forceHideBanner$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannersInfoInteractor$forceHideBanner$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.d;
                        paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$1 = aVar;
                        paymentMethodsBannersInfoInteractor$forceHideBanner$1.label = 1;
                        if (aVar.a(paymentMethodsBannersInfoInteractor$forceHideBanner$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var2.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$1;
                    str2 = (String) paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$0;
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdhVar = mdh.b;
                    paymentMethodsBannersInfoInteractor$forceHideBanner$2$1 = new PaymentMethodsBannersInfoInteractor$forceHideBanner$2$1(this, str2, null);
                    paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$0 = null;
                    paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$1 = g050Var;
                    paymentMethodsBannersInfoInteractor$forceHideBanner$1.label = 2;
                    if (tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$forceHideBanner$2$1, paymentMethodsBannersInfoInteractor$forceHideBanner$1) != coroutineSingletons) {
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdhVar = mdh.b;
            paymentMethodsBannersInfoInteractor$forceHideBanner$2$1 = new PaymentMethodsBannersInfoInteractor$forceHideBanner$2$1(this, str2, null);
            paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$0 = null;
            paymentMethodsBannersInfoInteractor$forceHideBanner$1.L$1 = g050Var;
            paymentMethodsBannersInfoInteractor$forceHideBanner$1.label = 2;
            if (tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$forceHideBanner$2$1, paymentMethodsBannersInfoInteractor$forceHideBanner$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        paymentMethodsBannersInfoInteractor$forceHideBanner$1 = new PaymentMethodsBannersInfoInteractor$forceHideBanner$1(this, continuationImpl);
        Object obj2 = paymentMethodsBannersInfoInteractor$forceHideBanner$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannersInfoInteractor$forceHideBanner$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1 paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        mdh mdhVar;
        PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1 paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1;
        try {
            if (continuationImpl instanceof PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1) {
                paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1 = (PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1) continuationImpl;
                int i2 = paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.d;
                        paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$1 = aVar;
                        paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label = 1;
                        if (aVar.a(paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var2.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$1;
                    str2 = (String) paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$0;
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdhVar = mdh.b;
                    paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1 = new PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1(this, str2, null);
                    paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$0 = null;
                    paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$1 = g050Var;
                    paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label = 2;
                    if (tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1, paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1) != coroutineSingletons) {
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdhVar = mdh.b;
            paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1 = new PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1(this, str2, null);
            paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$0 = null;
            paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.L$1 = g050Var;
            paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label = 2;
            if (tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$2$1, paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1 = new PaymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1(this, continuationImpl);
        Object obj2 = paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannersInfoInteractor$forceUpdateBannerShowCounter$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsBannersInfoInteractor$getBannerShowCount$1 paymentMethodsBannersInfoInteractor$getBannerShowCount$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof PaymentMethodsBannersInfoInteractor$getBannerShowCount$1) {
                paymentMethodsBannersInfoInteractor$getBannerShowCount$1 = (PaymentMethodsBannersInfoInteractor$getBannerShowCount$1) continuationImpl;
                int i2 = paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label = i2 - Integer.MIN_VALUE;
                    obj = paymentMethodsBannersInfoInteractor$getBannerShowCount$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.d;
                        paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$1 = aVar;
                        paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label = 1;
                        if (aVar.a(paymentMethodsBannersInfoInteractor$getBannerShowCount$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            Integer num = new Integer(((Number) obj).intValue());
                            g050Var2.d(null);
                            return num;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$1;
                    str2 = (String) paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$0;
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PaymentMethodsBannersInfoInteractor$getBannerShowCount$2$1 paymentMethodsBannersInfoInteractor$getBannerShowCount$2$1 = new PaymentMethodsBannersInfoInteractor$getBannerShowCount$2$1(this, str2, null);
                    paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$0 = null;
                    paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$1 = g050Var;
                    paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label = 2;
                    obj = tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$getBannerShowCount$2$1, paymentMethodsBannersInfoInteractor$getBannerShowCount$1);
                    if (obj != coroutineSingletons) {
                        g050Var2 = g050Var;
                        Integer num2 = new Integer(((Number) obj).intValue());
                        g050Var2.d(null);
                        return num2;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdh mdhVar2 = mdh.b;
            PaymentMethodsBannersInfoInteractor$getBannerShowCount$2$1 paymentMethodsBannersInfoInteractor$getBannerShowCount$2$12 = new PaymentMethodsBannersInfoInteractor$getBannerShowCount$2$1(this, str2, null);
            paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$0 = null;
            paymentMethodsBannersInfoInteractor$getBannerShowCount$1.L$1 = g050Var;
            paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label = 2;
            obj = tje.k0(mdhVar2, paymentMethodsBannersInfoInteractor$getBannerShowCount$2$12, paymentMethodsBannersInfoInteractor$getBannerShowCount$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        paymentMethodsBannersInfoInteractor$getBannerShowCount$1 = new PaymentMethodsBannersInfoInteractor$getBannerShowCount$1(this, continuationImpl);
        obj = paymentMethodsBannersInfoInteractor$getBannerShowCount$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannersInfoInteractor$getBannerShowCount$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1 paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        mdh mdhVar;
        PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1 paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1;
        try {
            if (continuationImpl instanceof PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1) {
                paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1 = (PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1) continuationImpl;
                int i2 = paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.d;
                        paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$1 = aVar;
                        paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label = 1;
                        if (aVar.a(paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var2.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$1;
                    str2 = (String) paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$0;
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdhVar = mdh.b;
                    paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1 = new PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1(this, str2, null);
                    paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$0 = null;
                    paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$1 = g050Var;
                    paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label = 2;
                    if (tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1, paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1) != coroutineSingletons) {
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdhVar = mdh.b;
            paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1 = new PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1(this, str2, null);
            paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$0 = null;
            paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.L$1 = g050Var;
            paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label = 2;
            if (tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$2$1, paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1 = new PaymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1(this, continuationImpl);
        Object obj2 = paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannersInfoInteractor$incrementBannerShownCounterIfNeed$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsBannersInfoInteractor$needHideBanner$1 paymentMethodsBannersInfoInteractor$needHideBanner$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof PaymentMethodsBannersInfoInteractor$needHideBanner$1) {
                paymentMethodsBannersInfoInteractor$needHideBanner$1 = (PaymentMethodsBannersInfoInteractor$needHideBanner$1) continuationImpl;
                int i2 = paymentMethodsBannersInfoInteractor$needHideBanner$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannersInfoInteractor$needHideBanner$1.label = i2 - Integer.MIN_VALUE;
                    obj = paymentMethodsBannersInfoInteractor$needHideBanner$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannersInfoInteractor$needHideBanner$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        paymentMethodsBannersInfoInteractor$needHideBanner$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.d;
                        paymentMethodsBannersInfoInteractor$needHideBanner$1.L$1 = aVar;
                        paymentMethodsBannersInfoInteractor$needHideBanner$1.label = 1;
                        if (aVar.a(paymentMethodsBannersInfoInteractor$needHideBanner$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) paymentMethodsBannersInfoInteractor$needHideBanner$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            Boolean bool = (Boolean) obj;
                            bool.getClass();
                            g050Var2.d(null);
                            return bool;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) paymentMethodsBannersInfoInteractor$needHideBanner$1.L$1;
                    str2 = (String) paymentMethodsBannersInfoInteractor$needHideBanner$1.L$0;
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PaymentMethodsBannersInfoInteractor$needHideBanner$2$1 paymentMethodsBannersInfoInteractor$needHideBanner$2$1 = new PaymentMethodsBannersInfoInteractor$needHideBanner$2$1(this, str2, null);
                    paymentMethodsBannersInfoInteractor$needHideBanner$1.L$0 = null;
                    paymentMethodsBannersInfoInteractor$needHideBanner$1.L$1 = g050Var;
                    paymentMethodsBannersInfoInteractor$needHideBanner$1.label = 2;
                    obj = tje.k0(mdhVar, paymentMethodsBannersInfoInteractor$needHideBanner$2$1, paymentMethodsBannersInfoInteractor$needHideBanner$1);
                    if (obj != coroutineSingletons) {
                        g050Var2 = g050Var;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        g050Var2.d(null);
                        return bool2;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdh mdhVar2 = mdh.b;
            PaymentMethodsBannersInfoInteractor$needHideBanner$2$1 paymentMethodsBannersInfoInteractor$needHideBanner$2$12 = new PaymentMethodsBannersInfoInteractor$needHideBanner$2$1(this, str2, null);
            paymentMethodsBannersInfoInteractor$needHideBanner$1.L$0 = null;
            paymentMethodsBannersInfoInteractor$needHideBanner$1.L$1 = g050Var;
            paymentMethodsBannersInfoInteractor$needHideBanner$1.label = 2;
            obj = tje.k0(mdhVar2, paymentMethodsBannersInfoInteractor$needHideBanner$2$12, paymentMethodsBannersInfoInteractor$needHideBanner$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        paymentMethodsBannersInfoInteractor$needHideBanner$1 = new PaymentMethodsBannersInfoInteractor$needHideBanner$1(this, continuationImpl);
        obj = paymentMethodsBannersInfoInteractor$needHideBanner$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannersInfoInteractor$needHideBanner$1.label;
        if (i != 0) {
        }
    }
}
