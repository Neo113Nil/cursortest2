package com.yandex.fintechsdk.data.config.impl.internal;

import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import defpackage.b23;
import defpackage.ny61;
import defpackage.xzd;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.config.impl.internal.datasources.network.a a;
    public final xzd b;

    public a(com.yandex.fintechsdk.data.config.impl.internal.datasources.network.a aVar, xzd xzdVar) {
        this.a = aVar;
        this.b = xzdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ConfigRepositoryImpl$getApplinkPaymentConfig$1 configRepositoryImpl$getApplinkPaymentConfig$1;
        int i;
        Object a;
        if (continuationImpl instanceof ConfigRepositoryImpl$getApplinkPaymentConfig$1) {
            configRepositoryImpl$getApplinkPaymentConfig$1 = (ConfigRepositoryImpl$getApplinkPaymentConfig$1) continuationImpl;
            int i2 = configRepositoryImpl$getApplinkPaymentConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                configRepositoryImpl$getApplinkPaymentConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = configRepositoryImpl$getApplinkPaymentConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = configRepositoryImpl$getApplinkPaymentConfig$1.label;
                xzd xzdVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    b23 b23Var = (b23) xzdVar.a.get();
                    if (b23Var != null) {
                        return b23Var;
                    }
                    configRepositoryImpl$getApplinkPaymentConfig$1.label = 1;
                    a = this.a.a(configRepositoryImpl$getApplinkPaymentConfig$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    xzdVar.a.set((b23) a);
                }
                return a;
            }
        }
        configRepositoryImpl$getApplinkPaymentConfig$1 = new ConfigRepositoryImpl$getApplinkPaymentConfig$1(this, continuationImpl);
        Object obj2 = configRepositoryImpl$getApplinkPaymentConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = configRepositoryImpl$getApplinkPaymentConfig$1.label;
        xzd xzdVar2 = this.b;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        ConfigRepositoryImpl$getPaymentKitConfig$1 configRepositoryImpl$getPaymentKitConfig$1;
        int i;
        Object b;
        if (continuationImpl instanceof ConfigRepositoryImpl$getPaymentKitConfig$1) {
            configRepositoryImpl$getPaymentKitConfig$1 = (ConfigRepositoryImpl$getPaymentKitConfig$1) continuationImpl;
            int i2 = configRepositoryImpl$getPaymentKitConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                configRepositoryImpl$getPaymentKitConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = configRepositoryImpl$getPaymentKitConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = configRepositoryImpl$getPaymentKitConfig$1.label;
                xzd xzdVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    PaymentKitConfig a = xzdVar.a();
                    if (a != null) {
                        return a;
                    }
                    configRepositoryImpl$getPaymentKitConfig$1.label = 1;
                    b = this.a.b(z, configRepositoryImpl$getPaymentKitConfig$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    PaymentKitConfig paymentKitConfig = (PaymentKitConfig) b;
                    xzdVar.b.set(paymentKitConfig);
                    r0 r0Var = xzdVar.c;
                    r0Var.getClass();
                    r0Var.m(null, paymentKitConfig);
                }
                return b;
            }
        }
        configRepositoryImpl$getPaymentKitConfig$1 = new ConfigRepositoryImpl$getPaymentKitConfig$1(this, continuationImpl);
        Object obj2 = configRepositoryImpl$getPaymentKitConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = configRepositoryImpl$getPaymentKitConfig$1.label;
        xzd xzdVar2 = this.b;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        return b;
    }
}
