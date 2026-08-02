package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class g0 {
    public static final f0 Companion = new f0();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ g0(int i, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, e0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && this.b == g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(isFaceRecognized=");
        sb.append(this.a);
        sb.append(", isFlowSuccessful=");
        return unr0.u(sb, this.b, ')');
    }
}
