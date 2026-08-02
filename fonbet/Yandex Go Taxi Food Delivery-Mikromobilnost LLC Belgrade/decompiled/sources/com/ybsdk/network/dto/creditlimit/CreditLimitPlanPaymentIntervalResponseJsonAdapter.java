package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalType;", "creditLimitPlanPaymentIntervalTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlanPaymentIntervalResponseJsonAdapter extends JsonAdapter<CreditLimitPlanPaymentIntervalResponse> {
    private final JsonAdapter<CreditLimitPlanPaymentIntervalType> creditLimitPlanPaymentIntervalTypeAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "value");

    public CreditLimitPlanPaymentIntervalResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.creditLimitPlanPaymentIntervalTypeAdapter = moshi.adapter(CreditLimitPlanPaymentIntervalType.class, emptySet, "type");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "value");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlanPaymentIntervalResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CreditLimitPlanPaymentIntervalType creditLimitPlanPaymentIntervalType = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                creditLimitPlanPaymentIntervalType = this.creditLimitPlanPaymentIntervalTypeAdapter.fromJson(jsonReader);
                if (creditLimitPlanPaymentIntervalType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("value__", "value", jsonReader);
            }
        }
        jsonReader.endObject();
        if (creditLimitPlanPaymentIntervalType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (num != null) {
            return new CreditLimitPlanPaymentIntervalResponse(creditLimitPlanPaymentIntervalType, num.intValue());
        }
        throw Util.missingProperty("value__", "value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse) {
        CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse2 = creditLimitPlanPaymentIntervalResponse;
        if (creditLimitPlanPaymentIntervalResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.creditLimitPlanPaymentIntervalTypeAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPaymentIntervalResponse2.getType());
        jsonWriter.name("value");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(creditLimitPlanPaymentIntervalResponse2.getValue()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(60, "GeneratedJsonAdapter(CreditLimitPlanPaymentIntervalResponse)");
    }
}
