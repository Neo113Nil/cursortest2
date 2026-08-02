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
public final class r2 {
    public static final q2 Companion = new q2();
    public static final KSerializer[] d = {null, null, new p53(auu0.a, 0)};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ r2(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, p2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return jl40.l(this.a, r2Var.a) && jl40.l(this.b, r2Var.b) && jl40.l(this.c, r2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppConfigurations(package=");
        sb.append(this.a);
        sb.append(", platform=");
        sb.append(this.b);
        sb.append(", badges=");
        return unr0.t(sb, this.c, ')');
    }
}
