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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlanVisualPropertiesResponseJsonAdapter extends JsonAdapter<CreditLimitPlanVisualPropertiesResponse> {
    private final JsonReader.Options options = JsonReader.Options.of("title", "short_title", "next_dates_description", "next_payment_description");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitPlanVisualPropertiesResponseJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlanVisualPropertiesResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("shortTitle", "short_title", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("nextDatesDescription", "next_dates_description", jsonReader);
                }
            } else if (selectName == 3 && (str4 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("nextPaymentDescription", "next_payment_description", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("shortTitle", "short_title", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("nextDatesDescription", "next_dates_description", jsonReader);
        }
        if (str4 != null) {
            return new CreditLimitPlanVisualPropertiesResponse(str, str2, str3, str4);
        }
        throw Util.missingProperty("nextPaymentDescription", "next_payment_description", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse) {
        CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse2 = creditLimitPlanVisualPropertiesResponse;
        if (creditLimitPlanVisualPropertiesResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanVisualPropertiesResponse2.getTitle());
        jsonWriter.name("short_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanVisualPropertiesResponse2.getShortTitle());
        jsonWriter.name("next_dates_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanVisualPropertiesResponse2.getNextDatesDescription());
        jsonWriter.name("next_payment_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanVisualPropertiesResponse2.getNextPaymentDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(CreditLimitPlanVisualPropertiesResponse)");
    }
}
