package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: StringishApiValue.kt */
/* loaded from: classes9.dex */
public abstract class StringishApiValue extends RefApiValue<String> {
    public StringishApiValue(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.RefApiValue, ru.ok.android.api.common.BoxedApiValue
    public boolean shouldSkipParam() {
        return getValue() == null || getValue().length() == 0;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(JsonWriter jsonWriter) throws IOException {
        jsonWriter.nullableValue(getValue());
    }
}
