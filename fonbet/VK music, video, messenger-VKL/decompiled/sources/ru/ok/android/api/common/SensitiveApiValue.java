package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: SensitiveApiValue.kt */
/* loaded from: classes9.dex */
public final class SensitiveApiValue extends StringishApiValue {

    /* compiled from: SensitiveApiValue.kt */
    public static final class Adapter extends BoxedApiValue {
        private final BoxedApiValue delegate;

        public Adapter(BoxedApiValue boxedApiValue) {
            this.delegate = boxedApiValue;
        }

        @Override // ru.ok.android.api.common.BoxedApiValue
        public boolean canRepeat() {
            return this.delegate.canRepeat();
        }

        @Override // ru.ok.android.api.common.BoxedApiValue
        public boolean shouldPost() {
            return this.delegate.shouldPost();
        }

        @Override // ru.ok.android.api.common.BoxedApiValue
        public boolean shouldSkipParam() {
            return this.delegate.shouldSkipParam();
        }

        public String toString() {
            return this.delegate.toString();
        }

        @Override // ru.ok.android.api.common.BoxedApiValue
        public void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
            if (ApiDebug.isDebug(jsonWriter)) {
                ApiDebug.omitValue(jsonWriter);
            } else {
                this.delegate.write(jsonWriter);
            }
        }
    }

    public SensitiveApiValue(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.StringishApiValue, ru.ok.android.api.common.BoxedApiValue
    public void write(JsonWriter jsonWriter) throws IOException {
        ApiDebug.sensitiveValue(jsonWriter, getValue());
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public SensitiveApiParam intoParam(String str) {
        return new SensitiveApiParam(str, getValue());
    }
}
