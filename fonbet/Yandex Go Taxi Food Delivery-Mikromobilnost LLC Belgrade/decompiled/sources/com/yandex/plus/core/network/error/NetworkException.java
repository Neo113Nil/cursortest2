package com.yandex.plus.core.network.error;

import defpackage.jt50;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/plus/core/network/error/NetworkException;", "Ljava/io/IOException;", "Ljt50;", "errorType", "Ljt50;", "getErrorType", "()Ljt50;", "zs50", "homeless-core-network-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkException extends IOException {
    private final jt50 errorType;

    public NetworkException(jt50 jt50Var, Throwable th) {
        super(th);
        this.errorType = jt50Var;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String message;
        Throwable cause = getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            return String.valueOf(this.errorType);
        }
        return this.errorType + "; exceptionMessage = " + message;
    }
}
