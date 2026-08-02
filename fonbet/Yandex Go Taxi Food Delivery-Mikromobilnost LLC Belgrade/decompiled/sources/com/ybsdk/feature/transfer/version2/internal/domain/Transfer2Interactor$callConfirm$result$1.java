package com.ybsdk.feature.transfer.version2.internal.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.dto.C2gTransferRequisitesDto;
import com.ybsdk.feature.transfer.version2.api.dto.HcsInvoiceRequisitesDto;
import com.ybsdk.feature.transfer.version2.api.entities.PhoneTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.AftTopupRequest;
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
import defpackage.b64;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.kfb0;
import defpackage.mvg;
import defpackage.ni01;
import defpackage.ny61;
import defpackage.oi01;
import defpackage.sg01;
import defpackage.tm60;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lnh01;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.domain.Transfer2Interactor$callConfirm$result$1", f = "Transfer2Interactor.kt", l = {HProv.PP_AUTH_INFO}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Interactor$callConfirm$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ TransferMainResultScreenParams $params;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Interactor$callConfirm$result$1(b bVar, TransferMainResultScreenParams transferMainResultScreenParams, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$params = transferMainResultScreenParams;
        this.$verificationToken = str;
        this.$operationId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Interactor$callConfirm$result$1 transfer2Interactor$callConfirm$result$1 = new Transfer2Interactor$callConfirm$result$1(this.this$0, this.$params, this.$verificationToken, this.$operationId, continuation);
        transfer2Interactor$callConfirm$result$1.L$0 = obj;
        return transfer2Interactor$callConfirm$result$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2Interactor$callConfirm$result$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0998  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TransferRequest transferRequest;
        PhoneTransferRequest.InputSource dto;
        String name;
        Object obj2;
        String p;
        String planToken;
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            String str2 = (String) this.L$0;
            b bVar = this.this$0;
            String str3 = bVar.b.b;
            TransferMainResultScreenParams transferMainResultScreenParams = this.$params;
            String str4 = this.$verificationToken;
            TransferRequest transferRequest2 = new TransferRequest(com.ybsdk.feature.transfer.version2.internal.network.dto.b.b(transferMainResultScreenParams.getScenario()), com.ybsdk.feature.transfer.version2.internal.network.dto.b.a(transferMainResultScreenParams.getDirection()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, transferMainResultScreenParams.getTransferId(), 262136, null);
            if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.PhoneTransferParams) {
                TransferMainResultScreenParams.PhoneTransferParams phoneTransferParams = (TransferMainResultScreenParams.PhoneTransferParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.PHONE, null, null, new PhoneTransferRequest(phoneTransferParams.getPhone(), phoneTransferParams.getPartnerId(), phoneTransferParams.getSourceAgreementId(), new Money(phoneTransferParams.getMoney().getAmount(), phoneTransferParams.getMoney().getCurrency()), phoneTransferParams.getComment(), phoneTransferParams.getRequestId(), phoneTransferParams.getPhoneInputSource().toDto(), phoneTransferParams.getPam()), null, null, null, null, null, null, null, null, null, null, null, null, null, 524251, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams) {
                GeneralTransferType generalTransferType = GeneralTransferType.SELF;
                TransferMainResultScreenParams.B2cTransferParams b2cTransferParams = (TransferMainResultScreenParams.B2cTransferParams) transferMainResultScreenParams;
                String sourceAgreementId = b2cTransferParams.getSourceAgreementId();
                Money money = new Money(b2cTransferParams.getMoney().getAmount(), b2cTransferParams.getMoney().getCurrency());
                String planToken2 = b2cTransferParams.getPlanToken();
                String targetPhone = b2cTransferParams.getTargetPhone();
                String targetPartnerId = b2cTransferParams.getTargetPartnerId();
                String message = b2cTransferParams.getMessage();
                String name2 = b2cTransferParams.getInputSource().toDto().name();
                String checkId = b2cTransferParams.getCheckId();
                String targetName = b2cTransferParams.getTargetName();
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, generalTransferType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new B2cTransferRequest(sourceAgreementId, 1, money, planToken2, new B2cTransferReceiver(targetPhone, targetPartnerId, message, name2, checkId, !evu0.J(targetName) ? targetName : null, null, 64, null)), null, 393211, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTransferParams) {
                TransferMainResultScreenParams.SelfTransferParams selfTransferParams = (TransferMainResultScreenParams.SelfTransferParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, selfTransferParams.getScenario() == TransferScenario.FUND ? GeneralTransferType.FUND_DEBIT : GeneralTransferType.SELF, new SelfTransferRequest(selfTransferParams.getSourceAgreementId(), selfTransferParams.getTargetAgreementId(), new Money(selfTransferParams.getMoney().getAmount(), selfTransferParams.getMoney().getCurrency())), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524275, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.SelfTopupParams) {
                TransferMainResultScreenParams.SelfTopupParams selfTopupParams = (TransferMainResultScreenParams.SelfTopupParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, selfTopupParams.getScenario() == TransferScenario.FUND ? GeneralTransferType.FUND_CREDIT : GeneralTransferType.SELF_TOPUP, null, new SelfTopupRequest(selfTopupParams.getSourceAgreementId(), selfTopupParams.getTargetId(), new Money(selfTopupParams.getMoney().getAmount(), selfTopupParams.getMoney().getCurrency()), bVar.d(selfTopupParams.getAutoFundPayload(), transferMainResultScreenParams, str4)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524267, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) {
                TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams requisitesLegalTransferParams = (TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.REQUISITES_LEGAL, null, null, null, null, new RequisitesLegalTransferRequest(requisitesLegalTransferParams.getSourceAgreementId(), new Money(requisitesLegalTransferParams.getMoney().getAmount(), requisitesLegalTransferParams.getMoney().getCurrency()), requisitesLegalTransferParams.getAccountNumber(), requisitesLegalTransferParams.getBic(), requisitesLegalTransferParams.getBeneficiaryName(), requisitesLegalTransferParams.getInn(), requisitesLegalTransferParams.getVatIncluded(), requisitesLegalTransferParams.getPaymentPurpose()), null, null, null, null, null, null, null, null, null, null, null, 524155, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) {
                TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams requisitesPersonTransferParams = (TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.REQUISITES_PERSON, null, null, null, new RequisitesPersonTransferRequest(requisitesPersonTransferParams.getSourceAgreementId(), new Money(requisitesPersonTransferParams.getMoney().getAmount(), requisitesPersonTransferParams.getMoney().getCurrency()), requisitesPersonTransferParams.getAccountNumber(), requisitesPersonTransferParams.getBic(), requisitesPersonTransferParams.getFirstName(), requisitesPersonTransferParams.getLastName(), requisitesPersonTransferParams.getMiddleName().getName(), requisitesPersonTransferParams.getPaymentPurpose()), null, null, null, null, null, null, null, null, null, null, null, null, 524219, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
                TransferMainResultScreenParams.Me2MeTopupParams me2MeTopupParams = (TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.ME2ME_TOPUP, null, null, null, null, null, null, new Me2MeTopupRequest(me2MeTopupParams.getTargetAgreementId(), me2MeTopupParams.getPartnerId(), new Money(me2MeTopupParams.getMoney().getAmount(), me2MeTopupParams.getMoney().getCurrency()), bVar.d(me2MeTopupParams.getAutoFundPayload(), transferMainResultScreenParams, str4)), null, null, null, null, null, null, null, null, null, 523771, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.AftTopupParams) {
                TransferMainResultScreenParams.AftTopupParams aftTopupParams = (TransferMainResultScreenParams.AftTopupParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.AFT_TOPUP, null, null, null, null, null, null, null, new AftTopupRequest(aftTopupParams.getTargetAgreementId(), aftTopupParams.getCardId(), aftTopupParams.getPartnerId(), new Money(aftTopupParams.getMoney().getAmount(), aftTopupParams.getMoney().getCurrency())), null, null, null, null, null, null, null, null, 523259, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.MobilePaymentParams) {
                TransferMainResultScreenParams.MobilePaymentParams mobilePaymentParams = (TransferMainResultScreenParams.MobilePaymentParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.MOBILE_PAYMENT, null, null, null, null, null, null, null, null, new MobilePaymentRequest(mobilePaymentParams.getSourceAgreementId(), mobilePaymentParams.getProviderId(), mobilePaymentParams.getPhone(), new Money(mobilePaymentParams.getMoney().getAmount(), mobilePaymentParams.getMoney().getCurrency())), null, null, null, null, null, null, null, 522235, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.InternetPaymentParams) {
                TransferMainResultScreenParams.InternetPaymentParams internetPaymentParams = (TransferMainResultScreenParams.InternetPaymentParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.INTERNET_PAYMENT, null, null, null, null, null, null, null, null, null, new InternetPaymentRequest(internetPaymentParams.getSourceAgreementId(), internetPaymentParams.getProviderId(), internetPaymentParams.getAccountNumber(), new Money(internetPaymentParams.getMoney().getAmount(), internetPaymentParams.getMoney().getCurrency())), null, null, null, null, null, null, 520187, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.C2gTransferParams) {
                GeneralTransferType generalTransferType2 = GeneralTransferType.SBP_C2G_BY_UIN;
                TransferMainResultScreenParams.C2gTransferParams c2gTransferParams = (TransferMainResultScreenParams.C2gTransferParams) transferMainResultScreenParams;
                String sourceAgreementId2 = c2gTransferParams.getSourceAgreementId();
                Money money2 = new Money(c2gTransferParams.getMoney().getAmount(), c2gTransferParams.getMoney().getCurrency());
                String invoiceId = c2gTransferParams.getInvoiceId();
                String uin = c2gTransferParams.getRequisites().getUin();
                String paymentPurpose = c2gTransferParams.getRequisites().getPaymentPurpose();
                MoneyEntity discount = c2gTransferParams.getRequisites().getDiscount();
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, generalTransferType2, null, null, null, null, null, null, null, null, null, null, new SbpC2gTransferRequest(sourceAgreementId2, money2, invoiceId, new C2gTransferRequisitesDto(uin, paymentPurpose, discount != null ? new Money(discount.getAmount(), discount.getCurrency()) : null, c2gTransferParams.getRequisites().getDiscountExpire(), c2gTransferParams.getRequisites().getPayerName(), c2gTransferParams.getRequisites().getPayerInn(), c2gTransferParams.getRequisites().getPayerKpp(), c2gTransferParams.getRequisites().getTaxiBillDate(), c2gTransferParams.getRequisites().getPayeeName(), c2gTransferParams.getRequisites().getPayeeAccountNumber(), c2gTransferParams.getRequisites().getPayeeBankBic(), c2gTransferParams.getRequisites().getPayeeInn(), c2gTransferParams.getRequisites().getPayeeKpp(), c2gTransferParams.getRequisites().getLegalAct(), c2gTransferParams.getRequisites().getPaymentTerm())), null, null, null, null, null, 516091, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) {
                GeneralTransferType generalTransferType3 = GeneralTransferType.REQUISITES_HCS;
                TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams requisitesHcsTransferParams = (TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) transferMainResultScreenParams;
                String sourceAgreementId3 = requisitesHcsTransferParams.getSourceAgreementId();
                Money money3 = new Money(requisitesHcsTransferParams.getMoney().getAmount(), requisitesHcsTransferParams.getMoney().getCurrency());
                String accountNumber = requisitesHcsTransferParams.getAccountNumber();
                String bic = requisitesHcsTransferParams.getBic();
                String inn = requisitesHcsTransferParams.getInn();
                boolean vatIncluded = requisitesHcsTransferParams.getVatIncluded();
                String beneficiaryName = requisitesHcsTransferParams.getBeneficiaryName();
                String hcsPersonalAccount = requisitesHcsTransferParams.getHcsPersonalAccount();
                String paymentPeriod = requisitesHcsTransferParams.getPaymentPeriod();
                String paymentPurpose2 = requisitesHcsTransferParams.getPaymentPurpose();
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, generalTransferType3, null, null, null, null, null, new RequisitesHcsTransferRequest(sourceAgreementId3, money3, accountNumber, bic, beneficiaryName, inn, vatIncluded, paymentPurpose2 == null ? "" : paymentPurpose2, hcsPersonalAccount, paymentPeriod), null, null, null, null, null, null, null, null, null, null, 524027, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams) {
                TransferMainResultScreenParams.HcsInvoiceTransferParams hcsInvoiceTransferParams = (TransferMainResultScreenParams.HcsInvoiceTransferParams) transferMainResultScreenParams;
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, GeneralTransferType.INVOICE_HCS, null, null, null, null, null, null, null, null, null, null, null, new InvoiceHcsTransferRequest(hcsInvoiceTransferParams.getSourceAgreementId(), new Money(hcsInvoiceTransferParams.getMoney().getAmount(), hcsInvoiceTransferParams.getMoney().getCurrency()), new HcsInvoiceRequisitesDto(hcsInvoiceTransferParams.getRequisites().getInvoiceId(), hcsInvoiceTransferParams.getRequisites().getSourceInvoiceId(), hcsInvoiceTransferParams.getRequisites().getPurposeOfPayment(), hcsInvoiceTransferParams.getRequisites().getDocumentType(), hcsInvoiceTransferParams.getRequisites().getDocumentNumber(), hcsInvoiceTransferParams.getRequisites().getRecipientInn(), hcsInvoiceTransferParams.getRequisites().getRecipientId(), hcsInvoiceTransferParams.getRequisites().getRecipientName())), null, null, null, null, 507899, null);
            } else if (transferMainResultScreenParams instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams) {
                GeneralTransferType generalTransferType4 = GeneralTransferType.CROSS_BORDER_BY_PHONE;
                TransferMainResultScreenParams.CrossBorderByPhoneParams crossBorderByPhoneParams = (TransferMainResultScreenParams.CrossBorderByPhoneParams) transferMainResultScreenParams;
                String sourceAgreementId4 = crossBorderByPhoneParams.getSourceAgreementId();
                Money money4 = new Money(crossBorderByPhoneParams.getMoney().getAmount(), crossBorderByPhoneParams.getMoney().getCurrency());
                Money money5 = new Money(crossBorderByPhoneParams.getCreditMoney().getAmount(), crossBorderByPhoneParams.getCreditMoney().getCurrency());
                TransferMainResultScreenParams.CurrencyRateEntity currencyRate = crossBorderByPhoneParams.getCurrencyRate();
                CurrencyRateDto currencyRateDto = currencyRate != null ? new CurrencyRateDto(new Money(new BigDecimal(currencyRate.getRate()), currencyRate.getCurrency())) : new CurrencyRateDto(new Money(crossBorderByPhoneParams.getMoney().getAmount(), crossBorderByPhoneParams.getMoney().getCurrency()));
                CrossBorderReceiverInfoDto crossBorderReceiverInfoDto = new CrossBorderReceiverInfoDto(crossBorderByPhoneParams.getPhone(), crossBorderByPhoneParams.getPartnerId(), crossBorderByPhoneParams.getReceiverFullName(), crossBorderByPhoneParams.getCountry());
                String name3 = crossBorderByPhoneParams.getPriorityMoneyType().name();
                PhoneInputSource phoneInputSource = crossBorderByPhoneParams.getPhoneInputSource();
                transferRequest = TransferRequest.copy$default(transferRequest2, null, null, generalTransferType4, null, null, null, null, null, null, null, null, null, null, null, null, new CrossBorderByPhoneRequest(sourceAgreementId4, 1, money4, money5, currencyRateDto, crossBorderReceiverInfoDto, name3, (phoneInputSource == null || (dto = phoneInputSource.toDto()) == null) ? null : dto.name()), null, null, null, 491515, null);
            } else {
                if (!(transferMainResultScreenParams instanceof TransferMainResultScreenParams.MkkCashoutParams)) {
                    w511.b();
                    return null;
                }
                TransferMainResultScreenParams.MkkCashoutParams mkkCashoutParams = (TransferMainResultScreenParams.MkkCashoutParams) transferMainResultScreenParams;
                transferRequest = new TransferRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MkkCashoutTransferRequest(new Money(mkkCashoutParams.getMoney().getAmount(), mkkCashoutParams.getMoney().getCurrency()), mkkCashoutParams.getPlanId()), null, null, 196600, null);
            }
            b bVar2 = this.this$0;
            TransferScenario scenario = this.$params.getScenario();
            bVar2.getClass();
            switch (scenario == null ? -1 : sg01.a[scenario.ordinal()]) {
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
                case 12:
                    GeneralTransferType type = this.$params instanceof TransferMainResultScreenParams.B2cTransferParams ? GeneralTransferType.SBP_B2C_CREDLIM : transferRequest.getType();
                    if (str3 == null || type == null) {
                        break;
                    } else {
                        String str5 = this.$verificationToken;
                        TransferMainResultScreenParams transferMainResultScreenParams2 = this.$params;
                        switch (ni01.a[type.ordinal()]) {
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
                            case 12:
                            case 13:
                            case 14:
                                name = type.name();
                                break;
                            case 15:
                            case 16:
                                name = "E_PAYMENT";
                                break;
                            default:
                                w511.b();
                                break;
                        }
                        String str6 = name;
                        boolean z = transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.PhoneTransferParams;
                        if (z) {
                            Regex regex = kfb0.a;
                            TransferMainResultScreenParams.PhoneTransferParams phoneTransferParams2 = (TransferMainResultScreenParams.PhoneTransferParams) transferMainResultScreenParams2;
                            p = b64.j(kfb0.f(phoneTransferParams2.getPhone()), phoneTransferParams2.getPartnerId());
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.SelfTopupParams) {
                            p = ((TransferMainResultScreenParams.SelfTopupParams) transferMainResultScreenParams2).getTargetId();
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.SelfTransferParams) {
                            p = ((TransferMainResultScreenParams.SelfTransferParams) transferMainResultScreenParams2).getTargetAgreementId();
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) {
                            TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams requisitesLegalTransferParams2 = (TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) transferMainResultScreenParams2;
                            p = b64.j(requisitesLegalTransferParams2.getAccountNumber(), requisitesLegalTransferParams2.getBic());
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) {
                            TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams requisitesPersonTransferParams2 = (TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) transferMainResultScreenParams2;
                            p = b64.j(requisitesPersonTransferParams2.getAccountNumber(), requisitesPersonTransferParams2.getBic());
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.Me2MeTopupParams) {
                            p = ((TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams2).getTargetAgreementId();
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.AftTopupParams) {
                            p = ((TransferMainResultScreenParams.AftTopupParams) transferMainResultScreenParams2).getTargetAgreementId();
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.MobilePaymentParams) {
                            TransferMainResultScreenParams.MobilePaymentParams mobilePaymentParams2 = (TransferMainResultScreenParams.MobilePaymentParams) transferMainResultScreenParams2;
                            String providerId = mobilePaymentParams2.getProviderId();
                            Regex regex2 = kfb0.a;
                            p = b64.j(providerId, kfb0.f(mobilePaymentParams2.getPhone()));
                        } else if (transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.InternetPaymentParams) {
                            TransferMainResultScreenParams.InternetPaymentParams internetPaymentParams2 = (TransferMainResultScreenParams.InternetPaymentParams) transferMainResultScreenParams2;
                            p = b64.j(internetPaymentParams2.getProviderId(), internetPaymentParams2.getAccountNumber());
                        } else {
                            if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.C2gTransferParams)) {
                                obj2 = null;
                                if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams)) {
                                    if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams)) {
                                        if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams)) {
                                            if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.MkkCashoutParams)) {
                                                if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.B2cTransferParams)) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    Regex regex3 = kfb0.a;
                                                    TransferMainResultScreenParams.B2cTransferParams b2cTransferParams2 = (TransferMainResultScreenParams.B2cTransferParams) transferMainResultScreenParams2;
                                                    p = g8e.p(kfb0.f(b2cTransferParams2.getTargetPhone()), b2cTransferParams2.getTargetPartnerId(), b2cTransferParams2.getTargetName());
                                                }
                                            } else {
                                                ny61.r("Hmac isn't supported for mkk cashout");
                                                break;
                                            }
                                        } else {
                                            TransferMainResultScreenParams.CrossBorderByPhoneParams crossBorderByPhoneParams2 = (TransferMainResultScreenParams.CrossBorderByPhoneParams) transferMainResultScreenParams2;
                                            String j = b64.j(crossBorderByPhoneParams2.getPhone(), crossBorderByPhoneParams2.getPartnerId());
                                            String receiverFullName = crossBorderByPhoneParams2.getReceiverFullName();
                                            String str7 = receiverFullName != null ? receiverFullName : "";
                                            Locale locale = tm60.a;
                                            p = g8e.p(j, str7, b64.j(tm60.a(crossBorderByPhoneParams2.getCreditMoney().getAmount()), crossBorderByPhoneParams2.getCreditMoney().getCurrency()));
                                        }
                                    } else {
                                        TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams requisitesHcsTransferParams2 = (TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) transferMainResultScreenParams2;
                                        p = b64.j(requisitesHcsTransferParams2.getAccountNumber(), requisitesHcsTransferParams2.getBic());
                                    }
                                } else {
                                    TransferMainResultScreenParams.HcsInvoiceTransferParams hcsInvoiceTransferParams2 = (TransferMainResultScreenParams.HcsInvoiceTransferParams) transferMainResultScreenParams2;
                                    p = g8e.p(hcsInvoiceTransferParams2.getInvoiceId(), hcsInvoiceTransferParams2.getRequisites().getRecipientInn(), hcsInvoiceTransferParams2.getRequisites().getDocumentNumber());
                                }
                            } else {
                                TransferMainResultScreenParams.C2gTransferParams c2gTransferParams2 = (TransferMainResultScreenParams.C2gTransferParams) transferMainResultScreenParams2;
                                String uin2 = c2gTransferParams2.getRequisites().getUin();
                                String payeeBankBic = c2gTransferParams2.getRequisites().getPayeeBankBic();
                                obj2 = null;
                                String payeeAccountNumber = c2gTransferParams2.getRequisites().getPayeeAccountNumber();
                                String paymentPurpose3 = c2gTransferParams2.getRequisites().getPaymentPurpose();
                                p = unr0.o(uin2, payeeBankBic, payeeAccountNumber, paymentPurpose3 != null ? paymentPurpose3 : "");
                            }
                            String str8 = p;
                            if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.Me2MeTopupParams)) {
                                planToken = ((TransferMainResultScreenParams.Me2MeTopupParams) transferMainResultScreenParams2).getPartnerId();
                            } else if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.AftTopupParams)) {
                                if (!z) {
                                    if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.SelfTopupParams)) {
                                        if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.SelfTransferParams)) {
                                            if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.MobilePaymentParams)) {
                                                if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams)) {
                                                    if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams)) {
                                                        if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.InternetPaymentParams)) {
                                                            if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.C2gTransferParams)) {
                                                                if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams)) {
                                                                    if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.HcsInvoiceTransferParams)) {
                                                                        if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.CrossBorderByPhoneParams)) {
                                                                            if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.MkkCashoutParams)) {
                                                                                if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.B2cTransferParams)) {
                                                                                    w511.b();
                                                                                    break;
                                                                                } else {
                                                                                    planToken = ((TransferMainResultScreenParams.B2cTransferParams) transferMainResultScreenParams2).getPlanToken();
                                                                                }
                                                                            } else {
                                                                                ny61.r("Hmac isn't supported for mkk cashout");
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            planToken = ((TransferMainResultScreenParams.CrossBorderByPhoneParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                                        }
                                                                    } else {
                                                                        planToken = ((TransferMainResultScreenParams.HcsInvoiceTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                                    }
                                                                } else {
                                                                    planToken = ((TransferMainResultScreenParams.TransferRequisiteParams.RequisitesHcsTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                                }
                                                            } else {
                                                                planToken = ((TransferMainResultScreenParams.C2gTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                            }
                                                        } else {
                                                            planToken = ((TransferMainResultScreenParams.InternetPaymentParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                        }
                                                    } else {
                                                        planToken = ((TransferMainResultScreenParams.TransferRequisiteParams.RequisitesPersonTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                    }
                                                } else {
                                                    planToken = ((TransferMainResultScreenParams.TransferRequisiteParams.RequisitesLegalTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                                }
                                            } else {
                                                planToken = ((TransferMainResultScreenParams.MobilePaymentParams) transferMainResultScreenParams2).getSourceAgreementId();
                                            }
                                        } else {
                                            planToken = ((TransferMainResultScreenParams.SelfTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                        }
                                    } else {
                                        planToken = ((TransferMainResultScreenParams.SelfTopupParams) transferMainResultScreenParams2).getSourceAgreementId();
                                    }
                                } else {
                                    planToken = ((TransferMainResultScreenParams.PhoneTransferParams) transferMainResultScreenParams2).getSourceAgreementId();
                                }
                            } else {
                                planToken = ((TransferMainResultScreenParams.AftTopupParams) transferMainResultScreenParams2).getCardId();
                            }
                            str = oi01.a(str3, str2, str5, str6, planToken, str8, transferMainResultScreenParams2.getCheckId(), transferMainResultScreenParams2.getMoney());
                            String str9 = str;
                            com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar = this.this$0.e;
                            String checkId2 = this.$params.getCheckId();
                            String referrer = this.$params.getReferrer();
                            String str10 = this.$verificationToken;
                            String str11 = this.$operationId;
                            this.label = 1;
                            e = aVar.e(transferRequest, str10, str11, str2, str9, checkId2, referrer, this);
                            if (e == coroutineSingletons) {
                            }
                        }
                        obj2 = null;
                        String str82 = p;
                        if (!(transferMainResultScreenParams2 instanceof TransferMainResultScreenParams.Me2MeTopupParams)) {
                        }
                        str = oi01.a(str3, str2, str5, str6, planToken, str82, transferMainResultScreenParams2.getCheckId(), transferMainResultScreenParams2.getMoney());
                        String str92 = str;
                        com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar2 = this.this$0.e;
                        String checkId22 = this.$params.getCheckId();
                        String referrer2 = this.$params.getReferrer();
                        String str102 = this.$verificationToken;
                        String str112 = this.$operationId;
                        this.label = 1;
                        e = aVar2.e(transferRequest, str102, str112, str2, str92, checkId22, referrer2, this);
                        if (e == coroutineSingletons) {
                        }
                    }
                    break;
                case 0:
                default:
                    w511.b();
                    break;
                case 13:
                    String str922 = str;
                    com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar22 = this.this$0.e;
                    String checkId222 = this.$params.getCheckId();
                    String referrer22 = this.$params.getReferrer();
                    String str1022 = this.$verificationToken;
                    String str1122 = this.$operationId;
                    this.label = 1;
                    e = aVar22.e(transferRequest, str1022, str1122, str2, str922, checkId222, referrer22, this);
                    if (e == coroutineSingletons) {
                    }
                    break;
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e = ((Result) obj).getValue();
        return new Result(e);
    }
}
