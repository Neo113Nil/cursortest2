package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes2.dex */
public final class p0 {
    public static final o0 Companion = new o0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ p0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, n0.a.getDescriptor());
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
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return jl40.l(this.a, p0Var.a) && jl40.l(this.b, p0Var.b) && jl40.l(this.c, p0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveLoginCredentialsData(login=");
        sb.append(this.a);
        sb.append(", password=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        return b64.p(sb, this.c, ')');
    }
}
