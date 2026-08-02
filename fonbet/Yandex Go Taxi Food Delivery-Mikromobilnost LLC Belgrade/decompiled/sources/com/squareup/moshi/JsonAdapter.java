package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import defpackage.ny61;
import defpackage.oq6;
import defpackage.oyr;
import defpackage.qq6;
import defpackage.yp6;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class JsonAdapter<T> {

    public interface Factory {
        JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi);
    }

    public final JsonAdapter<T> failOnUnknown() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.3
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean failOnUnknown = jsonReader.failOnUnknown();
                jsonReader.setFailOnUnknown(true);
                try {
                    return (T) JsonAdapter.this.fromJson(jsonReader);
                } finally {
                    jsonReader.setFailOnUnknown(failOnUnknown);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final boolean isLenient() {
                return JsonAdapter.this.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                JsonAdapter.this.toJson(jsonWriter, (JsonWriter) t);
            }

            public String toString() {
                return JsonAdapter.this + ".failOnUnknown()";
            }
        };
    }

    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    public final T fromJson(String str) throws IOException {
        yp6 yp6Var = new yp6();
        yp6Var.x0(str);
        JsonReader of = JsonReader.of(yp6Var);
        T fromJson = fromJson(of);
        if (isLenient() || of.peek() == JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final T fromJsonValue(Object obj) {
        JsonValueReader jsonValueReader = new JsonValueReader();
        int[] iArr = jsonValueReader.b;
        int i = jsonValueReader.a;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        jsonValueReader.A = objArr;
        jsonValueReader.a = i + 1;
        objArr[i] = obj;
        try {
            return fromJson(jsonValueReader);
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }

    public JsonAdapter<T> indent(final String str) {
        if (str != null) {
            return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.4
                @Override // com.squareup.moshi.JsonAdapter
                public T fromJson(JsonReader jsonReader) throws IOException {
                    return (T) JsonAdapter.this.fromJson(jsonReader);
                }

                @Override // com.squareup.moshi.JsonAdapter
                public final boolean isLenient() {
                    return JsonAdapter.this.isLenient();
                }

                @Override // com.squareup.moshi.JsonAdapter
                public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                    String indent = jsonWriter.getIndent();
                    jsonWriter.setIndent(str);
                    try {
                        JsonAdapter.this.toJson(jsonWriter, (JsonWriter) t);
                    } finally {
                        jsonWriter.setIndent(indent);
                    }
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(JsonAdapter.this);
                    sb.append(".indent(\"");
                    return oyr.t(sb, str, "\")");
                }
            };
        }
        ny61.t("indent == null");
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public final JsonAdapter<T> lenient() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.2
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean isLenient = jsonReader.isLenient();
                jsonReader.setLenient(true);
                try {
                    return (T) JsonAdapter.this.fromJson(jsonReader);
                } finally {
                    jsonReader.setLenient(isLenient);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final boolean isLenient() {
                return true;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                boolean isLenient = jsonWriter.isLenient();
                jsonWriter.setLenient(true);
                try {
                    JsonAdapter.this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setLenient(isLenient);
                }
            }

            public String toString() {
                return JsonAdapter.this + ".lenient()";
            }
        };
    }

    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter<T> serializeNulls() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                return (T) JsonAdapter.this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final boolean isLenient() {
                return JsonAdapter.this.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                boolean serializeNulls = jsonWriter.getSerializeNulls();
                jsonWriter.setSerializeNulls(true);
                try {
                    JsonAdapter.this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setSerializeNulls(serializeNulls);
                }
            }

            public String toString() {
                return JsonAdapter.this + ".serializeNulls()";
            }
        };
    }

    public final String toJson(T t) {
        yp6 yp6Var = new yp6();
        try {
            toJson((oq6) yp6Var, (yp6) t);
            return yp6Var.I0();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }

    public abstract void toJson(JsonWriter jsonWriter, T t) throws IOException;

    public final Object toJsonValue(T t) {
        JsonValueWriter jsonValueWriter = new JsonValueWriter();
        try {
            toJson((JsonWriter) jsonValueWriter, (JsonValueWriter) t);
            return jsonValueWriter.root();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }

    public final void toJson(oq6 oq6Var, T t) throws IOException {
        toJson(JsonWriter.of(oq6Var), (JsonWriter) t);
    }

    public final T fromJson(qq6 qq6Var) throws IOException {
        return fromJson(JsonReader.of(qq6Var));
    }
}
