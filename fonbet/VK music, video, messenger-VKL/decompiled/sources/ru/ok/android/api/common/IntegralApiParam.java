package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: IntegralApiParam.kt */
/* loaded from: classes9.dex */
public final class IntegralApiParam extends ApiParam {
    private final long value;

    public IntegralApiParam(String str, long j) {
        super(str);
        this.value = j;
    }

    public final long getValue() {
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
