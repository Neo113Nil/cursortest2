package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.ybsdk.feature.autotopup.internal.network.dto.regular.AutotopupWidgetSummaryDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.dzk0;
import defpackage.fa4;
import defpackage.fzk0;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.tcc;
import defpackage.w511;
import defpackage.xyk0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[LOOP:0: B:20:0x00ad->B:22:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(RoundingSettingsData roundingSettingsData, ContinuationImpl continuationImpl) {
        RoundingSettingsResponseKt$toEntity$1 roundingSettingsResponseKt$toEntity$1;
        int i;
        RoundingStatus roundingStatus;
        RoundingStatus roundingStatus2;
        DivDataDto topDivkitWidget;
        RoundingStatus roundingStatus3;
        xyk0 xyk0Var;
        ArrayList arrayList;
        fa4 fa4Var;
        Object a;
        RoundingStatus roundingStatus4;
        xyk0 xyk0Var2;
        fa4 fa4Var2;
        ArrayList arrayList2;
        if (continuationImpl instanceof RoundingSettingsResponseKt$toEntity$1) {
            roundingSettingsResponseKt$toEntity$1 = (RoundingSettingsResponseKt$toEntity$1) continuationImpl;
            int i2 = roundingSettingsResponseKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roundingSettingsResponseKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roundingSettingsResponseKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roundingSettingsResponseKt$toEntity$1.label;
                rr51 rr51Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = fzk0.a[roundingSettingsData.getStatus().ordinal()];
                    if (i3 == 1) {
                        roundingStatus = RoundingStatus.ENABLED;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        roundingStatus = RoundingStatus.DISABLED;
                    }
                    AutotopupWidgetSummaryDto summary = roundingSettingsData.getSummary();
                    roundingSettingsResponseKt$toEntity$1.L$0 = roundingSettingsData;
                    roundingSettingsResponseKt$toEntity$1.L$1 = roundingStatus;
                    roundingSettingsResponseKt$toEntity$1.label = 1;
                    Object c = com.ybsdk.feature.autotopup.internal.network.dto.regular.b.c(summary, roundingSettingsResponseKt$toEntity$1);
                    if (c != coroutineSingletons) {
                        roundingStatus2 = roundingStatus;
                        obj = c;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r13 = (List) roundingSettingsResponseKt$toEntity$1.L$3;
                    xyk0Var2 = (xyk0) roundingSettingsResponseKt$toEntity$1.L$2;
                    fa4Var2 = (fa4) roundingSettingsResponseKt$toEntity$1.L$1;
                    roundingStatus4 = (RoundingStatus) roundingSettingsResponseKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    arrayList2 = r13;
                    rr51Var = (rr51) obj;
                    arrayList = arrayList2;
                    roundingStatus3 = roundingStatus4;
                    xyk0Var = xyk0Var2;
                    fa4Var = fa4Var2;
                    return new dzk0(roundingStatus3, fa4Var, rr51Var, xyk0Var, arrayList);
                }
                RoundingStatus roundingStatus5 = (RoundingStatus) roundingSettingsResponseKt$toEntity$1.L$1;
                RoundingSettingsData roundingSettingsData2 = (RoundingSettingsData) roundingSettingsResponseKt$toEntity$1.L$0;
                kotlin.b.b(obj);
                roundingStatus2 = roundingStatus5;
                roundingSettingsData = roundingSettingsData2;
                fa4 fa4Var3 = (fa4) obj;
                RoundingOptionDto selectedRoundingStep = roundingSettingsData.getSelectedRoundingStep();
                xyk0 xyk0Var3 = new xyk0(selectedRoundingStep.getId(), selectedRoundingStep.getText(), selectedRoundingStep.getFutureIncomeAmount());
                List<RoundingOptionDto> availableRoundingOption = roundingSettingsData.getAvailableRoundingOption();
                ArrayList arrayList3 = new ArrayList(tcc.n(availableRoundingOption, 10));
                for (RoundingOptionDto roundingOptionDto : availableRoundingOption) {
                    arrayList3.add(new xyk0(roundingOptionDto.getId(), roundingOptionDto.getText(), roundingOptionDto.getFutureIncomeAmount()));
                }
                topDivkitWidget = roundingSettingsData.getTopDivkitWidget();
                if (topDivkitWidget != null) {
                    roundingStatus3 = roundingStatus2;
                    xyk0Var = xyk0Var3;
                    arrayList = arrayList3;
                    fa4Var = fa4Var3;
                    return new dzk0(roundingStatus3, fa4Var, rr51Var, xyk0Var, arrayList);
                }
                roundingSettingsResponseKt$toEntity$1.L$0 = roundingStatus2;
                roundingSettingsResponseKt$toEntity$1.L$1 = fa4Var3;
                roundingSettingsResponseKt$toEntity$1.L$2 = xyk0Var3;
                roundingSettingsResponseKt$toEntity$1.L$3 = arrayList3;
                roundingSettingsResponseKt$toEntity$1.label = 2;
                a = com.ybsdk.feature.divkit.internal.a.a(topDivkitWidget, new com.ybsdk.feature.divkit.api.domain.a(null), roundingSettingsResponseKt$toEntity$1);
                if (a != coroutineSingletons) {
                    roundingStatus4 = roundingStatus2;
                    xyk0Var2 = xyk0Var3;
                    fa4Var2 = fa4Var3;
                    obj = a;
                    arrayList2 = arrayList3;
                    rr51Var = (rr51) obj;
                    arrayList = arrayList2;
                    roundingStatus3 = roundingStatus4;
                    xyk0Var = xyk0Var2;
                    fa4Var = fa4Var2;
                    return new dzk0(roundingStatus3, fa4Var, rr51Var, xyk0Var, arrayList);
                }
                return coroutineSingletons;
            }
        }
        roundingSettingsResponseKt$toEntity$1 = new RoundingSettingsResponseKt$toEntity$1(continuationImpl);
        Object obj2 = roundingSettingsResponseKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roundingSettingsResponseKt$toEntity$1.label;
        rr51 rr51Var2 = null;
        if (i != 0) {
        }
        fa4 fa4Var32 = (fa4) obj2;
        RoundingOptionDto selectedRoundingStep2 = roundingSettingsData.getSelectedRoundingStep();
        xyk0 xyk0Var32 = new xyk0(selectedRoundingStep2.getId(), selectedRoundingStep2.getText(), selectedRoundingStep2.getFutureIncomeAmount());
        List<RoundingOptionDto> availableRoundingOption2 = roundingSettingsData.getAvailableRoundingOption();
        ArrayList arrayList32 = new ArrayList(tcc.n(availableRoundingOption2, 10));
        while (r5.hasNext()) {
        }
        topDivkitWidget = roundingSettingsData.getTopDivkitWidget();
        if (topDivkitWidget != null) {
        }
    }
}
