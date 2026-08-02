package ru.ok.android.api.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonWalker;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
public class MockApiWriter implements JsonWriter {

    @NonNull
    private Scope<?> scope;

    public static final class ArrayScope extends Scope<Collection<Object>> {
        public ArrayScope(@NonNull Collection<Object> collection) {
            super(null, collection);
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void jsonValue(@NonNull Reader reader, @NonNull JsonWriter jsonWriter) throws IOException {
            JsonWalker.walkManyValues(reader, jsonWriter);
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void name(@NonNull String str) {
            throw JsonStateException.nestingProblem("Expected value");
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void value(@Nullable Object obj) {
            ((Collection) this.value).add(obj);
        }

        public ArrayScope(@NonNull Scope<?> scope) {
            super(scope, new ArrayList());
        }
    }

    public static final class DocumentScope extends Scope<AtomicReference<Object>> {
        private boolean hasValue;

        public DocumentScope(@NonNull AtomicReference<Object> atomicReference) {
            super(null, atomicReference);
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void jsonValue(@NonNull Reader reader, @NonNull JsonWriter jsonWriter) throws IOException {
            JsonWalker.walkValue(reader, jsonWriter);
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void name(@NonNull String str) {
            throw JsonStateException.nestingProblem("Expected value");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void value(@Nullable Object obj) {
            if (this.hasValue) {
                throw JsonStateException.nestingProblem("Expected name");
            }
            ((AtomicReference) this.value).set(obj);
            this.hasValue = true;
        }
    }

    public static final class ObjectScope extends Scope<Map<String, Object>> {
        private String lastName;

        public ObjectScope(@NonNull Map<String, Object> map) {
            super(null, map);
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void jsonValue(@NonNull Reader reader, @NonNull JsonWriter jsonWriter) throws IOException {
            if (this.lastName == null) {
                throw JsonStateException.nestingProblem("Expected name");
            }
            JsonWalker.walkValue(reader, jsonWriter);
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void name(@NonNull String str) {
            if (this.lastName != null) {
                throw JsonStateException.nestingProblem("Expected value");
            }
            this.lastName = str;
        }

        @Override // ru.ok.android.api.common.MockApiWriter.Scope
        public void value(@Nullable Object obj) {
            String str = this.lastName;
            if (str == null) {
                throw JsonStateException.nestingProblem("Expected name");
            }
            ((Map) this.value).put(str, obj);
            this.lastName = null;
        }

        public ObjectScope(@NonNull Scope<?> scope) {
            super(scope, new LinkedHashMap());
        }
    }

    public static abstract class Scope<T> {
        final Scope<?> parent;

        @NonNull
        final T value;

        public Scope(@Nullable Scope<?> scope, @NonNull T t) {
            this.parent = scope;
            this.value = t;
        }

        public ArrayScope beginArray() {
            ArrayScope arrayScope = new ArrayScope((Scope<?>) this);
            value(arrayScope.value);
            return arrayScope;
        }

        public ObjectScope beginObject() {
            ObjectScope objectScope = new ObjectScope((Scope<?>) this);
            value(objectScope.value);
            return objectScope;
        }

        public Scope<?> end() {
            return this.parent;
        }

        public abstract void jsonValue(@NonNull Reader reader, @NonNull JsonWriter jsonWriter) throws IOException;

        public abstract void name(@NonNull String str);

        public abstract void value(@Nullable Object obj);
    }

    private MockApiWriter(@NonNull Scope<?> scope) {
        this.scope = scope;
    }

    public static JsonWriter to(@NonNull AtomicReference<Object> atomicReference) {
        return new MockApiWriter(new DocumentScope(atomicReference));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void beginArray() {
        this.scope = this.scope.beginArray();
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void beginObject() {
        this.scope = this.scope.beginObject();
    }

    @Override // ru.ok.android.api.json.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.scope.parent != null) {
            throw JsonStateException.nestingProblem("Unfinished document");
        }
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void comment(@NonNull String str) {
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void endArray() {
        this.scope = this.scope.end();
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void endObject() {
        this.scope = this.scope.end();
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void jsonValue(@NonNull Reader reader) throws IOException {
        this.scope.jsonValue(reader, this);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    @NonNull
    public JsonWriter name(@NonNull String str) {
        this.scope.name(str);
        return this;
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void nullValue() {
        this.scope.value(null);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void nullableValue(@Nullable String str) {
        this.scope.value(str);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(@NonNull String str) {
        this.scope.value(str);
    }

    public static JsonWriter to(@NonNull Collection<Object> collection) {
        return new MockApiWriter(new ArrayScope(collection));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void comment(@NonNull String str, Object... objArr) {
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(boolean z) {
        this.scope.value(Boolean.valueOf(z));
    }

    public static JsonWriter to(@NonNull Map<String, Object> map) {
        return new MockApiWriter(new ObjectScope(map));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(int i) {
        this.scope.value(Integer.valueOf(i));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(long j) {
        this.scope.value(Long.valueOf(j));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(double d) {
        this.scope.value(Double.valueOf(d));
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(@NonNull Number number) throws IOException {
        this.scope.value(number);
    }

    @Override // ru.ok.android.api.json.JsonWriter, java.io.Flushable
    public void flush() {
    }
}
