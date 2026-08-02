package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class e1 {
    public static final d1 Companion = new d1();
    public static final KSerializer[] c = {null, new p53(auu0.a, 0)};
    public final String a;
    public final List b;

    public /* synthetic */ e1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, c1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return jl40.l(this.a, e1Var.a) && jl40.l(this.b, e1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", countries=");
        return unr0.t(sb, this.b, ')');
    }
}
