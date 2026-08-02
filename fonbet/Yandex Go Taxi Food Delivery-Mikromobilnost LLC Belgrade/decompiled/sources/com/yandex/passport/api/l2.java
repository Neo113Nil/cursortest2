package com.yandex.passport.api;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;

/* loaded from: classes8.dex */
public final class l2 {
    public static PassportUidImpl a(k2 k2Var) {
        return new PassportUidImpl(PassportEnvironmentImpl.from(k2Var.getEnvironment()), k2Var.getValue());
    }
}
