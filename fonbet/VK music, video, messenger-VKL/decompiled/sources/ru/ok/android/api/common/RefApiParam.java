package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: RefApiParam.kt */
/* loaded from: classes9.dex */
public abstract class RefApiParam<T> extends ApiParam {
    private final T value;

    public RefApiParam(String str, T t) {
        super(str);
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }

    public boolean shouldSkip() {
        return this.value == null;
    }

    public String toString() {
        return getName() + " = " + this.value;
    }

    @Override // ru.ok.android.api.core.ApiParam
    public final void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (shouldSkip()) {
            jsonWriter.comment("skipped param %s", this);
        } else {
            jsonWriter.name(getName());
            writeValue(jsonWriter);
        }
    }

    public abstract void writeValue(JsonWriter jsonWriter) throws IOException, JsonSerializeException;
}
