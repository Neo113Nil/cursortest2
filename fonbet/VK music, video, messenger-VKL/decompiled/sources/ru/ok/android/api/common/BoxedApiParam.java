package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: BoxedApiParam.kt */
/* loaded from: classes9.dex */
public final class BoxedApiParam extends ApiParam {
    private final BoxedApiName nameBox;
    private final BoxedApiValue valueBox;

    public BoxedApiParam(BoxedApiName boxedApiName, BoxedApiValue boxedApiValue) {
        super(boxedApiName.getCanonicalName$odnoklassniki_android_api_release());
        this.nameBox = boxedApiName;
        this.valueBox = boxedApiValue;
    }

    @Override // ru.ok.android.api.core.ApiParam
    public boolean canRepeat() {
        return this.nameBox.canRepeat() && this.valueBox.canRepeat();
    }

    @Override // ru.ok.android.api.core.ApiParam
    public boolean isSupplied() {
        return this.valueBox.isSupplied();
    }

    @Override // ru.ok.android.api.core.ApiParam
    public boolean shouldPost() {
        return this.nameBox.shouldPost() || this.valueBox.shouldPost();
    }

    public String toString() {
        return getName() + " = " + this.valueBox;
    }

    @Override // ru.ok.android.api.core.ApiParam
    public void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        if (this.valueBox.shouldSkipParam()) {
            jsonWriter.comment("skipped param %s", this);
        } else {
            this.nameBox.write(jsonWriter);
            this.valueBox.write(jsonWriter);
        }
    }
}
