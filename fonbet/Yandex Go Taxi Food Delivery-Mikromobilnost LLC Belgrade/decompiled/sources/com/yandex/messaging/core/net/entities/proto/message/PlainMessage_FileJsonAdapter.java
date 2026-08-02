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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_FileJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "fileInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$PreviewHint;", "nullablePreviewHintAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_FileJsonAdapter extends JsonAdapter<PlainMessage.File> {
    private volatile Constructor<PlainMessage.File> constructorRef;
    private final JsonAdapter<PlainMessage.FileInfo> fileInfoAdapter;
    private final JsonAdapter<PlainMessage.File.PreviewHint> nullablePreviewHintAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("FileInfo", "PreviewHint");

    public PlainMessage_FileJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.fileInfoAdapter = moshi.adapter(PlainMessage.FileInfo.class, emptySet, "fileInfo");
        this.nullablePreviewHintAdapter = moshi.adapter(PlainMessage.File.PreviewHint.class, emptySet, "previewHint");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.File fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PlainMessage.FileInfo fileInfo = null;
        PlainMessage.File.PreviewHint previewHint = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                fileInfo = this.fileInfoAdapter.fromJson(jsonReader);
                if (fileInfo == null) {
                    throw Util.unexpectedNull("fileInfo", "FileInfo", jsonReader);
                }
            } else if (selectName == 1) {
                previewHint = this.nullablePreviewHintAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (fileInfo != null) {
                return new PlainMessage.File(fileInfo, previewHint);
            }
            throw Util.missingProperty("fileInfo", "FileInfo", jsonReader);
        }
        Constructor<PlainMessage.File> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PlainMessage.File.class.getDeclaredConstructor(PlainMessage.FileInfo.class, PlainMessage.File.PreviewHint.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (fileInfo != null) {
            return constructor.newInstance(fileInfo, previewHint, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("fileInfo", "FileInfo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.File file) {
        PlainMessage.File file2 = file;
        if (file2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("FileInfo");
        this.fileInfoAdapter.toJson(jsonWriter, (JsonWriter) file2.getFileInfo());
        jsonWriter.name("PreviewHint");
        this.nullablePreviewHintAdapter.toJson(jsonWriter, (JsonWriter) file2.getPreviewHint());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(PlainMessage.File)");
    }
}
