package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class e {
    public final Uid a;
    public final String b;
    public final String c;
    public final String d;

    static {
        int i = Uid.$stable;
    }

    public e(Uid uid, String str, String str2, String str3) {
        this.a = uid;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && this.c.equals(eVar.c) && jl40.l(this.d, eVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", biometricSessionId=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", flowId=");
        return b64.p(sb, this.d, ')');
    }
}
