package com.yandex.passport.sloth.url;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class o extends p {
    public final String a;

    public o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && jl40.l(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ShowErrorAndClose(error="), this.a, ')');
    }
}
