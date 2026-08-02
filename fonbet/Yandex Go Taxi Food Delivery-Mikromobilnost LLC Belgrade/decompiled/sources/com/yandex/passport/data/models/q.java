package com.yandex.passport.data.models;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes15.dex */
public final class q {
    public final List a;
    public final List b;

    public q(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jl40.l(this.a, qVar.a) && jl40.l(this.b, qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlTemplate(path=");
        sb.append(this.a);
        sb.append(", query=");
        return unr0.t(sb, this.b, ')');
    }
}
