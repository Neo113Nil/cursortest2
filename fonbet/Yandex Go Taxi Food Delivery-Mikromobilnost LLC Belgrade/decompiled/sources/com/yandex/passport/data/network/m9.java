package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.qje;
import defpackage.smw0;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class m9 {
    public static final l9 Companion = new l9();
    public static final KSerializer[] b;
    public final Map a;

    static {
        auu0 auu0Var = auu0.a;
        b = new KSerializer[]{new k8u(auu0Var, auu0Var, 1)};
    }

    public /* synthetic */ m9(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            qje.Z(i, 1, k9.a.getDescriptor());
            throw null;
        }
    }

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9) && jl40.l(this.a, ((m9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("Result(payload="), this.a, ')');
    }
}
