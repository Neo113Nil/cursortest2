package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class f0 implements i0 {
    public final String a;
    public final String b;
    public final String c;

    public f0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return jl40.l(this.a, f0Var.a) && jl40.l(this.b, f0Var.b) && jl40.l(this.c, f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialAction(provider=");
        sb.append(this.a);
        sb.append(", socialUrl=");
        sb.append(this.b);
        sb.append(", amUrl=");
        return b64.p(sb, this.c, ')');
    }
}
