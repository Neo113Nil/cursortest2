package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class d3 {
    public static final c3 Companion = new c3();
    public final String a;
    public final String b;

    public /* synthetic */ d3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return jl40.l(this.a, d3Var.a) && jl40.l(this.b, d3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemedIcon(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return b64.p(sb, this.b, ')');
    }
}
