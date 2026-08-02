package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_FileInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_FileInfoJsonAdapter extends JsonAdapter<PlainMessage.FileInfo> {
    private volatile Constructor<PlainMessage.FileInfo> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Id", PlusAcquisitionSmartOffer.Texts.NAME, "Size", "Id2", "Source");

    public PlainMessage_FileInfoJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "source");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.FileInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = 0L;
        Long l2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("id", "Id", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("size", "Size", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.endObject();
        if (i == -32) {
            return new PlainMessage.FileInfo(l.longValue(), str, l2.longValue(), str2, num);
        }
        Constructor<PlainMessage.FileInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = PlainMessage.FileInfo.class.getDeclaredConstructor(cls3, String.class, cls3, String.class, Integer.class, cls, cls2);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(l, str, l2, str2, num, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.FileInfo fileInfo) {
        PlainMessage.FileInfo fileInfo2 = fileInfo;
        if (fileInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(fileInfo2.id));
        jsonWriter.name(PlusAcquisitionSmartOffer.Texts.NAME);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fileInfo2.name);
        jsonWriter.name("Size");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(fileInfo2.size));
        jsonWriter.name("Id2");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fileInfo2.id2);
        jsonWriter.name("Source");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) fileInfo2.source);
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(PlainMessage.FileInfo)");
    }
}
