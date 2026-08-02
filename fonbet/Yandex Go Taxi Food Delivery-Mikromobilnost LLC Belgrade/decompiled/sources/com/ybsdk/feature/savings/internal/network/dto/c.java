package com.ybsdk.feature.savings.internal.network.dto;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.entities.SavingsAccountButtonEntity$Status;
import com.ybsdk.feature.savings.internal.network.dto.AccountActionButtonDto;
import defpackage.a3m0;
import defpackage.i9m0;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class c {
    public static final a3m0 a(AccountActionButtonDto accountActionButtonDto) {
        String text = accountActionButtonDto.getText();
        String subtitle = accountActionButtonDto.getSubtitle();
        String action = accountActionButtonDto.getAction();
        AccountActionButtonDto.Status status = accountActionButtonDto.getStatus();
        int i = status == null ? -1 : b.b[status.ordinal()];
        SavingsAccountButtonEntity$Status savingsAccountButtonEntity$Status = null;
        if (i != -1) {
            if (i != 1) {
                w511.b();
                return null;
            }
            savingsAccountButtonEntity$Status = SavingsAccountButtonEntity$Status.LOCKED;
        }
        return new a3m0(text, action, savingsAccountButtonEntity$Status, subtitle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(DivkitWidgetDto divkitWidgetDto, ContinuationImpl continuationImpl) {
        SavingsAccountInfoResponseKt$toEntity$5 savingsAccountInfoResponseKt$toEntity$5;
        int i;
        rr51 rr51Var;
        if (continuationImpl instanceof SavingsAccountInfoResponseKt$toEntity$5) {
            savingsAccountInfoResponseKt$toEntity$5 = (SavingsAccountInfoResponseKt$toEntity$5) continuationImpl;
            int i2 = savingsAccountInfoResponseKt$toEntity$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsAccountInfoResponseKt$toEntity$5.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsAccountInfoResponseKt$toEntity$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsAccountInfoResponseKt$toEntity$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DivDataDto divData = divkitWidgetDto.getDivData();
                    savingsAccountInfoResponseKt$toEntity$5.L$0 = divkitWidgetDto;
                    savingsAccountInfoResponseKt$toEntity$5.label = 1;
                    obj = com.ybsdk.feature.divkit.internal.a.a(divData, new com.ybsdk.feature.divkit.api.domain.a(null), savingsAccountInfoResponseKt$toEntity$5);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    divkitWidgetDto = (DivkitWidgetDto) savingsAccountInfoResponseKt$toEntity$5.L$0;
                    kotlin.b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var == null) {
                    return new i9m0(rr51Var, divkitWidgetDto.getLayoutId());
                }
                return null;
            }
        }
        savingsAccountInfoResponseKt$toEntity$5 = new SavingsAccountInfoResponseKt$toEntity$5(continuationImpl);
        Object obj2 = savingsAccountInfoResponseKt$toEntity$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsAccountInfoResponseKt$toEntity$5.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (rr51Var == null) {
        }
    }
}
