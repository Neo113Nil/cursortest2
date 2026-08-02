package com.ybsdk.common.repositiories.onboarding;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final Api a;

    public a(Api api) {
        this.a = api;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r0 == r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        OnboardingRepository$getRegistrationNext$1 onboardingRepository$getRegistrationNext$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof OnboardingRepository$getRegistrationNext$1) {
            onboardingRepository$getRegistrationNext$1 = (OnboardingRepository$getRegistrationNext$1) continuationImpl;
            int i2 = onboardingRepository$getRegistrationNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onboardingRepository$getRegistrationNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = onboardingRepository$getRegistrationNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = onboardingRepository$getRegistrationNext$1.label;
                if (i != 0) {
                    b.b(obj);
                    OnboardingRepository$getRegistrationNext$2 onboardingRepository$getRegistrationNext$2 = new OnboardingRepository$getRegistrationNext$2(this, str2, str3, str, null);
                    onboardingRepository$getRegistrationNext$1.label = 1;
                    c = c.c(onboardingRepository$getRegistrationNext$2, onboardingRepository$getRegistrationNext$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                OnboardingRepository$getRegistrationNext$3$1 onboardingRepository$getRegistrationNext$3$1 = new OnboardingRepository$getRegistrationNext$3$1(2, null);
                onboardingRepository$getRegistrationNext$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, onboardingRepository$getRegistrationNext$3$1, onboardingRepository$getRegistrationNext$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        onboardingRepository$getRegistrationNext$1 = new OnboardingRepository$getRegistrationNext$1(this, continuationImpl);
        Object obj2 = onboardingRepository$getRegistrationNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = onboardingRepository$getRegistrationNext$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
