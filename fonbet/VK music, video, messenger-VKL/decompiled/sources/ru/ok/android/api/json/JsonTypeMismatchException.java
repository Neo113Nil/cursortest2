package ru.ok.android.api.json;

/* loaded from: classes9.dex */
public final class JsonTypeMismatchException extends JsonParseException {
    public JsonTypeMismatchException(String str) {
        super(str);
    }

    public JsonTypeMismatchException(String str, Throwable th) {
        super(str, th);
    }

    public JsonTypeMismatchException(int i, int i2) {
        super("Expected " + JsonTokens.toString(i) + " was " + JsonTokens.toString(i2));
    }
}
