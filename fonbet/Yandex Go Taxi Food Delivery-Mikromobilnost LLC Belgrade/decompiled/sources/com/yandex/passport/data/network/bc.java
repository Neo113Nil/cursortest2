package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.qv10;

@gsq0
/* loaded from: classes15.dex */
public final class bc {
    public static final ac Companion = new ac();
    public final String a;
    public final long b;
    public final String c;
    public final int d;

    public /* synthetic */ bc(long j, String str, int i, int i2, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, zb.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = -1;
        } else {
            this.d = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return jl40.l(this.a, bcVar.a) && this.b == bcVar.b && jl40.l(this.c, bcVar.c) && this.d == bcVar.d;
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.d) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", denyResendUntil=");
        sb.append(this.b);
        sb.append(", callingNumberTemplate=");
        sb.append(this.c);
        sb.append(", codeLength=");
        return oyr.s(sb, this.d, ')');
    }
}
