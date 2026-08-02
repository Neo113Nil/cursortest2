package com.ybsdk.di.modules;

import defpackage.di51;
import defpackage.ny61;
import defpackage.ppp0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g {
    public final /* synthetic */ ppp0 a;
    public final /* synthetic */ di51 b;

    public g(ppp0 ppp0Var, di51 di51Var) {
        this.a = ppp0Var;
        this.b = di51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        SdkModule$providePassportPinStorage$1$getPin$1 sdkModule$providePassportPinStorage$1$getPin$1;
        int i;
        if (continuationImpl instanceof SdkModule$providePassportPinStorage$1$getPin$1) {
            sdkModule$providePassportPinStorage$1$getPin$1 = (SdkModule$providePassportPinStorage$1$getPin$1) continuationImpl;
            int i2 = sdkModule$providePassportPinStorage$1$getPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkModule$providePassportPinStorage$1$getPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkModule$providePassportPinStorage$1$getPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkModule$providePassportPinStorage$1$getPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sdkModule$providePassportPinStorage$1$getPin$1.label = 1;
                    Object f = ((com.ybsdk.feature.passport.impl.a) this.a).f(j, sdkModule$providePassportPinStorage$1$getPin$1);
                    return f == coroutineSingletons ? coroutineSingletons : f;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        sdkModule$providePassportPinStorage$1$getPin$1 = new SdkModule$providePassportPinStorage$1$getPin$1(this, continuationImpl);
        Object obj2 = sdkModule$providePassportPinStorage$1$getPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkModule$providePassportPinStorage$1$getPin$1.label;
        if (i != 0) {
        }
    }

    public final Long b() {
        return (Long) this.b.m().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, String str, ContinuationImpl continuationImpl) {
        SdkModule$providePassportPinStorage$1$savePin$1 sdkModule$providePassportPinStorage$1$savePin$1;
        int i;
        if (continuationImpl instanceof SdkModule$providePassportPinStorage$1$savePin$1) {
            sdkModule$providePassportPinStorage$1$savePin$1 = (SdkModule$providePassportPinStorage$1$savePin$1) continuationImpl;
            int i2 = sdkModule$providePassportPinStorage$1$savePin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkModule$providePassportPinStorage$1$savePin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkModule$providePassportPinStorage$1$savePin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkModule$providePassportPinStorage$1$savePin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sdkModule$providePassportPinStorage$1$savePin$1.label = 1;
                    Object k = ((com.ybsdk.feature.passport.impl.a) this.a).k(j, str, sdkModule$providePassportPinStorage$1$savePin$1);
                    return k == coroutineSingletons ? coroutineSingletons : k;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        sdkModule$providePassportPinStorage$1$savePin$1 = new SdkModule$providePassportPinStorage$1$savePin$1(this, continuationImpl);
        Object obj2 = sdkModule$providePassportPinStorage$1$savePin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkModule$providePassportPinStorage$1$savePin$1.label;
        if (i != 0) {
        }
    }
}
