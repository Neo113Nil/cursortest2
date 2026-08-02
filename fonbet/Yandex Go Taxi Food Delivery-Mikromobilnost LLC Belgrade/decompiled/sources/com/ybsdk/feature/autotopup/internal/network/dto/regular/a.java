package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.BindingPaymentInstructionsDto;
import defpackage.asi0;
import defpackage.bk11;
import defpackage.bsi0;
import defpackage.csi0;
import defpackage.dsi0;
import defpackage.esi0;
import defpackage.fa4;
import defpackage.fsi0;
import defpackage.gdb0;
import defpackage.giq0;
import defpackage.gw00;
import defpackage.h5a0;
import defpackage.i2b1;
import defpackage.j5a0;
import defpackage.ny61;
import defpackage.qgf;
import defpackage.tcc;
import defpackage.tsz0;
import defpackage.uda0;
import defpackage.w511;
import defpackage.w530;
import defpackage.ztv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final w530 a;
    public final gdb0 b;

    public a(w530 w530Var, gdb0 gdb0Var) {
        this.a = w530Var;
        this.b = gdb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RegularAutoTopupSettingsResponse regularAutoTopupSettingsResponse, ContinuationImpl continuationImpl) {
        RegularAutoTopupSettingsMapper$map$1 regularAutoTopupSettingsMapper$map$1;
        int i;
        RegularAutoTopupSettingsResponse regularAutoTopupSettingsResponse2;
        if (continuationImpl instanceof RegularAutoTopupSettingsMapper$map$1) {
            regularAutoTopupSettingsMapper$map$1 = (RegularAutoTopupSettingsMapper$map$1) continuationImpl;
            int i2 = regularAutoTopupSettingsMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                regularAutoTopupSettingsMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = regularAutoTopupSettingsMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = regularAutoTopupSettingsMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RegularAutotopupDataDto data = regularAutoTopupSettingsResponse.getData();
                    regularAutoTopupSettingsMapper$map$1.L$0 = regularAutoTopupSettingsResponse;
                    regularAutoTopupSettingsMapper$map$1.label = 1;
                    obj = b(data, regularAutoTopupSettingsMapper$map$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    regularAutoTopupSettingsResponse2 = regularAutoTopupSettingsResponse;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    regularAutoTopupSettingsResponse2 = (RegularAutoTopupSettingsResponse) regularAutoTopupSettingsMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                csi0 csi0Var = (csi0) obj;
                ToolbarDataDto toolbar = regularAutoTopupSettingsResponse2.getToolbar();
                tsz0 tsz0Var = new tsz0(toolbar.getSubtitleLeftImage().toEntity(), toolbar.getTitle(), toolbar.getSubtitle(), toolbar.getSubtitleAmount());
                InformationButtonDataDto infoButton = regularAutoTopupSettingsResponse2.getInfoButton();
                ztv ztvVar = new ztv(infoButton.getText(), infoButton.getAction());
                PaymentMethodsListDto paymentMethods = regularAutoTopupSettingsResponse2.getPaymentMethods();
                w530 w530Var = this.a;
                uda0 b = j5a0.b(paymentMethods, w530Var, false);
                String saveButtonText = regularAutoTopupSettingsResponse2.getSaveButtonText();
                String turnOffButtonText = regularAutoTopupSettingsResponse2.getTurnOffButtonText();
                TurnOffNoticeDto turnOffNotice = regularAutoTopupSettingsResponse2.getTurnOffNotice();
                bk11 bk11Var = new bk11(turnOffNotice.getTitle(), turnOffNotice.getDescription(), turnOffNotice.getButtonTextPrimary(), turnOffNotice.getButtonTextSecondary());
                CurrentPaymentMethodDto currentPaymentMethod = regularAutoTopupSettingsResponse2.getCurrentPaymentMethod();
                h5a0 a = currentPaymentMethod == null ? qgf.a(currentPaymentMethod, w530Var, false) : null;
                List<String> boundPaymentMethodIds = regularAutoTopupSettingsResponse2.getBoundPaymentMethodIds();
                BindingPaymentInstructionsDto bindingPaymentInstructions = regularAutoTopupSettingsResponse2.getBindingPaymentInstructions();
                return new asi0(csi0Var, tsz0Var, ztvVar, b, saveButtonText, turnOffButtonText, bk11Var, a, boundPaymentMethodIds, bindingPaymentInstructions != null ? i2b1.c(bindingPaymentInstructions) : null);
            }
        }
        regularAutoTopupSettingsMapper$map$1 = new RegularAutoTopupSettingsMapper$map$1(this, continuationImpl);
        Object obj3 = regularAutoTopupSettingsMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = regularAutoTopupSettingsMapper$map$1.label;
        if (i != 0) {
        }
        csi0 csi0Var2 = (csi0) obj3;
        ToolbarDataDto toolbar2 = regularAutoTopupSettingsResponse2.getToolbar();
        tsz0 tsz0Var2 = new tsz0(toolbar2.getSubtitleLeftImage().toEntity(), toolbar2.getTitle(), toolbar2.getSubtitle(), toolbar2.getSubtitleAmount());
        InformationButtonDataDto infoButton2 = regularAutoTopupSettingsResponse2.getInfoButton();
        ztv ztvVar2 = new ztv(infoButton2.getText(), infoButton2.getAction());
        PaymentMethodsListDto paymentMethods2 = regularAutoTopupSettingsResponse2.getPaymentMethods();
        w530 w530Var2 = this.a;
        uda0 b2 = j5a0.b(paymentMethods2, w530Var2, false);
        String saveButtonText2 = regularAutoTopupSettingsResponse2.getSaveButtonText();
        String turnOffButtonText2 = regularAutoTopupSettingsResponse2.getTurnOffButtonText();
        TurnOffNoticeDto turnOffNotice2 = regularAutoTopupSettingsResponse2.getTurnOffNotice();
        bk11 bk11Var2 = new bk11(turnOffNotice2.getTitle(), turnOffNotice2.getDescription(), turnOffNotice2.getButtonTextPrimary(), turnOffNotice2.getButtonTextSecondary());
        CurrentPaymentMethodDto currentPaymentMethod2 = regularAutoTopupSettingsResponse2.getCurrentPaymentMethod();
        if (currentPaymentMethod2 == null) {
        }
        List<String> boundPaymentMethodIds2 = regularAutoTopupSettingsResponse2.getBoundPaymentMethodIds();
        BindingPaymentInstructionsDto bindingPaymentInstructions2 = regularAutoTopupSettingsResponse2.getBindingPaymentInstructions();
        return new asi0(csi0Var2, tsz0Var2, ztvVar2, b2, saveButtonText2, turnOffButtonText2, bk11Var2, a, boundPaymentMethodIds2, bindingPaymentInstructions2 != null ? i2b1.c(bindingPaymentInstructions2) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e A[LOOP:2: B:31:0x0158->B:33:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(RegularAutotopupDataDto regularAutotopupDataDto, ContinuationImpl continuationImpl) {
        RegularAutoTopupSettingsMapper$toEntity$1 regularAutoTopupSettingsMapper$toEntity$1;
        int i;
        dsi0 dsi0Var;
        RegularAutotopupStatusEntity regularAutotopupStatusEntity;
        RegularAutotopupStatusEntity regularAutotopupStatusEntity2;
        RegularAutotopupDataDto regularAutotopupDataDto2;
        int d;
        Iterator it;
        LinkedHashMap linkedHashMap;
        if (continuationImpl instanceof RegularAutoTopupSettingsMapper$toEntity$1) {
            regularAutoTopupSettingsMapper$toEntity$1 = (RegularAutoTopupSettingsMapper$toEntity$1) continuationImpl;
            int i2 = regularAutoTopupSettingsMapper$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                regularAutoTopupSettingsMapper$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = regularAutoTopupSettingsMapper$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = regularAutoTopupSettingsMapper$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RegularAutotopupErrorDto error = regularAutotopupDataDto.getError();
                    dsi0Var = error != null ? new dsi0(error.getText(), error.getAction(), error.getRightImage().toEntity()) : null;
                    int i3 = bsi0.c[regularAutotopupDataDto.getStatus().ordinal()];
                    if (i3 == 1) {
                        regularAutotopupStatusEntity = RegularAutotopupStatusEntity.ENABLED;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        regularAutotopupStatusEntity = RegularAutotopupStatusEntity.DISABLED;
                    }
                    AutotopupWidgetSummaryDto summary = regularAutotopupDataDto.getSummary();
                    regularAutoTopupSettingsMapper$toEntity$1.L$0 = regularAutotopupDataDto;
                    regularAutoTopupSettingsMapper$toEntity$1.L$1 = dsi0Var;
                    regularAutoTopupSettingsMapper$toEntity$1.L$2 = regularAutotopupStatusEntity;
                    regularAutoTopupSettingsMapper$toEntity$1.label = 1;
                    Object c = b.c(summary, regularAutoTopupSettingsMapper$toEntity$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    regularAutotopupStatusEntity2 = regularAutotopupStatusEntity;
                    obj = c;
                    regularAutotopupDataDto2 = regularAutotopupDataDto;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RegularAutotopupStatusEntity regularAutotopupStatusEntity3 = (RegularAutotopupStatusEntity) regularAutoTopupSettingsMapper$toEntity$1.L$2;
                    dsi0Var = (dsi0) regularAutoTopupSettingsMapper$toEntity$1.L$1;
                    regularAutotopupDataDto2 = (RegularAutotopupDataDto) regularAutoTopupSettingsMapper$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    regularAutotopupStatusEntity2 = regularAutotopupStatusEntity3;
                }
                dsi0 dsi0Var2 = dsi0Var;
                fa4 fa4Var = (fa4) obj;
                RegularAutotopupLimitsDataDto limitsData = regularAutotopupDataDto2.getLimitsData();
                esi0 esi0Var = new esi0(limitsData.getMax(), limitsData.getMin(), limitsData.getTooltipMax(), limitsData.getTooltipMin());
                giq0 b = this.b.b(regularAutotopupDataDto2.getSelectedOption());
                List<RegularAutotopupOptionDto> availableOptions = regularAutotopupDataDto2.getAvailableOptions();
                ArrayList arrayList = new ArrayList(tcc.n(availableOptions, 10));
                for (RegularAutotopupOptionDto regularAutotopupOptionDto : availableOptions) {
                    FrequencyType b2 = b.b(regularAutotopupOptionDto.getType());
                    String text = regularAutotopupOptionDto.getText();
                    String hintDate = regularAutotopupOptionDto.getHintDate();
                    String hintMoney = regularAutotopupOptionDto.getHintMoney();
                    String formatDate = regularAutotopupOptionDto.getFormatDate();
                    Map<DayOfWeekDto, String> dayOfWeekText = regularAutotopupOptionDto.getDayOfWeekText();
                    if (dayOfWeekText != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(dayOfWeekText.size()));
                        Iterator<T> it2 = dayOfWeekText.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            linkedHashMap2.put(b.a((DayOfWeekDto) entry.getKey()), entry.getValue());
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        linkedHashMap = null;
                    }
                    arrayList.add(new fsi0(b2, text, hintDate, hintMoney, formatDate, linkedHashMap, regularAutotopupOptionDto.getPlaceholderLastDay()));
                }
                d = gw00.d(tcc.n(arrayList, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap3.put(((fsi0) next).a, next);
                }
                return new csi0(dsi0Var2, regularAutotopupStatusEntity2, fa4Var, esi0Var, b, linkedHashMap3);
            }
        }
        regularAutoTopupSettingsMapper$toEntity$1 = new RegularAutoTopupSettingsMapper$toEntity$1(this, continuationImpl);
        Object obj2 = regularAutoTopupSettingsMapper$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = regularAutoTopupSettingsMapper$toEntity$1.label;
        if (i != 0) {
        }
        dsi0 dsi0Var22 = dsi0Var;
        fa4 fa4Var2 = (fa4) obj2;
        RegularAutotopupLimitsDataDto limitsData2 = regularAutotopupDataDto2.getLimitsData();
        esi0 esi0Var2 = new esi0(limitsData2.getMax(), limitsData2.getMin(), limitsData2.getTooltipMax(), limitsData2.getTooltipMin());
        giq0 b3 = this.b.b(regularAutotopupDataDto2.getSelectedOption());
        List<RegularAutotopupOptionDto> availableOptions2 = regularAutotopupDataDto2.getAvailableOptions();
        ArrayList arrayList2 = new ArrayList(tcc.n(availableOptions2, 10));
        while (r0.hasNext()) {
        }
        d = gw00.d(tcc.n(arrayList2, 10));
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap(d);
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return new csi0(dsi0Var22, regularAutotopupStatusEntity2, fa4Var2, esi0Var2, b3, linkedHashMap32);
    }
}
