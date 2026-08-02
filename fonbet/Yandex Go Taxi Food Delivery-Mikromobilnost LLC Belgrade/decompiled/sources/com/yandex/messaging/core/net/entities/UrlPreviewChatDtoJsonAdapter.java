package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewChatDtoJsonAdapter extends JsonAdapter<UrlPreviewChatDto> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat_id", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "avatar_id", "member_count", "invite_hash", "public");
    private final JsonAdapter<String> stringAdapter;

    public UrlPreviewChatDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "memberCount");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isPublic");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UrlPreviewChatDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("chatName", "name", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("inviteHash", "invite_hash", jsonReader);
                    }
                    break;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("chatId", "chat_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("chatName", "name", jsonReader);
        }
        if (str5 != null) {
            return new UrlPreviewChatDto(str, str2, str3, str4, num, str5, bool);
        }
        throw Util.missingProperty("inviteHash", "invite_hash", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UrlPreviewChatDto urlPreviewChatDto) {
        UrlPreviewChatDto urlPreviewChatDto2 = urlPreviewChatDto;
        if (urlPreviewChatDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.getChatId());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.getChatName());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.getDescription());
        jsonWriter.name("avatar_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.getAvatarId());
        jsonWriter.name("member_count");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.getMemberCount());
        jsonWriter.name("invite_hash");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.getInviteHash());
        jsonWriter.name("public");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewChatDto2.isPublic());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(UrlPreviewChatDto)");
    }
}
