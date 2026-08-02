package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class c2 {
    public static final b2 Companion = new b2();
    public final String a;
    public final g2 b;

    public /* synthetic */ c2(int i, String str, g2 g2Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, a2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = g2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return jl40.l(this.a, c2Var.a) && jl40.l(this.b, c2Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Experiment(handler=" + this.a + ", passport=" + this.b + ')';
    }
}
