package ru.ok.android.api.methods.batch.execute;

import java.io.IOException;
import ru.ok.android.api.common.RefApiParam;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: SupplierApiParam.kt */
/* loaded from: classes9.dex */
public final class SupplierApiParam extends RefApiParam<String> {
    public SupplierApiParam(String str, String str2) {
        super(str, str2);
    }

    @Override // ru.ok.android.api.core.ApiParam
    public boolean isSupplied() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiParam
    public boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.common.RefApiParam
    public void writeValue(JsonWriter jsonWriter) throws IOException {
        jsonWriter.value(getValue());
    }

    public SupplierApiParam(String str, String str2, String str3) {
        this(str, SupplierApiValue.Companion.makeValue$odnoklassniki_android_api_release(str2, str3));
    }

    public SupplierApiParam(String str, ApiRequest apiRequest, String str2) {
        this(str, SupplierApiValue.Companion.makeValue$odnoklassniki_android_api_release(apiRequest, str2));
    }
}
