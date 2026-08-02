package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoPaymentsTestPaymentFlow;", "autoPaymentsTestPaymentFlowAdapter", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoPaymentsTestPaymentRequestJsonAdapter extends JsonAdapter<AutoPaymentsTestPaymentRequest> {
    private final JsonAdapter<AutoPaymentsTestPaymentFlow> autoPaymentsTestPaymentFlowAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "member_id", "flow");

    public AutoPaymentsTestPaymentRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.autoPaymentsTestPaymentFlowAdapter = moshi.adapter(AutoPaymentsTestPaymentFlow.class, emptySet, "paymentFlow");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoPaymentsTestPaymentRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        AutoPaymentsTestPaymentFlow autoPaymentsTestPaymentFlow = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (autoPaymentsTestPaymentFlow = this.autoPaymentsTestPaymentFlowAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentFlow", "flow", jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoPaymentsTestPaymentFlow != null) {
            return new AutoPaymentsTestPaymentRequest(str, str2, autoPaymentsTestPaymentFlow);
        }
        throw Util.missingProperty("paymentFlow", "flow", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoPaymentsTestPaymentRequest autoPaymentsTestPaymentRequest) {
        AutoPaymentsTestPaymentRequest autoPaymentsTestPaymentRequest2 = autoPaymentsTestPaymentRequest;
        if (autoPaymentsTestPaymentRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentsTestPaymentRequest2.getAgreementId());
        jsonWriter.name("member_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentsTestPaymentRequest2.getMemberId());
        jsonWriter.name("flow");
        this.autoPaymentsTestPaymentFlowAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentsTestPaymentRequest2.getPaymentFlow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(AutoPaymentsTestPaymentRequest)");
    }
}
