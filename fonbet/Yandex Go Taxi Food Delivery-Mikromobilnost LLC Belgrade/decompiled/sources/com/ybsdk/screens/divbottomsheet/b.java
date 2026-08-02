package com.ybsdk.screens.divbottomsheet;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ahk;
import defpackage.ny61;
import defpackage.rr51;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DivBottomSheetResponse divBottomSheetResponse, ContinuationImpl continuationImpl) {
        DivBottomSheetResponseKt$toEntity$1 divBottomSheetResponseKt$toEntity$1;
        int i;
        Object b;
        if (continuationImpl instanceof DivBottomSheetResponseKt$toEntity$1) {
            divBottomSheetResponseKt$toEntity$1 = (DivBottomSheetResponseKt$toEntity$1) continuationImpl;
            int i2 = divBottomSheetResponseKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divBottomSheetResponseKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divBottomSheetResponseKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divBottomSheetResponseKt$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divkitData = divBottomSheetResponse.getDivkitData();
                    divBottomSheetResponseKt$toEntity$1.label = 1;
                    b = aVar.b(divkitData, divBottomSheetResponseKt$toEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                kotlin.b.b(b);
                return new ahk((rr51) b);
            }
        }
        divBottomSheetResponseKt$toEntity$1 = new DivBottomSheetResponseKt$toEntity$1(continuationImpl);
        Object obj2 = divBottomSheetResponseKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divBottomSheetResponseKt$toEntity$1.label;
        if (i != 0) {
        }
        kotlin.b.b(b);
        return new ahk((rr51) b);
    }
}
