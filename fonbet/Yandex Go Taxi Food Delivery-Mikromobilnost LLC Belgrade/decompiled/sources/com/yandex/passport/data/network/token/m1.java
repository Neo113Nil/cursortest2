package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class m1 implements com.yandex.passport.data.models.p {
    public static final l1 Companion = new l1();
    public final String a;
    public final String b;

    public /* synthetic */ m1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, k1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // com.yandex.passport.data.models.p
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return jl40.l(this.a, m1Var.a) && jl40.l(this.b, m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", token=");
        return b64.p(sb, this.b, ')');
    }
}
