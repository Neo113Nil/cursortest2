package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import com.ybsdk.network.dto.PaymentInfoDetails;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/PaymentInfoDetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/PaymentInfoDetails;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "moneyCommonResponseAdapter", "nullableStringAdapter", "Lcom/ybsdk/network/dto/PaymentInfoDetails$PaymentType;", "paymentTypeAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentInfoDetailsJsonAdapter extends JsonAdapter<PaymentInfoDetails> {
    private final JsonAdapter<MoneyCommonResponse> moneyCommonResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_id", "creation_timestamp", "money", "image", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "type", "name");
    private final JsonAdapter<PaymentInfoDetails.PaymentType> paymentTypeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PaymentInfoDetailsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "paymentId");
        this.moneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "image");
        this.paymentTypeAdapter = moshi.adapter(PaymentInfoDetails.PaymentType.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentInfoDetails fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        MoneyCommonResponse moneyCommonResponse = null;
        String str3 = null;
        String str4 = null;
        PaymentInfoDetails.PaymentType paymentType = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            String str6 = str;
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
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("creationTimestamp", "creation_timestamp", jsonReader);
                    }
                    break;
                case 2:
                    moneyCommonResponse = this.moneyCommonResponseAdapter.fromJson(jsonReader);
                    if (moneyCommonResponse == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    paymentType = this.paymentTypeAdapter.fromJson(jsonReader);
                    if (paymentType == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    break;
                case 6:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    break;
            }
            str = str6;
        }
        String str7 = str;
        jsonReader.endObject();
        if (str7 == null) {
            throw Util.missingProperty("paymentId", "payment_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("creationTimestamp", "creation_timestamp", jsonReader);
        }
        if (moneyCommonResponse == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (paymentType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str5 != null) {
            return new PaymentInfoDetails(str7, str2, moneyCommonResponse, str3, str4, paymentType, str5);
        }
        throw Util.missingProperty("name", "name", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentInfoDetails paymentInfoDetails) {
        PaymentInfoDetails paymentInfoDetails2 = paymentInfoDetails;
        if (paymentInfoDetails2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getPaymentId());
        jsonWriter.name("creation_timestamp");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getCreationTimestamp());
        jsonWriter.name("money");
        this.moneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getMoney());
        jsonWriter.name("image");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getImage());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getDescription());
        jsonWriter.name("type");
        this.paymentTypeAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getType());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDetails2.getName());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(PaymentInfoDetails)");
    }
}
