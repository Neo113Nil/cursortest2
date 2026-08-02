package com.ybsdk.feature.passes.widget.internal;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.passes.widget.api.entity.PassesWidgetScreenType;
import com.ybsdk.feature.passes.widget.internal.data.PassesWidgetApi;
import com.ybsdk.feature.passes.widget.internal.data.PassesWidgetRequestDto;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final PassesWidgetApi a;

    public b(PassesWidgetApi passesWidgetApi) {
        this.a = passesWidgetApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PassesWidgetScreenType passesWidgetScreenType, ContinuationImpl continuationImpl) {
        PassesWidgetRepository$getPassesWidgetData$1 passesWidgetRepository$getPassesWidgetData$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof PassesWidgetRepository$getPassesWidgetData$1) {
            passesWidgetRepository$getPassesWidgetData$1 = (PassesWidgetRepository$getPassesWidgetData$1) continuationImpl;
            int i2 = passesWidgetRepository$getPassesWidgetData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passesWidgetRepository$getPassesWidgetData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passesWidgetRepository$getPassesWidgetData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passesWidgetRepository$getPassesWidgetData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PassesWidgetRequestDto passesWidgetRequestDto = new PassesWidgetRequestDto(passesWidgetScreenType.getPageType());
                    passesWidgetRepository$getPassesWidgetData$1.label = 1;
                    a = this.a.a(passesWidgetRequestDto, passesWidgetRepository$getPassesWidgetData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    return new Result.Failure(a2);
                }
                PassesWidgetRepository$getPassesWidgetData$2$1 passesWidgetRepository$getPassesWidgetData$2$1 = new PassesWidgetRepository$getPassesWidgetData$2$1(2, null);
                passesWidgetRepository$getPassesWidgetData$1.label = 2;
                Object a3 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, passesWidgetRepository$getPassesWidgetData$2$1, passesWidgetRepository$getPassesWidgetData$1);
                return a3 == coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        passesWidgetRepository$getPassesWidgetData$1 = new PassesWidgetRepository$getPassesWidgetData$1(this, continuationImpl);
        Object obj2 = passesWidgetRepository$getPassesWidgetData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passesWidgetRepository$getPassesWidgetData$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }
}
