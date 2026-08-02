package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: StringishApiParam.kt */
/* loaded from: classes9.dex */
public abstract class StringishApiParam extends RefApiParam<String> {
    public StringishApiParam(String str, String str2) {
        super(str, str2);
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public boolean shouldSkip() {
        return getValue() == null || getValue().length() == 0;
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public void writeValue(JsonWriter jsonWriter) throws IOException {
        jsonWriter.nullableValue(getValue());
    }
}
