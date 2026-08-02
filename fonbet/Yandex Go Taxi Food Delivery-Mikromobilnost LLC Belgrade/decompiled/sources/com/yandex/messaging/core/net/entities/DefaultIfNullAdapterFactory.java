package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/core/net/entities/DefaultIfNullAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultIfNullAdapterFactory implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if (!Types.getRawType(type).isAnnotationPresent(DefaultIfNull.class)) {
            return null;
        }
        final JsonAdapter nextAdapter = moshi.nextAdapter(this, type, set);
        return new JsonAdapter<Object>() { // from class: com.yandex.messaging.core.net.entities.DefaultIfNullAdapterFactory$create$1
            @Override // com.squareup.moshi.JsonAdapter
            public final Object fromJson(JsonReader jsonReader) {
                Map map = (Map) jsonReader.readJsonValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return JsonAdapter.this.fromJsonValue(linkedHashMap);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final void toJson(JsonWriter jsonWriter, Object obj) {
                JsonAdapter.this.toJson(jsonWriter, (JsonWriter) obj);
            }
        };
    }
}
