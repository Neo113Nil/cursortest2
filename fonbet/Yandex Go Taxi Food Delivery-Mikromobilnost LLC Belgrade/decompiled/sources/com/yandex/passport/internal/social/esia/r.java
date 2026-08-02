package com.yandex.passport.internal.social.esia;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class r implements x {
    public final String a;

    public r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && jl40.l(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthStartUrl(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
