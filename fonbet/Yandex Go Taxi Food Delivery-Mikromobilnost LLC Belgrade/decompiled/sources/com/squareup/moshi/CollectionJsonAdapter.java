package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    public static final JsonAdapter.Factory FACTORY = new AnonymousClass1();
    private final JsonAdapter<T> elementAdapter;

    /* renamed from: com.squareup.moshi.CollectionJsonAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            Class<?> rawType = Types.getRawType(type);
            AnonymousClass1 anonymousClass1 = null;
            if (!set.isEmpty()) {
                return null;
            }
            if (rawType == List.class || rawType == Collection.class) {
                return new AnonymousClass2(moshi.adapter(Types.collectionElementType(type, Collection.class)), anonymousClass1).nullSafe();
            }
            if (rawType == Set.class) {
                return new AnonymousClass3(moshi.adapter(Types.collectionElementType(type, Collection.class)), anonymousClass1).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.CollectionJsonAdapter$2, reason: invalid class name */
    class AnonymousClass2 extends CollectionJsonAdapter<Collection<Object>, Object> {
        @Override // com.squareup.moshi.CollectionJsonAdapter
        public final Collection a() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return super.fromJson(jsonReader);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            super.toJson(jsonWriter, (JsonWriter) obj);
        }
    }

    /* renamed from: com.squareup.moshi.CollectionJsonAdapter$3, reason: invalid class name */
    class AnonymousClass3 extends CollectionJsonAdapter<Set<Object>, Object> {
        @Override // com.squareup.moshi.CollectionJsonAdapter
        public final Collection a() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return super.fromJson(jsonReader);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            super.toJson(jsonWriter, (JsonWriter) obj);
        }
    }

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }

    public abstract Collection a();

    @Override // com.squareup.moshi.JsonAdapter
    public C fromJson(JsonReader jsonReader) throws IOException {
        C c = (C) a();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            c.add(this.elementAdapter.fromJson(jsonReader));
        }
        jsonReader.endArray();
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, C c) throws IOException {
        jsonWriter.beginArray();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            this.elementAdapter.toJson(jsonWriter, (JsonWriter) it.next());
        }
        jsonWriter.endArray();
    }

    public String toString() {
        return this.elementAdapter + ".collection()";
    }

    public /* synthetic */ CollectionJsonAdapter(JsonAdapter jsonAdapter, AnonymousClass1 anonymousClass1) {
        this(jsonAdapter);
    }
}
