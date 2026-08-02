package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: BooleanApiParam.kt */
/* loaded from: classes9.dex */
public final class BooleanApiParam extends ApiParam {
    private final boolean value;

    public BooleanApiParam(String str, boolean z) {
        super(str);
        this.value = z;
    }

    public final boolean getValue() {
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
