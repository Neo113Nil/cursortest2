package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class q0 implements t0 {
    public final PassportLogoutPropertiesImpl a;

    public q0(PassportLogoutPropertiesImpl passportLogoutPropertiesImpl) {
        this.a = passportLogoutPropertiesImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && jl40.l(this.a, ((q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Delete(properties=" + this.a + ')';
    }
}
