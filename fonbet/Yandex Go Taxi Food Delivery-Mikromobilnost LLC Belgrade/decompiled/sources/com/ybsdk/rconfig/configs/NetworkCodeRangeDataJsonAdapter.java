package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkCodeRangeDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkCodeRangeDataJsonAdapter extends JsonAdapter<NetworkCodeRangeData> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lower_bound", "upper_bound");

    public NetworkCodeRangeDataJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.a, "lowerBound");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NetworkCodeRangeData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("lowerBound", "lower_bound", jsonReader);
                }
            } else if (selectName == 1 && (num2 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("upperBound", "upper_bound", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("lowerBound", "lower_bound", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new NetworkCodeRangeData(intValue, num2.intValue());
        }
        throw Util.missingProperty("upperBound", "upper_bound", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NetworkCodeRangeData networkCodeRangeData) {
        NetworkCodeRangeData networkCodeRangeData2 = networkCodeRangeData;
        if (networkCodeRangeData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lower_bound");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(networkCodeRangeData2.getLowerBound()));
        jsonWriter.name("upper_bound");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(networkCodeRangeData2.getUpperBound()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(NetworkCodeRangeData)");
    }
}
