package com.yandex.passport.internal.network.response;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.internal.entities.ClientToken;

/* loaded from: classes2.dex */
public final class e {
    public final MasterToken a;
    public final UserInfo b;
    public final ClientToken c;

    static {
        int i = UserInfo.$stable;
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
    }

    public e(MasterToken masterToken, UserInfo userInfo, ClientToken clientToken) {
        this.a = masterToken;
        this.b = userInfo;
        this.c = clientToken;
    }

    public final ClientToken a() {
        return this.c;
    }

    public final MasterToken b() {
        return this.a;
    }

    public final UserInfo c() {
        return this.b;
    }
}
