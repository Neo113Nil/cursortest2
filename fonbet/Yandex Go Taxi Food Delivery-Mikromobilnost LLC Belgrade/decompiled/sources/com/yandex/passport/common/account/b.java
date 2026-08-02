package com.yandex.passport.common.account;

/* loaded from: classes15.dex */
public final class b {
    public static MasterToken a(String str) {
        if (str == null || str.length() <= 0 || str.equals("-")) {
            str = null;
        }
        return new MasterToken(str);
    }
}
