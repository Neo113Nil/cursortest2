package com.yandex.passport.api.exception;

import com.yandex.passport.api.k2;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.util.p;
import defpackage.b64;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/passport/api/exception/PassportAccountNotFoundException;", "Lcom/yandex/passport/api/exception/PassportException;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportAccountNotFoundException extends PassportException {
    public PassportAccountNotFoundException(k2 k2Var) {
        super("There is no account with uid " + k2Var);
    }

    public PassportAccountNotFoundException(String str, String str2) {
        super(b64.l("There is no account with ", str, " = ", str2));
    }

    public PassportAccountNotFoundException(Uid uid) {
        this(p.A(uid));
    }
}
