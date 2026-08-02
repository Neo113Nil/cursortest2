package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.analytics.DeeplinkParamsFilter;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/configs/DeeplinkParamsFilterSchemaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/DeeplinkParamsFilterSchema;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "Lcom/ybsdk/core/analytics/DeeplinkParamsFilter;", "mapOfStringDeeplinkParamsFilterAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/rconfig/configs/DeeplinkParamsRegexFilter;", "nullableListOfDeeplinkParamsRegexFilterAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeeplinkParamsFilterSchemaJsonAdapter extends JsonAdapter<DeeplinkParamsFilterSchema> {
    private final JsonAdapter<Map<String, DeeplinkParamsFilter>> mapOfStringDeeplinkParamsFilterAdapter;
    private final JsonAdapter<List<DeeplinkParamsRegexFilter>> nullableListOfDeeplinkParamsRegexFilterAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("filters", "filters_regex");

    public DeeplinkParamsFilterSchemaJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Map.class, String.class, DeeplinkParamsFilter.class);
        EmptySet emptySet = EmptySet.a;
        this.mapOfStringDeeplinkParamsFilterAdapter = moshi.adapter(newParameterizedType, emptySet, "filters");
        this.nullableListOfDeeplinkParamsRegexFilterAdapter = moshi.adapter(Types.newParameterizedType(List.class, DeeplinkParamsRegexFilter.class), emptySet, "filtersRegex");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeeplinkParamsFilterSchema fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, DeeplinkParamsFilter> map = null;
        List<DeeplinkParamsRegexFilter> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = this.mapOfStringDeeplinkParamsFilterAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("filters", "filters", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.nullableListOfDeeplinkParamsRegexFilterAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (map != null) {
            return new DeeplinkParamsFilterSchema(map, list);
        }
        throw Util.missingProperty("filters", "filters", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeeplinkParamsFilterSchema deeplinkParamsFilterSchema) {
        DeeplinkParamsFilterSchema deeplinkParamsFilterSchema2 = deeplinkParamsFilterSchema;
        if (deeplinkParamsFilterSchema2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("filters");
        this.mapOfStringDeeplinkParamsFilterAdapter.toJson(jsonWriter, (JsonWriter) deeplinkParamsFilterSchema2.getFilters());
        jsonWriter.name("filters_regex");
        this.nullableListOfDeeplinkParamsRegexFilterAdapter.toJson(jsonWriter, (JsonWriter) deeplinkParamsFilterSchema2.getFiltersRegex());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(DeeplinkParamsFilterSchema)");
    }
}
