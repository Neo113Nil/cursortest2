package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class d2 implements o2 {
    public final LoginProperties a;

    public d2(LoginProperties loginProperties) {
        this.a = loginProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && jl40.l(this.a, ((d2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActivityOpen(loginProperties=" + this.a + ')';
    }
}
