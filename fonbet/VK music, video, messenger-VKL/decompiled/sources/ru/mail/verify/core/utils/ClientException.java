package ru.mail.verify.core.utils;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes9.dex */
public class ClientException extends Exception {

    @NonNull
    private final a a;

    public enum a {
        DEFAULT,
        CANCELLED,
        REJECTED_BY_POLICY,
        REJECTED_BY_INTERCEPTOR_ERROR,
        NO_INTERNET_PERMISSION
    }

    public ClientException(@NonNull IOException iOException) {
        super(iOException);
        this.a = a.DEFAULT;
    }

    @NonNull
    public final a a() {
        return this.a;
    }

    public ClientException(@NonNull SecurityException securityException) {
        super(securityException);
        this.a = a.NO_INTERNET_PERMISSION;
    }

    public ClientException(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.a = aVar;
    }
}
