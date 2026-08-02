package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s0 implements t0 {
    public final PassportLogoutPropertiesImpl a;
    public final LogoutBehaviour b;

    public s0(PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, LogoutBehaviour logoutBehaviour) {
        this.a = passportLogoutPropertiesImpl;
        this.b = logoutBehaviour;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return jl40.l(this.a, s0Var.a) && this.b == s0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Logout(properties=" + this.a + ", behaviour=" + this.b + ')';
    }
}
