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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_ImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "fileInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_ImageJsonAdapter extends JsonAdapter<PlainMessage.Image> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PlainMessage.Image> constructorRef;
    private final JsonAdapter<PlainMessage.FileInfo> fileInfoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("FileInfo", "Width", "Height", "Animated");

    public PlainMessage_ImageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.fileInfoAdapter = moshi.adapter(PlainMessage.FileInfo.class, emptySet, "fileInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "width");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "animated");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.Image fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        Boolean bool2 = bool;
        PlainMessage.FileInfo fileInfo = null;
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
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("width", "Width", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("height", "Height", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("animated", "Animated", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -15) {
            if (fileInfo != null) {
                return new PlainMessage.Image(fileInfo, num.intValue(), num2.intValue(), bool2.booleanValue());
            }
            throw Util.missingProperty("fileInfo", "FileInfo", jsonReader);
        }
        Constructor<PlainMessage.Image> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Integer.TYPE;
            constructor = PlainMessage.Image.class.getDeclaredConstructor(PlainMessage.FileInfo.class, cls3, cls3, cls, cls3, cls2);
            this.constructorRef = constructor;
        }
        if (fileInfo != null) {
            return constructor.newInstance(fileInfo, num, num2, bool2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("fileInfo", "FileInfo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.Image image) {
        PlainMessage.Image image2 = image;
        if (image2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("FileInfo");
        this.fileInfoAdapter.toJson(jsonWriter, (JsonWriter) image2.fileInfo);
        jsonWriter.name("Width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(image2.width));
        jsonWriter.name("Height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(image2.height));
        jsonWriter.name("Animated");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(image2.animated));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(PlainMessage.Image)");
    }
}
