package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes2.dex */
public final class b1 {
    public static final a1 Companion = new a1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ b1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, z0.a.getDescriptor());
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
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return jl40.l(this.a, b1Var.a) && jl40.l(this.b, b1Var.b) && jl40.l(this.c, b1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialActionData(provider=");
        sb.append(this.a);
        sb.append(", socialUrl=");
        sb.append(this.b);
        sb.append(", amUrl=");
        return b64.p(sb, this.c, ')');
    }
}
