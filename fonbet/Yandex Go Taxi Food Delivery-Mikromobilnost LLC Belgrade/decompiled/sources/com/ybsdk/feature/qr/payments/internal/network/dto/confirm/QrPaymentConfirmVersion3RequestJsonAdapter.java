package com.ybsdk.feature.qr.payments.internal.network.dto.confirm;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.internal.network.common.ExternalBankPayloadDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.QrSourceDto;
import defpackage.ny61;
import defpackage.re91;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/confirm/QrPaymentConfirmVersion3RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/confirm/QrPaymentConfirmVersion3Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "nullableQrSourceDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "nullableExternalBankPayloadDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrPaymentConfirmVersion3RequestJsonAdapter extends JsonAdapter<QrPaymentConfirmVersion3Request> {
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<ExternalBankPayloadDto> nullableExternalBankPayloadDtoAdapter;
    private final JsonAdapter<QrSourceDto> nullableQrSourceDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public QrPaymentConfirmVersion3RequestJsonAdapter(Moshi moshi) {
        byte[] bArr = new byte[21];
        for (int i = 0; i < 21; i++) {
            bArr[i] = (byte) (re91.b[i] ^ re91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("hmac", "check_id", "qrc_link", "agreement_id", "money", "qrc_scan_id", "repayment_plan_id", "boost_strategy", "qr_source", "product_type", new String(bArr, uza.a));
        EmptySet emptySet = EmptySet.a;
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "checkId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "repaymentPlanId");
        this.nullableQrSourceDtoAdapter = moshi.adapter(QrSourceDto.class, emptySet, "qrSource");
        this.nullableExternalBankPayloadDtoAdapter = moshi.adapter(ExternalBankPayloadDto.class, emptySet, "externalBankPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrPaymentConfirmVersion3Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        HmacDto hmacDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        QrSourceDto qrSourceDto = null;
        String str7 = null;
        ExternalBankPayloadDto externalBankPayloadDto = null;
        while (true) {
            HmacDto hmacDto2 = hmacDto;
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            Money money2 = money;
            String str11 = str4;
            String str12 = str5;
            if (!jsonReader.hasNext()) {
                String str13 = str6;
                jsonReader.endObject();
                if (hmacDto2 == null) {
                    throw Util.missingProperty("hmac", "hmac", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("checkId", "check_id", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("qrcLink", "qrc_link", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("money", "money", jsonReader);
                }
                if (str11 != null) {
                    return new QrPaymentConfirmVersion3Request(hmacDto2, str8, str9, str10, money2, str11, str12, str13, qrSourceDto, str7, externalBankPayloadDto);
                }
                throw Util.missingProperty("qrcScanId", "qrc_scan_id", jsonReader);
            }
            String str14 = str6;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 0:
                    hmacDto = this.hmacDtoAdapter.fromJson(jsonReader);
                    if (hmacDto == null) {
                        throw Util.unexpectedNull("hmac", "hmac", jsonReader);
                    }
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("checkId", "check_id", jsonReader);
                    }
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("qrcLink", "qrc_link", jsonReader);
                    }
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 4:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 5:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("qrcScanId", "qrc_scan_id", jsonReader);
                    }
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str5 = str12;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 8:
                    qrSourceDto = this.nullableQrSourceDtoAdapter.fromJson(jsonReader);
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                case 10:
                    externalBankPayloadDto = this.nullableExternalBankPayloadDtoAdapter.fromJson(jsonReader);
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
                default:
                    str6 = str14;
                    hmacDto = hmacDto2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    money = money2;
                    str4 = str11;
                    str5 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request) {
        QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request2 = qrPaymentConfirmVersion3Request;
        if (qrPaymentConfirmVersion3Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getHmac());
        jsonWriter.name("check_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getCheckId());
        jsonWriter.name("qrc_link");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getQrcLink());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getMoney());
        jsonWriter.name("qrc_scan_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getQrcScanId());
        jsonWriter.name("repayment_plan_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getRepaymentPlanId());
        jsonWriter.name("boost_strategy");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getBoostStrategy());
        jsonWriter.name("qr_source");
        this.nullableQrSourceDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getQrSource());
        jsonWriter.name("product_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getProductType());
        byte[] bArr = new byte[21];
        for (int i = 0; i < 21; i++) {
            bArr[i] = (byte) (re91.b[i] ^ re91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableExternalBankPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentConfirmVersion3Request2.getExternalBankPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(QrPaymentConfirmVersion3Request)");
    }
}
