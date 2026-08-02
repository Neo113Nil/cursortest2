package com.ybsdk.feature.qr.payments.internal.screens.result.domain;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentResult;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionWidgetDto;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.cag0;
import defpackage.lo10;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.scc;
import defpackage.v1v0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(QrPaymentResult qrPaymentResult, Continuation continuation) {
        QrPaymentsResultDataMapper$toPaymentsResultStatus$1 qrPaymentsResultDataMapper$toPaymentsResultStatus$1;
        int i;
        String redirectLink;
        lo10 lo10Var;
        String str;
        v1v0 v1v0Var;
        String str2;
        String str3;
        ResultStatus resultStatus;
        if (continuation instanceof QrPaymentsResultDataMapper$toPaymentsResultStatus$1) {
            qrPaymentsResultDataMapper$toPaymentsResultStatus$1 = (QrPaymentsResultDataMapper$toPaymentsResultStatus$1) continuation;
            int i2 = qrPaymentsResultDataMapper$toPaymentsResultStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsResultDataMapper$toPaymentsResultStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsResultDataMapper$toPaymentsResultStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsResultDataMapper$toPaymentsResultStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ResultStatus a = b.a(qrPaymentResult.getStatus());
                    String paymentId = qrPaymentResult.getPaymentId();
                    MerchantDto merchant = qrPaymentResult.getMerchant();
                    lo10 lo10Var2 = new lo10(merchant.getTitle(), merchant.getDescription(), qxy0.c(merchant.getThemedLogo(), merchant.getLogo()));
                    String title = qrPaymentResult.getTitle();
                    String description = qrPaymentResult.getDescription();
                    SubscriptionWidgetDto subscriptionWidget = qrPaymentResult.getSubscriptionWidget();
                    v1v0 v1v0Var2 = subscriptionWidget != null ? new v1v0(subscriptionWidget.getTitle(), subscriptionWidget.getDescription()) : null;
                    redirectLink = qrPaymentResult.getRedirectLink();
                    DivDataDto divkitWidget = qrPaymentResult.getDivkitWidget();
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$0 = a;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$1 = paymentId;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$2 = lo10Var2;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$3 = title;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$4 = description;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$5 = v1v0Var2;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$6 = redirectLink;
                    qrPaymentsResultDataMapper$toPaymentsResultStatus$1.label = 1;
                    Object b = b.b(divkitWidget, qrPaymentsResultDataMapper$toPaymentsResultStatus$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lo10Var = lo10Var2;
                    str = description;
                    v1v0Var = v1v0Var2;
                    str2 = paymentId;
                    str3 = title;
                    resultStatus = a;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$6;
                    v1v0 v1v0Var3 = (v1v0) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$5;
                    String str5 = (String) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$4;
                    String str6 = (String) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$3;
                    lo10Var = (lo10) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$2;
                    String str7 = (String) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$1;
                    ResultStatus resultStatus2 = (ResultStatus) qrPaymentsResultDataMapper$toPaymentsResultStatus$1.L$0;
                    kotlin.b.b(obj);
                    str3 = str6;
                    str2 = str7;
                    redirectLink = str4;
                    v1v0Var = v1v0Var3;
                    str = str5;
                    resultStatus = resultStatus2;
                }
                return new cag0(resultStatus, str2, lo10Var, str3, str, v1v0Var, redirectLink, scc.h(obj));
            }
        }
        qrPaymentsResultDataMapper$toPaymentsResultStatus$1 = new QrPaymentsResultDataMapper$toPaymentsResultStatus$1(this, continuation);
        Object obj2 = qrPaymentsResultDataMapper$toPaymentsResultStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsResultDataMapper$toPaymentsResultStatus$1.label;
        if (i != 0) {
        }
        return new cag0(resultStatus, str2, lo10Var, str3, str, v1v0Var, redirectLink, scc.h(obj2));
    }
}
