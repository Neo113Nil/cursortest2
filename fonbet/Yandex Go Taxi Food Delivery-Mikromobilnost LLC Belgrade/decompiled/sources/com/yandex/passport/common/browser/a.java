package com.yandex.passport.common.browser;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class a {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OpenUrlSuccessResult(targetPackageName="), this.a, ')');
    }
}
