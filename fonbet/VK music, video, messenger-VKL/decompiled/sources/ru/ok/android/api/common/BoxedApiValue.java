package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: BoxedApiValue.kt */
/* loaded from: classes9.dex */
public abstract class BoxedApiValue {
    public boolean canRepeat() {
        return true;
    }

    public ApiParam intoParam(String str) {
        return intoParam(new StringApiName(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException;

    public final ApiParam intoParam(BoxedApiName boxedApiName) {
        return new BoxedApiParam(boxedApiName, this);
    }
}
