package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/SamsungPayFeatureJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/SamsungPayFeature;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "mapOfStringStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SamsungPayFeatureJsonAdapter extends JsonAdapter<SamsungPayFeature> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("service_ids", "is_enabled");

    public SamsungPayFeatureJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Map.class, String.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.mapOfStringStringAdapter = moshi.adapter(newParameterizedType, emptySet, "serviceIds");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SamsungPayFeature fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, String> map = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = this.mapOfStringStringAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("serviceIds", "service_ids", jsonReader);
                }
            } else if (selectName == 1 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
            }
        }
        jsonReader.endObject();
        if (map == null) {
            throw Util.missingProperty("serviceIds", "service_ids", jsonReader);
        }
        if (bool != null) {
            return new SamsungPayFeature(map, bool.booleanValue());
        }
        throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SamsungPayFeature samsungPayFeature) {
        SamsungPayFeature samsungPayFeature2 = samsungPayFeature;
        if (samsungPayFeature2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("service_ids");
        this.mapOfStringStringAdapter.toJson(jsonWriter, (JsonWriter) samsungPayFeature2.getServiceIds());
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(samsungPayFeature2.isEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(SamsungPayFeature)");
    }
}
