package ru.ok.android.api.json;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class JsonStateException extends IllegalStateException {
    private JsonStateException(String str) {
        super(str);
    }

    @NonNull
    public static JsonStateException nestingProblem(String str) {
        return new JsonStateException(str);
    }

    @NonNull
    public static JsonStateException notAtBeginObject(int i) {
        return new JsonStateException("Expected " + JsonTokens.toString(123) + " was " + JsonTokens.toString(i));
    }

    @NonNull
    public static JsonStateException notAtEndArray(int i) {
        return new JsonStateException("Expected " + JsonTokens.toString(93) + " was " + JsonTokens.toString(i));
    }

    @NonNull
    public static JsonStateException notAtEndObject(int i) {
        return new JsonStateException("Expected " + JsonTokens.toString(125) + " was " + JsonTokens.toString(i));
    }

    @NonNull
    public static JsonStateException notAtName(int i) {
        return new JsonStateException("Expected " + JsonTokens.toString(39) + " was " + JsonTokens.toString(i));
    }

    @NonNull
    public static JsonStateException notAtValue(int i) {
        return new JsonStateException("Expected value was " + JsonTokens.toString(i));
    }
}
