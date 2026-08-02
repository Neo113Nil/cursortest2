package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class fb {
    public static final eb Companion = new eb();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ fb(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, db.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return jl40.l(this.a, fbVar.a) && jl40.l(this.b, fbVar.b) && jl40.l(this.c, fbVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", clientToken=");
        return b64.p(sb, this.c, ')');
    }
}
