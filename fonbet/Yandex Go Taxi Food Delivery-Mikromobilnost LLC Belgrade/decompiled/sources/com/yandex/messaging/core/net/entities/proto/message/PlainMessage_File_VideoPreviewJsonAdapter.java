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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_File_VideoPreviewJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$VideoPreview;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "nullableByteArrayAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_File_VideoPreviewJsonAdapter extends JsonAdapter<PlainMessage.File.VideoPreview> {
    private volatile Constructor<PlainMessage.File.VideoPreview> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<byte[]> nullableByteArrayAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Width", "Height", "DurationMs", "BlurHash");

    public PlainMessage_File_VideoPreviewJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "width");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "durationMs");
        this.nullableByteArrayAdapter = moshi.adapter(byte[].class, emptySet, "blurHash");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.File.VideoPreview fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        Long l = 0L;
        byte[] bArr = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("width", "Width", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("height", "Height", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("durationMs", "DurationMs", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                bArr = this.nullableByteArrayAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new PlainMessage.File.VideoPreview(num.intValue(), num2.intValue(), l.longValue(), bArr);
        }
        Constructor<PlainMessage.File.VideoPreview> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = PlainMessage.File.VideoPreview.class.getDeclaredConstructor(cls2, cls2, Long.TYPE, byte[].class, cls2, cls);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num, num2, l, bArr, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.File.VideoPreview videoPreview) {
        PlainMessage.File.VideoPreview videoPreview2 = videoPreview;
        if (videoPreview2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(videoPreview2.width));
        jsonWriter.name("Height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(videoPreview2.height));
        jsonWriter.name("DurationMs");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(videoPreview2.durationMs));
        jsonWriter.name("BlurHash");
        this.nullableByteArrayAdapter.toJson(jsonWriter, (JsonWriter) videoPreview2.blurHash);
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(PlainMessage.File.VideoPreview)");
    }
}
