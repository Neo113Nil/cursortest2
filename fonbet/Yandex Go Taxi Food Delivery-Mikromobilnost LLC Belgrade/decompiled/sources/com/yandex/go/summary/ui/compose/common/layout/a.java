package com.yandex.go.summary.ui.compose.common.layout;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ androidx.compose.animation.core.a a;

    public a(androidx.compose.animation.core.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r1.f(r10, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (androidx.compose.animation.core.a.d(r1, r2, null, null, null, r6, 14) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1 firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        if (continuation instanceof FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1) {
            firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1 = (FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1 firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12 = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1;
                Object obj2 = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int intValue = ((Number) obj).intValue();
                    int floatValue = (int) ((Number) this.a.e()).floatValue();
                    androidx.compose.animation.core.a aVar = this.a;
                    if (floatValue == 0) {
                        Float f = new Float(intValue);
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.I$0 = intValue;
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.label = 1;
                    } else {
                        Float f2 = new Float(intValue);
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.I$0 = intValue;
                        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$12.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1 = new FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1 firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$122 = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1;
        Object obj22 = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = firstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$122.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
