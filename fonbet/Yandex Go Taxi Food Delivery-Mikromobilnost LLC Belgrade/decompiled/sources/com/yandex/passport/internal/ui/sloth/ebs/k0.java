package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.common.core.JwtToken;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k0 implements l0 {
    public final JwtToken a;

    static {
        int i = JwtToken.$stable;
    }

    public k0(JwtToken jwtToken) {
        this.a = jwtToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && jl40.l(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowInitializationCryptoSdk(jwt=" + this.a + ')';
    }
}
