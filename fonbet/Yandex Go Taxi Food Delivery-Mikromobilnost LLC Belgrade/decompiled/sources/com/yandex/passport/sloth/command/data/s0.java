package com.yandex.passport.sloth.command.data;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.qje;
import defpackage.smw0;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class s0 {
    public static final r0 Companion = new r0();
    public static final KSerializer[] c;
    public final String a;
    public final Map b;

    static {
        auu0 auu0Var = auu0.a;
        c = new KSerializer[]{null, new k8u(auu0Var, auu0Var, 1)};
    }

    public /* synthetic */ s0(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, q0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return jl40.l(this.a, s0Var.a) && jl40.l(this.b, s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMetricsData(identifier=");
        sb.append(this.a);
        sb.append(", params=");
        return smw0.n(sb, this.b, ')');
    }
}
