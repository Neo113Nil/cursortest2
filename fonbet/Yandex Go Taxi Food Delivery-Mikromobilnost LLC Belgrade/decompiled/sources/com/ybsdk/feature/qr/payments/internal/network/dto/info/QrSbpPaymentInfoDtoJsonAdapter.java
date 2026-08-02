package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.qr.payments.internal.network.common.QrcTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrSbpPaymentInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrSbpPaymentInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/common/QrcTypeDto;", "qrcTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDto;", "nullableQrPaymentInfoDtoAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionInfoDto;", "nullableSubscriptionInfoDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrSbpPaymentInfoDtoJsonAdapter extends JsonAdapter<QrSbpPaymentInfoDto> {
    private final JsonAdapter<QrPaymentInfoDto> nullableQrPaymentInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<SubscriptionInfoDto> nullableSubscriptionInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("qrc_type", "payment_info", "redirect_link", "subscription_info");
    private final JsonAdapter<QrcTypeDto> qrcTypeDtoAdapter;

    public QrSbpPaymentInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.qrcTypeDtoAdapter = moshi.adapter(QrcTypeDto.class, emptySet, "qrcType");
        this.nullableQrPaymentInfoDtoAdapter = moshi.adapter(QrPaymentInfoDto.class, emptySet, "payment");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "redirectLink");
        this.nullableSubscriptionInfoDtoAdapter = moshi.adapter(SubscriptionInfoDto.class, emptySet, "subscriptionInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrSbpPaymentInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        QrcTypeDto qrcTypeDto = null;
        QrPaymentInfoDto qrPaymentInfoDto = null;
        String str = null;
        SubscriptionInfoDto subscriptionInfoDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                qrcTypeDto = this.qrcTypeDtoAdapter.fromJson(jsonReader);
                if (qrcTypeDto == null) {
                    throw Util.unexpectedNull("qrcType", "qrc_type", jsonReader);
                }
            } else if (selectName == 1) {
                qrPaymentInfoDto = this.nullableQrPaymentInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                subscriptionInfoDto = this.nullableSubscriptionInfoDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (qrcTypeDto != null) {
            return new QrSbpPaymentInfoDto(qrcTypeDto, qrPaymentInfoDto, str, subscriptionInfoDto);
        }
        throw Util.missingProperty("qrcType", "qrc_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrSbpPaymentInfoDto qrSbpPaymentInfoDto) {
        QrSbpPaymentInfoDto qrSbpPaymentInfoDto2 = qrSbpPaymentInfoDto;
        if (qrSbpPaymentInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("qrc_type");
        this.qrcTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) qrSbpPaymentInfoDto2.getQrcType());
        jsonWriter.name("payment_info");
        this.nullableQrPaymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) qrSbpPaymentInfoDto2.getPayment());
        jsonWriter.name("redirect_link");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrSbpPaymentInfoDto2.getRedirectLink());
        jsonWriter.name("subscription_info");
        this.nullableSubscriptionInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) qrSbpPaymentInfoDto2.getSubscriptionInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(QrSbpPaymentInfoDto)");
    }
}
