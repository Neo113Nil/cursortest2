package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PrerequisiteParam;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam$TransfersPagePrerequisiteType;", "nullableTransfersPagePrerequisiteTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferPrerequisiteParam;", "nullableSelfTransferPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupPrerequisiteParam;", "nullableSelfTopupPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PhoneTransferPrerequisiteParam;", "nullablePhoneTransferPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentPrerequisiteParam;", "nullableMobilePaymentPrerequisiteParamAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam;", "nullableCommonTopupPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentPrerequisiteParam;", "nullableInternetPaymentPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/C2GPrerequisiteParam;", "nullableC2GPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsPrerequisiteParam;", "nullableInvoiceHcsPrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParam;", "nullableCrossBorderByPhonePrerequisiteParamAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrerequisiteParamJsonAdapter extends JsonAdapter<PrerequisiteParam> {
    private volatile Constructor<PrerequisiteParam> constructorRef;
    private final JsonAdapter<C2GPrerequisiteParam> nullableC2GPrerequisiteParamAdapter;
    private final JsonAdapter<CommonTopupPrerequisiteParam> nullableCommonTopupPrerequisiteParamAdapter;
    private final JsonAdapter<CrossBorderByPhonePrerequisiteParam> nullableCrossBorderByPhonePrerequisiteParamAdapter;
    private final JsonAdapter<InternetPaymentPrerequisiteParam> nullableInternetPaymentPrerequisiteParamAdapter;
    private final JsonAdapter<InvoiceHcsPrerequisiteParam> nullableInvoiceHcsPrerequisiteParamAdapter;
    private final JsonAdapter<MobilePaymentPrerequisiteParam> nullableMobilePaymentPrerequisiteParamAdapter;
    private final JsonAdapter<PhoneTransferPrerequisiteParam> nullablePhoneTransferPrerequisiteParamAdapter;
    private final JsonAdapter<SelfTopupPrerequisiteParam> nullableSelfTopupPrerequisiteParamAdapter;
    private final JsonAdapter<SelfTransferPrerequisiteParam> nullableSelfTransferPrerequisiteParamAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<PrerequisiteParam.TransfersPagePrerequisiteType> nullableTransfersPagePrerequisiteTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "self_transfer_prereq", "self_topup_prereq", "phone_transfer_prereq", "mobile_payment_prereq", "qr_string", "common_topup_prereq", "internet_payment_prereq", "c2g_prereq", "invoice_hcs_prereq", "cross_border_by_phone_prereq", "template_id", "template_type");

    public PrerequisiteParamJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTransfersPagePrerequisiteTypeAdapter = moshi.adapter(PrerequisiteParam.TransfersPagePrerequisiteType.class, emptySet, "type");
        this.nullableSelfTransferPrerequisiteParamAdapter = moshi.adapter(SelfTransferPrerequisiteParam.class, emptySet, "self");
        this.nullableSelfTopupPrerequisiteParamAdapter = moshi.adapter(SelfTopupPrerequisiteParam.class, emptySet, "selfTopup");
        this.nullablePhoneTransferPrerequisiteParamAdapter = moshi.adapter(PhoneTransferPrerequisiteParam.class, emptySet, "phone");
        this.nullableMobilePaymentPrerequisiteParamAdapter = moshi.adapter(MobilePaymentPrerequisiteParam.class, emptySet, "mobilePayment");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "qrString");
        this.nullableCommonTopupPrerequisiteParamAdapter = moshi.adapter(CommonTopupPrerequisiteParam.class, emptySet, "commonTopup");
        this.nullableInternetPaymentPrerequisiteParamAdapter = moshi.adapter(InternetPaymentPrerequisiteParam.class, emptySet, "internetPayment");
        this.nullableC2GPrerequisiteParamAdapter = moshi.adapter(C2GPrerequisiteParam.class, emptySet, "c2g");
        this.nullableInvoiceHcsPrerequisiteParamAdapter = moshi.adapter(InvoiceHcsPrerequisiteParam.class, emptySet, "invoiceHcs");
        this.nullableCrossBorderByPhonePrerequisiteParamAdapter = moshi.adapter(CrossBorderByPhonePrerequisiteParam.class, emptySet, "crossBorderByPhone");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PrerequisiteParam fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        PrerequisiteParam.TransfersPagePrerequisiteType transfersPagePrerequisiteType = null;
        SelfTransferPrerequisiteParam selfTransferPrerequisiteParam = null;
        SelfTopupPrerequisiteParam selfTopupPrerequisiteParam = null;
        PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam = null;
        MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam = null;
        String str = null;
        CommonTopupPrerequisiteParam commonTopupPrerequisiteParam = null;
        InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam = null;
        C2GPrerequisiteParam c2GPrerequisiteParam = null;
        InvoiceHcsPrerequisiteParam invoiceHcsPrerequisiteParam = null;
        CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    transfersPagePrerequisiteType = this.nullableTransfersPagePrerequisiteTypeAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    selfTransferPrerequisiteParam = this.nullableSelfTransferPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    selfTopupPrerequisiteParam = this.nullableSelfTopupPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    phoneTransferPrerequisiteParam = this.nullablePhoneTransferPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    mobilePaymentPrerequisiteParam = this.nullableMobilePaymentPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    commonTopupPrerequisiteParam = this.nullableCommonTopupPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    internetPaymentPrerequisiteParam = this.nullableInternetPaymentPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    c2GPrerequisiteParam = this.nullableC2GPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    invoiceHcsPrerequisiteParam = this.nullableInvoiceHcsPrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
                case 10:
                    crossBorderByPhonePrerequisiteParam = this.nullableCrossBorderByPhonePrerequisiteParamAdapter.fromJson(jsonReader);
                    i &= -1025;
                    break;
                case 11:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2049;
                    break;
                case 12:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -4097;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -8191) {
            C2GPrerequisiteParam c2GPrerequisiteParam2 = c2GPrerequisiteParam;
            InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam2 = internetPaymentPrerequisiteParam;
            CommonTopupPrerequisiteParam commonTopupPrerequisiteParam2 = commonTopupPrerequisiteParam;
            String str4 = str;
            MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam2 = mobilePaymentPrerequisiteParam;
            PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam2 = phoneTransferPrerequisiteParam;
            return new PrerequisiteParam(transfersPagePrerequisiteType, selfTransferPrerequisiteParam, selfTopupPrerequisiteParam, phoneTransferPrerequisiteParam2, mobilePaymentPrerequisiteParam2, str4, commonTopupPrerequisiteParam2, internetPaymentPrerequisiteParam2, c2GPrerequisiteParam2, invoiceHcsPrerequisiteParam, crossBorderByPhonePrerequisiteParam, str2, str3);
        }
        C2GPrerequisiteParam c2GPrerequisiteParam3 = c2GPrerequisiteParam;
        InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam3 = internetPaymentPrerequisiteParam;
        CommonTopupPrerequisiteParam commonTopupPrerequisiteParam3 = commonTopupPrerequisiteParam;
        String str5 = str;
        MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam3 = mobilePaymentPrerequisiteParam;
        PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam3 = phoneTransferPrerequisiteParam;
        SelfTopupPrerequisiteParam selfTopupPrerequisiteParam2 = selfTopupPrerequisiteParam;
        SelfTransferPrerequisiteParam selfTransferPrerequisiteParam2 = selfTransferPrerequisiteParam;
        PrerequisiteParam.TransfersPagePrerequisiteType transfersPagePrerequisiteType2 = transfersPagePrerequisiteType;
        Constructor<PrerequisiteParam> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PrerequisiteParam.class.getDeclaredConstructor(PrerequisiteParam.TransfersPagePrerequisiteType.class, SelfTransferPrerequisiteParam.class, SelfTopupPrerequisiteParam.class, PhoneTransferPrerequisiteParam.class, MobilePaymentPrerequisiteParam.class, String.class, CommonTopupPrerequisiteParam.class, InternetPaymentPrerequisiteParam.class, C2GPrerequisiteParam.class, InvoiceHcsPrerequisiteParam.class, CrossBorderByPhonePrerequisiteParam.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(transfersPagePrerequisiteType2, selfTransferPrerequisiteParam2, selfTopupPrerequisiteParam2, phoneTransferPrerequisiteParam3, mobilePaymentPrerequisiteParam3, str5, commonTopupPrerequisiteParam3, internetPaymentPrerequisiteParam3, c2GPrerequisiteParam3, invoiceHcsPrerequisiteParam, crossBorderByPhonePrerequisiteParam, str2, str3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PrerequisiteParam prerequisiteParam) {
        PrerequisiteParam prerequisiteParam2 = prerequisiteParam;
        if (prerequisiteParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.nullableTransfersPagePrerequisiteTypeAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getType());
        jsonWriter.name("self_transfer_prereq");
        this.nullableSelfTransferPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getSelf());
        jsonWriter.name("self_topup_prereq");
        this.nullableSelfTopupPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getSelfTopup());
        jsonWriter.name("phone_transfer_prereq");
        this.nullablePhoneTransferPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getPhone());
        jsonWriter.name("mobile_payment_prereq");
        this.nullableMobilePaymentPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getMobilePayment());
        jsonWriter.name("qr_string");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getQrString());
        jsonWriter.name("common_topup_prereq");
        this.nullableCommonTopupPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getCommonTopup());
        jsonWriter.name("internet_payment_prereq");
        this.nullableInternetPaymentPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getInternetPayment());
        jsonWriter.name("c2g_prereq");
        this.nullableC2GPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getC2g());
        jsonWriter.name("invoice_hcs_prereq");
        this.nullableInvoiceHcsPrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getInvoiceHcs());
        jsonWriter.name("cross_border_by_phone_prereq");
        this.nullableCrossBorderByPhonePrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getCrossBorderByPhone());
        jsonWriter.name("template_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getTemplateId());
        jsonWriter.name("template_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) prerequisiteParam2.getTemplateType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(PrerequisiteParam)");
    }
}
