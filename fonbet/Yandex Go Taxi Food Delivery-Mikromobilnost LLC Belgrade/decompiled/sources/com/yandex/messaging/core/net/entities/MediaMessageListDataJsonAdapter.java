package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.MediaMessageListData;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Info;", "infoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/yandex/messaging/core/net/entities/proto/ChatHistoryResponse$OutMessage;", "listOfOutMessageAdapter", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Metadata;", "nullableListOfMetadataAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaMessageListDataJsonAdapter extends JsonAdapter<MediaMessageListData> {
    private final JsonAdapter<MediaMessageListData.Info> infoAdapter;
    private final JsonAdapter<List<ChatHistoryResponse.OutMessage>> listOfOutMessageAdapter;
    private final JsonAdapter<List<MediaMessageListData.Metadata>> nullableListOfMetadataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("info", "messages", kju0.j);

    public MediaMessageListDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.infoAdapter = moshi.adapter(MediaMessageListData.Info.class, emptySet, "info");
        this.listOfOutMessageAdapter = moshi.adapter(Types.newParameterizedType(List.class, ChatHistoryResponse.OutMessage.class), emptySet, "messages");
        this.nullableListOfMetadataAdapter = moshi.adapter(Types.newParameterizedType(List.class, MediaMessageListData.Metadata.class), emptySet, kju0.j);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MediaMessageListData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MediaMessageListData.Info info = null;
        List<ChatHistoryResponse.OutMessage> list = null;
        List<MediaMessageListData.Metadata> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                info = this.infoAdapter.fromJson(jsonReader);
                if (info == null) {
                    throw Util.unexpectedNull("info", "info", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfOutMessageAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("messages", "messages", jsonReader);
                }
            } else if (selectName == 2) {
                list2 = this.nullableListOfMetadataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (info == null) {
            throw Util.missingProperty("info", "info", jsonReader);
        }
        if (list != null) {
            return new MediaMessageListData(info, list, list2);
        }
        throw Util.missingProperty("messages", "messages", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MediaMessageListData mediaMessageListData) {
        MediaMessageListData mediaMessageListData2 = mediaMessageListData;
        if (mediaMessageListData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("info");
        this.infoAdapter.toJson(jsonWriter, (JsonWriter) mediaMessageListData2.getInfo());
        jsonWriter.name("messages");
        this.listOfOutMessageAdapter.toJson(jsonWriter, (JsonWriter) mediaMessageListData2.getMessages());
        jsonWriter.name(kju0.j);
        this.nullableListOfMetadataAdapter.toJson(jsonWriter, (JsonWriter) mediaMessageListData2.getMetadata());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(MediaMessageListData)");
    }
}
