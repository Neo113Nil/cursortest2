package ru.ok.android.externcalls.sdk.conversation.internal;

import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: FastStartException.kt */
/* loaded from: classes9.dex */
public final class FastStartException extends ApiInvocationException {
    private final Throwable cause;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FastStartException(String str, Throwable th) {
        super(1, str);
        if (str == null) {
            str = null;
            String message = th != null ? th.getMessage() : null;
            if (message != null) {
                str = message;
            } else if (th != null) {
                str = th.getClass().getName();
            }
        }
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
