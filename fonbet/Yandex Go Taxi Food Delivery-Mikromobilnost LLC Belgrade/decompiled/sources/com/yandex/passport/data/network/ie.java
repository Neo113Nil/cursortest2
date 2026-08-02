package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class ie {
    public static final he Companion = new he();
    public final String a;
    public final ee b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ ie(int i, String str, ee eeVar, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ge.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = eeVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return jl40.l(this.a, ieVar.a) && jl40.l(this.b, ieVar.b) && this.c == ieVar.c && this.d == ieVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        sb.append(this.b);
        sb.append(", validForCall=");
        sb.append(this.c);
        sb.append(", validForFlashCall=");
        return unr0.u(sb, this.d, ')');
    }
}
