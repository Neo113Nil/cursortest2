package com.ybsdk.feature.ui.stat.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventDto;", "listOfUiStatEventDtoAdapter", "feature-ui-stat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiStatEventsRequestJsonAdapter extends JsonAdapter<UiStatEventsRequest> {
    private final JsonAdapter<List<UiStatEventDto>> listOfUiStatEventDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("user_session_id", "events");
    private final JsonAdapter<String> stringAdapter;

    public UiStatEventsRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "userSessionId");
        this.listOfUiStatEventDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, UiStatEventDto.class), emptySet, "events");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UiStatEventsRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<UiStatEventDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("userSessionId", "user_session_id", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfUiStatEventDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("events", "events", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("userSessionId", "user_session_id", jsonReader);
        }
        if (list != null) {
            return new UiStatEventsRequest(str, list);
        }
        throw Util.missingProperty("events", "events", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UiStatEventsRequest uiStatEventsRequest) {
        UiStatEventsRequest uiStatEventsRequest2 = uiStatEventsRequest;
        if (uiStatEventsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("user_session_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uiStatEventsRequest2.getUserSessionId());
        jsonWriter.name("events");
        this.listOfUiStatEventDtoAdapter.toJson(jsonWriter, (JsonWriter) uiStatEventsRequest2.getEvents());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(UiStatEventsRequest)");
    }
}
