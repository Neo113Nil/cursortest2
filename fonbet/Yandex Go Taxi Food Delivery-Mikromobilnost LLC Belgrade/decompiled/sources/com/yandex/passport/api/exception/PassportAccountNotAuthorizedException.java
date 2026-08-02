package com.yandex.passport.api.exception;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.r;
import com.yandex.passport.api.s0;
import com.yandex.passport.common.core.Uid;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/passport/api/exception/PassportAccountNotAuthorizedException;", "Lcom/yandex/passport/api/exception/PassportException;", "<init>", "()V", "", "uidValue", "J", "", "uidEnvironment", CA20Status.STATUS_USER_I, "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportAccountNotAuthorizedException extends PassportException {
    private final int uidEnvironment;
    private final long uidValue;

    public PassportAccountNotAuthorizedException(Uid uid) {
        super("Account " + uid + " does not have a master token right now, it is possible the account was signed out.");
        this.uidValue = uid.getValue();
        this.uidEnvironment = uid.getEnvironment().getInteger();
    }

    public final PassportUidImpl a() {
        if (this.uidValue <= 0) {
            return null;
        }
        s0 b = r.b(this.uidEnvironment);
        return new PassportUidImpl(PassportEnvironmentImpl.from(b), this.uidValue);
    }

    public PassportAccountNotAuthorizedException() {
        super("This account does not have a master token right now, it is possible the account was signed out.");
        this.uidValue = 0L;
        this.uidEnvironment = 0;
    }
}
