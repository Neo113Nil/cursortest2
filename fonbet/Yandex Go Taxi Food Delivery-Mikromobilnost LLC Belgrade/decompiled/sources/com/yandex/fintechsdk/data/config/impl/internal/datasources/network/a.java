package com.yandex.fintechsdk.data.config.impl.internal.datasources.network;

import defpackage.ny61;
import defpackage.wat;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.a a;
    public final com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit.a b;

    public a(com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.a aVar, com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ConfigNetworkDataSource$getApplinkPaymentConfig$1 configNetworkDataSource$getApplinkPaymentConfig$1;
        int i;
        if (continuationImpl instanceof ConfigNetworkDataSource$getApplinkPaymentConfig$1) {
            configNetworkDataSource$getApplinkPaymentConfig$1 = (ConfigNetworkDataSource$getApplinkPaymentConfig$1) continuationImpl;
            int i2 = configNetworkDataSource$getApplinkPaymentConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                configNetworkDataSource$getApplinkPaymentConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = configNetworkDataSource$getApplinkPaymentConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = configNetworkDataSource$getApplinkPaymentConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    configNetworkDataSource$getApplinkPaymentConfig$1.label = 1;
                    Object a = com.yandex.fintechsdk.core.network.api.request.b.a(this.a, configNetworkDataSource$getApplinkPaymentConfig$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        configNetworkDataSource$getApplinkPaymentConfig$1 = new ConfigNetworkDataSource$getApplinkPaymentConfig$1(this, continuationImpl);
        Object obj2 = configNetworkDataSource$getApplinkPaymentConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = configNetworkDataSource$getApplinkPaymentConfig$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        ConfigNetworkDataSource$getPaymentKitConfig$1 configNetworkDataSource$getPaymentKitConfig$1;
        int i;
        if (continuationImpl instanceof ConfigNetworkDataSource$getPaymentKitConfig$1) {
            configNetworkDataSource$getPaymentKitConfig$1 = (ConfigNetworkDataSource$getPaymentKitConfig$1) continuationImpl;
            int i2 = configNetworkDataSource$getPaymentKitConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                configNetworkDataSource$getPaymentKitConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = configNetworkDataSource$getPaymentKitConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = configNetworkDataSource$getPaymentKitConfig$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                wat watVar = new wat(z);
                configNetworkDataSource$getPaymentKitConfig$1.label = 1;
                Object b = this.b.b(watVar, configNetworkDataSource$getPaymentKitConfig$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        configNetworkDataSource$getPaymentKitConfig$1 = new ConfigNetworkDataSource$getPaymentKitConfig$1(this, continuationImpl);
        Object obj2 = configNetworkDataSource$getPaymentKitConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = configNetworkDataSource$getPaymentKitConfig$1.label;
        if (i == 0) {
        }
    }
}
