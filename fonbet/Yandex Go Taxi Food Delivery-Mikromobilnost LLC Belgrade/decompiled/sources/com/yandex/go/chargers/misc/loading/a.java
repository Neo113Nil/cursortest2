package com.yandex.go.chargers.misc.loading;

import defpackage.h55;
import defpackage.ny61;
import defpackage.x2a;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(x2a x2aVar, long j, ContinuationImpl continuationImpl) {
        ChargersLoadingExtensionsKt$dismissAfterDelay$1 chargersLoadingExtensionsKt$dismissAfterDelay$1;
        int i;
        Object obj;
        if (continuationImpl instanceof ChargersLoadingExtensionsKt$dismissAfterDelay$1) {
            chargersLoadingExtensionsKt$dismissAfterDelay$1 = (ChargersLoadingExtensionsKt$dismissAfterDelay$1) continuationImpl;
            int i2 = chargersLoadingExtensionsKt$dismissAfterDelay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersLoadingExtensionsKt$dismissAfterDelay$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersLoadingExtensionsKt$dismissAfterDelay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersLoadingExtensionsKt$dismissAfterDelay$1.label;
                if (i != 0) {
                    b.b(obj2);
                    chargersLoadingExtensionsKt$dismissAfterDelay$1.L$0 = x2aVar;
                    chargersLoadingExtensionsKt$dismissAfterDelay$1.J$0 = j;
                    chargersLoadingExtensionsKt$dismissAfterDelay$1.label = 1;
                    obj = x2aVar;
                    if (kotlinx.coroutines.a.i(j, chargersLoadingExtensionsKt$dismissAfterDelay$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x2a x2aVar2 = (x2a) chargersLoadingExtensionsKt$dismissAfterDelay$1.L$0;
                    b.b(obj2);
                    obj = x2aVar2;
                }
                ((h55) obj).i();
                return zy11.a;
            }
        }
        chargersLoadingExtensionsKt$dismissAfterDelay$1 = new ChargersLoadingExtensionsKt$dismissAfterDelay$1(continuationImpl);
        Object obj22 = chargersLoadingExtensionsKt$dismissAfterDelay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersLoadingExtensionsKt$dismissAfterDelay$1.label;
        if (i != 0) {
        }
        ((h55) obj).i();
        return zy11.a;
    }
}
