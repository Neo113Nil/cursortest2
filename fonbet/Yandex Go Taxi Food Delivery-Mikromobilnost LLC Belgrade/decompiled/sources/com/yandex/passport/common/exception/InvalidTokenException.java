package com.yandex.passport.common.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/common/exception/InvalidTokenException;", "Lcom/yandex/passport/common/exception/NetworkException;", "<init>", "()V", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvalidTokenException extends NetworkException {
    public InvalidTokenException() {
        super("Invalid token");
    }
}
