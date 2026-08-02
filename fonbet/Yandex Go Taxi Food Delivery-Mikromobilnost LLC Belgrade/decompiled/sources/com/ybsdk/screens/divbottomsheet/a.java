package com.ybsdk.screens.divbottomsheet;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import defpackage.ny61;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final DivBottomSheetApi a;

    public a(DivBottomSheetApi divBottomSheetApi) {
        this.a = divBottomSheetApi;
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
    public final Object a(String str, String str2, Map map, ContinuationImpl continuationImpl) {
        DivBottomSheetRepository$getDivBottomSheet$1 divBottomSheetRepository$getDivBottomSheet$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DivBottomSheetRepository$getDivBottomSheet$1) {
            divBottomSheetRepository$getDivBottomSheet$1 = (DivBottomSheetRepository$getDivBottomSheet$1) continuationImpl;
            int i2 = divBottomSheetRepository$getDivBottomSheet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divBottomSheetRepository$getDivBottomSheet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divBottomSheetRepository$getDivBottomSheet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divBottomSheetRepository$getDivBottomSheet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DivBottomSheetRepository$getDivBottomSheet$2 divBottomSheetRepository$getDivBottomSheet$2 = new DivBottomSheetRepository$getDivBottomSheet$2(this, str, str2, map, null);
                    divBottomSheetRepository$getDivBottomSheet$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(divBottomSheetRepository$getDivBottomSheet$2, divBottomSheetRepository$getDivBottomSheet$1);
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
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                DivBottomSheetRepository$getDivBottomSheet$3$1 divBottomSheetRepository$getDivBottomSheet$3$1 = new DivBottomSheetRepository$getDivBottomSheet$3$1(2, null);
                divBottomSheetRepository$getDivBottomSheet$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, divBottomSheetRepository$getDivBottomSheet$3$1, divBottomSheetRepository$getDivBottomSheet$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        divBottomSheetRepository$getDivBottomSheet$1 = new DivBottomSheetRepository$getDivBottomSheet$1(this, continuationImpl);
        Object obj2 = divBottomSheetRepository$getDivBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divBottomSheetRepository$getDivBottomSheet$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        DivBottomSheetRepository$getProTopUpBottomSheet$1 divBottomSheetRepository$getProTopUpBottomSheet$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DivBottomSheetRepository$getProTopUpBottomSheet$1) {
            divBottomSheetRepository$getProTopUpBottomSheet$1 = (DivBottomSheetRepository$getProTopUpBottomSheet$1) continuationImpl;
            int i2 = divBottomSheetRepository$getProTopUpBottomSheet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divBottomSheetRepository$getProTopUpBottomSheet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divBottomSheetRepository$getProTopUpBottomSheet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divBottomSheetRepository$getProTopUpBottomSheet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DivBottomSheetRepository$getProTopUpBottomSheet$2 divBottomSheetRepository$getProTopUpBottomSheet$2 = new DivBottomSheetRepository$getProTopUpBottomSheet$2(this, list, null);
                    divBottomSheetRepository$getProTopUpBottomSheet$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(divBottomSheetRepository$getProTopUpBottomSheet$2, divBottomSheetRepository$getProTopUpBottomSheet$1);
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
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                DivBottomSheetRepository$getProTopUpBottomSheet$3$1 divBottomSheetRepository$getProTopUpBottomSheet$3$1 = new DivBottomSheetRepository$getProTopUpBottomSheet$3$1(2, null);
                divBottomSheetRepository$getProTopUpBottomSheet$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, divBottomSheetRepository$getProTopUpBottomSheet$3$1, divBottomSheetRepository$getProTopUpBottomSheet$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        divBottomSheetRepository$getProTopUpBottomSheet$1 = new DivBottomSheetRepository$getProTopUpBottomSheet$1(this, continuationImpl);
        Object obj2 = divBottomSheetRepository$getProTopUpBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divBottomSheetRepository$getProTopUpBottomSheet$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
