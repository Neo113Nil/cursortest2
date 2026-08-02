package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: PostApiValue.kt */
/* loaded from: classes9.dex */
public final class PostApiValue extends StringishApiValue {

    /* compiled from: PostApiValue.kt */
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
            return true;
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
            this.delegate.write(jsonWriter);
        }
    }

    public PostApiValue(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public ApiParam intoParam(String str) {
        return new PostApiParam(str, getValue());
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public boolean shouldPost() {
        return true;
    }
}
