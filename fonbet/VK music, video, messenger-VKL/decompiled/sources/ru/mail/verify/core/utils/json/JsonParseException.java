package ru.mail.verify.core.utils.json;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class JsonParseException extends RuntimeException {
    public JsonParseException(@NonNull Throwable th) {
        super(null, th);
    }

    public JsonParseException(@NonNull String str) {
        super(str);
    }
}
