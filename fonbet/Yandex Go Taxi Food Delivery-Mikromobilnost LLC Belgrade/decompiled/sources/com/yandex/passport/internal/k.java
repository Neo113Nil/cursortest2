package com.yandex.passport.internal;

import com.yandex.auth.LegacyAccountType;

/* loaded from: classes5.dex */
public final class k {
    public static final String a(k kVar, int i, boolean z) {
        kVar.getClass();
        return z ? LegacyAccountType.STRING_TEAM : i != 6 ? i != 10 ? i != 12 ? LegacyAccountType.STRING_LOGIN : LegacyAccountType.STRING_MAILISH : "phone" : LegacyAccountType.STRING_SOCIAL;
    }
}
