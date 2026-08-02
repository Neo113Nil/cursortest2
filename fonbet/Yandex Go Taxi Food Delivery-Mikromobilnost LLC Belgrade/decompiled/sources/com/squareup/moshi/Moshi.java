package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.vg10;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class Moshi {
    public static final ArrayList e;
    public final List a;
    public final int b;
    public final ThreadLocal c = new ThreadLocal();
    public final LinkedHashMap d = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.Moshi$1, reason: invalid class name */
    class AnonymousClass1 implements JsonAdapter.Factory {
        public final /* synthetic */ Type a;
        public final /* synthetic */ JsonAdapter b;

        public AnonymousClass1(Type type, JsonAdapter jsonAdapter) {
            this.a = type;
            this.b = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            if (set.isEmpty() && Util.typesMatch(this.a, type)) {
                return this.b;
            }
            return null;
        }
    }

    public static final class Lookup<T> extends JsonAdapter<T> {
        public final Type a;
        public final String b;
        public final Object c;
        public JsonAdapter d;

        public Lookup(Type type, String str, Object obj) {
            this.a = type;
            this.b = str;
            this.c = obj;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader jsonReader) throws IOException {
            JsonAdapter jsonAdapter = this.d;
            if (jsonAdapter != null) {
                return (T) jsonAdapter.fromJson(jsonReader);
            }
            ny61.r("JsonAdapter isn't ready");
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, T t) throws IOException {
            JsonAdapter jsonAdapter = this.d;
            if (jsonAdapter != null) {
                jsonAdapter.toJson(jsonWriter, (JsonWriter) t);
            } else {
                ny61.r("JsonAdapter isn't ready");
            }
        }

        public String toString() {
            JsonAdapter jsonAdapter = this.d;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }

    public final class LookupChain {
        public final ArrayList a = new ArrayList();
        public final ArrayDeque b = new ArrayDeque();
        public boolean c;

        public LookupChain() {
        }

        public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
            if (!this.c) {
                this.c = true;
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque.size() != 1 || ((Lookup) arrayDeque.getFirst()).b != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator descendingIterator = arrayDeque.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        Lookup lookup = (Lookup) descendingIterator.next();
                        sb.append("\nfor ");
                        Type type = lookup.a;
                        String str = lookup.b;
                        sb.append(type);
                        if (str != null) {
                            sb.append(HexString.CHAR_SPACE);
                            sb.append(str);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public final void b(boolean z) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                Moshi.this.c.remove();
                if (z) {
                    synchronized (Moshi.this.d) {
                        try {
                            int size = this.a.size();
                            for (int i = 0; i < size; i++) {
                                Lookup lookup = (Lookup) this.a.get(i);
                                JsonAdapter jsonAdapter = (JsonAdapter) Moshi.this.d.put(lookup.c, lookup.d);
                                if (jsonAdapter != null) {
                                    lookup.d = jsonAdapter;
                                    Moshi.this.d.put(lookup.c, jsonAdapter);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(StandardJsonAdapters.FACTORY);
        arrayList.add(CollectionJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(ArrayJsonAdapter.FACTORY);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    public Moshi(Builder builder) {
        ArrayList arrayList = builder.a;
        int size = arrayList.size();
        ArrayList arrayList2 = e;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
        this.b = builder.b;
    }

    public static JsonAdapter.Factory a(final Type type, final Class cls, final JsonAdapter jsonAdapter) {
        if (type == null) {
            ny61.g("type == null");
            return null;
        }
        if (cls == null) {
            ny61.g("annotation == null");
            return null;
        }
        if (jsonAdapter == null) {
            ny61.g("jsonAdapter == null");
            return null;
        }
        if (!cls.isAnnotationPresent(JsonQualifier.class)) {
            vg10.e(cls, " does not have @JsonQualifier");
            return null;
        }
        if (cls.getDeclaredMethods().length <= 0) {
            return new JsonAdapter.Factory() { // from class: com.squareup.moshi.Moshi.2
                @Override // com.squareup.moshi.JsonAdapter.Factory
                public JsonAdapter<?> create(Type type2, Set<? extends Annotation> set, Moshi moshi) {
                    if (Util.typesMatch(type, type2) && set.size() == 1 && Util.isAnnotationPresent(set, cls)) {
                        return jsonAdapter;
                    }
                    return null;
                }
            };
        }
        ny61.g("Use JsonAdapter.Factory for annotations with elements");
        return null;
    }

    public <T> JsonAdapter<T> adapter(Type type, Set<? extends Annotation> set, String str) {
        JsonAdapter<T> jsonAdapter = null;
        if (type == null) {
            ny61.t("type == null");
            return null;
        }
        if (set == null) {
            ny61.t("annotations == null");
            return null;
        }
        Type removeSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type));
        Object asList = set.isEmpty() ? removeSubtypeWildcard : Arrays.asList(removeSubtypeWildcard, set);
        synchronized (this.d) {
            try {
                JsonAdapter<T> jsonAdapter2 = (JsonAdapter) this.d.get(asList);
                if (jsonAdapter2 != null) {
                    return jsonAdapter2;
                }
                LookupChain lookupChain = (LookupChain) this.c.get();
                if (lookupChain == null) {
                    lookupChain = new LookupChain();
                    this.c.set(lookupChain);
                }
                ArrayDeque arrayDeque = lookupChain.b;
                ArrayList arrayList = lookupChain.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        Lookup lookup = new Lookup(removeSubtypeWildcard, str, asList);
                        arrayList.add(lookup);
                        arrayDeque.add(lookup);
                        break;
                    }
                    Lookup lookup2 = (Lookup) arrayList.get(i);
                    if (lookup2.c.equals(asList)) {
                        arrayDeque.add(lookup2);
                        jsonAdapter = lookup2.d;
                        if (jsonAdapter == null) {
                            jsonAdapter = lookup2;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (jsonAdapter != null) {
                        return jsonAdapter;
                    }
                    try {
                        int size2 = this.a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            JsonAdapter<T> jsonAdapter3 = (JsonAdapter<T>) ((JsonAdapter.Factory) this.a.get(i2)).create(removeSubtypeWildcard, set, this);
                            if (jsonAdapter3 != null) {
                                ((Lookup) lookupChain.b.getLast()).d = jsonAdapter3;
                                lookupChain.b(true);
                                return jsonAdapter3;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set));
                    } catch (IllegalArgumentException e2) {
                        throw lookupChain.a(e2);
                    }
                } finally {
                    lookupChain.b(false);
                }
            } finally {
            }
        }
    }

    public Builder newBuilder() {
        List list;
        int i;
        Builder builder = new Builder();
        int i2 = 0;
        while (true) {
            list = this.a;
            i = this.b;
            if (i2 >= i) {
                break;
            }
            builder.add((JsonAdapter.Factory) list.get(i2));
            i2++;
        }
        int size = list.size() - e.size();
        while (i < size) {
            builder.addLast((JsonAdapter.Factory) list.get(i));
            i++;
        }
        return builder;
    }

    public <T> JsonAdapter<T> nextAdapter(JsonAdapter.Factory factory, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            ny61.t("annotations == null");
            return null;
        }
        Type removeSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type));
        List list = this.a;
        int indexOf = list.indexOf(factory);
        if (indexOf == -1) {
            kbs.f(factory, "Unable to skip past unknown factory ");
            return null;
        }
        int size = list.size();
        for (int i = indexOf + 1; i < size; i++) {
            JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) ((JsonAdapter.Factory) list.get(i)).create(removeSubtypeWildcard, set, this);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
        }
        vg10.g(Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set), "No next JsonAdapter for ");
        return null;
    }

    public static final class Builder {
        public final ArrayList a = new ArrayList();
        public int b = 0;

        public <T> Builder add(Type type, JsonAdapter<T> jsonAdapter) {
            ArrayList arrayList = Moshi.e;
            if (type == null) {
                ny61.g("type == null");
                return null;
            }
            if (jsonAdapter != null) {
                return add((JsonAdapter.Factory) new AnonymousClass1(type, jsonAdapter));
            }
            ny61.g("jsonAdapter == null");
            return null;
        }

        public <T> Builder addLast(Type type, JsonAdapter<T> jsonAdapter) {
            ArrayList arrayList = Moshi.e;
            if (type == null) {
                ny61.g("type == null");
                return null;
            }
            if (jsonAdapter != null) {
                return addLast((JsonAdapter.Factory) new AnonymousClass1(type, jsonAdapter));
            }
            ny61.g("jsonAdapter == null");
            return null;
        }

        public Moshi build() {
            return new Moshi(this);
        }

        public <T> Builder add(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
            return add(Moshi.a(type, cls, jsonAdapter));
        }

        public <T> Builder addLast(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
            return addLast(Moshi.a(type, cls, jsonAdapter));
        }

        public Builder add(JsonAdapter.Factory factory) {
            if (factory != null) {
                int i = this.b;
                this.b = i + 1;
                this.a.add(i, factory);
                return this;
            }
            ny61.g("factory == null");
            return null;
        }

        public Builder addLast(JsonAdapter.Factory factory) {
            if (factory != null) {
                this.a.add(factory);
                return this;
            }
            ny61.g("factory == null");
            return null;
        }

        public Builder add(Object obj) {
            if (obj != null) {
                return add((JsonAdapter.Factory) AdapterMethodsFactory.get(obj));
            }
            ny61.g("adapter == null");
            return null;
        }

        public Builder addLast(Object obj) {
            if (obj != null) {
                return addLast((JsonAdapter.Factory) AdapterMethodsFactory.get(obj));
            }
            ny61.g("adapter == null");
            return null;
        }
    }

    public <T> JsonAdapter<T> adapter(Class<T> cls) {
        return adapter(cls, Util.NO_ANNOTATIONS);
    }

    public <T> JsonAdapter<T> adapter(Type type, Class<? extends Annotation> cls) {
        if (cls != null) {
            return adapter(type, Collections.singleton(Types.a(cls)));
        }
        ny61.t("annotationType == null");
        return null;
    }

    public <T> JsonAdapter<T> adapter(Type type, Class<? extends Annotation>... clsArr) {
        if (clsArr.length == 1) {
            return adapter(type, clsArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(clsArr.length);
        for (Class<? extends Annotation> cls : clsArr) {
            linkedHashSet.add(Types.a(cls));
        }
        return adapter(type, Collections.unmodifiableSet(linkedHashSet));
    }

    public <T> JsonAdapter<T> adapter(Type type, Set<? extends Annotation> set) {
        return adapter(type, set, null);
    }

    public <T> JsonAdapter<T> adapter(Type type) {
        return adapter(type, Util.NO_ANNOTATIONS);
    }
}
