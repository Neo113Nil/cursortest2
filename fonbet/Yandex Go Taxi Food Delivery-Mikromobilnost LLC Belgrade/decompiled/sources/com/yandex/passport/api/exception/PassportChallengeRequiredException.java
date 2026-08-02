package com.yandex.passport.api.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/api/exception/PassportChallengeRequiredException;", "Lcom/yandex/passport/api/exception/PassportException;", "Lcom/yandex/passport/api/exception/PassportChallengeType;", "type", "Lcom/yandex/passport/api/exception/PassportChallengeType;", "getType", "()Lcom/yandex/passport/api/exception/PassportChallengeType;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportChallengeRequiredException extends PassportException {
    private final PassportChallengeType type;

    public PassportChallengeRequiredException(PassportChallengeType passportChallengeType) {
        super("Challenge required. Challenge type: " + passportChallengeType.name());
        this.type = passportChallengeType;
    }

    public /* synthetic */ PassportChallengeRequiredException(int i) {
        this(PassportChallengeType.DEFAULT);
    }

    public PassportChallengeRequiredException() {
        this(0);
    }
}
