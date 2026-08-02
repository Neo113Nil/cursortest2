package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes8.dex */
public final class y4 {
    public static final x4 Companion = new x4();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ y4(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return jl40.l(this.a, y4Var.a) && jl40.l(this.b, y4Var.b) && this.c == y4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return oyr.s(sb, this.c, ')');
    }
}
