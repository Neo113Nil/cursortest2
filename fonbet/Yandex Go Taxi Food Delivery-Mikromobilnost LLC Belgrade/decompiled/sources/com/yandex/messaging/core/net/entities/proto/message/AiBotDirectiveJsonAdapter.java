package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.JsonMap;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirectiveJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "mapOfStringNullableAnyAtJsonMapAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AiBotDirectiveJsonAdapter extends JsonAdapter<AiBotDirective> {
    private final JsonAdapter<Map<String, ?>> mapOfStringNullableAnyAtJsonMapAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Type", PlusAcquisitionSmartOffer.Texts.NAME, "Payload");
    private final JsonAdapter<String> stringAdapter;

    public AiBotDirectiveJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "type");
        this.mapOfStringNullableAnyAtJsonMapAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Types.subtypeOf(Object.class)), Collections.singleton(new JsonMap() { // from class: com.yandex.messaging.core.net.entities.proto.message.AiBotDirectiveJsonAdapter$annotationImpl$com_yandex_messaging_core_net_entities_JsonMap$0
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
        }), "payload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AiBotDirective fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, ?> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "Type", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("name", PlusAcquisitionSmartOffer.Texts.NAME, jsonReader);
                }
            } else if (selectName == 2 && (map = this.mapOfStringNullableAnyAtJsonMapAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("payload", "Payload", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("type", "Type", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("name", PlusAcquisitionSmartOffer.Texts.NAME, jsonReader);
        }
        if (map != null) {
            return new AiBotDirective(str, str2, map);
        }
        throw Util.missingProperty("payload", "Payload", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AiBotDirective aiBotDirective) {
        AiBotDirective aiBotDirective2 = aiBotDirective;
        if (aiBotDirective2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aiBotDirective2.getType());
        jsonWriter.name(PlusAcquisitionSmartOffer.Texts.NAME);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aiBotDirective2.getName());
        jsonWriter.name("Payload");
        this.mapOfStringNullableAnyAtJsonMapAdapter.toJson(jsonWriter, (JsonWriter) aiBotDirective2.getPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(AiBotDirective)");
    }
}
