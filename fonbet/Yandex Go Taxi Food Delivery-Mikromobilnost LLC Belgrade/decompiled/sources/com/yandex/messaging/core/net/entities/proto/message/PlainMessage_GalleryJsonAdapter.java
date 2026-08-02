package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_GalleryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;", "arrayOfItemAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_GalleryJsonAdapter extends JsonAdapter<PlainMessage.Gallery> {
    private final JsonAdapter<PlainMessage.Item[]> arrayOfItemAdapter;
    private volatile Constructor<PlainMessage.Gallery> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Text", "Items");

    public PlainMessage_GalleryJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.arrayOfItemAdapter = moshi.adapter(Types.arrayOf(PlainMessage.Item.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.Gallery fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        PlainMessage.Item[] itemArr = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -2;
            } else if (selectName == 1 && (itemArr = this.arrayOfItemAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "Items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            if (itemArr != null) {
                return new PlainMessage.Gallery(str, itemArr);
            }
            throw Util.missingProperty("items", "Items", jsonReader);
        }
        Constructor<PlainMessage.Gallery> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PlainMessage.Gallery.class.getDeclaredConstructor(String.class, PlainMessage.Item[].class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (itemArr != null) {
            return constructor.newInstance(str, itemArr, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("items", "Items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.Gallery gallery) {
        PlainMessage.Gallery gallery2 = gallery;
        if (gallery2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) gallery2.getText());
        jsonWriter.name("Items");
        this.arrayOfItemAdapter.toJson(jsonWriter, (JsonWriter) gallery2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(PlainMessage.Gallery)");
    }
}
