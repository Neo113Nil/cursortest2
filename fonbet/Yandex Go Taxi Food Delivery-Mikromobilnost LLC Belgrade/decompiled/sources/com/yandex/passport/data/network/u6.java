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
/* loaded from: classes8.dex */
public final class u6 {
    public static final t6 Companion = new t6();
    public static final KSerializer[] c = {null, new p53(auu0.a, 0)};
    public final String a;
    public final List b;

    public /* synthetic */ u6(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, s6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return jl40.l(this.a, u6Var.a) && jl40.l(this.b, u6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", cookies=");
        return unr0.t(sb, this.b, ')');
    }
}
