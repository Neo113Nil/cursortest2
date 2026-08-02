package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes8.dex */
public final class b9 {
    public static final a9 Companion = new a9();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ b9(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, z8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return jl40.l(this.a, b9Var.a) && jl40.l(this.b, b9Var.b) && jl40.l(this.c, b9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", state=");
        return b64.p(sb, this.c, ')');
    }
}
