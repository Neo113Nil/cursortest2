package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.vg10;
import defpackage.vm7;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class ClassJsonAdapter<T> extends JsonAdapter<T> {
    public static final JsonAdapter.Factory FACTORY = new AnonymousClass1();
    private final ClassFactory<T> classFactory;
    private final FieldBinding<?>[] fieldsArray;
    private final JsonReader.Options options;

    /* renamed from: com.squareup.moshi.ClassJsonAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        public static void a(Type type, Class cls) {
            Class<?> rawType = Types.getRawType(type);
            if (cls.isAssignableFrom(rawType)) {
                StringBuilder sb = new StringBuilder("No JsonAdapter for ");
                sb.append(type);
                String simpleName = cls.getSimpleName();
                String simpleName2 = rawType.getSimpleName();
                sb.append(", you should probably use ");
                sb.append(simpleName);
                sb.append(" instead of ");
                sb.append(simpleName2);
                sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
                throw new IllegalArgumentException(sb.toString());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            Json json2;
            if ((type instanceof Class) || (type instanceof ParameterizedType)) {
                Class<?> rawType = Types.getRawType(type);
                if (!rawType.isInterface() && !rawType.isEnum() && set.isEmpty()) {
                    if (Util.isPlatformType(rawType)) {
                        a(type, List.class);
                        a(type, Set.class);
                        a(type, Map.class);
                        a(type, Collection.class);
                        String l = qv10.l(rawType, "Platform ");
                        if (type instanceof ParameterizedType) {
                            l = l + " in " + type;
                        }
                        ny61.g(l.concat(" requires explicit JsonAdapter to be registered"));
                        return null;
                    }
                    if (!rawType.isAnonymousClass()) {
                        if (rawType.isLocalClass()) {
                            ny61.g("Cannot serialize local class ".concat(rawType.getName()));
                            return null;
                        }
                        if (rawType.getEnclosingClass() != null && !Modifier.isStatic(rawType.getModifiers())) {
                            ny61.g("Cannot serialize non-static nested class ".concat(rawType.getName()));
                            return null;
                        }
                        if (Modifier.isAbstract(rawType.getModifiers())) {
                            ny61.g("Cannot serialize abstract class ".concat(rawType.getName()));
                            return null;
                        }
                        if (Util.isKotlin(rawType)) {
                            vg10.i("Cannot serialize Kotlin type ", rawType.getName(), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                            return null;
                        }
                        ClassFactory classFactory = ClassFactory.get(rawType);
                        TreeMap treeMap = new TreeMap();
                        while (type != Object.class) {
                            Class<?> rawType2 = Types.getRawType(type);
                            boolean isPlatformType = Util.isPlatformType(rawType2);
                            for (Field field : rawType2.getDeclaredFields()) {
                                int modifiers = field.getModifiers();
                                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !isPlatformType) && ((json2 = (Json) field.getAnnotation(Json.class)) == null || !json2.ignore()))) {
                                    Type resolve = Util.resolve(type, rawType2, field.getGenericType());
                                    Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(field);
                                    String name = field.getName();
                                    JsonAdapter<T> adapter = moshi.adapter(resolve, jsonAnnotations, name);
                                    field.setAccessible(true);
                                    String jsonName = Util.jsonName(name, json2);
                                    FieldBinding fieldBinding = (FieldBinding) treeMap.put(jsonName, new FieldBinding(jsonName, field, adapter));
                                    if (fieldBinding != null) {
                                        vm7.e("Conflicting fields:\n    ", fieldBinding.b, "\n    ", field);
                                        return null;
                                    }
                                }
                            }
                            Class<?> rawType3 = Types.getRawType(type);
                            type = Util.resolve(type, rawType3, rawType3.getGenericSuperclass());
                        }
                        return new ClassJsonAdapter(classFactory, treeMap).nullSafe();
                    }
                    ny61.g("Cannot serialize anonymous class ".concat(rawType.getName()));
                }
            }
            return null;
        }
    }

    /* loaded from: classes11.dex */
    public static class FieldBinding<T> {
        public final String a;
        public final Field b;
        public final JsonAdapter c;

        public FieldBinding(String str, Field field, JsonAdapter jsonAdapter) {
            this.a = str;
            this.b = field;
            this.c = jsonAdapter;
        }

        public final void a(JsonReader jsonReader, Object obj) {
            this.b.set(obj, this.c.fromJson(jsonReader));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(JsonWriter jsonWriter, Object obj) {
            this.c.toJson(jsonWriter, (JsonWriter) this.b.get(obj));
        }
    }

    public ClassJsonAdapter(ClassFactory<T> classFactory, Map<String, FieldBinding<?>> map) {
        this.classFactory = classFactory;
        this.fieldsArray = (FieldBinding[]) map.values().toArray(new FieldBinding[map.size()]);
        this.options = JsonReader.Options.of((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        try {
            T t = (T) this.classFactory.newInstance();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int selectName = jsonReader.selectName(this.options);
                    if (selectName == -1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        this.fieldsArray[selectName].a(jsonReader, t);
                    }
                }
                jsonReader.endObject();
                return t;
            } catch (IllegalAccessException unused) {
                ny61.w();
                return null;
            }
        } catch (IllegalAccessException unused2) {
            ny61.w();
            return null;
        } catch (InstantiationException e) {
            ny61.j(e);
            return null;
        } catch (InvocationTargetException e2) {
            throw Util.rethrowCause(e2);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t) throws IOException {
        try {
            jsonWriter.beginObject();
            for (FieldBinding<?> fieldBinding : this.fieldsArray) {
                jsonWriter.name(fieldBinding.a);
                fieldBinding.b(jsonWriter, t);
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException unused) {
            ny61.w();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.classFactory + Extension.C_BRAKE;
    }
}
