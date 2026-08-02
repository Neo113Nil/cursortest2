package com.yandex.passport.internal.util;

import androidx.core.app.a1;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.i3y;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes15.dex */
public abstract class m {
    public static final Map a;
    public static final i3y b;

    static {
        PassportEnvironmentImpl passportEnvironmentImpl = PassportEnvironmentImpl.PRODUCTION;
        Pair pair = new Pair("passport.yandex.%s", passportEnvironmentImpl);
        PassportEnvironmentImpl passportEnvironmentImpl2 = PassportEnvironmentImpl.TESTING;
        a = kotlin.collections.b.i(pair, new Pair("passport-test.yandex.%s", passportEnvironmentImpl2), new Pair("passport-rc.yandex.%s", PassportEnvironmentImpl.RC), new Pair("passport.yandex-team.ru", PassportEnvironmentImpl.TEAM_PRODUCTION), new Pair("passport-test.yandex-team.ru", PassportEnvironmentImpl.TEAM_TESTING), new Pair("sandbox.pay.yandex.ru", passportEnvironmentImpl), new Pair("test.pay.yandex.ru", passportEnvironmentImpl2), new Pair("pay.yandex.ru", passportEnvironmentImpl));
        b = kotlin.a.a(new a1(23));
    }
}
