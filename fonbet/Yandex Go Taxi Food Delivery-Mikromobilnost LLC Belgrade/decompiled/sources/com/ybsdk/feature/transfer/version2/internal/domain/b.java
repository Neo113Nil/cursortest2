package com.ybsdk.feature.transfer.version2.internal.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.dto.C2gTransferRequisitesDto;
import com.ybsdk.feature.transfer.version2.api.dto.HcsInvoiceRequisitesDto;
import com.ybsdk.feature.transfer.version2.api.entities.AutoFundPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.C2gTransferRequisitesEntity;
import com.ybsdk.feature.transfer.version2.api.entities.FundDocsNoticeInfo;
import com.ybsdk.feature.transfer.version2.api.entities.HcsInvoiceRequisitesEntity;
import com.ybsdk.feature.transfer.version2.api.entities.PhoneTransferRequest;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import com.ybsdk.feature.transfer.version2.internal.data.c;
import com.ybsdk.feature.transfer.version2.internal.data.d;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.network.dto.AftTopupRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.AutoFundPayload;
import com.ybsdk.feature.transfer.version2.internal.network.dto.B2cTransferReceiver;
import com.ybsdk.feature.transfer.version2.internal.network.dto.B2cTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CrossBorderByPhoneRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CrossBorderReceiverInfoDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CurrencyRateDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.GeneralTransferType;
import com.ybsdk.feature.transfer.version2.internal.network.dto.InternetPaymentRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.InvoiceHcsTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.Me2MeTopupRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.MkkCashoutTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.MobilePaymentRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.RequisitesHcsTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.RequisitesLegalTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.RequisitesPersonTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SbpC2gTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SelfTopupRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SelfTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import defpackage.ag1;
import defpackage.ajq0;
import defpackage.ak1;
import defpackage.bjq0;
import defpackage.bob1;
import defpackage.cjq0;
import defpackage.d0e0;
import defpackage.d6v;
import defpackage.djq0;
import defpackage.dqg;
import defpackage.ejq0;
import defpackage.evu0;
import defpackage.fjq0;
import defpackage.g801;
import defpackage.gjq0;
import defpackage.gpx0;
import defpackage.gtu0;
import defpackage.h0e0;
import defpackage.h1e0;
import defpackage.hjq0;
import defpackage.hlx0;
import defpackage.i1e0;
import defpackage.ibz0;
import defpackage.ijq0;
import defpackage.j1e0;
import defpackage.jjq0;
import defpackage.k1e0;
import defpackage.kjq0;
import defpackage.ljq0;
import defpackage.lr3;
import defpackage.mjq0;
import defpackage.nh01;
import defpackage.njq0;
import defpackage.ny61;
import defpackage.ojq0;
import defpackage.orp0;
import defpackage.pjq0;
import defpackage.q1e0;
import defpackage.q5a0;
import defpackage.qbg;
import defpackage.rg01;
import defpackage.rjq0;
import defpackage.rk11;
import defpackage.sg01;
import defpackage.sk11;
import defpackage.tfq0;
import defpackage.tjq0;
import defpackage.tpr;
import defpackage.ujq0;
import defpackage.vjq0;
import defpackage.w511;
import defpackage.w530;
import defpackage.wjq0;
import defpackage.wk01;
import defpackage.wls;
import defpackage.wpy0;
import defpackage.wv3;
import defpackage.x4c;
import defpackage.xns;
import defpackage.xv3;
import defpackage.yv3;
import java.math.BigDecimal;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final TransferScenario a;
    public final ag1 b;
    public final com.ybsdk.utils.poller.b c;
    public final wv3 d;
    public final com.ybsdk.feature.transfer.version2.internal.data.helpers.a e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(TransferScenario transferScenario, com.ybsdk.feature.transfer.version2.internal.data.b bVar, d dVar, c cVar, com.ybsdk.feature.transfer.version2.internal.data.a aVar, rg01 rg01Var, ag1 ag1Var, com.ybsdk.utils.poller.b bVar2, wv3 wv3Var) {
        this.a = transferScenario;
        this.b = ag1Var;
        this.c = bVar2;
        this.d = wv3Var;
        switch (transferScenario == null ? -1 : sg01.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            case 0:
            default:
                w511.b();
                throw null;
            case 11:
                bVar = aVar;
                break;
            case 12:
                bVar = dVar;
                break;
            case 13:
                bVar = cVar;
                break;
        }
        hlx0 hlx0Var = rg01Var.a;
        com.ybsdk.feature.transfer.version2.internal.data.a aVar2 = (com.ybsdk.feature.transfer.version2.internal.data.a) ((ibz0) hlx0Var.b).get();
        wpy0 wpy0Var = (wpy0) ((qbg) hlx0Var.c).get();
        ((qbg) hlx0Var.w).get();
        this.e = new com.ybsdk.feature.transfer.version2.internal.data.helpers.a(bVar, aVar2, wpy0Var, (w530) ((qbg) hlx0Var.x).get(), (com.ybsdk.feature.transfer.version2.internal.data.helpers.b) ((gpx0) hlx0Var.y).get());
    }

    public static String e(TransferMainResultScreenParams transferMainResultScreenParams) {
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
            return ((TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams).getTargetAgreementId();
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) {
            return ((TransferMainResultScreenParams.SelfTopupParams) transferMainResultScreenParams).getTargetId();
        }
        if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams)) {
            w511.b();
        }
        return null;
    }

    public static String h(TransferMainResultScreenParams transferMainResultScreenParams) {
        boolean z;
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
            return ((TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams).getPartnerId();
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) {
            return ((TransferMainResultScreenParams.SelfTopupParams) transferMainResultScreenParams).getSourceAgreementId();
        }
        if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) && !((z = transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams)) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams) && !z && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) && !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams)) {
            w511.b();
        }
        return null;
    }

    public static PaymentMethodTypeDto i(TransferMainResultScreenParams transferMainResultScreenParams) {
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
            return PaymentMethodTypeDto.ME2ME;
        }
        if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) {
            return PaymentMethodTypeDto.SAVINGS_ACCOUNT;
        }
        if ((transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams) || (transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams)) {
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransferMainResultScreenParams transferMainResultScreenParams, String str, String str2, d6v d6vVar, ContinuationImpl continuationImpl) {
        Transfer2Interactor$callConfirm$1 transfer2Interactor$callConfirm$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof Transfer2Interactor$callConfirm$1) {
            transfer2Interactor$callConfirm$1 = (Transfer2Interactor$callConfirm$1) continuationImpl;
            int i2 = transfer2Interactor$callConfirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$callConfirm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$callConfirm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$callConfirm$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Transfer2Interactor$callConfirm$result$1 transfer2Interactor$callConfirm$result$1 = new Transfer2Interactor$callConfirm$result$1(this, transferMainResultScreenParams, str, str2, null);
                    transfer2Interactor$callConfirm$1.label = 1;
                    a = com.ybsdk.core.utils.d.a(d6vVar, transfer2Interactor$callConfirm$result$1, transfer2Interactor$callConfirm$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    return (sk11) a;
                }
                x4c.g("Can't load confirm", a2, null, Collections.singletonList(orp0.e), 4);
                return a2 instanceof RetryTimeoutException ? new rk11(new nh01(ResultStatus.TIMEOUT, null, null, null)) : new rk11(new nh01(ResultStatus.ERROR, null, null, null));
            }
        }
        transfer2Interactor$callConfirm$1 = new Transfer2Interactor$callConfirm$1(this, continuationImpl);
        Object obj2 = transfer2Interactor$callConfirm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$callConfirm$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        Transfer2Interactor$callGetResult$1 transfer2Interactor$callGetResult$1;
        int i;
        q1e0 q1e0Var;
        if (continuationImpl instanceof Transfer2Interactor$callGetResult$1) {
            transfer2Interactor$callGetResult$1 = (Transfer2Interactor$callGetResult$1) continuationImpl;
            int i2 = transfer2Interactor$callGetResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$callGetResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$callGetResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$callGetResult$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TransferScenario transferScenario = this.a;
                    switch (transferScenario == null ? -1 : sg01.a[transferScenario.ordinal()]) {
                        case -1:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            if (!z) {
                                q1e0Var = j1e0.b;
                                break;
                            } else {
                                q1e0Var = h1e0.b;
                                break;
                            }
                        case 0:
                        default:
                            w511.b();
                            return null;
                        case 12:
                            if (!z) {
                                q1e0Var = k1e0.b;
                                break;
                            } else {
                                q1e0Var = i1e0.b;
                                break;
                            }
                        case 13:
                            q1e0Var = h0e0.b;
                            break;
                    }
                    com.ybsdk.utils.poller.c c = this.c.c(q1e0Var, new Transfer2Interactor$callGetResult$2(2, null), new Transfer2Interactor$callGetResult$3(this, str, str2, null));
                    transfer2Interactor$callGetResult$1.label = 1;
                    obj = c.d(null, transfer2Interactor$callGetResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new g801(i3, (tpr) obj, this);
            }
        }
        transfer2Interactor$callGetResult$1 = new Transfer2Interactor$callGetResult$1(this, continuationImpl);
        Object obj2 = transfer2Interactor$callGetResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$callGetResult$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        return new g801(i32, (tpr) obj2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wk01 wk01Var, wjq0 wjq0Var, d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        Transfer2Interactor$checkTransfer$1 transfer2Interactor$checkTransfer$1;
        int i;
        wjq0 wjq0Var2;
        GeneralTransferType generalTransferType;
        TransferRequest copy$default;
        PhoneTransferRequest.InputSource dto;
        String str2;
        GeneralTransferType generalTransferType2;
        if (continuationImpl instanceof Transfer2Interactor$checkTransfer$1) {
            transfer2Interactor$checkTransfer$1 = (Transfer2Interactor$checkTransfer$1) continuationImpl;
            int i2 = transfer2Interactor$checkTransfer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$checkTransfer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$checkTransfer$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$checkTransfer$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (wjq0Var == null) {
                    wjq0Var2 = null;
                } else if ((wjq0Var instanceof njq0) || (wjq0Var instanceof ujq0) || (wjq0Var instanceof vjq0) || (wjq0Var instanceof jjq0) || (wjq0Var instanceof ajq0) || (wjq0Var instanceof ljq0) || (wjq0Var instanceof ijq0) || (wjq0Var instanceof tjq0) || (wjq0Var instanceof djq0) || (wjq0Var instanceof cjq0) || (wjq0Var instanceof hjq0) || (wjq0Var instanceof gjq0) || (wjq0Var instanceof kjq0)) {
                    wjq0Var2 = wjq0Var;
                } else if (wjq0Var instanceof pjq0) {
                    pjq0 pjq0Var = (pjq0) wjq0Var;
                    wjq0Var2 = new pjq0(gtu0.b(pjq0Var.a), pjq0Var.b, pjq0Var.c, pjq0Var.d, pjq0Var.e, pjq0Var.f, pjq0Var.g, pjq0Var.h, pjq0Var.i);
                } else if (wjq0Var instanceof rjq0) {
                    rjq0 rjq0Var = (rjq0) wjq0Var;
                    wjq0Var2 = new rjq0(gtu0.b(rjq0Var.a), rjq0Var.b, rjq0Var.c, rjq0Var.d, rjq0Var.e, rjq0Var.f, rjq0Var.g, rjq0Var.h, rjq0Var.i);
                } else {
                    if (!(wjq0Var instanceof ojq0)) {
                        w511.b();
                        return null;
                    }
                    ojq0 ojq0Var = (ojq0) wjq0Var;
                    wjq0Var2 = new ojq0(gtu0.b(ojq0Var.a), ojq0Var.b, ojq0Var.c, ojq0Var.d, ojq0Var.e, ojq0Var.f, ojq0Var.g, ojq0Var.h, ojq0Var.i, ojq0Var.j, ojq0Var.k);
                }
                boolean z = wjq0Var2 instanceof djq0;
                if (z || (wjq0Var2 instanceof kjq0) || (wjq0Var2 instanceof cjq0) || wjq0Var2 == null) {
                    generalTransferType = null;
                } else {
                    if (wjq0Var2 instanceof ajq0) {
                        generalTransferType2 = GeneralTransferType.AFT_TOPUP;
                    } else if (wjq0Var2 instanceof ijq0) {
                        generalTransferType2 = GeneralTransferType.INTERNET_PAYMENT;
                    } else if (wjq0Var2 instanceof jjq0) {
                        generalTransferType2 = GeneralTransferType.ME2ME_TOPUP;
                    } else if (wjq0Var2 instanceof ljq0) {
                        generalTransferType2 = GeneralTransferType.MOBILE_PAYMENT;
                    } else if (wjq0Var2 instanceof njq0) {
                        generalTransferType2 = GeneralTransferType.PHONE;
                    } else if (wjq0Var2 instanceof ojq0) {
                        generalTransferType2 = GeneralTransferType.REQUISITES_HCS;
                    } else if (wjq0Var2 instanceof pjq0) {
                        generalTransferType2 = GeneralTransferType.REQUISITES_LEGAL;
                    } else if (wjq0Var2 instanceof rjq0) {
                        generalTransferType2 = GeneralTransferType.REQUISITES_PERSON;
                    } else if (wjq0Var2 instanceof tjq0) {
                        generalTransferType2 = GeneralTransferType.SBP_C2G_BY_UIN;
                    } else if (wjq0Var2 instanceof hjq0) {
                        generalTransferType2 = GeneralTransferType.INVOICE_HCS;
                    } else if (wjq0Var2 instanceof gjq0) {
                        generalTransferType2 = GeneralTransferType.CROSS_BORDER_BY_PHONE;
                    } else if (wjq0Var2 instanceof ujq0) {
                        generalTransferType2 = wk01Var.a == TransferScenario.FUND ? GeneralTransferType.FUND_CREDIT : GeneralTransferType.SELF_TOPUP;
                    } else {
                        if (!(wjq0Var2 instanceof vjq0)) {
                            w511.b();
                            return null;
                        }
                        generalTransferType2 = wk01Var.a == TransferScenario.FUND ? GeneralTransferType.FUND_DEBIT : GeneralTransferType.SELF;
                    }
                    generalTransferType = generalTransferType2;
                }
                TransferScenario transferScenario = wk01Var.a;
                String str3 = wk01Var.c;
                ak1 ak1Var = wk01Var.g;
                String str4 = ak1Var.a;
                BigDecimal bigDecimal = wk01Var.d;
                TransferRequest transferRequest = new TransferRequest(com.ybsdk.feature.transfer.version2.internal.network.dto.b.b(transferScenario), com.ybsdk.feature.transfer.version2.internal.network.dto.b.a(wk01Var.b), generalTransferType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, wk01Var.u, 262136, null);
                if (z || wjq0Var2 == null) {
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139, null);
                } else if (wjq0Var2 instanceof cjq0) {
                    String str5 = wk01Var.H;
                    if (str5 == null) {
                        str5 = ((cjq0) wjq0Var2).g;
                    }
                    String str6 = str5;
                    cjq0 cjq0Var = (cjq0) wjq0Var2;
                    bjq0 bjq0Var = cjq0Var.e;
                    if (str6 != null) {
                        GeneralTransferType generalTransferType3 = GeneralTransferType.SELF;
                        String str7 = ak1Var.a;
                        Money money = new Money(bigDecimal, str3);
                        String str8 = bjq0Var != null ? bjq0Var.b : null;
                        String str9 = bjq0Var != null ? bjq0Var.a : null;
                        String str10 = wk01Var.e;
                        String str11 = wk01Var.I;
                        PhoneInputSource phoneInputSource = cjq0Var.f;
                        if (phoneInputSource == null) {
                            phoneInputSource = PhoneInputSource.MANUALLY;
                        }
                        copy$default = TransferRequest.copy$default(transferRequest, null, null, generalTransferType3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new B2cTransferRequest(str7, 1, money, str6, new B2cTransferReceiver(str8, str9, str10, phoneInputSource.toDto().name(), bjq0Var != null ? bjq0Var.e : null, (bjq0Var == null || (str2 = bjq0Var.c) == null || evu0.J(str2)) ? null : str2, str11)), null, 393211, null);
                    } else {
                        copy$default = TransferRequest.copy$default(transferRequest, null, null, GeneralTransferType.SELF, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283, null);
                    }
                } else if (wjq0Var2 instanceof njq0) {
                    njq0 njq0Var = (njq0) wjq0Var2;
                    mjq0 mjq0Var = njq0Var.a;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, new PhoneTransferRequest(mjq0Var.b, mjq0Var.a, ak1Var.a, new Money(bigDecimal, str3), wk01Var.e, mjq0Var.e, njq0Var.c.toDto(), mjq0Var.g), null, null, null, null, null, null, null, null, null, null, null, null, null, 524255, null);
                } else if (wjq0Var2 instanceof ujq0) {
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, new SelfTopupRequest(((ujq0) wjq0Var2).a.a, str4, new Money(bigDecimal, str3), null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524271, null);
                } else if (wjq0Var2 instanceof vjq0) {
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, new SelfTransferRequest(str4, ((vjq0) wjq0Var2).a.a, new Money(bigDecimal, str3)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279, null);
                } else if (wjq0Var2 instanceof pjq0) {
                    String str12 = ak1Var.a;
                    Money money2 = new Money(bigDecimal, str3);
                    pjq0 pjq0Var2 = (pjq0) wjq0Var2;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, new RequisitesLegalTransferRequest(str12, money2, pjq0Var2.a, pjq0Var2.g, pjq0Var2.c, pjq0Var2.d, pjq0Var2.e, pjq0Var2.f), null, null, null, null, null, null, null, null, null, null, null, 524159, null);
                } else if (wjq0Var2 instanceof rjq0) {
                    String str13 = ak1Var.a;
                    Money money3 = new Money(bigDecimal, str3);
                    rjq0 rjq0Var2 = (rjq0) wjq0Var2;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, new RequisitesPersonTransferRequest(str13, money3, rjq0Var2.a, rjq0Var2.g, rjq0Var2.c, rjq0Var2.d, rjq0Var2.e.a, rjq0Var2.f), null, null, null, null, null, null, null, null, null, null, null, null, 524223, null);
                } else if (wjq0Var2 instanceof jjq0) {
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, new Me2MeTopupRequest(str4, ((jjq0) wjq0Var2).c.a, new Money(bigDecimal, str3), null), null, null, null, null, null, null, null, null, null, 523775, null);
                } else if (wjq0Var2 instanceof ajq0) {
                    tfq0 tfq0Var = ((ajq0) wjq0Var2).c;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, new AftTopupRequest(str4, tfq0Var.a, tfq0Var.b, new Money(bigDecimal, str3)), null, null, null, null, null, null, null, null, 523263, null);
                } else if (wjq0Var2 instanceof ljq0) {
                    ljq0 ljq0Var = (ljq0) wjq0Var2;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, null, new MobilePaymentRequest(str4, ljq0Var.b.getId(), ljq0Var.c, new Money(bigDecimal, str3)), null, null, null, null, null, null, null, 522239, null);
                } else if (wjq0Var2 instanceof ijq0) {
                    ijq0 ijq0Var = (ijq0) wjq0Var2;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, null, null, new InternetPaymentRequest(str4, ijq0Var.b.getId(), ijq0Var.c, new Money(bigDecimal, str3)), null, null, null, null, null, null, 520191, null);
                } else if (wjq0Var2 instanceof tjq0) {
                    Money money4 = new Money(bigDecimal, str3);
                    tjq0 tjq0Var = (tjq0) wjq0Var2;
                    C2gTransferRequisitesEntity c2gTransferRequisitesEntity = tjq0Var.g;
                    String str14 = tjq0Var.b;
                    String uin = c2gTransferRequisitesEntity.getUin();
                    String paymentPurpose = c2gTransferRequisitesEntity.getPaymentPurpose();
                    MoneyEntity discount = c2gTransferRequisitesEntity.getDiscount();
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, null, null, null, new SbpC2gTransferRequest(str4, money4, str14, new C2gTransferRequisitesDto(uin, paymentPurpose, discount != null ? new Money(discount.getAmount(), discount.getCurrency()) : null, c2gTransferRequisitesEntity.getDiscountExpire(), c2gTransferRequisitesEntity.getPayerName(), c2gTransferRequisitesEntity.getPayerInn(), c2gTransferRequisitesEntity.getPayerKpp(), c2gTransferRequisitesEntity.getTaxiBillDate(), c2gTransferRequisitesEntity.getPayeeName(), c2gTransferRequisitesEntity.getPayeeAccountNumber(), c2gTransferRequisitesEntity.getPayeeBankBic(), c2gTransferRequisitesEntity.getPayeeInn(), c2gTransferRequisitesEntity.getPayeeKpp(), c2gTransferRequisitesEntity.getLegalAct(), c2gTransferRequisitesEntity.getPaymentTerm())), null, null, null, null, null, 516095, null);
                } else if (wjq0Var2 instanceof ojq0) {
                    String str15 = ak1Var.a;
                    Money money5 = new Money(bigDecimal, str3);
                    ojq0 ojq0Var2 = (ojq0) wjq0Var2;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, new RequisitesHcsTransferRequest(str15, money5, ojq0Var2.a, ojq0Var2.b, ojq0Var2.c, ojq0Var2.d, ojq0Var2.h, ojq0Var2.g, ojq0Var2.e, ojq0Var2.f), null, null, null, null, null, null, null, null, null, null, 524031, null);
                } else if (wjq0Var2 instanceof hjq0) {
                    Money money6 = new Money(bigDecimal, str3);
                    HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity = ((hjq0) wjq0Var2).g;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InvoiceHcsTransferRequest(str4, money6, new HcsInvoiceRequisitesDto(hcsInvoiceRequisitesEntity.getInvoiceId(), hcsInvoiceRequisitesEntity.getSourceInvoiceId(), hcsInvoiceRequisitesEntity.getPurposeOfPayment(), hcsInvoiceRequisitesEntity.getDocumentType(), hcsInvoiceRequisitesEntity.getDocumentNumber(), hcsInvoiceRequisitesEntity.getRecipientInn(), hcsInvoiceRequisitesEntity.getRecipientId(), hcsInvoiceRequisitesEntity.getRecipientName())), null, null, null, null, 507903, null);
                } else if (wjq0Var2 instanceof gjq0) {
                    gjq0 gjq0Var = (gjq0) wjq0Var2;
                    SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = gjq0Var.g;
                    BigDecimal bigDecimal2 = selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType == SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT ? bigDecimal : gjq0Var.c;
                    if (selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType != SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.CREDIT) {
                        bigDecimal = gjq0Var.e;
                    }
                    String str16 = ak1Var.a;
                    Money money7 = new Money(bigDecimal2, gjq0Var.d);
                    Money money8 = new Money(bigDecimal, gjq0Var.f);
                    ejq0 ejq0Var = gjq0Var.h;
                    CurrencyRateDto currencyRateDto = ejq0Var != null ? new CurrencyRateDto(new Money(new BigDecimal(ejq0Var.a), ejq0Var.b)) : new CurrencyRateDto(new Money(BigDecimal.TEN, "RUB"));
                    fjq0 fjq0Var = gjq0Var.b;
                    CrossBorderReceiverInfoDto crossBorderReceiverInfoDto = new CrossBorderReceiverInfoDto(fjq0Var.a, fjq0Var.b, fjq0Var.c, wk01Var.J);
                    String name = selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.name();
                    PhoneInputSource phoneInputSource2 = gjq0Var.k;
                    copy$default = TransferRequest.copy$default(transferRequest, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CrossBorderByPhoneRequest(str16, 1, money7, money8, currencyRateDto, crossBorderReceiverInfoDto, name, (phoneInputSource2 == null || (dto = phoneInputSource2.toDto()) == null) ? null : dto.name()), null, null, null, 491519, null);
                } else {
                    if (!(wjq0Var2 instanceof kjq0)) {
                        w511.b();
                        return null;
                    }
                    copy$default = new TransferRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MkkCashoutTransferRequest(new Money(bigDecimal, str3), null), null, null, 196600, null);
                }
                wls transfer2Interactor$checkTransfer$2 = new Transfer2Interactor$checkTransfer$2(wjq0Var2, this, copy$default, null);
                transfer2Interactor$checkTransfer$1.label = 1;
                Object O = d6vVar.O(transfer2Interactor$checkTransfer$2, str, transfer2Interactor$checkTransfer$1);
                return O == obj2 ? obj2 : O;
            }
        }
        transfer2Interactor$checkTransfer$1 = new Transfer2Interactor$checkTransfer$1(this, continuationImpl);
        Object obj3 = transfer2Interactor$checkTransfer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$checkTransfer$1.label;
        if (i == 0) {
        }
    }

    public final AutoFundPayload d(AutoFundPayloadEntity autoFundPayloadEntity, TransferMainResultScreenParams transferMainResultScreenParams, String str) {
        try {
            String e = e(transferMainResultScreenParams);
            String h = h(transferMainResultScreenParams);
            PaymentMethodTypeDto i = i(transferMainResultScreenParams);
            if ((autoFundPayloadEntity != null ? autoFundPayloadEntity.getAutoFundAmount() : null) == null || transferMainResultScreenParams.getTransferId() == null || e == null || i == null || autoFundPayloadEntity.getAutoTopupThreshold() == null || autoFundPayloadEntity.getAutoTopupAmount() == null) {
                return null;
            }
            wv3 wv3Var = this.d;
            String checkId = transferMainResultScreenParams.getCheckId();
            BigDecimal amount = autoFundPayloadEntity.getAutoTopupAmount().getAmount();
            BigDecimal amount2 = autoFundPayloadEntity.getAutoTopupThreshold().getAmount();
            String str2 = (h == null || !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams)) ? null : h;
            if (h == null || !(transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams)) {
                h = null;
            }
            q5a0 q5a0Var = new q5a0(null, h, str2, i);
            AutoTopupType autoTopupType = AutoTopupType.UP_TO_BALANCE;
            AutoTopupSwitchStatus autoTopupSwitchStatus = AutoTopupSwitchStatus.DISABLED;
            MoneyEntity autoFundAmount = autoFundPayloadEntity.getAutoFundAmount();
            return new AutoFundPayload(bob1.f(autoFundPayloadEntity.getAutoFundAmount()), ((xv3) wv3Var).a(new yv3(amount, amount2, q5a0Var, autoTopupType, autoTopupSwitchStatus, new lr3(true, autoFundAmount != null ? autoFundAmount.getAmount() : null)), e, null, checkId, str));
        } catch (Throwable th) {
            x4c.g("can't generate hmac", th, null, Collections.singletonList(orp0.e), 4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Transfer2Interactor$getCrossBorderSuggestedPartners$1 transfer2Interactor$getCrossBorderSuggestedPartners$1;
        int i;
        if (continuationImpl instanceof Transfer2Interactor$getCrossBorderSuggestedPartners$1) {
            transfer2Interactor$getCrossBorderSuggestedPartners$1 = (Transfer2Interactor$getCrossBorderSuggestedPartners$1) continuationImpl;
            int i2 = transfer2Interactor$getCrossBorderSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$getCrossBorderSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$getCrossBorderSuggestedPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$getCrossBorderSuggestedPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2Interactor$getCrossBorderSuggestedPartners$1.label = 1;
                    Object f = this.e.f(str, str2, str3, transfer2Interactor$getCrossBorderSuggestedPartners$1);
                    return f == coroutineSingletons ? coroutineSingletons : f;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2Interactor$getCrossBorderSuggestedPartners$1 = new Transfer2Interactor$getCrossBorderSuggestedPartners$1(this, continuationImpl);
        Object obj2 = transfer2Interactor$getCrossBorderSuggestedPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$getCrossBorderSuggestedPartners$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(FundDocsNoticeInfo fundDocsNoticeInfo, ContinuationImpl continuationImpl) {
        Transfer2Interactor$getFundDocsNotice$1 transfer2Interactor$getFundDocsNotice$1;
        int i;
        Object e;
        if (continuationImpl instanceof Transfer2Interactor$getFundDocsNotice$1) {
            transfer2Interactor$getFundDocsNotice$1 = (Transfer2Interactor$getFundDocsNotice$1) continuationImpl;
            int i2 = transfer2Interactor$getFundDocsNotice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$getFundDocsNotice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$getFundDocsNotice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$getFundDocsNotice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.c.c(d0e0.b, new Transfer2Interactor$getFundDocsNotice$pollingResult$1(2, null), new Transfer2Interactor$getFundDocsNotice$pollingResult$2(this, fundDocsNoticeInfo, null));
                    transfer2Interactor$getFundDocsNotice$1.label = 1;
                    e = c.e(transfer2Interactor$getFundDocsNotice$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (!(e instanceof Result.Failure)) {
                    return e;
                }
                try {
                    return (xns) ((dqg) e).c();
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        transfer2Interactor$getFundDocsNotice$1 = new Transfer2Interactor$getFundDocsNotice$1(this, continuationImpl);
        Object obj2 = transfer2Interactor$getFundDocsNotice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$getFundDocsNotice$1.label;
        if (i != 0) {
        }
        if (!(e instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        Transfer2Interactor$getSenderHistory$1 transfer2Interactor$getSenderHistory$1;
        int i;
        if (continuationImpl instanceof Transfer2Interactor$getSenderHistory$1) {
            transfer2Interactor$getSenderHistory$1 = (Transfer2Interactor$getSenderHistory$1) continuationImpl;
            int i2 = transfer2Interactor$getSenderHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$getSenderHistory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$getSenderHistory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$getSenderHistory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2Interactor$getSenderHistory$1.label = 1;
                    Object i3 = this.e.i(transfer2Interactor$getSenderHistory$1);
                    return i3 == coroutineSingletons ? coroutineSingletons : i3;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2Interactor$getSenderHistory$1 = new Transfer2Interactor$getSenderHistory$1(this, continuationImpl);
        Object obj2 = transfer2Interactor$getSenderHistory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$getSenderHistory$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Transfer2Interactor$getSuggestedPartners$1 transfer2Interactor$getSuggestedPartners$1;
        int i;
        if (continuationImpl instanceof Transfer2Interactor$getSuggestedPartners$1) {
            transfer2Interactor$getSuggestedPartners$1 = (Transfer2Interactor$getSuggestedPartners$1) continuationImpl;
            int i2 = transfer2Interactor$getSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$getSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$getSuggestedPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$getSuggestedPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2Interactor$getSuggestedPartners$1.label = 1;
                    Object j = this.e.j(str, str2, str3, transfer2Interactor$getSuggestedPartners$1);
                    return j == coroutineSingletons ? coroutineSingletons : j;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2Interactor$getSuggestedPartners$1 = new Transfer2Interactor$getSuggestedPartners$1(this, continuationImpl);
        Object obj2 = transfer2Interactor$getSuggestedPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$getSuggestedPartners$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(TransferMainScreenArguments transferMainScreenArguments, d6v d6vVar, ContinuationImpl continuationImpl) {
        Transfer2Interactor$getTransferMainData$1 transfer2Interactor$getTransferMainData$1;
        int i;
        if (continuationImpl instanceof Transfer2Interactor$getTransferMainData$1) {
            transfer2Interactor$getTransferMainData$1 = (Transfer2Interactor$getTransferMainData$1) continuationImpl;
            int i2 = transfer2Interactor$getTransferMainData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$getTransferMainData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Interactor$getTransferMainData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$getTransferMainData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls transfer2Interactor$getTransferMainData$2 = new Transfer2Interactor$getTransferMainData$2(this, transferMainScreenArguments, null);
                transfer2Interactor$getTransferMainData$1.label = 1;
                Object O = d6vVar.O(transfer2Interactor$getTransferMainData$2, "get_transfer_page", transfer2Interactor$getTransferMainData$1);
                return O == obj2 ? obj2 : O;
            }
        }
        transfer2Interactor$getTransferMainData$1 = new Transfer2Interactor$getTransferMainData$1(this, continuationImpl);
        Object obj3 = transfer2Interactor$getTransferMainData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$getTransferMainData$1.label;
        if (i == 0) {
        }
    }
}
