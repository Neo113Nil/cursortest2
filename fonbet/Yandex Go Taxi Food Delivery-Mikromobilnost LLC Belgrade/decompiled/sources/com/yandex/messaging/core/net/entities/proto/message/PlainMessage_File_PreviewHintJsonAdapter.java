package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_File_PreviewHintJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$PreviewHint;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$VideoPreview;", "nullableVideoPreviewAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_File_PreviewHintJsonAdapter extends JsonAdapter<PlainMessage.File.PreviewHint> {
    private volatile Constructor<PlainMessage.File.PreviewHint> constructorRef;
    private final JsonAdapter<PlainMessage.File.VideoPreview> nullableVideoPreviewAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("VideoPreview");

    public PlainMessage_File_PreviewHintJsonAdapter(Moshi moshi) {
        this.nullableVideoPreviewAdapter = moshi.adapter(PlainMessage.File.VideoPreview.class, EmptySet.a, "videoPreview");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.File.PreviewHint fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PlainMessage.File.VideoPreview videoPreview = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                videoPreview = this.nullableVideoPreviewAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new PlainMessage.File.PreviewHint(videoPreview);
        }
        Constructor<PlainMessage.File.PreviewHint> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PlainMessage.File.PreviewHint.class.getDeclaredConstructor(PlainMessage.File.VideoPreview.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(videoPreview, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.File.PreviewHint previewHint) {
        PlainMessage.File.PreviewHint previewHint2 = previewHint;
        if (previewHint2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("VideoPreview");
        this.nullableVideoPreviewAdapter.toJson(jsonWriter, (JsonWriter) previewHint2.getVideoPreview());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(PlainMessage.File.PreviewHint)");
    }
}
