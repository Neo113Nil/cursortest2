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
public final class l2 {
    public static final k2 Companion = new k2();
    public static final KSerializer[] c = {null, new p53(a2.a, 0)};
    public final String a;
    public final List b;

    public /* synthetic */ l2(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, j2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return jl40.l(this.a, l2Var.a) && jl40.l(this.b, l2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", experiments=");
        return unr0.t(sb, this.b, ')');
    }
}
