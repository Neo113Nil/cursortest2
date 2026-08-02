package com.yandex.fintechsdk.core.network.api.request;

import defpackage.ny61;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        RequesterKt$execute$1 requesterKt$execute$1;
        int i;
        if (continuationImpl instanceof RequesterKt$execute$1) {
            requesterKt$execute$1 = (RequesterKt$execute$1) continuationImpl;
            int i2 = requesterKt$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requesterKt$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requesterKt$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requesterKt$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    requesterKt$execute$1.label = 1;
                    Object b = aVar.b(zy11.a, requesterKt$execute$1);
                    return b == obj2 ? obj2 : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        requesterKt$execute$1 = new RequesterKt$execute$1(continuationImpl);
        Object obj3 = requesterKt$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requesterKt$execute$1.label;
        if (i != 0) {
        }
    }
}
