package com.ybsdk.di.modules.features;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class i {
    public final /* synthetic */ com.ybsdk.feature.banners.api.interactors.a a;

    public i(com.ybsdk.feature.banners.api.interactors.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        EducationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1 educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1;
        int i;
        if (continuationImpl instanceof EducationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1) {
            educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1 = (EducationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1) continuationImpl;
            int i2 = educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.label = i2 - Integer.MIN_VALUE;
                Object obj = educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.label = 1;
                    Object a = this.a.a(str, str2, educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1 = new EducationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1(this, continuationImpl);
        Object obj2 = educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = educationsFeatureModule$provideEducationsMarkEventRepository$1$markEvent0E7RQCE$1.label;
        if (i != 0) {
        }
    }
}
