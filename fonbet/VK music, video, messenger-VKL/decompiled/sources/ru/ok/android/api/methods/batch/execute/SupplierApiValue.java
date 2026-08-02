package ru.ok.android.api.methods.batch.execute;

import java.io.IOException;
import ru.ok.android.api.common.RefApiValue;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonWriter;
import xsna.pzl;
import xsna.zcl;

/* compiled from: SupplierApiValue.kt */
/* loaded from: classes9.dex */
public final class SupplierApiValue extends RefApiValue<String> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: SupplierApiValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String makeValue$odnoklassniki_android_api_release(String str, String str2) {
            return pzl.b(str, ".", str2);
        }

        private Companion() {
        }

        public final String makeValue$odnoklassniki_android_api_release(ApiRequest apiRequest, String str) {
            return makeValue$odnoklassniki_android_api_release(ApiUris.parseMethod(apiRequest.getUri()), str);
        }
    }

    public SupplierApiValue(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public boolean isSupplied() {
        return true;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public void write(JsonWriter jsonWriter) throws IOException {
        jsonWriter.value(getValue());
    }

    public SupplierApiValue(String str, String str2) {
        this(Companion.makeValue$odnoklassniki_android_api_release(str, str2));
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public SupplierApiParam intoParam(String str) {
        return new SupplierApiParam(str, getValue());
    }

    public SupplierApiValue(ApiRequest apiRequest, String str) {
        this(Companion.makeValue$odnoklassniki_android_api_release(apiRequest, str));
    }
}
