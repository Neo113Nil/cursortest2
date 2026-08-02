package com.ybsdk.feature.qr.payments.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsResultStatus;", "qrPaymentsResultStatusAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "merchantDtoAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionWidgetDto;", "nullableSubscriptionWidgetDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrPaymentResultJsonAdapter extends JsonAdapter<QrPaymentResult> {
    private final JsonAdapter<MerchantDto> merchantDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<SubscriptionWidgetDto> nullableSubscriptionWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_id", ACSPConstants.STATUS, "merchant", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "subscription_widget", "redirect_link", "divkit_widget");
    private final JsonAdapter<QrPaymentsResultStatus> qrPaymentsResultStatusAdapter;
    private final JsonAdapter<String> stringAdapter;

    public QrPaymentResultJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "paymentId");
        this.qrPaymentsResultStatusAdapter = moshi.adapter(QrPaymentsResultStatus.class, emptySet, ACSPConstants.STATUS);
        this.merchantDtoAdapter = moshi.adapter(MerchantDto.class, emptySet, "merchant");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableSubscriptionWidgetDtoAdapter = moshi.adapter(SubscriptionWidgetDto.class, emptySet, "subscriptionWidget");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitWidget");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrPaymentResult fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        QrPaymentsResultStatus qrPaymentsResultStatus = null;
        MerchantDto merchantDto = null;
        String str2 = null;
        String str3 = null;
        SubscriptionWidgetDto subscriptionWidgetDto = null;
        String str4 = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("paymentId", "payment_id", jsonReader);
                    }
                    break;
                case 1:
                    qrPaymentsResultStatus = this.qrPaymentsResultStatusAdapter.fromJson(jsonReader);
                    if (qrPaymentsResultStatus == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 2:
                    merchantDto = this.merchantDtoAdapter.fromJson(jsonReader);
                    if (merchantDto == null) {
                        throw Util.unexpectedNull("merchant", "merchant", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    subscriptionWidgetDto = this.nullableSubscriptionWidgetDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("paymentId", "payment_id", jsonReader);
        }
        if (qrPaymentsResultStatus == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (merchantDto == null) {
            throw Util.missingProperty("merchant", "merchant", jsonReader);
        }
        if (str2 != null) {
            return new QrPaymentResult(str, qrPaymentsResultStatus, merchantDto, str2, str3, subscriptionWidgetDto, str4, divDataDto);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrPaymentResult qrPaymentResult) {
        QrPaymentResult qrPaymentResult2 = qrPaymentResult;
        if (qrPaymentResult2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getPaymentId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.qrPaymentsResultStatusAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getStatus());
        jsonWriter.name("merchant");
        this.merchantDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getMerchant());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getDescription());
        jsonWriter.name("subscription_widget");
        this.nullableSubscriptionWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getSubscriptionWidget());
        jsonWriter.name("redirect_link");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getRedirectLink());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentResult2.getDivkitWidget());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(QrPaymentResult)");
    }
}
