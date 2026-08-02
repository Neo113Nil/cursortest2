package com.yandex.passport.internal.properties;

import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c0 {
    public final List a;
    public final List b;
    public final Map c;

    public c0(List list, List list2, Map map) {
        this.a = list;
        this.b = list2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return jl40.l(this.a, c0Var.a) && jl40.l(this.b, c0Var.b) && jl40.l(this.c, c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VpnBlockerProperties(productLocation=");
        sb.append(this.a);
        sb.append(", deviceGeoLocation=");
        sb.append(this.b);
        sb.append(", additionalParams=");
        return smw0.n(sb, this.c, ')');
    }
}
