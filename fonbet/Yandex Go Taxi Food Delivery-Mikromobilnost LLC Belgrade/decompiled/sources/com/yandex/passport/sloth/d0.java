package com.yandex.passport.sloth;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class d0 implements i0 {
    public final String a;

    public d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && jl40.l(this.a, ((d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SamlSsoAuth(authUrl=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
