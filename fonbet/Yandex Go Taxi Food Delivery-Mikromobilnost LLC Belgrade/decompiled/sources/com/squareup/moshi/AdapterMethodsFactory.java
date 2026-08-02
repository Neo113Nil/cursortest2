package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.w511;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class AdapterMethodsFactory implements JsonAdapter.Factory {
    public final ArrayList a;
    public final ArrayList b;

    /* renamed from: com.squareup.moshi.AdapterMethodsFactory$2, reason: invalid class name */
    class AnonymousClass2 extends AdapterMethod {
        @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
        public void toJson(Moshi moshi, JsonWriter jsonWriter, Object obj) throws IOException, InvocationTargetException {
            invoke(jsonWriter, obj);
        }
    }

    /* renamed from: com.squareup.moshi.AdapterMethodsFactory$4, reason: invalid class name */
    class AnonymousClass4 extends AdapterMethod {
        @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
        public Object fromJson(Moshi moshi, JsonReader jsonReader) throws IOException, InvocationTargetException {
            return invoke(jsonReader);
        }
    }

    public AdapterMethodsFactory(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public static AdapterMethod a(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AdapterMethod adapterMethod = (AdapterMethod) arrayList.get(i);
            if (Types.equals(adapterMethod.a, type) && adapterMethod.b.equals(set)) {
                return adapterMethod;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdapterMethodsFactory get(Object obj) {
        Class<?> cls;
        Type type;
        Object obj2;
        String str;
        Class cls2;
        ?? r2;
        AdapterMethodsFactory adapterMethodsFactory;
        char c;
        Object obj3;
        Object obj4;
        Class cls3;
        AdapterMethod adapterMethod;
        AdapterMethod a;
        String str2;
        Class cls4;
        boolean z;
        AdapterMethod adapterMethod2;
        boolean z2;
        AdapterMethod a2;
        Class cls5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Class<?> cls6 = obj.getClass();
        while (cls6 != Object.class) {
            Method[] declaredMethods = cls6.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            Object[] objArr = declaredMethods;
            while (i < length) {
                Method method = objArr[i];
                boolean isAnnotationPresent = method.isAnnotationPresent(ToJson.class);
                Class cls7 = Void.TYPE;
                boolean z3 = true;
                if (isAnnotationPresent) {
                    method.setAccessible(true);
                    final Type genericReturnType = method.getGenericReturnType();
                    final Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    adapterMethodsFactory = null;
                    c = 0;
                    if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == JsonWriter.class && genericReturnType == cls7) {
                        int length2 = genericParameterTypes.length;
                        int i2 = 2;
                        while (i2 < length2) {
                            boolean z4 = z3;
                            Type type2 = genericParameterTypes[i2];
                            cls = cls6;
                            if ((type2 instanceof ParameterizedType) && ((ParameterizedType) type2).getRawType() == JsonAdapter.class) {
                                i2++;
                                z3 = z4;
                                cls6 = cls;
                            } else {
                                type = JsonAdapter.class;
                                obj2 = "\n    ";
                                str2 = "Unexpected signature for ";
                                cls4 = cls7;
                                z = z4;
                            }
                        }
                        cls = cls6;
                        boolean z5 = z3;
                        Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(parameterAnnotations[z5 ? 1 : 0]);
                        type = JsonAdapter.class;
                        Type type3 = genericParameterTypes[z5 ? 1 : 0];
                        int length3 = genericParameterTypes.length;
                        obj2 = "\n    ";
                        str2 = "Unexpected signature for ";
                        z2 = z5 ? 1 : 0;
                        adapterMethod2 = new AnonymousClass2(type3, jsonAnnotations, obj, method, length3, 2, true);
                        cls2 = cls7;
                        a2 = a(arrayList, adapterMethod2.a, adapterMethod2.b);
                        if (a2 == null) {
                            StringBuilder sb = new StringBuilder("Conflicting @ToJson methods:\n    ");
                            sb.append(a2.d);
                            w511.p(sb, obj2, adapterMethod2.d);
                            return null;
                        }
                        arrayList.add(adapterMethod2);
                        str = str2;
                        r2 = z2;
                    } else {
                        cls = cls6;
                        type = JsonAdapter.class;
                        obj2 = "\n    ";
                        str2 = "Unexpected signature for ";
                        cls4 = cls7;
                        z = true;
                    }
                    if (genericParameterTypes.length != z || genericReturnType == (cls5 = cls4)) {
                        w511.t(str2, method, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                        return null;
                    }
                    final Set<? extends Annotation> jsonAnnotations2 = Util.jsonAnnotations(method);
                    final Set<? extends Annotation> jsonAnnotations3 = Util.jsonAnnotations(parameterAnnotations[0]);
                    cls2 = cls5;
                    adapterMethod2 = new AdapterMethod(genericParameterTypes[0], jsonAnnotations3, obj, method, genericParameterTypes.length, Util.hasNullable(parameterAnnotations[0])) { // from class: com.squareup.moshi.AdapterMethodsFactory.3
                        public JsonAdapter h;

                        @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                        public void bind(Moshi moshi, JsonAdapter.Factory factory) {
                            super.bind(moshi, factory);
                            Type type4 = genericParameterTypes[0];
                            Type type5 = genericReturnType;
                            boolean equals = Types.equals(type4, type5);
                            Set<? extends Annotation> set = jsonAnnotations2;
                            this.h = (equals && jsonAnnotations3.equals(set)) ? moshi.nextAdapter(factory, type5, set) : moshi.adapter(type5, set);
                        }

                        @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                        public void toJson(Moshi moshi, JsonWriter jsonWriter, Object obj5) throws IOException, InvocationTargetException {
                            this.h.toJson(jsonWriter, (JsonWriter) invoke(obj5));
                        }
                    };
                    z2 = z;
                    a2 = a(arrayList, adapterMethod2.a, adapterMethod2.b);
                    if (a2 == null) {
                    }
                } else {
                    cls = cls6;
                    type = JsonAdapter.class;
                    obj2 = "\n    ";
                    str = "Unexpected signature for ";
                    cls2 = cls7;
                    r2 = 1;
                    adapterMethodsFactory = null;
                    c = 0;
                }
                if (method.isAnnotationPresent(FromJson.class)) {
                    method.setAccessible(r2);
                    final Type genericReturnType2 = method.getGenericReturnType();
                    final Set<? extends Annotation> jsonAnnotations4 = Util.jsonAnnotations(method);
                    final Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                    if (genericParameterTypes2.length < r2 || genericParameterTypes2[c] != JsonReader.class) {
                        obj4 = objArr;
                        cls3 = cls2;
                    } else {
                        cls3 = cls2;
                        if (genericReturnType2 != cls3) {
                            int length4 = genericParameterTypes2.length;
                            int i3 = r2;
                            Object obj5 = objArr;
                            while (i3 < length4) {
                                int i4 = i3;
                                Type type4 = genericParameterTypes2[i4];
                                obj4 = obj5;
                                if ((type4 instanceof ParameterizedType) && ((ParameterizedType) type4).getRawType() == type) {
                                    obj5 = obj4;
                                    i3 = i4 + 1;
                                }
                            }
                            obj3 = obj5;
                            adapterMethod = new AnonymousClass4(genericReturnType2, jsonAnnotations4, obj, method, genericParameterTypes2.length, 1, true);
                            a = a(arrayList2, adapterMethod.a, adapterMethod.b);
                            if (a == null) {
                                StringBuilder sb2 = new StringBuilder("Conflicting @FromJson methods:\n    ");
                                sb2.append(a.d);
                                w511.p(sb2, obj2, adapterMethod.d);
                                return adapterMethodsFactory;
                            }
                            arrayList2.add(adapterMethod);
                        } else {
                            obj4 = objArr;
                        }
                    }
                    if (genericParameterTypes2.length != 1 || genericReturnType2 == cls3) {
                        w511.t(str, method, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                        return adapterMethodsFactory;
                    }
                    final Set<? extends Annotation> jsonAnnotations5 = Util.jsonAnnotations(parameterAnnotations2[c]);
                    adapterMethod = new AdapterMethod(genericReturnType2, jsonAnnotations4, obj, method, genericParameterTypes2.length, Util.hasNullable(parameterAnnotations2[c])) { // from class: com.squareup.moshi.AdapterMethodsFactory.5
                        public JsonAdapter h;

                        @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                        public void bind(Moshi moshi, JsonAdapter.Factory factory) {
                            super.bind(moshi, factory);
                            Type[] typeArr = genericParameterTypes2;
                            boolean equals = Types.equals(typeArr[0], genericReturnType2);
                            Set<? extends Annotation> set = jsonAnnotations5;
                            this.h = (equals && set.equals(jsonAnnotations4)) ? moshi.nextAdapter(factory, typeArr[0], set) : moshi.adapter(typeArr[0], set);
                        }

                        @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                        public Object fromJson(Moshi moshi, JsonReader jsonReader) throws IOException, InvocationTargetException {
                            return invoke(this.h.fromJson(jsonReader));
                        }
                    };
                    obj3 = obj4;
                    a = a(arrayList2, adapterMethod.a, adapterMethod.b);
                    if (a == null) {
                    }
                } else {
                    obj3 = objArr;
                }
                i++;
                cls6 = cls;
                objArr = obj3;
            }
            cls6 = cls6.getSuperclass();
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new AdapterMethodsFactory(arrayList, arrayList2);
        }
        ny61.g(qv10.n(obj, "Expected at least one @ToJson or @FromJson method on "));
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(final Type type, final Set<? extends Annotation> set, final Moshi moshi) {
        final AdapterMethod a = a(this.a, type, set);
        final AdapterMethod a2 = a(this.b, type, set);
        JsonAdapter jsonAdapter = null;
        if (a == null && a2 == null) {
            return null;
        }
        if (a == null || a2 == null) {
            try {
                jsonAdapter = moshi.nextAdapter(this, type, set);
            } catch (IllegalArgumentException e) {
                StringBuilder x = unr0.x("No ", a == null ? "@ToJson" : "@FromJson", " adapter for ");
                x.append(Util.typeAnnotatedWithAnnotations(type, set));
                throw new IllegalArgumentException(x.toString(), e);
            }
        }
        final JsonAdapter jsonAdapter2 = jsonAdapter;
        if (a != null) {
            a.bind(moshi, this);
        }
        if (a2 != null) {
            a2.bind(moshi, this);
        }
        return new JsonAdapter<Object>() { // from class: com.squareup.moshi.AdapterMethodsFactory.1
            @Override // com.squareup.moshi.JsonAdapter
            public Object fromJson(JsonReader jsonReader) throws IOException {
                AdapterMethod adapterMethod = a2;
                if (adapterMethod == null) {
                    return jsonAdapter2.fromJson(jsonReader);
                }
                if (!adapterMethod.g && jsonReader.peek() == JsonReader.Token.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return adapterMethod.fromJson(moshi, jsonReader);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(cause);
                    String path = jsonReader.getPath();
                    sb.append(" at ");
                    sb.append(path);
                    throw new JsonDataException(sb.toString(), cause);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
                AdapterMethod adapterMethod = AdapterMethod.this;
                if (adapterMethod == null) {
                    jsonAdapter2.toJson(jsonWriter, (JsonWriter) obj);
                    return;
                }
                if (!adapterMethod.g && obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                try {
                    adapterMethod.toJson(moshi, jsonWriter, obj);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(cause);
                    String path = jsonWriter.getPath();
                    sb.append(" at ");
                    sb.append(path);
                    throw new JsonDataException(sb.toString(), cause);
                }
            }

            public String toString() {
                return "JsonAdapter" + set + Extension.O_BRAKE + type + Extension.C_BRAKE;
            }
        };
    }

    public static abstract class AdapterMethod {
        public final Type a;
        public final Set b;
        public final Object c;
        public final Method d;
        public final int e;
        public final JsonAdapter[] f;
        public final boolean g;

        public AdapterMethod(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            this.a = Util.canonicalize(type);
            this.b = set;
            this.c = obj;
            this.d = method;
            this.e = i2;
            this.f = new JsonAdapter[i - i2];
            this.g = z;
        }

        public void bind(Moshi moshi, JsonAdapter.Factory factory) {
            JsonAdapter[] jsonAdapterArr = this.f;
            if (jsonAdapterArr.length > 0) {
                Method method = this.d;
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                int length = genericParameterTypes.length;
                int i = this.e;
                for (int i2 = i; i2 < length; i2++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i2]).getActualTypeArguments()[0];
                    Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(parameterAnnotations[i2]);
                    jsonAdapterArr[i2 - i] = (Types.equals(this.a, type) && this.b.equals(jsonAnnotations)) ? moshi.nextAdapter(factory, type, jsonAnnotations) : moshi.adapter(type, jsonAnnotations);
                }
            }
        }

        public Object fromJson(Moshi moshi, JsonReader jsonReader) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        public Object invoke(Object obj, Object obj2) throws InvocationTargetException {
            JsonAdapter[] jsonAdapterArr = this.f;
            Object[] objArr = new Object[jsonAdapterArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
            try {
                return this.d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                ny61.w();
                return null;
            }
        }

        public void toJson(Moshi moshi, JsonWriter jsonWriter, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        public Object invoke(Object obj) throws InvocationTargetException {
            JsonAdapter[] jsonAdapterArr = this.f;
            Object[] objArr = new Object[jsonAdapterArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
            try {
                return this.d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                ny61.w();
                return null;
            }
        }
    }
}
