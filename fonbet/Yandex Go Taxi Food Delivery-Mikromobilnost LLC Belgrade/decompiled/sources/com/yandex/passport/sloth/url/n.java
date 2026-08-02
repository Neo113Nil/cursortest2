package com.yandex.passport.sloth.url;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class n extends p {
    public final String a;

    public n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && jl40.l(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RedirectUrlCommand(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
