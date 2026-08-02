package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class x0 implements a1 {
    public final String a;
    public final String b;
    public final String c;

    public x0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return jl40.l(this.a, x0Var.a) && jl40.l(this.b, x0Var.b) && jl40.l(this.c, x0Var.c);
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
