package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.au3;
import defpackage.b64;
import defpackage.bsi0;
import defpackage.ea4;
import defpackage.fa4;
import defpackage.fwt0;
import defpackage.fxy0;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class b {
    public static final DayOfWeek a(DayOfWeekDto dayOfWeekDto) {
        switch (bsi0.a[dayOfWeekDto.ordinal()]) {
            case 1:
                return DayOfWeek.MON;
            case 2:
                return DayOfWeek.TUE;
            case 3:
                return DayOfWeek.WED;
            case 4:
                return DayOfWeek.THU;
            case 5:
                return DayOfWeek.FRI;
            case 6:
                return DayOfWeek.SAT;
            case 7:
                return DayOfWeek.SUN;
            default:
                w511.b();
                return null;
        }
    }

    public static final FrequencyType b(RegularAutotopupTypeDto regularAutotopupTypeDto) {
        int i = bsi0.b[regularAutotopupTypeDto.ordinal()];
        if (i == 1) {
            return FrequencyType.ONCE_PER_WEEK;
        }
        if (i == 2) {
            return FrequencyType.ONCE_PER_MONTH;
        }
        if (i == 3) {
            return FrequencyType.TWICE_PER_MONTH;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[LOOP:0: B:15:0x0099->B:17:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(AutotopupWidgetSummaryDto autotopupWidgetSummaryDto, ContinuationImpl continuationImpl) {
        RegularAutoTopupSettingsResponseKt$toEntity$2 regularAutoTopupSettingsResponseKt$toEntity$2;
        int i;
        rr51 rr51Var;
        DivDataDto divkitWidget;
        AutotopupWidgetSummaryDataDto nativeWidget;
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto2 = autotopupWidgetSummaryDto;
        if (continuationImpl instanceof RegularAutoTopupSettingsResponseKt$toEntity$2) {
            regularAutoTopupSettingsResponseKt$toEntity$2 = (RegularAutoTopupSettingsResponseKt$toEntity$2) continuationImpl;
            int i2 = regularAutoTopupSettingsResponseKt$toEntity$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                regularAutoTopupSettingsResponseKt$toEntity$2.label = i2 - Integer.MIN_VALUE;
                Object obj = regularAutoTopupSettingsResponseKt$toEntity$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = regularAutoTopupSettingsResponseKt$toEntity$2.label;
                ea4 ea4Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (autotopupWidgetSummaryDto2 == null || (divkitWidget = autotopupWidgetSummaryDto2.getDivkitWidget()) == null) {
                        rr51Var = null;
                        if (autotopupWidgetSummaryDto2 != null && (nativeWidget = autotopupWidgetSummaryDto2.getNativeWidget()) != null) {
                            String title = nativeWidget.getTitle();
                            String subtitle = nativeWidget.getSubtitle();
                            String futureIncomeTitle = nativeWidget.getFutureIncomeTitle();
                            fxy0 entity = nativeWidget.getLeftImage().toEntity();
                            fxy0 entity2 = nativeWidget.getActionImage().toEntity();
                            fxy0 entity3 = nativeWidget.getFutureIncomeBackgroundColor().toEntity();
                            fxy0 entity4 = nativeWidget.getBackgroundColor().toEntity();
                            List<AutotopupSummaryBlockDto> blocks = nativeWidget.getBlocks();
                            ArrayList arrayList = new ArrayList(tcc.n(blocks, 10));
                            for (AutotopupSummaryBlockDto autotopupSummaryBlockDto : blocks) {
                                arrayList.add(new au3(g8e.i(Text.Companion, autotopupSummaryBlockDto.getAmount()), new Text.Constant(autotopupSummaryBlockDto.getDate()), b64.j(autotopupSummaryBlockDto.getAmount(), autotopupSummaryBlockDto.getDate()), autotopupSummaryBlockDto.getEnabled()));
                                nativeWidget = nativeWidget;
                            }
                            AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto = nativeWidget;
                            ea4Var = new ea4(title, subtitle, futureIncomeTitle, entity, entity2, entity3, entity4, arrayList, new fwt0(autotopupWidgetSummaryDataDto.getSpoilerParams().getParticleColor().toEntity()), autotopupWidgetSummaryDataDto.getTooltipText());
                        }
                        return new fa4(rr51Var, ea4Var);
                    }
                    regularAutoTopupSettingsResponseKt$toEntity$2.L$0 = autotopupWidgetSummaryDto2;
                    regularAutoTopupSettingsResponseKt$toEntity$2.label = 1;
                    obj = com.ybsdk.feature.divkit.internal.a.a(divkitWidget, new com.ybsdk.feature.divkit.api.domain.a(null), regularAutoTopupSettingsResponseKt$toEntity$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    autotopupWidgetSummaryDto2 = (AutotopupWidgetSummaryDto) regularAutoTopupSettingsResponseKt$toEntity$2.L$0;
                    kotlin.b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (autotopupWidgetSummaryDto2 != null) {
                    String title2 = nativeWidget.getTitle();
                    String subtitle2 = nativeWidget.getSubtitle();
                    String futureIncomeTitle2 = nativeWidget.getFutureIncomeTitle();
                    fxy0 entity5 = nativeWidget.getLeftImage().toEntity();
                    fxy0 entity22 = nativeWidget.getActionImage().toEntity();
                    fxy0 entity32 = nativeWidget.getFutureIncomeBackgroundColor().toEntity();
                    fxy0 entity42 = nativeWidget.getBackgroundColor().toEntity();
                    List<AutotopupSummaryBlockDto> blocks2 = nativeWidget.getBlocks();
                    ArrayList arrayList2 = new ArrayList(tcc.n(blocks2, 10));
                    while (r2.hasNext()) {
                    }
                    AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto2 = nativeWidget;
                    ea4Var = new ea4(title2, subtitle2, futureIncomeTitle2, entity5, entity22, entity32, entity42, arrayList2, new fwt0(autotopupWidgetSummaryDataDto2.getSpoilerParams().getParticleColor().toEntity()), autotopupWidgetSummaryDataDto2.getTooltipText());
                }
                return new fa4(rr51Var, ea4Var);
            }
        }
        regularAutoTopupSettingsResponseKt$toEntity$2 = new RegularAutoTopupSettingsResponseKt$toEntity$2(continuationImpl);
        Object obj2 = regularAutoTopupSettingsResponseKt$toEntity$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = regularAutoTopupSettingsResponseKt$toEntity$2.label;
        ea4 ea4Var2 = null;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (autotopupWidgetSummaryDto2 != null) {
        }
        return new fa4(rr51Var, ea4Var2);
    }
}
