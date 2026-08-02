package com.yandex.passport.api;

import java.util.Map;

/* loaded from: classes15.dex */
public final class u2 implements c3 {
    public final PassportTheme a = PassportTheme.FOLLOW_SYSTEM;
    public t0 b = new s0(1);
    public Map c = kotlin.collections.b.f();
    public boolean w = true;
    public boolean x = true;

    @Override // com.yandex.passport.api.c3
    public final Map getCustomWebParams() {
        return this.c;
    }

    @Override // com.yandex.passport.api.c3
    public final t0 getEnvironment() {
        return this.b;
    }

    @Override // com.yandex.passport.api.c3
    public final boolean getShowLoading() {
        return this.w;
    }

    @Override // com.yandex.passport.api.c3
    public final boolean getShowUi() {
        return this.x;
    }

    @Override // com.yandex.passport.api.c3
    public final PassportTheme getTheme() {
        return this.a;
    }
}
