package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.fex;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/network/dto/ProEventResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/ProEventResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "", "listOfStringAdapter", "Lfex;", "nullableJsonStringMapAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProEventResponseJsonAdapter extends JsonAdapter<ProEventResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<fex> nullableJsonStringMapAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("event_id", "event_type", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "action", "is_closable", "importance", "placement", "payload");
    private final JsonAdapter<String> stringAdapter;

    public ProEventResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "eventId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isClosable");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "placement");
        this.nullableJsonStringMapAdapter = moshi.adapter(fex.class, emptySet, "payload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProEventResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List<String> list = null;
        fex fexVar = null;
        while (true) {
            Boolean bool2 = bool;
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str4;
            if (!jsonReader.hasNext()) {
                String str11 = str5;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("eventId", "event_id", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("eventType", "event_type", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (bool2 == null) {
                    throw Util.missingProperty("isClosable", "is_closable", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str6 == null) {
                    throw Util.missingProperty("importance", "importance", jsonReader);
                }
                if (list != null) {
                    return new ProEventResponse(str7, str8, str9, str10, str11, booleanValue, str6, list, fexVar);
                }
                throw Util.missingProperty("placement", "placement", jsonReader);
            }
            String str12 = str5;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("eventId", "event_id", jsonReader);
                    }
                    bool = bool2;
                    str5 = str12;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("eventType", "event_type", jsonReader);
                    }
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str3 = str9;
                    str4 = str10;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str4 = str10;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 5:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("isClosable", "is_closable", jsonReader);
                    }
                    bool = fromJson;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 6:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("importance", "importance", jsonReader);
                    }
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 7:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("placement", "placement", jsonReader);
                    }
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 8:
                    fexVar = this.nullableJsonStringMapAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                default:
                    bool = bool2;
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProEventResponse proEventResponse) {
        ProEventResponse proEventResponse2 = proEventResponse;
        if (proEventResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("event_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getEventId());
        jsonWriter.name("event_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getEventType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getDescription());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getAction());
        jsonWriter.name("is_closable");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(proEventResponse2.isClosable()));
        jsonWriter.name("importance");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getImportance());
        jsonWriter.name("placement");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getPlacement());
        jsonWriter.name("payload");
        this.nullableJsonStringMapAdapter.toJson(jsonWriter, (JsonWriter) proEventResponse2.getPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ProEventResponse)");
    }
}
