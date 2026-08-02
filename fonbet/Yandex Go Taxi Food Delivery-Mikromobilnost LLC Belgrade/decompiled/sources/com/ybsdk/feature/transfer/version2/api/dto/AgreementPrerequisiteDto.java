package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010!HÆ\u0003JÇ\u0001\u0010T\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!HÆ\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020[HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006\\"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDto;", "", "referenceToButton", "Lcom/ybsdk/feature/transfer/version2/api/dto/ReferenceToButtonDto;", "selfTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "selfTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "phoneTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/PhoneTransferPayloadDto;", "requisitesLegalPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalDto;", "requisitesHcsPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDto;", "mobilePaymentPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/MobilePaymentPayloadDto;", "me2meTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "aftTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "internetPaymentPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/InternetPaymentPayloadDto;", "sbpC2gPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SbpC2GPayloadDto;", "invoiceHcsPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/InvoiceHcsPayloadDto;", "commonTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/CommonTopupPayloadDto;", "crossBorderByPhonePayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/CrossBorderByPhonePayloadDto;", "mkkCashoutPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/MkkCashoutPayloadDto;", "b2cTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/dto/ReferenceToButtonDto;Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/PhoneTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/MobilePaymentPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/InternetPaymentPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/SbpC2GPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/InvoiceHcsPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/CommonTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/CrossBorderByPhonePayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/MkkCashoutPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDto;)V", "getReferenceToButton", "()Lcom/ybsdk/feature/transfer/version2/api/dto/ReferenceToButtonDto;", "getSelfTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "getSelfTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "getPhoneTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/PhoneTransferPayloadDto;", "getRequisitesLegalPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalDto;", "getRequisitesHcsPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDto;", "getMobilePaymentPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/MobilePaymentPayloadDto;", "getMe2meTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "getAftTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "getInternetPaymentPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/InternetPaymentPayloadDto;", "getSbpC2gPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SbpC2GPayloadDto;", "getInvoiceHcsPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/InvoiceHcsPayloadDto;", "getCommonTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/CommonTopupPayloadDto;", "getCrossBorderByPhonePayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/CrossBorderByPhonePayloadDto;", "getMkkCashoutPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/MkkCashoutPayloadDto;", "getB2cTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AgreementPrerequisiteDto {
    private final AftTopupPayloadDto aftTopupPayload;
    private final B2cTransferPayloadDto b2cTransferPayload;
    private final CommonTopupPayloadDto commonTopupPayload;
    private final CrossBorderByPhonePayloadDto crossBorderByPhonePayload;
    private final InternetPaymentPayloadDto internetPaymentPayload;
    private final InvoiceHcsPayloadDto invoiceHcsPayload;
    private final Me2MeTopupPayloadDto me2meTopupPayload;
    private final MkkCashoutPayloadDto mkkCashoutPayload;
    private final MobilePaymentPayloadDto mobilePaymentPayload;
    private final PhoneTransferPayloadDto phoneTransferPayload;
    private final ReferenceToButtonDto referenceToButton;
    private final RequisitesHcsPayloadDto requisitesHcsPayload;
    private final RequisitesLegalDto requisitesLegalPayload;
    private final SbpC2GPayloadDto sbpC2gPayload;
    private final SelfTopupPayloadDto selfTopupPayload;
    private final SelfTransferPayloadDto selfTransferPayload;

    public AgreementPrerequisiteDto(@Json(name = "button_ref") ReferenceToButtonDto referenceToButtonDto, @Json(name = "self_transfer_payload") SelfTransferPayloadDto selfTransferPayloadDto, @Json(name = "self_topup_payload") SelfTopupPayloadDto selfTopupPayloadDto, @Json(name = "phone_transfer_payload") PhoneTransferPayloadDto phoneTransferPayloadDto, @Json(name = "requisites_legal_payload") RequisitesLegalDto requisitesLegalDto, @Json(name = "requisites_hcs_payload") RequisitesHcsPayloadDto requisitesHcsPayloadDto, @Json(name = "mobile_payment_payload") MobilePaymentPayloadDto mobilePaymentPayloadDto, @Json(name = "me2me_topup_payload") Me2MeTopupPayloadDto me2MeTopupPayloadDto, @Json(name = "aft_topup_payload") AftTopupPayloadDto aftTopupPayloadDto, @Json(name = "internet_payment_payload") InternetPaymentPayloadDto internetPaymentPayloadDto, @Json(name = "sbp_c2g_payload") SbpC2GPayloadDto sbpC2GPayloadDto, @Json(name = "invoice_hcs_payload") InvoiceHcsPayloadDto invoiceHcsPayloadDto, @Json(name = "common_topup_payload") CommonTopupPayloadDto commonTopupPayloadDto, @Json(name = "cross_border_by_phone_payload") CrossBorderByPhonePayloadDto crossBorderByPhonePayloadDto, @Json(name = "mkk_cashout_payload") MkkCashoutPayloadDto mkkCashoutPayloadDto, @Json(name = "b2c_transfer_payload") B2cTransferPayloadDto b2cTransferPayloadDto) {
        this.referenceToButton = referenceToButtonDto;
        this.selfTransferPayload = selfTransferPayloadDto;
        this.selfTopupPayload = selfTopupPayloadDto;
        this.phoneTransferPayload = phoneTransferPayloadDto;
        this.requisitesLegalPayload = requisitesLegalDto;
        this.requisitesHcsPayload = requisitesHcsPayloadDto;
        this.mobilePaymentPayload = mobilePaymentPayloadDto;
        this.me2meTopupPayload = me2MeTopupPayloadDto;
        this.aftTopupPayload = aftTopupPayloadDto;
        this.internetPaymentPayload = internetPaymentPayloadDto;
        this.sbpC2gPayload = sbpC2GPayloadDto;
        this.invoiceHcsPayload = invoiceHcsPayloadDto;
        this.commonTopupPayload = commonTopupPayloadDto;
        this.crossBorderByPhonePayload = crossBorderByPhonePayloadDto;
        this.mkkCashoutPayload = mkkCashoutPayloadDto;
        this.b2cTransferPayload = b2cTransferPayloadDto;
    }

    /* renamed from: component1, reason: from getter */
    public final ReferenceToButtonDto getReferenceToButton() {
        return this.referenceToButton;
    }

    /* renamed from: component10, reason: from getter */
    public final InternetPaymentPayloadDto getInternetPaymentPayload() {
        return this.internetPaymentPayload;
    }

    /* renamed from: component11, reason: from getter */
    public final SbpC2GPayloadDto getSbpC2gPayload() {
        return this.sbpC2gPayload;
    }

    /* renamed from: component12, reason: from getter */
    public final InvoiceHcsPayloadDto getInvoiceHcsPayload() {
        return this.invoiceHcsPayload;
    }

    /* renamed from: component13, reason: from getter */
    public final CommonTopupPayloadDto getCommonTopupPayload() {
        return this.commonTopupPayload;
    }

    /* renamed from: component14, reason: from getter */
    public final CrossBorderByPhonePayloadDto getCrossBorderByPhonePayload() {
        return this.crossBorderByPhonePayload;
    }

    /* renamed from: component15, reason: from getter */
    public final MkkCashoutPayloadDto getMkkCashoutPayload() {
        return this.mkkCashoutPayload;
    }

    /* renamed from: component16, reason: from getter */
    public final B2cTransferPayloadDto getB2cTransferPayload() {
        return this.b2cTransferPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final SelfTransferPayloadDto getSelfTransferPayload() {
        return this.selfTransferPayload;
    }

    /* renamed from: component3, reason: from getter */
    public final SelfTopupPayloadDto getSelfTopupPayload() {
        return this.selfTopupPayload;
    }

    /* renamed from: component4, reason: from getter */
    public final PhoneTransferPayloadDto getPhoneTransferPayload() {
        return this.phoneTransferPayload;
    }

    /* renamed from: component5, reason: from getter */
    public final RequisitesLegalDto getRequisitesLegalPayload() {
        return this.requisitesLegalPayload;
    }

    /* renamed from: component6, reason: from getter */
    public final RequisitesHcsPayloadDto getRequisitesHcsPayload() {
        return this.requisitesHcsPayload;
    }

    /* renamed from: component7, reason: from getter */
    public final MobilePaymentPayloadDto getMobilePaymentPayload() {
        return this.mobilePaymentPayload;
    }

    /* renamed from: component8, reason: from getter */
    public final Me2MeTopupPayloadDto getMe2meTopupPayload() {
        return this.me2meTopupPayload;
    }

    /* renamed from: component9, reason: from getter */
    public final AftTopupPayloadDto getAftTopupPayload() {
        return this.aftTopupPayload;
    }

    public final AgreementPrerequisiteDto copy(@Json(name = "button_ref") ReferenceToButtonDto referenceToButton, @Json(name = "self_transfer_payload") SelfTransferPayloadDto selfTransferPayload, @Json(name = "self_topup_payload") SelfTopupPayloadDto selfTopupPayload, @Json(name = "phone_transfer_payload") PhoneTransferPayloadDto phoneTransferPayload, @Json(name = "requisites_legal_payload") RequisitesLegalDto requisitesLegalPayload, @Json(name = "requisites_hcs_payload") RequisitesHcsPayloadDto requisitesHcsPayload, @Json(name = "mobile_payment_payload") MobilePaymentPayloadDto mobilePaymentPayload, @Json(name = "me2me_topup_payload") Me2MeTopupPayloadDto me2meTopupPayload, @Json(name = "aft_topup_payload") AftTopupPayloadDto aftTopupPayload, @Json(name = "internet_payment_payload") InternetPaymentPayloadDto internetPaymentPayload, @Json(name = "sbp_c2g_payload") SbpC2GPayloadDto sbpC2gPayload, @Json(name = "invoice_hcs_payload") InvoiceHcsPayloadDto invoiceHcsPayload, @Json(name = "common_topup_payload") CommonTopupPayloadDto commonTopupPayload, @Json(name = "cross_border_by_phone_payload") CrossBorderByPhonePayloadDto crossBorderByPhonePayload, @Json(name = "mkk_cashout_payload") MkkCashoutPayloadDto mkkCashoutPayload, @Json(name = "b2c_transfer_payload") B2cTransferPayloadDto b2cTransferPayload) {
        return new AgreementPrerequisiteDto(referenceToButton, selfTransferPayload, selfTopupPayload, phoneTransferPayload, requisitesLegalPayload, requisitesHcsPayload, mobilePaymentPayload, me2meTopupPayload, aftTopupPayload, internetPaymentPayload, sbpC2gPayload, invoiceHcsPayload, commonTopupPayload, crossBorderByPhonePayload, mkkCashoutPayload, b2cTransferPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementPrerequisiteDto)) {
            return false;
        }
        AgreementPrerequisiteDto agreementPrerequisiteDto = (AgreementPrerequisiteDto) other;
        return jl40.l(this.referenceToButton, agreementPrerequisiteDto.referenceToButton) && jl40.l(this.selfTransferPayload, agreementPrerequisiteDto.selfTransferPayload) && jl40.l(this.selfTopupPayload, agreementPrerequisiteDto.selfTopupPayload) && jl40.l(this.phoneTransferPayload, agreementPrerequisiteDto.phoneTransferPayload) && jl40.l(this.requisitesLegalPayload, agreementPrerequisiteDto.requisitesLegalPayload) && jl40.l(this.requisitesHcsPayload, agreementPrerequisiteDto.requisitesHcsPayload) && jl40.l(this.mobilePaymentPayload, agreementPrerequisiteDto.mobilePaymentPayload) && jl40.l(this.me2meTopupPayload, agreementPrerequisiteDto.me2meTopupPayload) && jl40.l(this.aftTopupPayload, agreementPrerequisiteDto.aftTopupPayload) && jl40.l(this.internetPaymentPayload, agreementPrerequisiteDto.internetPaymentPayload) && jl40.l(this.sbpC2gPayload, agreementPrerequisiteDto.sbpC2gPayload) && jl40.l(this.invoiceHcsPayload, agreementPrerequisiteDto.invoiceHcsPayload) && jl40.l(this.commonTopupPayload, agreementPrerequisiteDto.commonTopupPayload) && jl40.l(this.crossBorderByPhonePayload, agreementPrerequisiteDto.crossBorderByPhonePayload) && jl40.l(this.mkkCashoutPayload, agreementPrerequisiteDto.mkkCashoutPayload) && jl40.l(this.b2cTransferPayload, agreementPrerequisiteDto.b2cTransferPayload);
    }

    public final AftTopupPayloadDto getAftTopupPayload() {
        return this.aftTopupPayload;
    }

    public final B2cTransferPayloadDto getB2cTransferPayload() {
        return this.b2cTransferPayload;
    }

    public final CommonTopupPayloadDto getCommonTopupPayload() {
        return this.commonTopupPayload;
    }

    public final CrossBorderByPhonePayloadDto getCrossBorderByPhonePayload() {
        return this.crossBorderByPhonePayload;
    }

    public final InternetPaymentPayloadDto getInternetPaymentPayload() {
        return this.internetPaymentPayload;
    }

    public final InvoiceHcsPayloadDto getInvoiceHcsPayload() {
        return this.invoiceHcsPayload;
    }

    public final Me2MeTopupPayloadDto getMe2meTopupPayload() {
        return this.me2meTopupPayload;
    }

    public final MkkCashoutPayloadDto getMkkCashoutPayload() {
        return this.mkkCashoutPayload;
    }

    public final MobilePaymentPayloadDto getMobilePaymentPayload() {
        return this.mobilePaymentPayload;
    }

    public final PhoneTransferPayloadDto getPhoneTransferPayload() {
        return this.phoneTransferPayload;
    }

    public final ReferenceToButtonDto getReferenceToButton() {
        return this.referenceToButton;
    }

    public final RequisitesHcsPayloadDto getRequisitesHcsPayload() {
        return this.requisitesHcsPayload;
    }

    public final RequisitesLegalDto getRequisitesLegalPayload() {
        return this.requisitesLegalPayload;
    }

    public final SbpC2GPayloadDto getSbpC2gPayload() {
        return this.sbpC2gPayload;
    }

    public final SelfTopupPayloadDto getSelfTopupPayload() {
        return this.selfTopupPayload;
    }

    public final SelfTransferPayloadDto getSelfTransferPayload() {
        return this.selfTransferPayload;
    }

    public int hashCode() {
        int hashCode = this.referenceToButton.hashCode() * 31;
        SelfTransferPayloadDto selfTransferPayloadDto = this.selfTransferPayload;
        int hashCode2 = (hashCode + (selfTransferPayloadDto == null ? 0 : selfTransferPayloadDto.hashCode())) * 31;
        SelfTopupPayloadDto selfTopupPayloadDto = this.selfTopupPayload;
        int hashCode3 = (hashCode2 + (selfTopupPayloadDto == null ? 0 : selfTopupPayloadDto.hashCode())) * 31;
        PhoneTransferPayloadDto phoneTransferPayloadDto = this.phoneTransferPayload;
        int hashCode4 = (hashCode3 + (phoneTransferPayloadDto == null ? 0 : phoneTransferPayloadDto.hashCode())) * 31;
        RequisitesLegalDto requisitesLegalDto = this.requisitesLegalPayload;
        int hashCode5 = (hashCode4 + (requisitesLegalDto == null ? 0 : requisitesLegalDto.hashCode())) * 31;
        RequisitesHcsPayloadDto requisitesHcsPayloadDto = this.requisitesHcsPayload;
        int hashCode6 = (hashCode5 + (requisitesHcsPayloadDto == null ? 0 : requisitesHcsPayloadDto.hashCode())) * 31;
        MobilePaymentPayloadDto mobilePaymentPayloadDto = this.mobilePaymentPayload;
        int hashCode7 = (hashCode6 + (mobilePaymentPayloadDto == null ? 0 : mobilePaymentPayloadDto.hashCode())) * 31;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = this.me2meTopupPayload;
        int hashCode8 = (hashCode7 + (me2MeTopupPayloadDto == null ? 0 : me2MeTopupPayloadDto.hashCode())) * 31;
        AftTopupPayloadDto aftTopupPayloadDto = this.aftTopupPayload;
        int hashCode9 = (hashCode8 + (aftTopupPayloadDto == null ? 0 : aftTopupPayloadDto.hashCode())) * 31;
        InternetPaymentPayloadDto internetPaymentPayloadDto = this.internetPaymentPayload;
        int hashCode10 = (hashCode9 + (internetPaymentPayloadDto == null ? 0 : internetPaymentPayloadDto.hashCode())) * 31;
        SbpC2GPayloadDto sbpC2GPayloadDto = this.sbpC2gPayload;
        int hashCode11 = (hashCode10 + (sbpC2GPayloadDto == null ? 0 : sbpC2GPayloadDto.hashCode())) * 31;
        InvoiceHcsPayloadDto invoiceHcsPayloadDto = this.invoiceHcsPayload;
        int hashCode12 = (hashCode11 + (invoiceHcsPayloadDto == null ? 0 : invoiceHcsPayloadDto.hashCode())) * 31;
        CommonTopupPayloadDto commonTopupPayloadDto = this.commonTopupPayload;
        int hashCode13 = (hashCode12 + (commonTopupPayloadDto == null ? 0 : commonTopupPayloadDto.hashCode())) * 31;
        CrossBorderByPhonePayloadDto crossBorderByPhonePayloadDto = this.crossBorderByPhonePayload;
        int hashCode14 = (hashCode13 + (crossBorderByPhonePayloadDto == null ? 0 : crossBorderByPhonePayloadDto.hashCode())) * 31;
        MkkCashoutPayloadDto mkkCashoutPayloadDto = this.mkkCashoutPayload;
        int hashCode15 = (hashCode14 + (mkkCashoutPayloadDto == null ? 0 : mkkCashoutPayloadDto.hashCode())) * 31;
        B2cTransferPayloadDto b2cTransferPayloadDto = this.b2cTransferPayload;
        return hashCode15 + (b2cTransferPayloadDto != null ? b2cTransferPayloadDto.hashCode() : 0);
    }

    public String toString() {
        return "AgreementPrerequisiteDto(referenceToButton=" + this.referenceToButton + ", selfTransferPayload=" + this.selfTransferPayload + ", selfTopupPayload=" + this.selfTopupPayload + ", phoneTransferPayload=" + this.phoneTransferPayload + ", requisitesLegalPayload=" + this.requisitesLegalPayload + ", requisitesHcsPayload=" + this.requisitesHcsPayload + ", mobilePaymentPayload=" + this.mobilePaymentPayload + ", me2meTopupPayload=" + this.me2meTopupPayload + ", aftTopupPayload=" + this.aftTopupPayload + ", internetPaymentPayload=" + this.internetPaymentPayload + ", sbpC2gPayload=" + this.sbpC2gPayload + ", invoiceHcsPayload=" + this.invoiceHcsPayload + ", commonTopupPayload=" + this.commonTopupPayload + ", crossBorderByPhonePayload=" + this.crossBorderByPhonePayload + ", mkkCashoutPayload=" + this.mkkCashoutPayload + ", b2cTransferPayload=" + this.b2cTransferPayload + Extension.C_BRAKE;
    }
}
