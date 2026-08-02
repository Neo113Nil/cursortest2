package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import defpackage.b64;
import defpackage.kbs;
import defpackage.oyr;
import defpackage.unr0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class StandardJsonAdapters {
    public static final JsonAdapter.Factory FACTORY = new AnonymousClass1();
    public static final JsonAdapter a = new AnonymousClass2();
    public static final JsonAdapter b = new AnonymousClass3();
    public static final JsonAdapter c = new AnonymousClass4();
    public static final JsonAdapter d = new AnonymousClass5();
    public static final JsonAdapter e = new AnonymousClass6();
    public static final JsonAdapter f = new AnonymousClass7();
    public static final JsonAdapter g = new AnonymousClass8();
    public static final JsonAdapter h = new AnonymousClass9();
    public static final JsonAdapter i = new AnonymousClass10();

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return StandardJsonAdapters.a;
            }
            if (type == Byte.TYPE) {
                return StandardJsonAdapters.b;
            }
            if (type == Character.TYPE) {
                return StandardJsonAdapters.c;
            }
            if (type == Double.TYPE) {
                return StandardJsonAdapters.d;
            }
            if (type == Float.TYPE) {
                return StandardJsonAdapters.e;
            }
            if (type == Integer.TYPE) {
                return StandardJsonAdapters.f;
            }
            if (type == Long.TYPE) {
                return StandardJsonAdapters.g;
            }
            if (type == Short.TYPE) {
                return StandardJsonAdapters.h;
            }
            if (type == Boolean.class) {
                return StandardJsonAdapters.a.nullSafe();
            }
            if (type == Byte.class) {
                return StandardJsonAdapters.b.nullSafe();
            }
            if (type == Character.class) {
                return StandardJsonAdapters.c.nullSafe();
            }
            if (type == Double.class) {
                return StandardJsonAdapters.d.nullSafe();
            }
            if (type == Float.class) {
                return StandardJsonAdapters.e.nullSafe();
            }
            if (type == Integer.class) {
                return StandardJsonAdapters.f.nullSafe();
            }
            if (type == Long.class) {
                return StandardJsonAdapters.g.nullSafe();
            }
            if (type == Short.class) {
                return StandardJsonAdapters.h.nullSafe();
            }
            if (type == String.class) {
                return StandardJsonAdapters.i.nullSafe();
            }
            if (type == Object.class) {
                return new ObjectJsonAdapter(moshi).nullSafe();
            }
            Class<?> rawType = Types.getRawType(type);
            JsonAdapter<?> generatedAdapter = Util.generatedAdapter(moshi, type, rawType);
            if (generatedAdapter != null) {
                return generatedAdapter;
            }
            if (rawType.isEnum()) {
                return new EnumJsonAdapter(rawType).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$11, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass11 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            a = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$2, reason: invalid class name */
    public class AnonymousClass2 extends JsonAdapter<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Boolean fromJson(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$3, reason: invalid class name */
    public class AnonymousClass3 extends JsonAdapter<Byte> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Byte fromJson(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) StandardJsonAdapters.a(jsonReader, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Byte b) throws IOException {
            jsonWriter.value(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$4, reason: invalid class name */
    public class AnonymousClass4 extends JsonAdapter<Character> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Character fromJson(JsonReader jsonReader) throws IOException {
            String nextString = jsonReader.nextString();
            if (nextString.length() <= 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonDataException(b64.l("Expected a char but was ", unr0.l(OpenList.CHAR_QUOTE, "\"", nextString), " at path ", jsonReader.getPath()));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$5, reason: invalid class name */
    public class AnonymousClass5 extends JsonAdapter<Double> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Double fromJson(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Double d) throws IOException {
            jsonWriter.value(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$6, reason: invalid class name */
    public class AnonymousClass6 extends JsonAdapter<Float> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Float fromJson(JsonReader jsonReader) throws IOException {
            float nextDouble = (float) jsonReader.nextDouble();
            if (jsonReader.isLenient() || !Float.isInfinite(nextDouble)) {
                return Float.valueOf(nextDouble);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + nextDouble + " at path " + jsonReader.getPath());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Float f) throws IOException {
            f.getClass();
            jsonWriter.value(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$7, reason: invalid class name */
    public class AnonymousClass7 extends JsonAdapter<Integer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Integer fromJson(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.nextInt());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Integer num) throws IOException {
            jsonWriter.value(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$8, reason: invalid class name */
    public class AnonymousClass8 extends JsonAdapter<Long> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        public Long fromJson(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Long l) throws IOException {
            jsonWriter.value(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$9, reason: invalid class name */
    public class AnonymousClass9 extends JsonAdapter<Short> {
        @Override // com.squareup.moshi.JsonAdapter
        public Short fromJson(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) StandardJsonAdapters.a(jsonReader, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Short sh) throws IOException {
            jsonWriter.value(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
        private final T[] constants;
        private final Class<T> enumType;
        private final String[] nameStrings;
        private final JsonReader.Options options;

        public EnumJsonAdapter(Class<T> cls) {
            this.enumType = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.constants = enumConstants;
                this.nameStrings = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.constants;
                    if (i >= tArr.length) {
                        this.options = JsonReader.Options.of(this.nameStrings);
                        return;
                    } else {
                        String name = tArr[i].name();
                        this.nameStrings[i] = Util.jsonName(name, cls.getField(name));
                        i++;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in ".concat(cls.getName()), e);
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader jsonReader) throws IOException {
            int selectString = jsonReader.selectString(this.options);
            if (selectString != -1) {
                return this.constants[selectString];
            }
            String path = jsonReader.getPath();
            String nextString = jsonReader.nextString();
            StringBuilder sb = new StringBuilder("Expected one of ");
            oyr.D(" but was ", nextString, " at path ", sb, Arrays.asList(this.nameStrings));
            sb.append(path);
            throw new JsonDataException(sb.toString());
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(this.nameStrings[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.enumType.getName() + Extension.C_BRAKE;
        }
    }

    public static final class ObjectJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Boolean> booleanAdapter;
        private final JsonAdapter<Double> doubleAdapter;
        private final JsonAdapter<List> listJsonAdapter;
        private final JsonAdapter<Map> mapAdapter;
        private final Moshi moshi;
        private final JsonAdapter<String> stringAdapter;

        public ObjectJsonAdapter(Moshi moshi) {
            this.moshi = moshi;
            this.listJsonAdapter = moshi.adapter(List.class);
            this.mapAdapter = moshi.adapter(Map.class);
            this.stringAdapter = moshi.adapter(String.class);
            this.doubleAdapter = moshi.adapter(Double.class);
            this.booleanAdapter = moshi.adapter(Boolean.class);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) throws IOException {
            switch (AnonymousClass11.a[jsonReader.peek().ordinal()]) {
                case 1:
                    return this.listJsonAdapter.fromJson(jsonReader);
                case 2:
                    return this.mapAdapter.fromJson(jsonReader);
                case 3:
                    return this.stringAdapter.fromJson(jsonReader);
                case 4:
                    return this.doubleAdapter.fromJson(jsonReader);
                case 5:
                    return this.booleanAdapter.fromJson(jsonReader);
                case 6:
                    return jsonReader.nextNull();
                default:
                    StringBuilder sb = new StringBuilder("Expected a value but was ");
                    sb.append(jsonReader.peek());
                    kbs.q(sb, " at path ", jsonReader.getPath());
                    return null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        
            if (r1.isAssignableFrom(r0) != false) goto L8;
         */
        @Override // com.squareup.moshi.JsonAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                jsonWriter.beginObject();
                jsonWriter.endObject();
                return;
            }
            Moshi moshi = this.moshi;
            Class<?> cls2 = Map.class;
            if (!cls2.isAssignableFrom(cls)) {
                cls2 = Collection.class;
            }
            cls = cls2;
            moshi.adapter(cls, Util.NO_ANNOTATIONS).toJson(jsonWriter, (JsonWriter) obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(JsonReader jsonReader, String str, int i2, int i3) {
        int nextInt = jsonReader.nextInt();
        if (nextInt >= i2 && nextInt <= i3) {
            return nextInt;
        }
        String path = jsonReader.getPath();
        StringBuilder u = b64.u(nextInt, "Expected ", str, " but was ", " at path ");
        u.append(path);
        throw new JsonDataException(u.toString());
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$10, reason: invalid class name */
    public class AnonymousClass10 extends JsonAdapter<String> {
        public String toString() {
            return "JsonAdapter(String)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public String fromJson(JsonReader jsonReader) throws IOException {
            return jsonReader.nextString();
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }
}
