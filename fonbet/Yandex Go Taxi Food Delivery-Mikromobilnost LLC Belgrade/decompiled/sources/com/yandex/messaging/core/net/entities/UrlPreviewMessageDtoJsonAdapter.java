package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "urlPreviewChatDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "longAdapter", "", "Lcom/yandex/messaging/core/net/entities/MentionedUserDto;", "nullableListOfMentionedUserDtoAdapter", "Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "nullableUrlPreviewUserDtoAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewMessageDtoJsonAdapter extends JsonAdapter<UrlPreviewMessageDto> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<MentionedUserDto>> nullableListOfMentionedUserDtoAdapter;
    private final JsonAdapter<UrlPreviewUserDto> nullableUrlPreviewUserDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("chat", "text", ClidProvider.TIMESTAMP, "mentioned_users", "user");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UrlPreviewChatDto> urlPreviewChatDtoAdapter;

    public UrlPreviewMessageDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.urlPreviewChatDtoAdapter = moshi.adapter(UrlPreviewChatDto.class, emptySet, "chat");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.nullableListOfMentionedUserDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, MentionedUserDto.class), emptySet, "mentionedUsers");
        this.nullableUrlPreviewUserDtoAdapter = moshi.adapter(UrlPreviewUserDto.class, emptySet, "user");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UrlPreviewMessageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        UrlPreviewChatDto urlPreviewChatDto = null;
        String str = null;
        List<MentionedUserDto> list = null;
        UrlPreviewUserDto urlPreviewUserDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                urlPreviewChatDto = this.urlPreviewChatDtoAdapter.fromJson(jsonReader);
                if (urlPreviewChatDto == null) {
                    throw Util.unexpectedNull("chat", "chat", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 2) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                }
            } else if (selectName == 3) {
                list = this.nullableListOfMentionedUserDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                urlPreviewUserDto = this.nullableUrlPreviewUserDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (urlPreviewChatDto == null) {
            throw Util.missingProperty("chat", "chat", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (l != null) {
            return new UrlPreviewMessageDto(urlPreviewChatDto, str, l.longValue(), list, urlPreviewUserDto);
        }
        throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UrlPreviewMessageDto urlPreviewMessageDto) {
        UrlPreviewMessageDto urlPreviewMessageDto2 = urlPreviewMessageDto;
        if (urlPreviewMessageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("chat");
        this.urlPreviewChatDtoAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewMessageDto2.getChat());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewMessageDto2.getText());
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(urlPreviewMessageDto2.getTimestamp()));
        jsonWriter.name("mentioned_users");
        this.nullableListOfMentionedUserDtoAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewMessageDto2.getMentionedUsers());
        jsonWriter.name("user");
        this.nullableUrlPreviewUserDtoAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewMessageDto2.getUser());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(UrlPreviewMessageDto)");
    }
}
