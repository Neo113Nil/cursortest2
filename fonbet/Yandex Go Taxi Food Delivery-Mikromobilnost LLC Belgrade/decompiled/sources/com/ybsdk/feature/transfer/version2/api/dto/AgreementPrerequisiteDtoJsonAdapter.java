package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\fR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/AgreementPrerequisiteDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/api/dto/ReferenceToButtonDto;", "referenceToButtonDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "nullableSelfTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "nullableSelfTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/PhoneTransferPayloadDto;", "nullablePhoneTransferPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalDto;", "nullableRequisitesLegalDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDto;", "nullableRequisitesHcsPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/MobilePaymentPayloadDto;", "nullableMobilePaymentPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "nullableMe2MeTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "nullableAftTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/InternetPaymentPayloadDto;", "nullableInternetPaymentPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/SbpC2GPayloadDto;", "nullableSbpC2GPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/InvoiceHcsPayloadDto;", "nullableInvoiceHcsPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/CommonTopupPayloadDto;", "nullableCommonTopupPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/CrossBorderByPhonePayloadDto;", "nullableCrossBorderByPhonePayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/MkkCashoutPayloadDto;", "nullableMkkCashoutPayloadDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDto;", "nullableB2cTransferPayloadDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AgreementPrerequisiteDtoJsonAdapter extends JsonAdapter<AgreementPrerequisiteDto> {
    private final JsonAdapter<AftTopupPayloadDto> nullableAftTopupPayloadDtoAdapter;
    private final JsonAdapter<B2cTransferPayloadDto> nullableB2cTransferPayloadDtoAdapter;
    private final JsonAdapter<CommonTopupPayloadDto> nullableCommonTopupPayloadDtoAdapter;
    private final JsonAdapter<CrossBorderByPhonePayloadDto> nullableCrossBorderByPhonePayloadDtoAdapter;
    private final JsonAdapter<InternetPaymentPayloadDto> nullableInternetPaymentPayloadDtoAdapter;
    private final JsonAdapter<InvoiceHcsPayloadDto> nullableInvoiceHcsPayloadDtoAdapter;
    private final JsonAdapter<Me2MeTopupPayloadDto> nullableMe2MeTopupPayloadDtoAdapter;
    private final JsonAdapter<MkkCashoutPayloadDto> nullableMkkCashoutPayloadDtoAdapter;
    private final JsonAdapter<MobilePaymentPayloadDto> nullableMobilePaymentPayloadDtoAdapter;
    private final JsonAdapter<PhoneTransferPayloadDto> nullablePhoneTransferPayloadDtoAdapter;
    private final JsonAdapter<RequisitesHcsPayloadDto> nullableRequisitesHcsPayloadDtoAdapter;
    private final JsonAdapter<RequisitesLegalDto> nullableRequisitesLegalDtoAdapter;
    private final JsonAdapter<SbpC2GPayloadDto> nullableSbpC2GPayloadDtoAdapter;
    private final JsonAdapter<SelfTopupPayloadDto> nullableSelfTopupPayloadDtoAdapter;
    private final JsonAdapter<SelfTransferPayloadDto> nullableSelfTransferPayloadDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("button_ref", "self_transfer_payload", "self_topup_payload", "phone_transfer_payload", "requisites_legal_payload", "requisites_hcs_payload", "mobile_payment_payload", "me2me_topup_payload", "aft_topup_payload", "internet_payment_payload", "sbp_c2g_payload", "invoice_hcs_payload", "common_topup_payload", "cross_border_by_phone_payload", "mkk_cashout_payload", "b2c_transfer_payload");
    private final JsonAdapter<ReferenceToButtonDto> referenceToButtonDtoAdapter;

    public AgreementPrerequisiteDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.referenceToButtonDtoAdapter = moshi.adapter(ReferenceToButtonDto.class, emptySet, "referenceToButton");
        this.nullableSelfTransferPayloadDtoAdapter = moshi.adapter(SelfTransferPayloadDto.class, emptySet, "selfTransferPayload");
        this.nullableSelfTopupPayloadDtoAdapter = moshi.adapter(SelfTopupPayloadDto.class, emptySet, "selfTopupPayload");
        this.nullablePhoneTransferPayloadDtoAdapter = moshi.adapter(PhoneTransferPayloadDto.class, emptySet, "phoneTransferPayload");
        this.nullableRequisitesLegalDtoAdapter = moshi.adapter(RequisitesLegalDto.class, emptySet, "requisitesLegalPayload");
        this.nullableRequisitesHcsPayloadDtoAdapter = moshi.adapter(RequisitesHcsPayloadDto.class, emptySet, "requisitesHcsPayload");
        this.nullableMobilePaymentPayloadDtoAdapter = moshi.adapter(MobilePaymentPayloadDto.class, emptySet, "mobilePaymentPayload");
        this.nullableMe2MeTopupPayloadDtoAdapter = moshi.adapter(Me2MeTopupPayloadDto.class, emptySet, "me2meTopupPayload");
        this.nullableAftTopupPayloadDtoAdapter = moshi.adapter(AftTopupPayloadDto.class, emptySet, "aftTopupPayload");
        this.nullableInternetPaymentPayloadDtoAdapter = moshi.adapter(InternetPaymentPayloadDto.class, emptySet, "internetPaymentPayload");
        this.nullableSbpC2GPayloadDtoAdapter = moshi.adapter(SbpC2GPayloadDto.class, emptySet, "sbpC2gPayload");
        this.nullableInvoiceHcsPayloadDtoAdapter = moshi.adapter(InvoiceHcsPayloadDto.class, emptySet, "invoiceHcsPayload");
        this.nullableCommonTopupPayloadDtoAdapter = moshi.adapter(CommonTopupPayloadDto.class, emptySet, "commonTopupPayload");
        this.nullableCrossBorderByPhonePayloadDtoAdapter = moshi.adapter(CrossBorderByPhonePayloadDto.class, emptySet, "crossBorderByPhonePayload");
        this.nullableMkkCashoutPayloadDtoAdapter = moshi.adapter(MkkCashoutPayloadDto.class, emptySet, "mkkCashoutPayload");
        this.nullableB2cTransferPayloadDtoAdapter = moshi.adapter(B2cTransferPayloadDto.class, emptySet, "b2cTransferPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AgreementPrerequisiteDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ReferenceToButtonDto referenceToButtonDto = null;
        SelfTransferPayloadDto selfTransferPayloadDto = null;
        SelfTopupPayloadDto selfTopupPayloadDto = null;
        PhoneTransferPayloadDto phoneTransferPayloadDto = null;
        RequisitesLegalDto requisitesLegalDto = null;
        RequisitesHcsPayloadDto requisitesHcsPayloadDto = null;
        MobilePaymentPayloadDto mobilePaymentPayloadDto = null;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = null;
        AftTopupPayloadDto aftTopupPayloadDto = null;
        InternetPaymentPayloadDto internetPaymentPayloadDto = null;
        SbpC2GPayloadDto sbpC2GPayloadDto = null;
        InvoiceHcsPayloadDto invoiceHcsPayloadDto = null;
        CommonTopupPayloadDto commonTopupPayloadDto = null;
        CrossBorderByPhonePayloadDto crossBorderByPhonePayloadDto = null;
        MkkCashoutPayloadDto mkkCashoutPayloadDto = null;
        B2cTransferPayloadDto b2cTransferPayloadDto = null;
        while (jsonReader.hasNext()) {
            ReferenceToButtonDto referenceToButtonDto2 = referenceToButtonDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    referenceToButtonDto = this.referenceToButtonDtoAdapter.fromJson(jsonReader);
                    if (referenceToButtonDto == null) {
                        throw Util.unexpectedNull("referenceToButton", "button_ref", jsonReader);
                    }
                    continue;
                case 1:
                    selfTransferPayloadDto = this.nullableSelfTransferPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    selfTopupPayloadDto = this.nullableSelfTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    phoneTransferPayloadDto = this.nullablePhoneTransferPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    requisitesLegalDto = this.nullableRequisitesLegalDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    requisitesHcsPayloadDto = this.nullableRequisitesHcsPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    mobilePaymentPayloadDto = this.nullableMobilePaymentPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    me2MeTopupPayloadDto = this.nullableMe2MeTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    aftTopupPayloadDto = this.nullableAftTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    internetPaymentPayloadDto = this.nullableInternetPaymentPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    sbpC2GPayloadDto = this.nullableSbpC2GPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    invoiceHcsPayloadDto = this.nullableInvoiceHcsPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 12:
                    commonTopupPayloadDto = this.nullableCommonTopupPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 13:
                    crossBorderByPhonePayloadDto = this.nullableCrossBorderByPhonePayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 14:
                    mkkCashoutPayloadDto = this.nullableMkkCashoutPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 15:
                    b2cTransferPayloadDto = this.nullableB2cTransferPayloadDtoAdapter.fromJson(jsonReader);
                    break;
            }
            referenceToButtonDto = referenceToButtonDto2;
        }
        ReferenceToButtonDto referenceToButtonDto3 = referenceToButtonDto;
        jsonReader.endObject();
        if (referenceToButtonDto3 != null) {
            return new AgreementPrerequisiteDto(referenceToButtonDto3, selfTransferPayloadDto, selfTopupPayloadDto, phoneTransferPayloadDto, requisitesLegalDto, requisitesHcsPayloadDto, mobilePaymentPayloadDto, me2MeTopupPayloadDto, aftTopupPayloadDto, internetPaymentPayloadDto, sbpC2GPayloadDto, invoiceHcsPayloadDto, commonTopupPayloadDto, crossBorderByPhonePayloadDto, mkkCashoutPayloadDto, b2cTransferPayloadDto);
        }
        throw Util.missingProperty("referenceToButton", "button_ref", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AgreementPrerequisiteDto agreementPrerequisiteDto) {
        AgreementPrerequisiteDto agreementPrerequisiteDto2 = agreementPrerequisiteDto;
        if (agreementPrerequisiteDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("button_ref");
        this.referenceToButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getReferenceToButton());
        jsonWriter.name("self_transfer_payload");
        this.nullableSelfTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getSelfTransferPayload());
        jsonWriter.name("self_topup_payload");
        this.nullableSelfTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getSelfTopupPayload());
        jsonWriter.name("phone_transfer_payload");
        this.nullablePhoneTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getPhoneTransferPayload());
        jsonWriter.name("requisites_legal_payload");
        this.nullableRequisitesLegalDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getRequisitesLegalPayload());
        jsonWriter.name("requisites_hcs_payload");
        this.nullableRequisitesHcsPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getRequisitesHcsPayload());
        jsonWriter.name("mobile_payment_payload");
        this.nullableMobilePaymentPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getMobilePaymentPayload());
        jsonWriter.name("me2me_topup_payload");
        this.nullableMe2MeTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getMe2meTopupPayload());
        jsonWriter.name("aft_topup_payload");
        this.nullableAftTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getAftTopupPayload());
        jsonWriter.name("internet_payment_payload");
        this.nullableInternetPaymentPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getInternetPaymentPayload());
        jsonWriter.name("sbp_c2g_payload");
        this.nullableSbpC2GPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getSbpC2gPayload());
        jsonWriter.name("invoice_hcs_payload");
        this.nullableInvoiceHcsPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getInvoiceHcsPayload());
        jsonWriter.name("common_topup_payload");
        this.nullableCommonTopupPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getCommonTopupPayload());
        jsonWriter.name("cross_border_by_phone_payload");
        this.nullableCrossBorderByPhonePayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getCrossBorderByPhonePayload());
        jsonWriter.name("mkk_cashout_payload");
        this.nullableMkkCashoutPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getMkkCashoutPayload());
        jsonWriter.name("b2c_transfer_payload");
        this.nullableB2cTransferPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) agreementPrerequisiteDto2.getB2cTransferPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(AgreementPrerequisiteDto)");
    }
}
