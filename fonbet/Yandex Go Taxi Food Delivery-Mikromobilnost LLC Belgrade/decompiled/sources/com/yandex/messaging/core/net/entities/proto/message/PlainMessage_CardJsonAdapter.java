package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.JsonMap;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_CardJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "mapOfStringNullableAnyAtJsonMapAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_CardJsonAdapter extends JsonAdapter<PlainMessage.Card> {
    private final JsonAdapter<Map<String, ?>> mapOfStringNullableAnyAtJsonMapAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Card");

    public PlainMessage_CardJsonAdapter(Moshi moshi) {
        this.mapOfStringNullableAnyAtJsonMapAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Types.subtypeOf(Object.class)), Collections.singleton(new JsonMap() { // from class: com.yandex.messaging.core.net.entities.proto.message.PlainMessage_CardJsonAdapter$annotationImpl$com_yandex_messaging_core_net_entities_JsonMap$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonMap.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonMap;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.yandex.messaging.core.net.entities.JsonMap()";
            }
        }), "card");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.Card fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, ?> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (map = this.mapOfStringNullableAnyAtJsonMapAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("card", "Card", jsonReader);
            }
        }
        jsonReader.endObject();
        if (map != null) {
            return new PlainMessage.Card(map);
        }
        throw Util.missingProperty("card", "Card", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.Card card) {
        PlainMessage.Card card2 = card;
        if (card2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Card");
        this.mapOfStringNullableAnyAtJsonMapAdapter.toJson(jsonWriter, (JsonWriter) card2.getCard());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(PlainMessage.Card)");
    }
}
