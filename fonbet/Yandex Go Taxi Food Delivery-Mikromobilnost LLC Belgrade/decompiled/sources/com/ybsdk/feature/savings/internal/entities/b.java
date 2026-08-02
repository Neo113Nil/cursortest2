package com.ybsdk.feature.savings.internal.entities;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.network.dto.ActionButtonDto;
import com.ybsdk.feature.savings.internal.network.dto.FundNeedConfirmationDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundResultDataDto;
import defpackage.aqs;
import defpackage.eps;
import defpackage.fps;
import defpackage.g8e;
import defpackage.job1;
import defpackage.ms;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.xvq;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class b {
    public static final fps a(FundResultDataDto fundResultDataDto) {
        ThemedImageUrlEntity c = qxy0.c(fundResultDataDto.getImage(), null);
        Text.Constant i = g8e.i(Text.Companion, fundResultDataDto.getTitle());
        String subtitle = fundResultDataDto.getSubtitle();
        return new fps(c, i, subtitle != null ? new Text.Constant(subtitle) : null, aqs.a(fundResultDataDto.getButton()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(FundNeedConfirmationDataDto fundNeedConfirmationDataDto, ContinuationImpl continuationImpl) {
        FundOperationStatusResponseEntityKt$toEntity$4 fundOperationStatusResponseEntityKt$toEntity$4;
        int i;
        Object b;
        rr51 rr51Var;
        if (continuationImpl instanceof FundOperationStatusResponseEntityKt$toEntity$4) {
            fundOperationStatusResponseEntityKt$toEntity$4 = (FundOperationStatusResponseEntityKt$toEntity$4) continuationImpl;
            int i2 = fundOperationStatusResponseEntityKt$toEntity$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fundOperationStatusResponseEntityKt$toEntity$4.label = i2 - Integer.MIN_VALUE;
                Object obj = fundOperationStatusResponseEntityKt$toEntity$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fundOperationStatusResponseEntityKt$toEntity$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto bottomDivkitWidget = fundNeedConfirmationDataDto.getBottomDivkitWidget();
                    fundOperationStatusResponseEntityKt$toEntity$4.L$0 = fundNeedConfirmationDataDto;
                    fundOperationStatusResponseEntityKt$toEntity$4.label = 1;
                    b = aVar.b(bottomDivkitWidget, fundOperationStatusResponseEntityKt$toEntity$4);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fundNeedConfirmationDataDto = (FundNeedConfirmationDataDto) fundOperationStatusResponseEntityKt$toEntity$4.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var != null) {
                    return null;
                }
                Text.Constant i3 = g8e.i(Text.Companion, fundNeedConfirmationDataDto.getTitle());
                Text.Constant constant = new Text.Constant(fundNeedConfirmationDataDto.getSubtitle());
                ms a = aqs.a(fundNeedConfirmationDataDto.getPrimaryButton());
                ActionButtonDto secondaryButton = fundNeedConfirmationDataDto.getSecondaryButton();
                return new eps(i3, constant, rr51Var, a, secondaryButton != null ? aqs.a(secondaryButton) : null, job1.f(qxy0.c(fundNeedConfirmationDataDto.getBackgroundImage(), null), new xvq(28)));
            }
        }
        fundOperationStatusResponseEntityKt$toEntity$4 = new FundOperationStatusResponseEntityKt$toEntity$4(continuationImpl);
        Object obj2 = fundOperationStatusResponseEntityKt$toEntity$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fundOperationStatusResponseEntityKt$toEntity$4.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
    }
}
