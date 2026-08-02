package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: FloatingApiParam.kt */
/* loaded from: classes9.dex */
public final class FloatingApiParam extends ApiParam {
    private final double value;

    public FloatingApiParam(String str, double d) {
        super(str);
        this.value = d;
    }

    public final double getValue() {
        return this.value;
    }

    public String toString() {
        return getName() + " = " + this.value;
    }

    @Override // ru.ok.android.api.core.ApiParam
    public void write(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(getName());
        jsonWriter.value(this.value);
    }
}
