package com.ybsdk.feature.ui.stat.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventPayloadDto;", "uiStatEventPayloadDtoAdapter", "feature-ui-stat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiStatEventDtoJsonAdapter extends JsonAdapter<UiStatEventDto> {
    private final JsonReader.Options options = JsonReader.Options.of(ClidProvider.TIMESTAMP, "event_name", "payload");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UiStatEventPayloadDto> uiStatEventPayloadDtoAdapter;

    public UiStatEventDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, ClidProvider.TIMESTAMP);
        this.uiStatEventPayloadDtoAdapter = moshi.adapter(UiStatEventPayloadDto.class, emptySet, "payload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UiStatEventDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        UiStatEventPayloadDto uiStatEventPayloadDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("eventName", "event_name", jsonReader);
                }
            } else if (selectName == 2 && (uiStatEventPayloadDto = this.uiStatEventPayloadDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("payload", "payload", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("eventName", "event_name", jsonReader);
        }
        if (uiStatEventPayloadDto != null) {
            return new UiStatEventDto(str, str2, uiStatEventPayloadDto);
        }
        throw Util.missingProperty("payload", "payload", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UiStatEventDto uiStatEventDto) {
        UiStatEventDto uiStatEventDto2 = uiStatEventDto;
        if (uiStatEventDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uiStatEventDto2.getTimestamp());
        jsonWriter.name("event_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uiStatEventDto2.getEventName());
        jsonWriter.name("payload");
        this.uiStatEventPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) uiStatEventDto2.getPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(UiStatEventDto)");
    }
}
