package com.ybsdk.feature.divkit.internal;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DivDataDto divDataDto, com.ybsdk.feature.divkit.api.domain.a aVar, ContinuationImpl continuationImpl) {
        DivDataExtKt$parseToYbDivData$1 divDataExtKt$parseToYbDivData$1;
        int i;
        Object b;
        if (continuationImpl instanceof DivDataExtKt$parseToYbDivData$1) {
            divDataExtKt$parseToYbDivData$1 = (DivDataExtKt$parseToYbDivData$1) continuationImpl;
            int i2 = divDataExtKt$parseToYbDivData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divDataExtKt$parseToYbDivData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divDataExtKt$parseToYbDivData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divDataExtKt$parseToYbDivData$1.label;
                if (i != 0) {
                    b.b(obj);
                    divDataExtKt$parseToYbDivData$1.label = 1;
                    b = aVar.b(divDataDto, divDataExtKt$parseToYbDivData$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    return b;
                }
                return null;
            }
        }
        divDataExtKt$parseToYbDivData$1 = new DivDataExtKt$parseToYbDivData$1(continuationImpl);
        Object obj3 = divDataExtKt$parseToYbDivData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divDataExtKt$parseToYbDivData$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
    }
}
