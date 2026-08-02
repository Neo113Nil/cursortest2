package com.ybsdk.feature.qr.payments.internal.network.dto.result;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentResult;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/result/GetResultResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/result/GetResultResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;", "qrPaymentResultAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetResultResponseJsonAdapter extends JsonAdapter<GetResultResponse> {
    private final JsonReader.Options options = JsonReader.Options.of("payment_result");
    private final JsonAdapter<QrPaymentResult> qrPaymentResultAdapter;

    public GetResultResponseJsonAdapter(Moshi moshi) {
        this.qrPaymentResultAdapter = moshi.adapter(QrPaymentResult.class, EmptySet.a, "paymentResult");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetResultResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        QrPaymentResult qrPaymentResult = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (qrPaymentResult = this.qrPaymentResultAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentResult", "payment_result", jsonReader);
            }
        }
        jsonReader.endObject();
        if (qrPaymentResult != null) {
            return new GetResultResponse(qrPaymentResult);
        }
        throw Util.missingProperty("paymentResult", "payment_result", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetResultResponse getResultResponse) {
        GetResultResponse getResultResponse2 = getResultResponse;
        if (getResultResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_result");
        this.qrPaymentResultAdapter.toJson(jsonWriter, (JsonWriter) getResultResponse2.getPaymentResult());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(GetResultResponse)");
    }
}
