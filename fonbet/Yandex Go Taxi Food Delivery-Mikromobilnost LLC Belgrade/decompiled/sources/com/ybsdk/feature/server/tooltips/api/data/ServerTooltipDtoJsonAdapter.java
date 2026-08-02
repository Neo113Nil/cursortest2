package com.ybsdk.feature.server.tooltips.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;", "serverTooltipModelDtoAdapter", "", "nullableIntAdapter", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServerTooltipDtoJsonAdapter extends JsonAdapter<ServerTooltipDto> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "event_id", "defaults_group", "model", "showing_delay_ms");
    private final JsonAdapter<ServerTooltipModelDto> serverTooltipModelDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ServerTooltipDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.serverTooltipModelDtoAdapter = moshi.adapter(ServerTooltipModelDto.class, emptySet, "model");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "showingDelayMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ServerTooltipDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        ServerTooltipModelDto serverTooltipModelDto = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("eventId", "event_id", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("defaultsGroup", "defaults_group", jsonReader);
                }
            } else if (selectName == 3) {
                serverTooltipModelDto = this.serverTooltipModelDtoAdapter.fromJson(jsonReader);
                if (serverTooltipModelDto == null) {
                    throw Util.unexpectedNull("model", "model", jsonReader);
                }
            } else if (selectName == 4) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("eventId", "event_id", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("defaultsGroup", "defaults_group", jsonReader);
        }
        if (serverTooltipModelDto != null) {
            return new ServerTooltipDto(str, str2, str3, serverTooltipModelDto, num);
        }
        throw Util.missingProperty("model", "model", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ServerTooltipDto serverTooltipDto) {
        ServerTooltipDto serverTooltipDto2 = serverTooltipDto;
        if (serverTooltipDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) serverTooltipDto2.getName());
        jsonWriter.name("event_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) serverTooltipDto2.getEventId());
        jsonWriter.name("defaults_group");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) serverTooltipDto2.getDefaultsGroup());
        jsonWriter.name("model");
        this.serverTooltipModelDtoAdapter.toJson(jsonWriter, (JsonWriter) serverTooltipDto2.getModel());
        jsonWriter.name("showing_delay_ms");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) serverTooltipDto2.getShowingDelayMs());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ServerTooltipDto)");
    }
}
