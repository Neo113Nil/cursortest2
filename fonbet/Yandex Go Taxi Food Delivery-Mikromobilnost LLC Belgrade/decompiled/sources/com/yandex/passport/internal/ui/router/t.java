package com.yandex.passport.internal.ui.router;

import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class t implements v {
    public final LoginProperties a;

    public t(LoginProperties loginProperties) {
        this.a = loginProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && jl40.l(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Bouncer(loginProperties=" + this.a + ')';
    }
}
