package com.yandex.passport.api.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/api/exception/PassportPollingException;", "Lcom/yandex/passport/api/exception/PassportException;", "Lcom/yandex/passport/api/exception/PassportPollingExceptionType;", "type", "Lcom/yandex/passport/api/exception/PassportPollingExceptionType;", "getType", "()Lcom/yandex/passport/api/exception/PassportPollingExceptionType;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportPollingException extends PassportException {
    private final PassportPollingExceptionType type;

    public PassportPollingException(PassportPollingExceptionType passportPollingExceptionType) {
        super(passportPollingExceptionType.name());
        this.type = passportPollingExceptionType;
    }
}
