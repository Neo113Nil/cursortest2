package com.yandex.passport.data.network.token;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class d1 implements com.yandex.passport.data.models.p {
    public static final c1 Companion = new c1();
    public final String a;
    public final y0 b;

    public /* synthetic */ d1(int i, String str, y0 y0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = y0Var;
    }

    @Override // com.yandex.passport.data.models.p
    public final String a() {
        return this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return jl40.l(this.a, d1Var.a) && jl40.l(this.b, d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(status=" + this.a + ", oAuth=" + this.b + ')';
    }
}
