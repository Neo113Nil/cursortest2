package com.yandex.passport.internal.usecase.ui;

import defpackage.jl40;
import defpackage.smw0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {
    public final List a;
    public final Map b;

    public d(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(accounts=");
        sb.append(this.a);
        sb.append(", children=");
        return smw0.n(sb, this.b, ')');
    }
}
