package com.ybsdk.feature.pfm.internal.data.mappers;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.lvy0;
import defpackage.mls;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.x4c;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(PfmResponse.FunFactData funFactData, ContinuationImpl continuationImpl) {
        PfmResponseFunFactMapperKt$toEntity$1 pfmResponseFunFactMapperKt$toEntity$1;
        int i;
        String str;
        ColorModel colorModel;
        if (continuationImpl instanceof PfmResponseFunFactMapperKt$toEntity$1) {
            pfmResponseFunFactMapperKt$toEntity$1 = (PfmResponseFunFactMapperKt$toEntity$1) continuationImpl;
            int i2 = pfmResponseFunFactMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfmResponseFunFactMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pfmResponseFunFactMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmResponseFunFactMapperKt$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String logId = funFactData.getDivkitItem().getLogId();
                    ColorModel c = lvy0.c(funFactData.getBackgroundBlurColor());
                    PfmResponse.FunFactDivItem divkitItem = funFactData.getDivkitItem();
                    pfmResponseFunFactMapperKt$toEntity$1.L$0 = logId;
                    pfmResponseFunFactMapperKt$toEntity$1.L$1 = c;
                    pfmResponseFunFactMapperKt$toEntity$1.label = 1;
                    Object b = b(divkitItem, pfmResponseFunFactMapperKt$toEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = logId;
                    obj = b;
                    colorModel = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    colorModel = (ColorModel) pfmResponseFunFactMapperKt$toEntity$1.L$1;
                    str = (String) pfmResponseFunFactMapperKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                }
                return new mls(str, colorModel, (rr51) obj);
            }
        }
        pfmResponseFunFactMapperKt$toEntity$1 = new PfmResponseFunFactMapperKt$toEntity$1(continuationImpl);
        Object obj2 = pfmResponseFunFactMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmResponseFunFactMapperKt$toEntity$1.label;
        if (i != 0) {
        }
        return new mls(str, colorModel, (rr51) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(PfmResponse.FunFactDivItem funFactDivItem, ContinuationImpl continuationImpl) {
        PfmResponseFunFactMapperKt$toYbDivData$1 pfmResponseFunFactMapperKt$toYbDivData$1;
        int i;
        Object b;
        Throwable a;
        if (continuationImpl instanceof PfmResponseFunFactMapperKt$toYbDivData$1) {
            pfmResponseFunFactMapperKt$toYbDivData$1 = (PfmResponseFunFactMapperKt$toYbDivData$1) continuationImpl;
            int i2 = pfmResponseFunFactMapperKt$toYbDivData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfmResponseFunFactMapperKt$toYbDivData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pfmResponseFunFactMapperKt$toYbDivData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmResponseFunFactMapperKt$toYbDivData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divJson = funFactDivItem.getDivJson();
                    pfmResponseFunFactMapperKt$toYbDivData$1.label = 1;
                    b = aVar.b(divJson, pfmResponseFunFactMapperKt$toYbDivData$1);
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
                a = Result.a(b);
                if (a != null) {
                    x4c.g("Can't parse fun fact item", a, null, null, 12);
                }
                if (b instanceof Result.Failure) {
                    return b;
                }
                return null;
            }
        }
        pfmResponseFunFactMapperKt$toYbDivData$1 = new PfmResponseFunFactMapperKt$toYbDivData$1(continuationImpl);
        Object obj2 = pfmResponseFunFactMapperKt$toYbDivData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmResponseFunFactMapperKt$toYbDivData$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
    }
}
