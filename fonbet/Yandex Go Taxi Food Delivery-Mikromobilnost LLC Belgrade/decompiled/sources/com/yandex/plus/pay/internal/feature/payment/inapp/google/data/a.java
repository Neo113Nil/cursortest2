package com.yandex.plus.pay.internal.feature.payment.inapp.google.data;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto;
import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import defpackage.auu0;
import defpackage.bt90;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.hwt;
import defpackage.i3y;
import defpackage.jfd0;
import defpackage.jka0;
import defpackage.jse;
import defpackage.k8u;
import defpackage.kfd0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.rcd0;
import defpackage.sbx;
import defpackage.swj0;
import defpackage.tje;
import defpackage.w511;
import defpackage.y1v0;
import defpackage.zfj0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class a implements hwt {
    public final ExternalMediaBillingApi a;
    public final y1v0 b;
    public final sbx c;
    public final jse d;
    public final i3y e = kotlin.a.a(new zfj0(9));

    public a(ExternalMediaBillingApi externalMediaBillingApi, y1v0 y1v0Var, sbx sbxVar, jse jseVar) {
        this.a = externalMediaBillingApi;
        this.b = y1v0Var;
        this.c = sbxVar;
        this.d = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rcd0 rcd0Var, String str, String str2, String str3, String str4, Map map, ContinuationImpl continuationImpl) {
        RestGoogleReceiptRepository$submitReceipt$1 restGoogleReceiptRepository$submitReceipt$1;
        int i;
        String str5;
        int i2;
        PlusPaySubmitResult.Status status;
        int i3;
        rcd0 rcd0Var2 = rcd0Var;
        if (continuationImpl instanceof RestGoogleReceiptRepository$submitReceipt$1) {
            restGoogleReceiptRepository$submitReceipt$1 = (RestGoogleReceiptRepository$submitReceipt$1) continuationImpl;
            int i4 = restGoogleReceiptRepository$submitReceipt$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                restGoogleReceiptRepository$submitReceipt$1.label = i4 - Integer.MIN_VALUE;
                Object obj = restGoogleReceiptRepository$submitReceipt$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restGoogleReceiptRepository$submitReceipt$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str6 = rcd0Var2.d;
                    String str7 = rcd0Var2.c;
                    sbx sbxVar = this.c;
                    sbxVar.getClass();
                    auu0 auu0Var = auu0.a;
                    RestGoogleReceiptRepository$submitReceipt$response$1 restGoogleReceiptRepository$submitReceipt$response$1 = new RestGoogleReceiptRepository$submitReceipt$response$1(this, new jka0(str6, str, str7, str2, str3, str4, sbxVar.c(map, new k8u(auu0Var, auu0Var, 1))), null);
                    restGoogleReceiptRepository$submitReceipt$1.L$0 = rcd0Var2;
                    restGoogleReceiptRepository$submitReceipt$1.L$1 = null;
                    restGoogleReceiptRepository$submitReceipt$1.L$2 = null;
                    restGoogleReceiptRepository$submitReceipt$1.L$3 = null;
                    restGoogleReceiptRepository$submitReceipt$1.L$4 = null;
                    restGoogleReceiptRepository$submitReceipt$1.L$5 = null;
                    restGoogleReceiptRepository$submitReceipt$1.L$6 = null;
                    restGoogleReceiptRepository$submitReceipt$1.label = 1;
                    obj = tje.k0(this.d, restGoogleReceiptRepository$submitReceipt$response$1, restGoogleReceiptRepository$submitReceipt$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rcd0Var2 = (rcd0) restGoogleReceiptRepository$submitReceipt$1.L$0;
                    b.b(obj);
                }
                mwj0 mwj0Var = (mwj0) obj;
                kfd0 kfd0Var = (kfd0) this.e.getValue();
                Object obj2 = mwj0Var.a;
                String str8 = mwj0Var.b;
                PaymentSubmitResultDto paymentSubmitResultDto = (PaymentSubmitResultDto) obj2;
                kfd0Var.getClass();
                str5 = paymentSubmitResultDto.a;
                if (str5 == null) {
                    str5 = "";
                }
                i2 = jfd0.a[paymentSubmitResultDto.b.ordinal()];
                if (i2 != 1) {
                    status = PlusPaySubmitResult.Status.SUCCESS;
                } else if (i2 == 2) {
                    status = PlusPaySubmitResult.Status.FAIL;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    status = PlusPaySubmitResult.Status.UNKNOWN;
                }
                PlusPaySubmitResult plusPaySubmitResult = new PlusPaySubmitResult(str5, status, paymentSubmitResultDto.c);
                i3 = swj0.a[plusPaySubmitResult.getStatus().ordinal()];
                y1v0 y1v0Var = this.b;
                if (i3 != 1) {
                    if (evu0.J(plusPaySubmitResult.getInvoiceId())) {
                        String str9 = (String) kotlin.collections.a.R(rcd0Var2.b);
                        bt90 bt90Var = y1v0Var.a;
                        if (str8 == null) {
                            str8 = "no_value";
                        }
                        if (str9 == null) {
                            str9 = "no_value";
                        }
                        LinkedHashMap y = g8e.y("requestId", str8, "additionalData", "no_value");
                        y.put("paymentOptionIdentifier", str9);
                        y.put("paymentMethodIdentifier", "no_value");
                        y.put("_meta", bt90.b(new HashMap()));
                        bt90Var.c("Error.Subscription.Mediabilling.Native.SubmitOrder.SuccessWithoutOrderId", y);
                    }
                    return plusPaySubmitResult;
                }
                if (i3 == 2) {
                    String invoiceId = plusPaySubmitResult.getInvoiceId();
                    String str10 = evu0.J(invoiceId) ? null : invoiceId;
                    bt90 bt90Var2 = y1v0Var.a;
                    if (str8 == null) {
                        str8 = "no_value";
                    }
                    if (str10 == null) {
                        str10 = "no_value";
                    }
                    LinkedHashMap y2 = g8e.y("requestId", str8, "additionalData", "no_value");
                    y2.put("transactionIdentifier", "no_value");
                    y2.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str10);
                    y2.put("_meta", bt90.b(new HashMap()));
                    bt90Var2.c("Error.Subscription.Mediabilling.InApp.SubmitReceipt.SubmitingFailed", y2);
                    return plusPaySubmitResult;
                }
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                String str11 = (String) kotlin.collections.a.R(rcd0Var2.b);
                String lowerCase = plusPaySubmitResult.getStatus().name().toLowerCase(Locale.ROOT);
                bt90 bt90Var3 = y1v0Var.a;
                if (str8 == null) {
                    str8 = "no_value";
                }
                if (str11 == null) {
                    str11 = "no_value";
                }
                LinkedHashMap y3 = g8e.y("requestId", str8, "additionalData", "no_value");
                y3.put("transactionIdentifier", "no_value");
                y3.put("productIdentifier", str11);
                y3.put(ACSPConstants.STATUS, lowerCase);
                y3.put("_meta", bt90.b(new HashMap()));
                bt90Var3.c("Error.Subscription.Mediabilling.InApp.SubmitReceipt.UnexpectedStatus", y3);
                return plusPaySubmitResult;
            }
        }
        restGoogleReceiptRepository$submitReceipt$1 = new RestGoogleReceiptRepository$submitReceipt$1(this, continuationImpl);
        Object obj3 = restGoogleReceiptRepository$submitReceipt$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restGoogleReceiptRepository$submitReceipt$1.label;
        if (i != 0) {
        }
        mwj0 mwj0Var2 = (mwj0) obj3;
        kfd0 kfd0Var2 = (kfd0) this.e.getValue();
        Object obj22 = mwj0Var2.a;
        String str82 = mwj0Var2.b;
        PaymentSubmitResultDto paymentSubmitResultDto2 = (PaymentSubmitResultDto) obj22;
        kfd0Var2.getClass();
        str5 = paymentSubmitResultDto2.a;
        if (str5 == null) {
        }
        i2 = jfd0.a[paymentSubmitResultDto2.b.ordinal()];
        if (i2 != 1) {
        }
        PlusPaySubmitResult plusPaySubmitResult2 = new PlusPaySubmitResult(str5, status, paymentSubmitResultDto2.c);
        i3 = swj0.a[plusPaySubmitResult2.getStatus().ordinal()];
        y1v0 y1v0Var2 = this.b;
        if (i3 != 1) {
        }
    }
}
