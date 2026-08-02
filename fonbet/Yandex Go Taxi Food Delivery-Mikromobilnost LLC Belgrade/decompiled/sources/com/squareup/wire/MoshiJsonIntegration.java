package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.internal.JsonFormatter;
import com.squareup.wire.internal.JsonIntegration;
import defpackage.unr0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001:\u0003\u0016\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J4\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0016J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¨\u0006\u0019"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration;", "Lcom/squareup/wire/internal/JsonIntegration;", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "", "<init>", "()V", "frameworkAdapter", "framework", "type", "Ljava/lang/reflect/Type;", "listAdapter", "elementAdapter", "skipNull", "", "mapAdapter", "keyFormatter", "Lcom/squareup/wire/internal/JsonFormatter;", "valueAdapter", "structAdapter", "formatterAdapter", "jsonStringAdapter", "FormatterJsonAdapter", "ListJsonAdapter", "MapJsonAdapter", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MoshiJsonIntegration extends JsonIntegration<Moshi, JsonAdapter<Object>> {
    public static final MoshiJsonIntegration INSTANCE = new MoshiJsonIntegration();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$FormatterJsonAdapter;", "", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/wire/internal/JsonFormatter;", "formatter", "<init>", "(Lcom/squareup/wire/internal/JsonFormatter;)V", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lcom/squareup/wire/internal/JsonFormatter;", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FormatterJsonAdapter<T> extends JsonAdapter<T> {
        private final JsonFormatter<T> formatter;

        public FormatterJsonAdapter(JsonFormatter<T> jsonFormatter) {
            this.formatter = jsonFormatter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader reader) {
            String nextString = reader.nextString();
            try {
                return this.formatter.fromString(nextString);
            } catch (RuntimeException unused) {
                StringBuilder x = unr0.x("decode failed: ", nextString, " at path ");
                x.append(reader.getPath());
                throw new JsonDataException(x.toString());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, T value) {
            Object stringOrNumber = this.formatter.toStringOrNumber(value);
            if (stringOrNumber instanceof Number) {
                writer.value((Number) stringOrNumber);
            } else {
                writer.value((String) stringOrNumber);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00030\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$ListJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "", "single", "", "skipNull", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Z)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/util/List;)V", "Lcom/squareup/moshi/JsonAdapter;", "Z", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ListJsonAdapter<T> extends JsonAdapter<List<? extends T>> {
        private final JsonAdapter<T> single;
        private final boolean skipNull;

        public ListJsonAdapter(JsonAdapter<T> jsonAdapter, boolean z) {
            this.single = jsonAdapter;
            this.skipNull = z;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public List<T> fromJson(JsonReader reader) {
            ArrayList arrayList = new ArrayList();
            reader.beginArray();
            while (reader.hasNext()) {
                T fromJson = this.single.fromJson(reader);
                if (fromJson != null || !this.skipNull) {
                    arrayList.add(fromJson);
                }
            }
            reader.endArray();
            return arrayList;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, List<? extends T> value) {
            writer.beginArray();
            Iterator<? extends T> it = value.iterator();
            while (it.hasNext()) {
                this.single.toJson(writer, (JsonWriter) it.next());
            }
            writer.endArray();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$MapJsonAdapter;", "", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/wire/internal/JsonFormatter;", "keyFormatter", "valueAdapter", "<init>", "(Lcom/squareup/wire/internal/JsonFormatter;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/util/Map;)V", "Lcom/squareup/wire/internal/JsonFormatter;", "Lcom/squareup/moshi/JsonAdapter;", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, ? extends V>> {
        private final JsonFormatter<K> keyFormatter;
        private final JsonAdapter<V> valueAdapter;

        public MapJsonAdapter(JsonFormatter<K> jsonFormatter, JsonAdapter<V> jsonAdapter) {
            this.keyFormatter = jsonFormatter;
            this.valueAdapter = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Map<K, V> fromJson(JsonReader reader) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            reader.beginObject();
            while (reader.hasNext()) {
                linkedHashMap.put(this.keyFormatter.fromString(reader.nextName()), this.valueAdapter.fromJson(reader));
            }
            reader.endObject();
            return linkedHashMap;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, Map<K, ? extends V> value) {
            writer.beginObject();
            for (Map.Entry<K, ? extends V> entry : value.entrySet()) {
                K key = entry.getKey();
                V value2 = entry.getValue();
                writer.name(this.keyFormatter.toStringOrNumber(key).toString());
                this.valueAdapter.toJson(writer, (JsonWriter) value2);
            }
            writer.endObject();
        }
    }

    private MoshiJsonIntegration() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> formatterAdapter(JsonFormatter<?> jsonStringAdapter) {
        return new FormatterJsonAdapter(jsonStringAdapter).nullSafe();
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> frameworkAdapter(Moshi framework, Type type) {
        return framework.adapter(type).nullSafe();
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> listAdapter(JsonAdapter<Object> elementAdapter, boolean skipNull) {
        return new ListJsonAdapter(elementAdapter, skipNull).nullSafe();
    }

    /* renamed from: mapAdapter, reason: avoid collision after fix types in other method */
    public JsonAdapter<Object> mapAdapter2(Moshi framework, JsonFormatter<?> keyFormatter, JsonAdapter<Object> valueAdapter) {
        return new MapJsonAdapter(keyFormatter, valueAdapter).nullSafe();
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> structAdapter(Moshi framework) {
        return framework.adapter(Object.class).serializeNulls().nullSafe();
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ JsonAdapter<Object> formatterAdapter(JsonFormatter jsonFormatter) {
        return formatterAdapter((JsonFormatter<?>) jsonFormatter);
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ JsonAdapter<Object> mapAdapter(Moshi moshi, JsonFormatter jsonFormatter, JsonAdapter<Object> jsonAdapter) {
        return mapAdapter2(moshi, (JsonFormatter<?>) jsonFormatter, jsonAdapter);
    }
}
