package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.messaging.core.net.entities.MediaMessageListData;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListData_MetadataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Metadata;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "nullableListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$BrowserLinkPreview;", "nullableBrowserLinkPreviewAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaMessageListData_MetadataJsonAdapter extends JsonAdapter<MediaMessageListData.Metadata> {
    private final JsonAdapter<MediaMessageListData.BrowserLinkPreview> nullableBrowserLinkPreviewAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("links", "preview");

    public MediaMessageListData_MetadataJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableListOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "links");
        this.nullableBrowserLinkPreviewAdapter = moshi.adapter(MediaMessageListData.BrowserLinkPreview.class, emptySet, "preview");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MediaMessageListData.Metadata fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        MediaMessageListData.BrowserLinkPreview browserLinkPreview = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                browserLinkPreview = this.nullableBrowserLinkPreviewAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new MediaMessageListData.Metadata(list, browserLinkPreview);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MediaMessageListData.Metadata metadata) {
        MediaMessageListData.Metadata metadata2 = metadata;
        if (metadata2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("links");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) metadata2.getLinks());
        jsonWriter.name("preview");
        this.nullableBrowserLinkPreviewAdapter.toJson(jsonWriter, (JsonWriter) metadata2.getPreview());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(MediaMessageListData.Metadata)");
    }
}
