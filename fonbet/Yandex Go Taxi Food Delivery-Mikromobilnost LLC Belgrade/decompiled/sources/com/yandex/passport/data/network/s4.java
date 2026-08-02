package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes8.dex */
public final class s4 {
    public static final r4 Companion = new r4();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ s4(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, q4.a.getDescriptor());
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
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return jl40.l(this.a, s4Var.a) && jl40.l(this.b, s4Var.b) && this.c == s4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", codeValue=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return oyr.s(sb, this.c, ')');
    }
}
