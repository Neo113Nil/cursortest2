package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.qje;
import java.util.HashMap;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class u2 {
    public static final t2 Companion = new t2();
    public static final KSerializer[] d;
    public final String a;
    public final HashMap b;
    public final HashMap c;

    static {
        auu0 auu0Var = auu0.a;
        d = new KSerializer[]{null, new k8u(auu0Var, auu0Var, 0), new k8u(auu0Var, b3.a, 0)};
    }

    public /* synthetic */ u2(int i, String str, HashMap hashMap, HashMap hashMap2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, s2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return jl40.l(this.a, u2Var.a) && jl40.l(this.b, u2Var.b) && jl40.l(this.c, u2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BadgeSpecification(name=" + this.a + ", strings=" + this.b + ", icons=" + this.c + ')';
    }
}
