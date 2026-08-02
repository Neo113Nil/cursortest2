package com.yandex.passport.internal.entities;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.q2;

/* loaded from: classes15.dex */
public final class r {
    public static UserCredentials a(q2 q2Var) {
        return new UserCredentials(PassportEnvironmentImpl.from(q2Var.getEnvironment()), q2Var.getLogin(), q2Var.getPassword(), q2Var.getAvatarUrl());
    }
}
