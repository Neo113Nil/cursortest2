package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import com.ybsdk.feature.qr.payments.internal.domain.v2.result.Funding;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import com.ybsdk.feature.qr.payments.internal.network.common.CredlimCheckPayloadDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.confirm.QrPaymentConfirmVersion3Request;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionWidgetDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.result.GetResultRequest;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.CheckPaymentRequestV2;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.CheckPaymentResponseV2;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.ResultPageDataDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.StatusPageDataDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.TooltipActionDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.TooltipWithActionDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.common.PageImageHeaderDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.GetPaymentInfoRequest;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.PaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.SubscriptionInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.SuccessInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.result.GetPaymentResultResponseV2;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.result.PaymentResultV2FailedDataDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.result.PaymentResultV2SuccessDataDto;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.a1v0;
import defpackage.bcp0;
import defpackage.c5z;
import defpackage.c6g0;
import defpackage.cqs;
import defpackage.duz0;
import defpackage.gc5;
import defpackage.gea1;
import defpackage.i8g0;
import defpackage.j8g0;
import defpackage.jl40;
import defpackage.lo10;
import defpackage.mbg0;
import defpackage.mgb;
import defpackage.ns;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.rzj0;
import defpackage.szj0;
import defpackage.tcc;
import defpackage.tzj0;
import defpackage.uzj0;
import defpackage.v1a0;
import defpackage.v1v0;
import defpackage.v8u0;
import defpackage.vpa1;
import defpackage.vzj0;
import defpackage.w511;
import defpackage.x991;
import defpackage.xvz0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final QrPaymentsApi a;
    public final c6g0 b;
    public final com.ybsdk.feature.qr.payments.internal.screens.result.domain.a c;

    public b(QrPaymentsApi qrPaymentsApi, c6g0 c6g0Var, com.ybsdk.feature.qr.payments.internal.screens.result.domain.a aVar) {
        this.a = qrPaymentsApi;
        this.b = c6g0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, CheckPaymentResponseV2 checkPaymentResponseV2, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$toEntity$9 qrPaymentsV2Repository$toEntity$9;
        int i;
        xvz0 xvz0Var;
        rr51 rr51Var;
        xvz0 xvz0Var2;
        rzj0 rzj0Var;
        boolean z;
        String str;
        boolean z2;
        Object obj;
        CheckPaymentResponseV2 checkPaymentResponseV22;
        String str2;
        xvz0 xvz0Var3;
        rzj0 rzj0Var2;
        Map<String, String> divkitAgreementsChipText;
        ArrayList arrayList;
        bVar.getClass();
        if (continuationImpl instanceof QrPaymentsV2Repository$toEntity$9) {
            qrPaymentsV2Repository$toEntity$9 = (QrPaymentsV2Repository$toEntity$9) continuationImpl;
            int i2 = qrPaymentsV2Repository$toEntity$9.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$toEntity$9.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrPaymentsV2Repository$toEntity$9.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$toEntity$9.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean isPaymentAllowed = checkPaymentResponseV2.isPaymentAllowed();
                    String checkId = checkPaymentResponseV2.getCheckId();
                    TooltipWithActionDto tooltip = checkPaymentResponseV2.getTooltip();
                    if (tooltip != null) {
                        String title = tooltip.getTitle();
                        TooltipActionDto action = tooltip.getAction();
                        xvz0Var = new xvz0(title, action != null ? new duz0(action.getValue(), action.getText(), qxy0.c(action.getImage(), null)) : null);
                    } else {
                        xvz0Var = null;
                    }
                    ResultPageDataDto resultPageData = checkPaymentResponseV2.getResultPageData();
                    szj0 szj0Var = new szj0(resultPageData.getLoading().getStateMessages());
                    StatusPageDataDto timeout = resultPageData.getTimeout();
                    v8u0 v8u0Var = new v8u0(timeout.getTitle(), timeout.getDescription());
                    StatusPageDataDto error = resultPageData.getError();
                    rzj0 rzj0Var3 = new rzj0(szj0Var, v8u0Var, new v8u0(error.getTitle(), error.getDescription()));
                    DivDataDto divkitWidget = checkPaymentResponseV2.getDivkitWidget();
                    if (divkitWidget == null) {
                        rr51Var = null;
                        xvz0Var2 = xvz0Var;
                        rzj0Var = rzj0Var3;
                        z = isPaymentAllowed;
                        str = checkId;
                        divkitAgreementsChipText = checkPaymentResponseV2.getDivkitAgreementsChipText();
                        if (divkitAgreementsChipText != null) {
                            ArrayList arrayList2 = new ArrayList(divkitAgreementsChipText.size());
                            for (Map.Entry<String, String> entry : divkitAgreementsChipText.entrySet()) {
                                arrayList2.add(new c5z(entry.getKey(), entry.getValue()));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        CredlimCheckPayloadDto credlimPayload = checkPaymentResponseV2.getCredlimPayload();
                        return new mgb(z, str, xvz0Var2, rzj0Var, rr51Var, arrayList, credlimPayload != null ? credlimPayload.getRepaymentPlanId() : null, checkPaymentResponseV2.getDeclineReason());
                    }
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    qrPaymentsV2Repository$toEntity$9.L$0 = checkPaymentResponseV2;
                    qrPaymentsV2Repository$toEntity$9.L$1 = checkId;
                    qrPaymentsV2Repository$toEntity$9.L$2 = xvz0Var;
                    qrPaymentsV2Repository$toEntity$9.L$3 = rzj0Var3;
                    qrPaymentsV2Repository$toEntity$9.Z$0 = isPaymentAllowed;
                    qrPaymentsV2Repository$toEntity$9.label = 1;
                    Object b = aVar.b(divkitWidget, qrPaymentsV2Repository$toEntity$9);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = isPaymentAllowed;
                    obj = b;
                    checkPaymentResponseV22 = checkPaymentResponseV2;
                    str2 = checkId;
                    xvz0Var3 = xvz0Var;
                    rzj0Var2 = rzj0Var3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = qrPaymentsV2Repository$toEntity$9.Z$0;
                    rzj0Var2 = (rzj0) qrPaymentsV2Repository$toEntity$9.L$3;
                    xvz0Var3 = (xvz0) qrPaymentsV2Repository$toEntity$9.L$2;
                    str2 = (String) qrPaymentsV2Repository$toEntity$9.L$1;
                    checkPaymentResponseV22 = (CheckPaymentResponseV2) qrPaymentsV2Repository$toEntity$9.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                kotlin.b.b(obj);
                rr51Var = (rr51) obj;
                z = z2;
                rzj0Var = rzj0Var2;
                checkPaymentResponseV2 = checkPaymentResponseV22;
                xvz0Var2 = xvz0Var3;
                str = str2;
                divkitAgreementsChipText = checkPaymentResponseV2.getDivkitAgreementsChipText();
                if (divkitAgreementsChipText != null) {
                }
                CredlimCheckPayloadDto credlimPayload2 = checkPaymentResponseV2.getCredlimPayload();
                return new mgb(z, str, xvz0Var2, rzj0Var, rr51Var, arrayList, credlimPayload2 != null ? credlimPayload2.getRepaymentPlanId() : null, checkPaymentResponseV2.getDeclineReason());
            }
        }
        qrPaymentsV2Repository$toEntity$9 = new QrPaymentsV2Repository$toEntity$9(bVar, continuationImpl);
        Object obj22 = qrPaymentsV2Repository$toEntity$9.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$toEntity$9.label;
        if (i != 0) {
        }
        kotlin.b.b(obj);
        rr51Var = (rr51) obj;
        z = z2;
        rzj0Var = rzj0Var2;
        checkPaymentResponseV2 = checkPaymentResponseV22;
        xvz0Var2 = xvz0Var3;
        str = str2;
        divkitAgreementsChipText = checkPaymentResponseV2.getDivkitAgreementsChipText();
        if (divkitAgreementsChipText != null) {
        }
        CredlimCheckPayloadDto credlimPayload22 = checkPaymentResponseV2.getCredlimPayload();
        return new mgb(z, str, xvz0Var2, rzj0Var, rr51Var, arrayList, credlimPayload22 != null ? credlimPayload22.getRepaymentPlanId() : null, checkPaymentResponseV2.getDeclineReason());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.ybsdk.feature.qr.payments.internal.data.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, SuccessInfoDto successInfoDto, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$toEntity$3 qrPaymentsV2Repository$toEntity$3;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof QrPaymentsV2Repository$toEntity$3) {
            qrPaymentsV2Repository$toEntity$3 = (QrPaymentsV2Repository$toEntity$3) continuationImpl;
            int i2 = qrPaymentsV2Repository$toEntity$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$toEntity$3.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Repository$toEntity$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$toEntity$3.label;
                List list = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = mbg0.a[successInfoDto.getQrcType().ordinal()];
                    if (i3 == 1) {
                        PaymentInfoDto paymentInfo = successInfoDto.getPaymentInfo();
                        if (paymentInfo != null) {
                            qrPaymentsV2Repository$toEntity$3.label = 1;
                            obj = bVar.i(paymentInfo, qrPaymentsV2Repository$toEntity$3);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        SubscriptionInfoDto subscriptionInfo = successInfoDto.getSubscriptionInfo();
                        if (subscriptionInfo != null) {
                            String title = subscriptionInfo.getTitle();
                            String description = subscriptionInfo.getDescription();
                            ThemedImageUrlEntity c = qxy0.c(subscriptionInfo.getLogo(), null);
                            String agreementsSheetTitle = subscriptionInfo.getAgreementsSheetTitle();
                            Text.Constant constant = agreementsSheetTitle != null ? new Text.Constant(agreementsSheetTitle) : null;
                            List<AgreementDto> agreements = subscriptionInfo.getAgreements();
                            if (agreements != null) {
                                List<AgreementDto> list2 = agreements;
                                list = new ArrayList(tcc.n(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    list.add(vpa1.c((AgreementDto) it.next()));
                                }
                            }
                            if (list == 0) {
                                list = EmptyList.a;
                            }
                            return new j8g0(new a1v0(new SubscriptionInfoEntity(title, description, c, constant, list), subscriptionInfo.getRedirectUrl(), x991.a(bVar.b.a)));
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return new i8g0((v1a0) obj);
            }
        }
        qrPaymentsV2Repository$toEntity$3 = new QrPaymentsV2Repository$toEntity$3(bVar, continuationImpl);
        Object obj2 = qrPaymentsV2Repository$toEntity$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$toEntity$3.label;
        List list3 = 0;
        if (i != 0) {
        }
        return new i8g0((v1a0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, GetPaymentResultResponseV2 getPaymentResultResponseV2, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$toEntity$11 qrPaymentsV2Repository$toEntity$11;
        int i;
        String paymentId;
        ResultStatus a;
        vzj0 vzj0Var;
        Object obj;
        ResultStatus resultStatus;
        bVar.getClass();
        if (continuationImpl instanceof QrPaymentsV2Repository$toEntity$11) {
            qrPaymentsV2Repository$toEntity$11 = (QrPaymentsV2Repository$toEntity$11) continuationImpl;
            int i2 = qrPaymentsV2Repository$toEntity$11.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$toEntity$11.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrPaymentsV2Repository$toEntity$11.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$toEntity$11.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    paymentId = getPaymentResultResponseV2.getPaymentId();
                    a = com.ybsdk.feature.qr.payments.internal.screens.result.domain.b.a(getPaymentResultResponseV2.getStatus());
                    PaymentResultV2SuccessDataDto successStatusData = getPaymentResultResponseV2.getSuccessStatusData();
                    if (successStatusData == null) {
                        vzj0Var = null;
                        PaymentResultV2FailedDataDto failStatusData = getPaymentResultResponseV2.getFailStatusData();
                        return new tzj0(a, paymentId, vzj0Var, failStatusData != null ? new uzj0(failStatusData.getTitle(), failStatusData.getSubtitle()) : null);
                    }
                    qrPaymentsV2Repository$toEntity$11.L$0 = getPaymentResultResponseV2;
                    qrPaymentsV2Repository$toEntity$11.L$1 = paymentId;
                    qrPaymentsV2Repository$toEntity$11.L$2 = a;
                    qrPaymentsV2Repository$toEntity$11.label = 1;
                    Object j = bVar.j(successStatusData, qrPaymentsV2Repository$toEntity$11);
                    if (j == obj3) {
                        return obj3;
                    }
                    obj = j;
                    resultStatus = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    resultStatus = (ResultStatus) qrPaymentsV2Repository$toEntity$11.L$2;
                    String str = (String) qrPaymentsV2Repository$toEntity$11.L$1;
                    GetPaymentResultResponseV2 getPaymentResultResponseV22 = (GetPaymentResultResponseV2) qrPaymentsV2Repository$toEntity$11.L$0;
                    kotlin.b.b(obj2);
                    paymentId = str;
                    getPaymentResultResponseV2 = getPaymentResultResponseV22;
                    obj = obj2;
                }
                vzj0Var = (vzj0) obj;
                a = resultStatus;
                PaymentResultV2FailedDataDto failStatusData2 = getPaymentResultResponseV2.getFailStatusData();
                return new tzj0(a, paymentId, vzj0Var, failStatusData2 != null ? new uzj0(failStatusData2.getTitle(), failStatusData2.getSubtitle()) : null);
            }
        }
        qrPaymentsV2Repository$toEntity$11 = new QrPaymentsV2Repository$toEntity$11(bVar, continuationImpl);
        Object obj22 = qrPaymentsV2Repository$toEntity$11.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$toEntity$11.label;
        if (i != 0) {
        }
        vzj0Var = (vzj0) obj;
        a = resultStatus;
        PaymentResultV2FailedDataDto failStatusData22 = getPaymentResultResponseV2.getFailStatusData();
        return new tzj0(a, paymentId, vzj0Var, failStatusData22 != null ? new uzj0(failStatusData22.getTitle(), failStatusData22.getSubtitle()) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, DataWithStatusResponse dataWithStatusResponse, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$toEntity$1 qrPaymentsV2Repository$toEntity$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof QrPaymentsV2Repository$toEntity$1) {
            qrPaymentsV2Repository$toEntity$1 = (QrPaymentsV2Repository$toEntity$1) continuationImpl;
            int i2 = qrPaymentsV2Repository$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Repository$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$toEntity$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                QrPaymentsV2Repository$toEntity$2 qrPaymentsV2Repository$toEntity$2 = new QrPaymentsV2Repository$toEntity$2(bVar, null);
                qrPaymentsV2Repository$toEntity$1.label = 1;
                Object b = com.ybsdk.core.utils.dto.b.b(dataWithStatusResponse, qrPaymentsV2Repository$toEntity$2, qrPaymentsV2Repository$toEntity$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        qrPaymentsV2Repository$toEntity$1 = new QrPaymentsV2Repository$toEntity$1(bVar, continuationImpl);
        Object obj2 = qrPaymentsV2Repository$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$toEntity$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, BigDecimal bigDecimal, String str3, String str4, QrSource qrSource, QrPaymentBankInfo qrPaymentBankInfo, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$checkPayment$1 qrPaymentsV2Repository$checkPayment$1;
        int i;
        ProductType productType;
        if (continuationImpl instanceof QrPaymentsV2Repository$checkPayment$1) {
            qrPaymentsV2Repository$checkPayment$1 = (QrPaymentsV2Repository$checkPayment$1) continuationImpl;
            int i2 = qrPaymentsV2Repository$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Repository$checkPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$checkPayment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Money money = new Money(bigDecimal, null, 2, null);
                c6g0 c6g0Var = this.b;
                QrPaymentsV2Repository$checkPayment$2 qrPaymentsV2Repository$checkPayment$2 = new QrPaymentsV2Repository$checkPayment$2(this, str, new CheckPaymentRequestV2(str2, money, c6g0Var.a, c6g0Var.b, str3, str4, gea1.e(qrSource), (qrPaymentBankInfo == null || (productType = qrPaymentBankInfo.getProductType()) == null) ? null : productType.name(), qrPaymentBankInfo != null ? qrPaymentBankInfo.toExternalBankPayloadDto() : null), null);
                qrPaymentsV2Repository$checkPayment$1.label = 1;
                Object c = c.c(qrPaymentsV2Repository$checkPayment$2, qrPaymentsV2Repository$checkPayment$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        qrPaymentsV2Repository$checkPayment$1 = new QrPaymentsV2Repository$checkPayment$1(this, continuationImpl);
        Object obj2 = qrPaymentsV2Repository$checkPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$checkPayment$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, BigDecimal bigDecimal, String str3, int i, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$getPaymentInfo$1 qrPaymentsV2Repository$getPaymentInfo$1;
        int i2;
        if (continuationImpl instanceof QrPaymentsV2Repository$getPaymentInfo$1) {
            qrPaymentsV2Repository$getPaymentInfo$1 = (QrPaymentsV2Repository$getPaymentInfo$1) continuationImpl;
            int i3 = qrPaymentsV2Repository$getPaymentInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$getPaymentInfo$1.label = i3 - Integer.MIN_VALUE;
                QrPaymentsV2Repository$getPaymentInfo$1 qrPaymentsV2Repository$getPaymentInfo$12 = qrPaymentsV2Repository$getPaymentInfo$1;
                Object obj = qrPaymentsV2Repository$getPaymentInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = qrPaymentsV2Repository$getPaymentInfo$12.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c6g0 c6g0Var = this.b;
                QrPaymentsV2Repository$getPaymentInfo$2 qrPaymentsV2Repository$getPaymentInfo$2 = new QrPaymentsV2Repository$getPaymentInfo$2(this, str, new GetPaymentInfoRequest(c6g0Var.a, c6g0Var.b, str2, bigDecimal != null ? new Money(bigDecimal, null, 2, null) : null, str3), i, null);
                qrPaymentsV2Repository$getPaymentInfo$12.label = 1;
                Object c = c.c(qrPaymentsV2Repository$getPaymentInfo$2, qrPaymentsV2Repository$getPaymentInfo$12);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        qrPaymentsV2Repository$getPaymentInfo$1 = new QrPaymentsV2Repository$getPaymentInfo$1(this, continuationImpl);
        QrPaymentsV2Repository$getPaymentInfo$1 qrPaymentsV2Repository$getPaymentInfo$122 = qrPaymentsV2Repository$getPaymentInfo$1;
        Object obj2 = qrPaymentsV2Repository$getPaymentInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = qrPaymentsV2Repository$getPaymentInfo$122.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, String str, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$getResult$1 qrPaymentsV2Repository$getResult$1;
        int i2;
        if (continuationImpl instanceof QrPaymentsV2Repository$getResult$1) {
            qrPaymentsV2Repository$getResult$1 = (QrPaymentsV2Repository$getResult$1) continuationImpl;
            int i3 = qrPaymentsV2Repository$getResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$getResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Repository$getResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = qrPaymentsV2Repository$getResult$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c6g0 c6g0Var = this.b;
                QrPaymentsV2Repository$getResult$2 qrPaymentsV2Repository$getResult$2 = new QrPaymentsV2Repository$getResult$2(this, new GetResultRequest(str, c6g0Var.a, c6g0Var.b), i, null);
                qrPaymentsV2Repository$getResult$1.label = 1;
                Object c = c.c(qrPaymentsV2Repository$getResult$2, qrPaymentsV2Repository$getResult$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        qrPaymentsV2Repository$getResult$1 = new QrPaymentsV2Repository$getResult$1(this, continuationImpl);
        Object obj2 = qrPaymentsV2Repository$getResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = qrPaymentsV2Repository$getResult$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, String str3, String str4, String str5, Money money, String str6, String str7, String str8, String str9, QrSource qrSource, QrPaymentBankInfo qrPaymentBankInfo, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$qrPaymentsResultConfirmV3$1 qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1;
        int i;
        Object c;
        ProductType productType;
        Throwable a;
        if (continuationImpl instanceof QrPaymentsV2Repository$qrPaymentsResultConfirmV3$1) {
            qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1 = (QrPaymentsV2Repository$qrPaymentsResultConfirmV3$1) continuationImpl;
            int i2 = qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2 qrPaymentsV2Repository$qrPaymentsResultConfirmV3$2 = new QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2(this, str3, str2, str4, new QrPaymentConfirmVersion3Request(new HmacDto(str6, HmacDto.Version.ONE), str5, str, str7, money, this.b.b, str8, str9, qrSource != null ? gea1.e(qrSource) : null, (qrPaymentBankInfo == null || (productType = qrPaymentBankInfo.getProductType()) == null) ? null : productType.name(), qrPaymentBankInfo != null ? qrPaymentBankInfo.toExternalBankPayloadDto() : null), null);
                    qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.label = 1;
                    c = c.c(qrPaymentsV2Repository$qrPaymentsResultConfirmV3$2, qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                QrPaymentsV2Repository$qrPaymentsResultConfirmV3$3$1 qrPaymentsV2Repository$qrPaymentsResultConfirmV3$3$1 = new QrPaymentsV2Repository$qrPaymentsResultConfirmV3$3$1(2, this.c, com.ybsdk.feature.qr.payments.internal.screens.result.domain.a.class, "toPaymentsResultStatus", "toPaymentsResultStatus(Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, qrPaymentsV2Repository$qrPaymentsResultConfirmV3$3$1, qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1 = new QrPaymentsV2Repository$qrPaymentsResultConfirmV3$1(this, continuationImpl);
        Object obj2 = qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$qrPaymentsResultConfirmV3$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(PaymentInfoDto paymentInfoDto, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$toEntity$6 qrPaymentsV2Repository$toEntity$6;
        int i;
        PageImageHeaderEntity pageImageHeaderEntity;
        Money money;
        Object obj;
        lo10 lo10Var;
        String str;
        PaymentInfoDto paymentInfoDto2;
        if (continuationImpl instanceof QrPaymentsV2Repository$toEntity$6) {
            qrPaymentsV2Repository$toEntity$6 = (QrPaymentsV2Repository$toEntity$6) continuationImpl;
            int i2 = qrPaymentsV2Repository$toEntity$6.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$toEntity$6.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrPaymentsV2Repository$toEntity$6.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$toEntity$6.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PageImageHeaderDto header = paymentInfoDto.getHeader();
                    ThemedImageUrlEntity c = qxy0.c(header.getTitleImage(), null);
                    Themes<String> cornerImage = header.getCornerImage();
                    pageImageHeaderEntity = new PageImageHeaderEntity(c, cornerImage != null ? qxy0.c(cornerImage, null) : null);
                    MerchantDto merchant = paymentInfoDto.getMerchant();
                    lo10 lo10Var2 = new lo10(merchant.getTitle(), merchant.getDescription(), qxy0.c(merchant.getThemedLogo(), merchant.getLogo()));
                    Money amount = paymentInfoDto.getAmount();
                    String purpose = paymentInfoDto.getPurpose();
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto agreementsData = paymentInfoDto.getAgreementsData();
                    qrPaymentsV2Repository$toEntity$6.L$0 = paymentInfoDto;
                    qrPaymentsV2Repository$toEntity$6.L$1 = pageImageHeaderEntity;
                    qrPaymentsV2Repository$toEntity$6.L$2 = lo10Var2;
                    qrPaymentsV2Repository$toEntity$6.L$3 = amount;
                    qrPaymentsV2Repository$toEntity$6.L$4 = purpose;
                    qrPaymentsV2Repository$toEntity$6.label = 1;
                    Object b = aVar.b(agreementsData, qrPaymentsV2Repository$toEntity$6);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    money = amount;
                    obj = b;
                    lo10Var = lo10Var2;
                    str = purpose;
                    paymentInfoDto2 = paymentInfoDto;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) qrPaymentsV2Repository$toEntity$6.L$4;
                    Money money2 = (Money) qrPaymentsV2Repository$toEntity$6.L$3;
                    lo10Var = (lo10) qrPaymentsV2Repository$toEntity$6.L$2;
                    PageImageHeaderEntity pageImageHeaderEntity2 = (PageImageHeaderEntity) qrPaymentsV2Repository$toEntity$6.L$1;
                    paymentInfoDto2 = (PaymentInfoDto) qrPaymentsV2Repository$toEntity$6.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                    money = money2;
                    pageImageHeaderEntity = pageImageHeaderEntity2;
                    str = str2;
                }
                kotlin.b.b(obj);
                return new v1a0(pageImageHeaderEntity, lo10Var, money, str, (rr51) obj, new bcp0(ns.a(paymentInfoDto2.getButtons().getSelectAgreementButton()), ns.a(paymentInfoDto2.getButtons().getPaymentButton())), paymentInfoDto2.isAmountEditable(), x991.a(this.b.a));
            }
        }
        qrPaymentsV2Repository$toEntity$6 = new QrPaymentsV2Repository$toEntity$6(this, continuationImpl);
        Object obj22 = qrPaymentsV2Repository$toEntity$6.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$toEntity$6.label;
        if (i != 0) {
        }
        kotlin.b.b(obj);
        return new v1a0(pageImageHeaderEntity, lo10Var, money, str, (rr51) obj, new bcp0(ns.a(paymentInfoDto2.getButtons().getSelectAgreementButton()), ns.a(paymentInfoDto2.getButtons().getPaymentButton())), paymentInfoDto2.isAmountEditable(), x991.a(this.b.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto, ContinuationImpl continuationImpl) {
        QrPaymentsV2Repository$toEntity$12 qrPaymentsV2Repository$toEntity$12;
        int i;
        String str;
        v1v0 v1v0Var;
        gc5 gc5Var;
        String str2;
        PaymentResultV2SuccessDataDto paymentResultV2SuccessDataDto2;
        v1v0 v1v0Var2;
        int length;
        int i2;
        Funding funding;
        if (continuationImpl instanceof QrPaymentsV2Repository$toEntity$12) {
            qrPaymentsV2Repository$toEntity$12 = (QrPaymentsV2Repository$toEntity$12) continuationImpl;
            int i3 = qrPaymentsV2Repository$toEntity$12.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Repository$toEntity$12.label = i3 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Repository$toEntity$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Repository$toEntity$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SubscriptionWidgetDto subscriptionWidget = paymentResultV2SuccessDataDto.getSubscriptionWidget();
                    v1v0 v1v0Var3 = subscriptionWidget != null ? new v1v0(subscriptionWidget.getTitle(), subscriptionWidget.getDescription()) : null;
                    String redirectLink = paymentResultV2SuccessDataDto.getRedirectLink();
                    DivDataDto divData = paymentResultV2SuccessDataDto.getDivData();
                    if (divData == null) {
                        str = redirectLink;
                        v1v0Var = v1v0Var3;
                        gc5Var = null;
                        ActionButtonDto button = paymentResultV2SuccessDataDto.getButton();
                        ActionButtonEntity a = button != null ? ns.a(button) : null;
                        cqs cqsVar = Funding.Companion;
                        String funding2 = paymentResultV2SuccessDataDto.getFunding();
                        cqsVar.getClass();
                        Funding[] values = Funding.values();
                        length = values.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                funding = null;
                                break;
                            }
                            Funding funding3 = values[i2];
                            if (jl40.l(funding3.name(), funding2)) {
                                funding = funding3;
                                break;
                            }
                            i2++;
                        }
                        return new vzj0(v1v0Var, str, gc5Var, a, funding);
                    }
                    qrPaymentsV2Repository$toEntity$12.L$0 = paymentResultV2SuccessDataDto;
                    qrPaymentsV2Repository$toEntity$12.L$1 = v1v0Var3;
                    qrPaymentsV2Repository$toEntity$12.L$2 = redirectLink;
                    qrPaymentsV2Repository$toEntity$12.label = 1;
                    Object b = com.ybsdk.feature.qr.payments.internal.screens.result.domain.b.b(divData, qrPaymentsV2Repository$toEntity$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = redirectLink;
                    obj = b;
                    paymentResultV2SuccessDataDto2 = paymentResultV2SuccessDataDto;
                    v1v0Var2 = v1v0Var3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) qrPaymentsV2Repository$toEntity$12.L$2;
                    v1v0Var2 = (v1v0) qrPaymentsV2Repository$toEntity$12.L$1;
                    paymentResultV2SuccessDataDto2 = (PaymentResultV2SuccessDataDto) qrPaymentsV2Repository$toEntity$12.L$0;
                    kotlin.b.b(obj);
                }
                gc5Var = (gc5) obj;
                str = str2;
                v1v0Var = v1v0Var2;
                paymentResultV2SuccessDataDto = paymentResultV2SuccessDataDto2;
                ActionButtonDto button2 = paymentResultV2SuccessDataDto.getButton();
                if (button2 != null) {
                }
                cqs cqsVar2 = Funding.Companion;
                String funding22 = paymentResultV2SuccessDataDto.getFunding();
                cqsVar2.getClass();
                Funding[] values2 = Funding.values();
                length = values2.length;
                i2 = 0;
                while (true) {
                    if (i2 >= length) {
                    }
                    i2++;
                }
                return new vzj0(v1v0Var, str, gc5Var, a, funding);
            }
        }
        qrPaymentsV2Repository$toEntity$12 = new QrPaymentsV2Repository$toEntity$12(this, continuationImpl);
        Object obj2 = qrPaymentsV2Repository$toEntity$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Repository$toEntity$12.label;
        if (i != 0) {
        }
        gc5Var = (gc5) obj2;
        str = str2;
        v1v0Var = v1v0Var2;
        paymentResultV2SuccessDataDto = paymentResultV2SuccessDataDto2;
        ActionButtonDto button22 = paymentResultV2SuccessDataDto.getButton();
        if (button22 != null) {
        }
        cqs cqsVar22 = Funding.Companion;
        String funding222 = paymentResultV2SuccessDataDto.getFunding();
        cqsVar22.getClass();
        Funding[] values22 = Funding.values();
        length = values22.length;
        i2 = 0;
        while (true) {
            if (i2 >= length) {
            }
            i2++;
        }
        return new vzj0(v1v0Var, str, gc5Var, a, funding);
    }
}
