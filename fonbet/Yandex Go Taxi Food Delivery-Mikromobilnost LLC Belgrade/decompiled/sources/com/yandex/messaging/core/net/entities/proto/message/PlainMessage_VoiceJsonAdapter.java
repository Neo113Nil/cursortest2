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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_VoiceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "fileInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "nullableStringAdapter", "", "booleanAdapter", "", "byteArrayAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_VoiceJsonAdapter extends JsonAdapter<PlainMessage.Voice> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<byte[]> byteArrayAdapter;
    private volatile Constructor<PlainMessage.Voice> constructorRef;
    private final JsonAdapter<PlainMessage.FileInfo> fileInfoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("FileInfo", "Duration", "Text", "WasRecognized", "Waveform", "DisableRecognition");

    public PlainMessage_VoiceJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.fileInfoAdapter = moshi.adapter(PlainMessage.FileInfo.class, emptySet, "fileInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "duration");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "wasRecognized");
        this.byteArrayAdapter = moshi.adapter(byte[].class, emptySet, "waveform");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.Voice fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Integer num = 0;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        PlainMessage.FileInfo fileInfo = null;
        int i = -1;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    fileInfo = this.fileInfoAdapter.fromJson(jsonReader);
                    if (fileInfo == null) {
                        throw Util.unexpectedNull("fileInfo", "FileInfo", jsonReader);
                    }
                    break;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("duration", "Duration", jsonReader);
                    }
                    i &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("wasRecognized", "WasRecognized", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    bArr = this.byteArrayAdapter.fromJson(jsonReader);
                    if (bArr == null) {
                        throw Util.unexpectedNull("waveform", "Waveform", jsonReader);
                    }
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("disableRecognition", "DisableRecognition", jsonReader);
                    }
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -47) {
            if (fileInfo == null) {
                throw Util.missingProperty("fileInfo", "FileInfo", jsonReader);
            }
            int intValue = num.intValue();
            boolean booleanValue = bool2.booleanValue();
            if (bArr != null) {
                return new PlainMessage.Voice(fileInfo, intValue, str, booleanValue, bArr, bool3.booleanValue());
            }
            throw Util.missingProperty("waveform", "Waveform", jsonReader);
        }
        PlainMessage.FileInfo fileInfo2 = fileInfo;
        Constructor<PlainMessage.Voice> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            constructor = PlainMessage.Voice.class.getDeclaredConstructor(PlainMessage.FileInfo.class, cls2, String.class, cls3, byte[].class, cls3, cls2, cls);
            this.constructorRef = constructor;
        }
        if (fileInfo2 == null) {
            throw Util.missingProperty("fileInfo", "FileInfo", jsonReader);
        }
        if (bArr == null) {
            throw Util.missingProperty("waveform", "Waveform", jsonReader);
        }
        return constructor.newInstance(fileInfo2, num, str, bool2, bArr, bool3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.Voice voice) {
        PlainMessage.Voice voice2 = voice;
        if (voice2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("FileInfo");
        this.fileInfoAdapter.toJson(jsonWriter, (JsonWriter) voice2.fileInfo);
        jsonWriter.name("Duration");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(voice2.duration));
        jsonWriter.name("Text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) voice2.text);
        jsonWriter.name("WasRecognized");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(voice2.wasRecognized));
        jsonWriter.name("Waveform");
        this.byteArrayAdapter.toJson(jsonWriter, (JsonWriter) voice2.waveform);
        jsonWriter.name("DisableRecognition");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(voice2.disableRecognition));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(PlainMessage.Voice)");
    }
}
