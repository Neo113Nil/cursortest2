package com.ybsdk.feature.savings.internal.entities;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.network.dto.DivkitWidgetDto;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.rtl;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DivkitWidgetDto divkitWidgetDto, String str, ContinuationImpl continuationImpl) {
        DivkitDashboardItemKt$toDashboardItem$1 divkitDashboardItemKt$toDashboardItem$1;
        int i;
        Object b;
        rr51 rr51Var;
        if (continuationImpl instanceof DivkitDashboardItemKt$toDashboardItem$1) {
            divkitDashboardItemKt$toDashboardItem$1 = (DivkitDashboardItemKt$toDashboardItem$1) continuationImpl;
            int i2 = divkitDashboardItemKt$toDashboardItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divkitDashboardItemKt$toDashboardItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divkitDashboardItemKt$toDashboardItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divkitDashboardItemKt$toDashboardItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divData = divkitWidgetDto.getDivData();
                    divkitDashboardItemKt$toDashboardItem$1.L$0 = str;
                    divkitDashboardItemKt$toDashboardItem$1.label = 1;
                    b = aVar.b(divData, divkitDashboardItemKt$toDashboardItem$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) divkitDashboardItemKt$toDashboardItem$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var == null) {
                    return new rtl(rr51Var, rr51Var.e, str);
                }
                return null;
            }
        }
        divkitDashboardItemKt$toDashboardItem$1 = new DivkitDashboardItemKt$toDashboardItem$1(continuationImpl);
        Object obj2 = divkitDashboardItemKt$toDashboardItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divkitDashboardItemKt$toDashboardItem$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var == null) {
        }
    }
}
