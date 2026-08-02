package com.yandex.passport.api.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/api/exception/PassportUserIdConnectionException;", "Lcom/yandex/passport/api/exception/PassportException;", "<init>", "()V", "passport-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PassportUserIdConnectionException extends PassportException {
    public PassportUserIdConnectionException() {
        super("Failed to connect with user-id web");
    }
}
