package ru.ok.android.api.common;

import ru.ok.android.api.core.AutoApiParam;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: StringAutoApiParam.kt */
/* loaded from: classes9.dex */
public final class StringAutoApiParam extends AutoApiParam {
    private final String value;

    public StringAutoApiParam(String str, String str2) {
        super(str);
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // ru.ok.android.api.core.AutoApiParam
    public void write(JsonWriter jsonWriter) {
        String str = this.value;
        if (str == null || str.length() == 0) {
            return;
        }
        jsonWriter.name(getName());
        jsonWriter.value(this.value);
    }
}
