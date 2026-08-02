package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class y implements i0 {
    public final String a;

    public y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && jl40.l(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("CreateNewProfile(registrationUrl="), this.a, ')');
    }
}
