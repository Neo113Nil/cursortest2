package com.yandex.passport.internal;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;

/* loaded from: classes2.dex */
public abstract class g {
    public static final LoginProperties a;

    static {
        LoginProperties.a aVar = new LoginProperties.a();
        Filter.a aVar2 = new Filter.a();
        aVar2.e(PassportEnvironmentImpl.PRODUCTION);
        aVar.g(aVar2.a());
        aVar.B = true;
        aVar.J = "passport/settings";
        a = aVar.a();
    }
}
