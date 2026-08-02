package com.yandex.passport.common.ebs;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class l extends n {
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
        return b64.p(new StringBuilder("Success(trackId="), this.a, ')');
    }
}
