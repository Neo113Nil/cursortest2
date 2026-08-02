package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class l implements m {
    public final String a;

    public l(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && jl40.l(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("SetUrl(value="), this.a, ')');
    }
}
