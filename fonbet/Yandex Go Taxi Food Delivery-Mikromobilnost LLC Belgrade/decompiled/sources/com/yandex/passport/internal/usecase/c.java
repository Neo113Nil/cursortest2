package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class c {
    public final Uid a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    static {
        int i = Uid.$stable;
    }

    public c(int i, Uid uid, String str, String str2, String str3) {
        this.a = uid;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.e) + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", flowId=");
        sb.append(this.b);
        sb.append(", serviceId=");
        sb.append(this.c);
        sb.append(", biometricSessionId=");
        sb.append(this.d);
        sb.append(", attemptNumber=");
        return oyr.s(sb, this.e, ')');
    }
}
