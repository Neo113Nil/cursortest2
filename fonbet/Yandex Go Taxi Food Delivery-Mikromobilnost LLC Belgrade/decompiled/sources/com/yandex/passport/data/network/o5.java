package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class o5 {
    public static final n5 Companion = new n5();
    public final String a;
    public final long b;

    public /* synthetic */ o5(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, m5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return jl40.l(this.a, o5Var.a) && this.b == o5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockVpnEntryDTO(appId=");
        sb.append(this.a);
        sb.append(", version=");
        return b64.o(sb, this.b, ')');
    }
}
