package com.yandex.plus.home.payment.google;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$GoogleBillingConfig;
import defpackage.bfd0;
import defpackage.dtt;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.skd0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class a {
    public final bfd0 a;
    public final b b;

    public a(bfd0 bfd0Var, b bVar) {
        this.a = bfd0Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        GoogleBillingConfigInteractorImpl$resolveConfig$1 googleBillingConfigInteractorImpl$resolveConfig$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof GoogleBillingConfigInteractorImpl$resolveConfig$1) {
            googleBillingConfigInteractorImpl$resolveConfig$1 = (GoogleBillingConfigInteractorImpl$resolveConfig$1) continuationImpl;
            int i2 = googleBillingConfigInteractorImpl$resolveConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBillingConfigInteractorImpl$resolveConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBillingConfigInteractorImpl$resolveConfig$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBillingConfigInteractorImpl$resolveConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    googleBillingConfigInteractorImpl$resolveConfig$1.label = 2;
                    obj = aVar.c(googleBillingConfigInteractorImpl$resolveConfig$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new dtt(((dtt) obj).a, true);
            }
        }
        googleBillingConfigInteractorImpl$resolveConfig$1 = new GoogleBillingConfigInteractorImpl$resolveConfig$1(aVar, continuationImpl);
        Object obj3 = googleBillingConfigInteractorImpl$resolveConfig$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBillingConfigInteractorImpl$resolveConfig$1.label;
        if (i != 0) {
        }
        return new dtt(((dtt) obj3).a, true);
    }

    public final Object b(ContinuationImpl continuationImpl) {
        return this.b.a(new GoogleBillingConfigInteractorImpl$getConfig$2(this, null), continuationImpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|33|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GoogleBillingConfigInteractorImpl$getConfigFromPay$1 googleBillingConfigInteractorImpl$getConfigFromPay$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof GoogleBillingConfigInteractorImpl$getConfigFromPay$1) {
            googleBillingConfigInteractorImpl$getConfigFromPay$1 = (GoogleBillingConfigInteractorImpl$getConfigFromPay$1) continuationImpl;
            int i2 = googleBillingConfigInteractorImpl$getConfigFromPay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBillingConfigInteractorImpl$getConfigFromPay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBillingConfigInteractorImpl$getConfigFromPay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBillingConfigInteractorImpl$getConfigFromPay$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o430 o430Var = e3n.b;
                    long U = kp50.U(3, DurationUnit.SECONDS);
                    GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1 googleBillingConfigInteractorImpl$getConfigFromPay$2$1 = new GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1(this, null);
                    googleBillingConfigInteractorImpl$getConfigFromPay$1.L$0 = null;
                    googleBillingConfigInteractorImpl$getConfigFromPay$1.L$1 = null;
                    googleBillingConfigInteractorImpl$getConfigFromPay$1.L$2 = null;
                    googleBillingConfigInteractorImpl$getConfigFromPay$1.I$0 = 0;
                    googleBillingConfigInteractorImpl$getConfigFromPay$1.I$1 = 0;
                    googleBillingConfigInteractorImpl$getConfigFromPay$1.label = 1;
                    obj = kotlinx.coroutines.a.v(U, googleBillingConfigInteractorImpl$getConfigFromPay$2$1, googleBillingConfigInteractorImpl$getConfigFromPay$1);
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
                a = Result.a(obj);
                if (a == null) {
                    skd0.c(PlusLogTag.BILLING, String.valueOf(a), null);
                    return new dtt("UNDEFINED", true);
                }
                PlusPaySdkAdapter$GoogleBillingConfig plusPaySdkAdapter$GoogleBillingConfig = (PlusPaySdkAdapter$GoogleBillingConfig) obj;
                return new dtt(plusPaySdkAdapter$GoogleBillingConfig.getGoogleCountryCode(), plusPaySdkAdapter$GoogleBillingConfig.isNativePaymentAllowed());
            }
        }
        googleBillingConfigInteractorImpl$getConfigFromPay$1 = new GoogleBillingConfigInteractorImpl$getConfigFromPay$1(this, continuationImpl);
        Object obj2 = googleBillingConfigInteractorImpl$getConfigFromPay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBillingConfigInteractorImpl$getConfigFromPay$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a == null) {
        }
    }

    public final Object d(Continuation continuation) {
        Object b = this.b.b(new GoogleBillingConfigInteractorImpl$updateConfig$2(this, null), (ContinuationImpl) continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
