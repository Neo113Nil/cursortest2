package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonWriter;
import xsna.epx;

/* compiled from: BoxedApiName.kt */
/* loaded from: classes9.dex */
public abstract class BoxedApiName {
    private final String canonicalName;

    public BoxedApiName(String str) {
        this.canonicalName = str;
    }

    public final boolean canRepeat() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof BoxedApiName) && epx.f(this.canonicalName, ((BoxedApiName) obj).canonicalName);
        }
        return true;
    }

    public final String getCanonicalName$odnoklassniki_android_api_release() {
        return this.canonicalName;
    }

    public int hashCode() {
        return this.canonicalName.hashCode();
    }

    public ApiParam intoParam(String str) {
        return intoParam(new StringApiValue(str));
    }

    public boolean shouldPost() {
        return false;
    }

    public String toString() {
        return this.canonicalName;
    }

    public final void write(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name(this.canonicalName);
    }

    public final ApiParam intoParam(BoxedApiValue boxedApiValue) {
        return new BoxedApiParam(this, boxedApiValue);
    }
}
