package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableLongAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewUserDtoJsonAdapter extends JsonAdapter<UrlPreviewUserDto> {
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("guid", "display_name", "avatar_id", "gender", "phone_id", "last_seen");
    private final JsonAdapter<String> stringAdapter;

    public UrlPreviewUserDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "guid");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "avatarId");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "lastSeen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UrlPreviewUserDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("guid", "guid", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("displayName", "display_name", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("guid", "guid", jsonReader);
        }
        if (str2 != null) {
            return new UrlPreviewUserDto(str, str2, str3, str4, str5, l);
        }
        throw Util.missingProperty("displayName", "display_name", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UrlPreviewUserDto urlPreviewUserDto) {
        UrlPreviewUserDto urlPreviewUserDto2 = urlPreviewUserDto;
        if (urlPreviewUserDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("guid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewUserDto2.getGuid());
        jsonWriter.name("display_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewUserDto2.getDisplayName());
        jsonWriter.name("avatar_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewUserDto2.getAvatarId());
        jsonWriter.name("gender");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewUserDto2.getGender());
        jsonWriter.name("phone_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewUserDto2.getPhoneId());
        jsonWriter.name("last_seen");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewUserDto2.getLastSeen());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(UrlPreviewUserDto)");
    }
}
