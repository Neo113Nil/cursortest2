package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.internal.network.common.ExternalBankPayloadDto;
import defpackage.ny61;
import defpackage.re91;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentRequestV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentRequestV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "nullableQrSourceDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "nullableExternalBankPayloadDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckPaymentRequestV2JsonAdapter extends JsonAdapter<CheckPaymentRequestV2> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<ExternalBankPayloadDto> nullableExternalBankPayloadDtoAdapter;
    private final JsonAdapter<QrSourceDto> nullableQrSourceDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CheckPaymentRequestV2JsonAdapter(Moshi moshi) {
        byte[] bArr = new byte[21];
        for (int i = 0; i < 21; i++) {
            bArr[i] = (byte) (re91.b[i] ^ re91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("agreement_id", "money", "qrc_link", "qrc_scan_id", "repayment_plan_id", "boost_strategy", "qr_source", "product_type", new String(bArr, uza.a));
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "repaymentPlanId");
        this.nullableQrSourceDtoAdapter = moshi.adapter(QrSourceDto.class, emptySet, "qrSource");
        this.nullableExternalBankPayloadDtoAdapter = moshi.adapter(ExternalBankPayloadDto.class, emptySet, "externalBankPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckPaymentRequestV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        QrSourceDto qrSourceDto = null;
        String str6 = null;
        ExternalBankPayloadDto externalBankPayloadDto = null;
        while (true) {
            String str7 = str;
            Money money2 = money;
            if (!jsonReader.hasNext()) {
                String str8 = str2;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("money", "money", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("qrcLink", "qrc_link", jsonReader);
                }
                if (str3 != null) {
                    return new CheckPaymentRequestV2(str7, money2, str8, str3, str4, str5, qrSourceDto, str6, externalBankPayloadDto);
                }
                throw Util.missingProperty("qrcScanId", "qrc_scan_id", jsonReader);
            }
            String str9 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str9;
                    str = str7;
                    money = money2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str2 = str9;
                    money = money2;
                case 1:
                    Money fromJson = this.moneyAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    money = fromJson;
                    str2 = str9;
                    str = str7;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("qrcLink", "qrc_link", jsonReader);
                    }
                    str = str7;
                    money = money2;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("qrcScanId", "qrc_scan_id", jsonReader);
                    }
                    str2 = str9;
                    str = str7;
                    money = money2;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                    money = money2;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                    money = money2;
                case 6:
                    qrSourceDto = this.nullableQrSourceDtoAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                    money = money2;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                    money = money2;
                case 8:
                    externalBankPayloadDto = this.nullableExternalBankPayloadDtoAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                    money = money2;
                default:
                    str2 = str9;
                    str = str7;
                    money = money2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckPaymentRequestV2 checkPaymentRequestV2) {
        CheckPaymentRequestV2 checkPaymentRequestV22 = checkPaymentRequestV2;
        if (checkPaymentRequestV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getMoney());
        jsonWriter.name("qrc_link");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getQrcLink());
        jsonWriter.name("qrc_scan_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getQrcScanId());
        jsonWriter.name("repayment_plan_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getRepaymentPlanId());
        jsonWriter.name("boost_strategy");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getBoostStrategy());
        jsonWriter.name("qr_source");
        this.nullableQrSourceDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getQrSource());
        jsonWriter.name("product_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getProductType());
        byte[] bArr = new byte[21];
        for (int i = 0; i < 21; i++) {
            bArr[i] = (byte) (re91.b[i] ^ re91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableExternalBankPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentRequestV22.getExternalBankPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(CheckPaymentRequestV2)");
    }
}
