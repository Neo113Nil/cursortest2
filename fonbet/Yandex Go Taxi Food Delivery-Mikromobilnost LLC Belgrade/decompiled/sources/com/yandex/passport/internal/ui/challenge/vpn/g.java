package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class g {
    public final String a;

    public g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && jl40.l(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Init(url="), this.a, ')');
    }
}
