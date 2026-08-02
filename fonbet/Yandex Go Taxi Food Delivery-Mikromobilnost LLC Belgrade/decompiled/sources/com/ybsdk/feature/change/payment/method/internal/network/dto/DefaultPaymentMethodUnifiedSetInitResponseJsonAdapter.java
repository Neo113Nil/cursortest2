package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "defaultPaymentMethodUnifiedSetStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "", "mapOfStringAnyAdapter", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultPaymentMethodUnifiedSetInitResponseJsonAdapter extends JsonAdapter<DefaultPaymentMethodUnifiedSetInitResponse> {
    private final JsonAdapter<DefaultPaymentMethodUnifiedSetStatus> defaultPaymentMethodUnifiedSetStatusAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(TarifficatorScenarioActivity.RESULT_KEY, "polling_payload");

    public DefaultPaymentMethodUnifiedSetInitResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.defaultPaymentMethodUnifiedSetStatusAdapter = moshi.adapter(DefaultPaymentMethodUnifiedSetStatus.class, emptySet, TarifficatorScenarioActivity.RESULT_KEY);
        this.mapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "pollingPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DefaultPaymentMethodUnifiedSetInitResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus = null;
        Map<String, Object> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                defaultPaymentMethodUnifiedSetStatus = this.defaultPaymentMethodUnifiedSetStatusAdapter.fromJson(jsonReader);
                if (defaultPaymentMethodUnifiedSetStatus == null) {
                    throw Util.unexpectedNull(TarifficatorScenarioActivity.RESULT_KEY, TarifficatorScenarioActivity.RESULT_KEY, jsonReader);
                }
            } else if (selectName == 1 && (map = this.mapOfStringAnyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("pollingPayload", "polling_payload", jsonReader);
            }
        }
        jsonReader.endObject();
        if (defaultPaymentMethodUnifiedSetStatus == null) {
            throw Util.missingProperty(TarifficatorScenarioActivity.RESULT_KEY, TarifficatorScenarioActivity.RESULT_KEY, jsonReader);
        }
        if (map != null) {
            return new DefaultPaymentMethodUnifiedSetInitResponse(defaultPaymentMethodUnifiedSetStatus, map);
        }
        throw Util.missingProperty("pollingPayload", "polling_payload", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DefaultPaymentMethodUnifiedSetInitResponse defaultPaymentMethodUnifiedSetInitResponse) {
        DefaultPaymentMethodUnifiedSetInitResponse defaultPaymentMethodUnifiedSetInitResponse2 = defaultPaymentMethodUnifiedSetInitResponse;
        if (defaultPaymentMethodUnifiedSetInitResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(TarifficatorScenarioActivity.RESULT_KEY);
        this.defaultPaymentMethodUnifiedSetStatusAdapter.toJson(jsonWriter, (JsonWriter) defaultPaymentMethodUnifiedSetInitResponse2.getResult());
        jsonWriter.name("polling_payload");
        this.mapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) defaultPaymentMethodUnifiedSetInitResponse2.getPollingPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(64, "GeneratedJsonAdapter(DefaultPaymentMethodUnifiedSetInitResponse)");
    }
}
