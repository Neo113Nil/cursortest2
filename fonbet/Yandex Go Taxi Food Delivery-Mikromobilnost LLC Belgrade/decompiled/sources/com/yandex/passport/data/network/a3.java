package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class a3 {
    public static final z2 Companion = new z2();
    public static final KSerializer[] c = {new p53(s2.a, 0), new p53(p2.a, 0)};
    public final List a;
    public final List b;

    public /* synthetic */ a3(List list, List list2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, y2.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return jl40.l(this.a, a3Var.a) && jl40.l(this.b, a3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(badgesSpecification=");
        sb.append(this.a);
        sb.append(", appsConfiguration=");
        return unr0.t(sb, this.b, ')');
    }
}
