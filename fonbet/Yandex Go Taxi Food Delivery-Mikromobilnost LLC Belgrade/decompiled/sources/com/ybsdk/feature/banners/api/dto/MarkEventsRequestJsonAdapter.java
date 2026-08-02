package com.ybsdk.feature.banners.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/banners/api/dto/MarkEventsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/banners/api/dto/MarkEventsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "nullableListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/banners/api/dto/WidgetType;", "nullableWidgetTypeAdapter", "Lcom/ybsdk/feature/banners/api/dto/MarkType;", "markTypeAdapter", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkEventsRequestJsonAdapter extends JsonAdapter<MarkEventsRequest> {
    private final JsonAdapter<MarkType> markTypeAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<WidgetType> nullableWidgetTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("event_ids", "event_type", "mark_type");

    public MarkEventsRequestJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableListOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "ids");
        this.nullableWidgetTypeAdapter = moshi.adapter(WidgetType.class, emptySet, "type");
        this.markTypeAdapter = moshi.adapter(MarkType.class, emptySet, "mark");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MarkEventsRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        WidgetType widgetType = null;
        MarkType markType = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                widgetType = this.nullableWidgetTypeAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (markType = this.markTypeAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("mark", "mark_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (markType != null) {
            return new MarkEventsRequest(list, widgetType, markType);
        }
        throw Util.missingProperty("mark", "mark_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MarkEventsRequest markEventsRequest) {
        MarkEventsRequest markEventsRequest2 = markEventsRequest;
        if (markEventsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("event_ids");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) markEventsRequest2.getIds());
        jsonWriter.name("event_type");
        this.nullableWidgetTypeAdapter.toJson(jsonWriter, (JsonWriter) markEventsRequest2.getType());
        jsonWriter.name("mark_type");
        this.markTypeAdapter.toJson(jsonWriter, (JsonWriter) markEventsRequest2.getMark());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(MarkEventsRequest)");
    }
}
