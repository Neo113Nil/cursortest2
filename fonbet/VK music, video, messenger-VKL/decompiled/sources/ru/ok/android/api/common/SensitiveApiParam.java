package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: SensitiveApiParam.kt */
/* loaded from: classes9.dex */
public final class SensitiveApiParam extends StringishApiParam {
    public SensitiveApiParam(String str, String str2) {
        super(str, str2);
    }

    @Override // ru.ok.android.api.common.StringishApiParam, ru.ok.android.api.common.RefApiParam
    public void writeValue(JsonWriter jsonWriter) throws IOException {
        ApiDebug.sensitiveValue(jsonWriter, getValue());
    }
}
