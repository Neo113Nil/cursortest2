package com.yandex.passport.api.exception;

import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/passport/api/exception/PassportDeprecatedApiUsageException;", "Lcom/yandex/passport/api/exception/PassportException;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportDeprecatedApiUsageException extends PassportException {
    public PassportDeprecatedApiUsageException(String str) {
        super(oyr.p("Action ", str, " is not supported on deprecated api"));
    }
}
