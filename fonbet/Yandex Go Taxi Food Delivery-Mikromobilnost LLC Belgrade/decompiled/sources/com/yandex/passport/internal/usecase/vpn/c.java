package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class c {
    public final Environment a;
    public final String b;

    public c(String str, Environment environment) {
        this.a = environment;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && jl40.l(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", placemark=");
        return b64.p(sb, this.b, ')');
    }
}
