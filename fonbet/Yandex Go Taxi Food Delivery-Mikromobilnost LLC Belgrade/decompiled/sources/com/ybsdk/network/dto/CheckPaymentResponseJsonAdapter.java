package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.CheckPaymentResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/CheckPaymentResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/CheckPaymentResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentResolution;", "paymentResolutionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentConditions;", "nullablePaymentConditionsAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckPaymentResponseJsonAdapter extends JsonAdapter<CheckPaymentResponse> {
    private final JsonAdapter<CheckPaymentResponse.PaymentConditions> nullablePaymentConditionsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("resolution", "condition");
    private final JsonAdapter<CheckPaymentResponse.PaymentResolution> paymentResolutionAdapter;

    public CheckPaymentResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentResolutionAdapter = moshi.adapter(CheckPaymentResponse.PaymentResolution.class, emptySet, "resolution");
        this.nullablePaymentConditionsAdapter = moshi.adapter(CheckPaymentResponse.PaymentConditions.class, emptySet, "conditions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckPaymentResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CheckPaymentResponse.PaymentResolution paymentResolution = null;
        CheckPaymentResponse.PaymentConditions paymentConditions = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentResolution = this.paymentResolutionAdapter.fromJson(jsonReader);
                if (paymentResolution == null) {
                    throw Util.unexpectedNull("resolution", "resolution", jsonReader);
                }
            } else if (selectName == 1) {
                paymentConditions = this.nullablePaymentConditionsAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentResolution != null) {
            return new CheckPaymentResponse(paymentResolution, paymentConditions);
        }
        throw Util.missingProperty("resolution", "resolution", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckPaymentResponse checkPaymentResponse) {
        CheckPaymentResponse checkPaymentResponse2 = checkPaymentResponse;
        if (checkPaymentResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("resolution");
        this.paymentResolutionAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponse2.getResolution());
        jsonWriter.name("condition");
        this.nullablePaymentConditionsAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponse2.getConditions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(CheckPaymentResponse)");
    }
}
