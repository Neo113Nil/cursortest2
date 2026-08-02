package com.ybsdk.feature.divkit.api.dto;

import defpackage.ny61;
import defpackage.rr51;
import defpackage.v7l;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DivScreenDto divScreenDto, Continuation continuation) {
        DivScreenDtoKt$toEntity$1 divScreenDtoKt$toEntity$1;
        int i;
        String str;
        Object obj;
        String str2;
        if (continuation instanceof DivScreenDtoKt$toEntity$1) {
            divScreenDtoKt$toEntity$1 = (DivScreenDtoKt$toEntity$1) continuation;
            int i2 = divScreenDtoKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divScreenDtoKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = divScreenDtoKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divScreenDtoKt$toEntity$1.label;
                if (i != 0) {
                    b.b(obj2);
                    String title = divScreenDto.getTitle();
                    String subtitle = divScreenDto.getSubtitle();
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divData = divScreenDto.getDivData();
                    divScreenDtoKt$toEntity$1.L$0 = title;
                    divScreenDtoKt$toEntity$1.L$1 = subtitle;
                    divScreenDtoKt$toEntity$1.label = 1;
                    Object b = aVar.b(divData, divScreenDtoKt$toEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = title;
                    obj = b;
                    str2 = subtitle;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) divScreenDtoKt$toEntity$1.L$1;
                    str = (String) divScreenDtoKt$toEntity$1.L$0;
                    b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                b.b(obj);
                return new v7l((rr51) obj, str, str2);
            }
        }
        divScreenDtoKt$toEntity$1 = new DivScreenDtoKt$toEntity$1(continuation);
        Object obj22 = divScreenDtoKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divScreenDtoKt$toEntity$1.label;
        if (i != 0) {
        }
        b.b(obj);
        return new v7l((rr51) obj, str, str2);
    }
}
