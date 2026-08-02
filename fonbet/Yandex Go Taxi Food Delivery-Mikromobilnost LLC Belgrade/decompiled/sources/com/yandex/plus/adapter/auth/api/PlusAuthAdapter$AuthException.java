package com.yandex.plus.adapter.auth.api;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\r\u000e\u000f\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"com/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Cancelled", "Forbidden", "Unsupported", "Other", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlusAuthAdapter$AuthException extends Exception {
    private final Throwable cause;
    private final String message;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException$Cancelled;", "Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException;", "<init>", "()V", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancelled extends PlusAuthAdapter$AuthException {
        public Cancelled() {
            super("Cancelled!", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException$Forbidden;", "Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException;", "<init>", "()V", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Forbidden extends PlusAuthAdapter$AuthException {
        public Forbidden() {
            super("Forbidden!", null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException$Other;", "Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException;", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Other extends PlusAuthAdapter$AuthException {
        public Other(Throwable th) {
            super("Other error", th);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException$Unsupported;", "Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$AuthException;", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unsupported extends PlusAuthAdapter$AuthException {
        public Unsupported() {
            super("Operation `OpenUrl` is unsupported!", null);
        }
    }

    public PlusAuthAdapter$AuthException(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
