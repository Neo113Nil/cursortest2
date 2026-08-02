package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.api.entities.PhoneTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\fR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\fR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\fR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\fR\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\fR\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "nullableTransfersPageScenarioAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "nullableTransferDirectionTypeAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GeneralTransferType;", "nullableGeneralTransferTypeAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferRequest;", "nullableSelfTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupRequest;", "nullableSelfTopupRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest;", "nullablePhoneTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;", "nullableRequisitesPersonTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequest;", "nullableRequisitesLegalTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequest;", "nullableRequisitesHcsTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/Me2MeTopupRequest;", "nullableMe2MeTopupRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequest;", "nullableAftTopupRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentRequest;", "nullableMobilePaymentRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentRequest;", "nullableInternetPaymentRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequest;", "nullableSbpC2gTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsTransferRequest;", "nullableInvoiceHcsTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequest;", "nullableCrossBorderByPhoneRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MkkCashoutTransferRequest;", "nullableMkkCashoutTransferRequestAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequest;", "nullableB2cTransferRequestAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferRequestJsonAdapter extends JsonAdapter<TransferRequest> {
    private volatile Constructor<TransferRequest> constructorRef;
    private final JsonAdapter<AftTopupRequest> nullableAftTopupRequestAdapter;
    private final JsonAdapter<B2cTransferRequest> nullableB2cTransferRequestAdapter;
    private final JsonAdapter<CrossBorderByPhoneRequest> nullableCrossBorderByPhoneRequestAdapter;
    private final JsonAdapter<GeneralTransferType> nullableGeneralTransferTypeAdapter;
    private final JsonAdapter<InternetPaymentRequest> nullableInternetPaymentRequestAdapter;
    private final JsonAdapter<InvoiceHcsTransferRequest> nullableInvoiceHcsTransferRequestAdapter;
    private final JsonAdapter<Me2MeTopupRequest> nullableMe2MeTopupRequestAdapter;
    private final JsonAdapter<MkkCashoutTransferRequest> nullableMkkCashoutTransferRequestAdapter;
    private final JsonAdapter<MobilePaymentRequest> nullableMobilePaymentRequestAdapter;
    private final JsonAdapter<PhoneTransferRequest> nullablePhoneTransferRequestAdapter;
    private final JsonAdapter<RequisitesHcsTransferRequest> nullableRequisitesHcsTransferRequestAdapter;
    private final JsonAdapter<RequisitesLegalTransferRequest> nullableRequisitesLegalTransferRequestAdapter;
    private final JsonAdapter<RequisitesPersonTransferRequest> nullableRequisitesPersonTransferRequestAdapter;
    private final JsonAdapter<SbpC2gTransferRequest> nullableSbpC2gTransferRequestAdapter;
    private final JsonAdapter<SelfTopupRequest> nullableSelfTopupRequestAdapter;
    private final JsonAdapter<SelfTransferRequest> nullableSelfTransferRequestAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TransferDirectionType> nullableTransferDirectionTypeAdapter;
    private final JsonAdapter<TransfersPageRequest.TransfersPageScenario> nullableTransfersPageScenarioAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("scenario", "direction", "type", "self_transfer_payload", "self_topup_payload", "phone_transfer_payload", "requisites_person_payload", "requisites_legal_payload", "requisites_hcs_payload", "me2me_topup_payload", "aft_topup_payload", "mobile_payment_payload", "internet_payment_payload", "sbp_c2g_transfer_payload", "invoice_hcs_transfer_payload", "cross_border_by_phone_payload", "mkk_cashout_payload", "b2c_transfer_payload", "transfer_id");

    public TransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTransfersPageScenarioAdapter = moshi.adapter(TransfersPageRequest.TransfersPageScenario.class, emptySet, "scenario");
        this.nullableTransferDirectionTypeAdapter = moshi.adapter(TransferDirectionType.class, emptySet, "direction");
        this.nullableGeneralTransferTypeAdapter = moshi.adapter(GeneralTransferType.class, emptySet, "type");
        this.nullableSelfTransferRequestAdapter = moshi.adapter(SelfTransferRequest.class, emptySet, "selfTransferRequest");
        this.nullableSelfTopupRequestAdapter = moshi.adapter(SelfTopupRequest.class, emptySet, "selfTopupRequest");
        this.nullablePhoneTransferRequestAdapter = moshi.adapter(PhoneTransferRequest.class, emptySet, "phoneTransferRequest");
        this.nullableRequisitesPersonTransferRequestAdapter = moshi.adapter(RequisitesPersonTransferRequest.class, emptySet, "requisitesPersonTransferRequest");
        this.nullableRequisitesLegalTransferRequestAdapter = moshi.adapter(RequisitesLegalTransferRequest.class, emptySet, "requisitesLegalTransferRequest");
        this.nullableRequisitesHcsTransferRequestAdapter = moshi.adapter(RequisitesHcsTransferRequest.class, emptySet, "requisitesHcsPayloadTransferRequest");
        this.nullableMe2MeTopupRequestAdapter = moshi.adapter(Me2MeTopupRequest.class, emptySet, "me2meTopupRequest");
        this.nullableAftTopupRequestAdapter = moshi.adapter(AftTopupRequest.class, emptySet, "aftTopupRequest");
        this.nullableMobilePaymentRequestAdapter = moshi.adapter(MobilePaymentRequest.class, emptySet, "mobilePaymentRequest");
        this.nullableInternetPaymentRequestAdapter = moshi.adapter(InternetPaymentRequest.class, emptySet, "internetPaymentRequest");
        this.nullableSbpC2gTransferRequestAdapter = moshi.adapter(SbpC2gTransferRequest.class, emptySet, "sbpC2gTransferRequest");
        this.nullableInvoiceHcsTransferRequestAdapter = moshi.adapter(InvoiceHcsTransferRequest.class, emptySet, "invoiceHcsTransferRequest");
        this.nullableCrossBorderByPhoneRequestAdapter = moshi.adapter(CrossBorderByPhoneRequest.class, emptySet, "crossBorderByPhoneRequest");
        this.nullableMkkCashoutTransferRequestAdapter = moshi.adapter(MkkCashoutTransferRequest.class, emptySet, "mkkCashoutRequest");
        this.nullableB2cTransferRequestAdapter = moshi.adapter(B2cTransferRequest.class, emptySet, "b2cTransferRequest");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "transferId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferRequest fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        TransfersPageRequest.TransfersPageScenario transfersPageScenario = null;
        TransferDirectionType transferDirectionType = null;
        GeneralTransferType generalTransferType = null;
        SelfTransferRequest selfTransferRequest = null;
        SelfTopupRequest selfTopupRequest = null;
        PhoneTransferRequest phoneTransferRequest = null;
        RequisitesPersonTransferRequest requisitesPersonTransferRequest = null;
        RequisitesLegalTransferRequest requisitesLegalTransferRequest = null;
        RequisitesHcsTransferRequest requisitesHcsTransferRequest = null;
        Me2MeTopupRequest me2MeTopupRequest = null;
        AftTopupRequest aftTopupRequest = null;
        MobilePaymentRequest mobilePaymentRequest = null;
        InternetPaymentRequest internetPaymentRequest = null;
        SbpC2gTransferRequest sbpC2gTransferRequest = null;
        InvoiceHcsTransferRequest invoiceHcsTransferRequest = null;
        CrossBorderByPhoneRequest crossBorderByPhoneRequest = null;
        MkkCashoutTransferRequest mkkCashoutTransferRequest = null;
        B2cTransferRequest b2cTransferRequest = null;
        String str = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    transfersPageScenario = this.nullableTransfersPageScenarioAdapter.fromJson(jsonReader);
                    continue;
                case 1:
                    transferDirectionType = this.nullableTransferDirectionTypeAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    generalTransferType = this.nullableGeneralTransferTypeAdapter.fromJson(jsonReader);
                    continue;
                case 3:
                    selfTransferRequest = this.nullableSelfTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    selfTopupRequest = this.nullableSelfTopupRequestAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    phoneTransferRequest = this.nullablePhoneTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    requisitesPersonTransferRequest = this.nullableRequisitesPersonTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    continue;
                case 7:
                    requisitesLegalTransferRequest = this.nullableRequisitesLegalTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    requisitesHcsTransferRequest = this.nullableRequisitesHcsTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    continue;
                case 9:
                    me2MeTopupRequest = this.nullableMe2MeTopupRequestAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    continue;
                case 10:
                    aftTopupRequest = this.nullableAftTopupRequestAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    continue;
                case 11:
                    mobilePaymentRequest = this.nullableMobilePaymentRequestAdapter.fromJson(jsonReader);
                    i2 &= -2049;
                    continue;
                case 12:
                    internetPaymentRequest = this.nullableInternetPaymentRequestAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    sbpC2gTransferRequest = this.nullableSbpC2gTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    invoiceHcsTransferRequest = this.nullableInvoiceHcsTransferRequestAdapter.fromJson(jsonReader);
                    i2 &= -16385;
                    continue;
                case 15:
                    crossBorderByPhoneRequest = this.nullableCrossBorderByPhoneRequestAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    mkkCashoutTransferRequest = this.nullableMkkCashoutTransferRequestAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
                case 17:
                    b2cTransferRequest = this.nullableB2cTransferRequestAdapter.fromJson(jsonReader);
                    i = -131073;
                    break;
                case 18:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -262137) {
            RequisitesHcsTransferRequest requisitesHcsTransferRequest2 = requisitesHcsTransferRequest;
            RequisitesLegalTransferRequest requisitesLegalTransferRequest2 = requisitesLegalTransferRequest;
            RequisitesPersonTransferRequest requisitesPersonTransferRequest2 = requisitesPersonTransferRequest;
            PhoneTransferRequest phoneTransferRequest2 = phoneTransferRequest;
            SelfTopupRequest selfTopupRequest2 = selfTopupRequest;
            SelfTransferRequest selfTransferRequest2 = selfTransferRequest;
            return new TransferRequest(transfersPageScenario, transferDirectionType, generalTransferType, selfTransferRequest2, selfTopupRequest2, phoneTransferRequest2, requisitesPersonTransferRequest2, requisitesLegalTransferRequest2, requisitesHcsTransferRequest2, me2MeTopupRequest, aftTopupRequest, mobilePaymentRequest, internetPaymentRequest, sbpC2gTransferRequest, invoiceHcsTransferRequest, crossBorderByPhoneRequest, mkkCashoutTransferRequest, b2cTransferRequest, str);
        }
        RequisitesHcsTransferRequest requisitesHcsTransferRequest3 = requisitesHcsTransferRequest;
        RequisitesLegalTransferRequest requisitesLegalTransferRequest3 = requisitesLegalTransferRequest;
        RequisitesPersonTransferRequest requisitesPersonTransferRequest3 = requisitesPersonTransferRequest;
        PhoneTransferRequest phoneTransferRequest3 = phoneTransferRequest;
        SelfTopupRequest selfTopupRequest3 = selfTopupRequest;
        SelfTransferRequest selfTransferRequest3 = selfTransferRequest;
        GeneralTransferType generalTransferType2 = generalTransferType;
        TransferDirectionType transferDirectionType2 = transferDirectionType;
        TransfersPageRequest.TransfersPageScenario transfersPageScenario2 = transfersPageScenario;
        Constructor<TransferRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TransferRequest.class.getDeclaredConstructor(TransfersPageRequest.TransfersPageScenario.class, TransferDirectionType.class, GeneralTransferType.class, SelfTransferRequest.class, SelfTopupRequest.class, PhoneTransferRequest.class, RequisitesPersonTransferRequest.class, RequisitesLegalTransferRequest.class, RequisitesHcsTransferRequest.class, Me2MeTopupRequest.class, AftTopupRequest.class, MobilePaymentRequest.class, InternetPaymentRequest.class, SbpC2gTransferRequest.class, InvoiceHcsTransferRequest.class, CrossBorderByPhoneRequest.class, MkkCashoutTransferRequest.class, B2cTransferRequest.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(transfersPageScenario2, transferDirectionType2, generalTransferType2, selfTransferRequest3, selfTopupRequest3, phoneTransferRequest3, requisitesPersonTransferRequest3, requisitesLegalTransferRequest3, requisitesHcsTransferRequest3, me2MeTopupRequest, aftTopupRequest, mobilePaymentRequest, internetPaymentRequest, sbpC2gTransferRequest, invoiceHcsTransferRequest, crossBorderByPhoneRequest, mkkCashoutTransferRequest, b2cTransferRequest, str, Integer.valueOf(i2), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferRequest transferRequest) {
        TransferRequest transferRequest2 = transferRequest;
        if (transferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("scenario");
        this.nullableTransfersPageScenarioAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getScenario());
        jsonWriter.name("direction");
        this.nullableTransferDirectionTypeAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getDirection());
        jsonWriter.name("type");
        this.nullableGeneralTransferTypeAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getType());
        jsonWriter.name("self_transfer_payload");
        this.nullableSelfTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getSelfTransferRequest());
        jsonWriter.name("self_topup_payload");
        this.nullableSelfTopupRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getSelfTopupRequest());
        jsonWriter.name("phone_transfer_payload");
        this.nullablePhoneTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getPhoneTransferRequest());
        jsonWriter.name("requisites_person_payload");
        this.nullableRequisitesPersonTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getRequisitesPersonTransferRequest());
        jsonWriter.name("requisites_legal_payload");
        this.nullableRequisitesLegalTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getRequisitesLegalTransferRequest());
        jsonWriter.name("requisites_hcs_payload");
        this.nullableRequisitesHcsTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getRequisitesHcsPayloadTransferRequest());
        jsonWriter.name("me2me_topup_payload");
        this.nullableMe2MeTopupRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getMe2meTopupRequest());
        jsonWriter.name("aft_topup_payload");
        this.nullableAftTopupRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getAftTopupRequest());
        jsonWriter.name("mobile_payment_payload");
        this.nullableMobilePaymentRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getMobilePaymentRequest());
        jsonWriter.name("internet_payment_payload");
        this.nullableInternetPaymentRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getInternetPaymentRequest());
        jsonWriter.name("sbp_c2g_transfer_payload");
        this.nullableSbpC2gTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getSbpC2gTransferRequest());
        jsonWriter.name("invoice_hcs_transfer_payload");
        this.nullableInvoiceHcsTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getInvoiceHcsTransferRequest());
        jsonWriter.name("cross_border_by_phone_payload");
        this.nullableCrossBorderByPhoneRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getCrossBorderByPhoneRequest());
        jsonWriter.name("mkk_cashout_payload");
        this.nullableMkkCashoutTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getMkkCashoutRequest());
        jsonWriter.name("b2c_transfer_payload");
        this.nullableB2cTransferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getB2cTransferRequest());
        jsonWriter.name("transfer_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferRequest2.getTransferId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(TransferRequest)");
    }
}
