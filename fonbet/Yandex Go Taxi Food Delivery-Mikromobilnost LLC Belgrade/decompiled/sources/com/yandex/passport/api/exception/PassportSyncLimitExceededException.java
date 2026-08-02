package com.yandex.passport.api.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/api/exception/PassportSyncLimitExceededException;", "Lcom/yandex/passport/api/exception/PassportException;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportSyncLimitExceededException extends PassportException {
    public PassportSyncLimitExceededException() {
        super("Account sync limit exceeded. Please try later.");
    }
}
