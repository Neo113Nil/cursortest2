package com.yandex.passport.api.exception;

import com.yandex.passport.api.PassportUidImpl;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/passport/api/exception/PassportTooManyTracksException;", "Lcom/yandex/passport/api/exception/PassportException;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportTooManyTracksException extends PassportException {
    public PassportTooManyTracksException(PassportUidImpl passportUidImpl) {
        super("Too many tracks for account with uid " + passportUidImpl);
    }
}
