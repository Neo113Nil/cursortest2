package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import defpackage.kbs;
import defpackage.w511;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, V>> {
    public static final JsonAdapter.Factory FACTORY = new AnonymousClass1();
    private final JsonAdapter<K> keyAdapter;
    private final JsonAdapter<V> valueAdapter;

    /* renamed from: com.squareup.moshi.MapJsonAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            Class<?> rawType;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (rawType = Types.getRawType(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                if (!Map.class.isAssignableFrom(rawType)) {
                    w511.q();
                    return null;
                }
                Type resolve = Util.resolve(type, rawType, Util.getGenericSupertype(type, rawType, Map.class));
                actualTypeArguments = resolve instanceof ParameterizedType ? ((ParameterizedType) resolve).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            }
            return new MapJsonAdapter(moshi, actualTypeArguments[0], actualTypeArguments[1]).nullSafe();
        }
    }

    public MapJsonAdapter(Moshi moshi, Type type, Type type2) {
        this.keyAdapter = moshi.adapter(type);
        this.valueAdapter = moshi.adapter(type2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Map<K, V> fromJson(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            jsonReader.promoteNameToValue();
            K fromJson = this.keyAdapter.fromJson(jsonReader);
            V fromJson2 = this.valueAdapter.fromJson(jsonReader);
            V put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                StringBuilder sb = new StringBuilder("Map key '");
                sb.append(fromJson);
                String path = jsonReader.getPath();
                sb.append("' has multiple values at path ");
                sb.append(path);
                sb.append(Extension.COLON_SPACE);
                sb.append(put);
                sb.append(" and ");
                sb.append(fromJson2);
                throw new JsonDataException(sb.toString());
            }
        }
        jsonReader.endObject();
        return linkedHashTreeMap;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                kbs.s(jsonWriter.getPath(), "Map key is null at ");
                return;
            } else {
                jsonWriter.promoteValueToName();
                this.keyAdapter.toJson(jsonWriter, (JsonWriter) entry.getKey());
                this.valueAdapter.toJson(jsonWriter, (JsonWriter) entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public String toString() {
        return "JsonAdapter(" + this.keyAdapter + "=" + this.valueAdapter + Extension.C_BRAKE;
    }
}
