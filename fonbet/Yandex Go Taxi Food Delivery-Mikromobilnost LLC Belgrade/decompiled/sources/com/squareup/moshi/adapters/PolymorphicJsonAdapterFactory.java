package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class PolymorphicJsonAdapterFactory<T> implements JsonAdapter.Factory {
    public final Class a;
    public final String b;
    public final List c;
    public final List d;
    public final JsonAdapter e;

    public static final class PolymorphicJsonAdapter extends JsonAdapter<Object> {
        final JsonAdapter<Object> fallbackJsonAdapter;
        final List<JsonAdapter<Object>> jsonAdapters;
        final String labelKey;
        final JsonReader.Options labelKeyOptions;
        final JsonReader.Options labelOptions;
        final List<String> labels;
        final List<Type> subtypes;

        public PolymorphicJsonAdapter(String str, List<String> list, List<Type> list2, List<JsonAdapter<Object>> list3, JsonAdapter<Object> jsonAdapter) {
            this.labelKey = str;
            this.labels = list;
            this.subtypes = list2;
            this.jsonAdapters = list3;
            this.fallbackJsonAdapter = jsonAdapter;
            this.labelKeyOptions = JsonReader.Options.of(str);
            this.labelOptions = JsonReader.Options.of((String[]) list.toArray(new String[0]));
        }

        public final int a(JsonReader jsonReader) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.selectName(this.labelKeyOptions) != -1) {
                    int selectString = jsonReader.selectString(this.labelOptions);
                    if (selectString != -1 || this.fallbackJsonAdapter != null) {
                        return selectString;
                    }
                    StringBuilder sb = new StringBuilder("Expected one of ");
                    sb.append(this.labels);
                    String str = this.labelKey;
                    String nextString = jsonReader.nextString();
                    sb.append(" for key '");
                    sb.append(str);
                    sb.append("' but found '");
                    sb.append(nextString);
                    sb.append("'. Register a subtype for this label.");
                    throw new JsonDataException(sb.toString());
                }
                jsonReader.skipName();
                jsonReader.skipValue();
            }
            kbs.s(this.labelKey, "Missing label for ");
            return 0;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) throws IOException {
            JsonReader peekJson = jsonReader.peekJson();
            peekJson.setFailOnUnknown(false);
            try {
                int a = a(peekJson);
                peekJson.close();
                return a == -1 ? this.fallbackJsonAdapter.fromJson(jsonReader) : this.jsonAdapters.get(a).fromJson(jsonReader);
            } catch (Throwable th) {
                peekJson.close();
                throw th;
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            JsonAdapter<Object> jsonAdapter;
            int indexOf = this.subtypes.indexOf(obj.getClass());
            if (indexOf == -1) {
                jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter == null) {
                    StringBuilder sb = new StringBuilder("Expected one of ");
                    sb.append(this.subtypes);
                    sb.append(" but found ");
                    sb.append(obj);
                    yci0.q(sb, ", a ", obj.getClass(), ". Register this subtype.");
                    return;
                }
            } else {
                jsonAdapter = this.jsonAdapters.get(indexOf);
            }
            jsonWriter.beginObject();
            if (jsonAdapter != this.fallbackJsonAdapter) {
                jsonWriter.name(this.labelKey).value(this.labels.get(indexOf));
            }
            int beginFlatten = jsonWriter.beginFlatten();
            jsonAdapter.toJson(jsonWriter, (JsonWriter) obj);
            jsonWriter.endFlatten(beginFlatten);
            jsonWriter.endObject();
        }

        public String toString() {
            return oyr.t(new StringBuilder("PolymorphicJsonAdapter("), this.labelKey, Extension.C_BRAKE);
        }
    }

    public PolymorphicJsonAdapterFactory(Class cls, String str, List list, List list2, JsonAdapter jsonAdapter) {
        this.a = cls;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = jsonAdapter;
    }

    public static <T> PolymorphicJsonAdapterFactory<T> of(Class<T> cls, String str) {
        if (cls == null) {
            ny61.t("baseType == null");
            return null;
        }
        if (str != null) {
            List list = Collections.EMPTY_LIST;
            return new PolymorphicJsonAdapterFactory<>(cls, str, list, list, null);
        }
        ny61.t("labelKey == null");
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
        if (Types.getRawType(type) != this.a || !set.isEmpty()) {
            return null;
        }
        List list = this.d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(moshi.adapter((Type) list.get(i)));
        }
        return new PolymorphicJsonAdapter(this.b, this.c, this.d, arrayList, this.e).nullSafe();
    }

    public PolymorphicJsonAdapterFactory<T> withDefaultValue(final T t) {
        return withFallbackJsonAdapter(new JsonAdapter<Object>() { // from class: com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory.1
            @Override // com.squareup.moshi.JsonAdapter
            public Object fromJson(JsonReader jsonReader) throws IOException {
                jsonReader.skipValue();
                return t;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
                throw new IllegalArgumentException("Expected one of " + PolymorphicJsonAdapterFactory.this.d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
            }
        });
    }

    public PolymorphicJsonAdapterFactory<T> withFallbackJsonAdapter(JsonAdapter<Object> jsonAdapter) {
        return new PolymorphicJsonAdapterFactory<>(this.a, this.b, this.c, this.d, jsonAdapter);
    }

    public PolymorphicJsonAdapterFactory<T> withSubtype(Class<? extends T> cls, String str) {
        if (cls == null) {
            ny61.t("subtype == null");
            return null;
        }
        if (str == null) {
            ny61.t("label == null");
            return null;
        }
        List list = this.c;
        if (list.contains(str)) {
            ny61.g("Labels must be unique.");
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.d);
        arrayList2.add(cls);
        return new PolymorphicJsonAdapterFactory<>(this.a, this.b, arrayList, arrayList2, this.e);
    }
}
