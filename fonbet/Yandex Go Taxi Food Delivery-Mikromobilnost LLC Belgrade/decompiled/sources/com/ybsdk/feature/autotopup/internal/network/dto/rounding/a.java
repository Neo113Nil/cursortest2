package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.InformationButtonDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.ToolbarDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.TurnOffNoticeDto;
import defpackage.bk11;
import defpackage.dzk0;
import defpackage.ezk0;
import defpackage.g5a0;
import defpackage.j5a0;
import defpackage.ny61;
import defpackage.qgf;
import defpackage.tsz0;
import defpackage.uda0;
import defpackage.w530;
import defpackage.ztv;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final w530 a;

    public a(w530 w530Var) {
        this.a = w530Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RoundingSettingsResponse roundingSettingsResponse, ContinuationImpl continuationImpl) {
        RoundingSettingsMapper$map$1 roundingSettingsMapper$map$1;
        int i;
        RoundingSettingsResponse roundingSettingsResponse2;
        if (continuationImpl instanceof RoundingSettingsMapper$map$1) {
            roundingSettingsMapper$map$1 = (RoundingSettingsMapper$map$1) continuationImpl;
            int i2 = roundingSettingsMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roundingSettingsMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roundingSettingsMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roundingSettingsMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RoundingSettingsData data = roundingSettingsResponse.getData();
                    roundingSettingsMapper$map$1.L$0 = roundingSettingsResponse;
                    roundingSettingsMapper$map$1.label = 1;
                    obj = b.a(data, roundingSettingsMapper$map$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    roundingSettingsResponse2 = roundingSettingsResponse;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    roundingSettingsResponse2 = (RoundingSettingsResponse) roundingSettingsMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                dzk0 dzk0Var = (dzk0) obj;
                ToolbarDataDto toolbar = roundingSettingsResponse2.getToolbar();
                tsz0 tsz0Var = new tsz0(toolbar.getSubtitleLeftImage().toEntity(), toolbar.getTitle(), toolbar.getSubtitle(), toolbar.getSubtitleAmount());
                Text f = d.f(roundingSettingsResponse2.getTitle());
                InformationButtonDataDto infoButton = roundingSettingsResponse2.getInfoButton();
                ztv ztvVar = infoButton == null ? new ztv(infoButton.getText(), infoButton.getAction()) : null;
                PaymentMethodsListDto paymentMethods = roundingSettingsResponse2.getPaymentMethods();
                w530 w530Var = this.a;
                uda0 b = j5a0.b(paymentMethods, w530Var, false);
                String saveButtonText = roundingSettingsResponse2.getSaveButtonText();
                String turnOffButtonText = roundingSettingsResponse2.getTurnOffButtonText();
                TurnOffNoticeDto turnOffNotice = roundingSettingsResponse2.getTurnOffNotice();
                bk11 bk11Var = new bk11(turnOffNotice.getTitle(), turnOffNotice.getDescription(), turnOffNotice.getButtonTextPrimary(), turnOffNotice.getButtonTextSecondary());
                CurrentPaymentMethodDto currentPaymentMethod = roundingSettingsResponse2.getCurrentPaymentMethod();
                Object a = currentPaymentMethod == null ? qgf.a(currentPaymentMethod, w530Var, false) : null;
                return new ezk0(dzk0Var, f, tsz0Var, ztvVar, b, saveButtonText, turnOffButtonText, bk11Var, a instanceof g5a0 ? (g5a0) a : null);
            }
        }
        roundingSettingsMapper$map$1 = new RoundingSettingsMapper$map$1(this, continuationImpl);
        Object obj2 = roundingSettingsMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roundingSettingsMapper$map$1.label;
        if (i != 0) {
        }
        dzk0 dzk0Var2 = (dzk0) obj2;
        ToolbarDataDto toolbar2 = roundingSettingsResponse2.getToolbar();
        tsz0 tsz0Var2 = new tsz0(toolbar2.getSubtitleLeftImage().toEntity(), toolbar2.getTitle(), toolbar2.getSubtitle(), toolbar2.getSubtitleAmount());
        Text f2 = d.f(roundingSettingsResponse2.getTitle());
        InformationButtonDataDto infoButton2 = roundingSettingsResponse2.getInfoButton();
        if (infoButton2 == null) {
        }
        PaymentMethodsListDto paymentMethods2 = roundingSettingsResponse2.getPaymentMethods();
        w530 w530Var2 = this.a;
        uda0 b2 = j5a0.b(paymentMethods2, w530Var2, false);
        String saveButtonText2 = roundingSettingsResponse2.getSaveButtonText();
        String turnOffButtonText2 = roundingSettingsResponse2.getTurnOffButtonText();
        TurnOffNoticeDto turnOffNotice2 = roundingSettingsResponse2.getTurnOffNotice();
        bk11 bk11Var2 = new bk11(turnOffNotice2.getTitle(), turnOffNotice2.getDescription(), turnOffNotice2.getButtonTextPrimary(), turnOffNotice2.getButtonTextSecondary());
        CurrentPaymentMethodDto currentPaymentMethod2 = roundingSettingsResponse2.getCurrentPaymentMethod();
        if (currentPaymentMethod2 == null) {
        }
        return new ezk0(dzk0Var2, f2, tsz0Var2, ztvVar, b2, saveButtonText2, turnOffButtonText2, bk11Var2, a instanceof g5a0 ? (g5a0) a : null);
    }
}
