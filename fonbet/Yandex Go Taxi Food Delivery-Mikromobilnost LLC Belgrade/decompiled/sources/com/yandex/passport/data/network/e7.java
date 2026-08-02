package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class e7 {
    public static final d7 Companion = new d7();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public /* synthetic */ e7(int i, int i2, int i3, String str, String str2, String str3) {
        if (11 != (i & 11)) {
            qje.Z(i, 11, c7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = Integer.MAX_VALUE;
        } else {
            this.e = i3;
        }
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return jl40.l(this.a, e7Var.a) && jl40.l(this.b, e7Var.b) && jl40.l(this.c, e7Var.c) && this.d == e7Var.d && this.e == e7Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.e) + oyr.b(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(deviceCode=");
        sb.append(this.a);
        sb.append(", userCode=");
        sb.append(this.b);
        sb.append(", verificationUrl=");
        sb.append(this.c);
        sb.append(", interval=");
        sb.append(this.d);
        sb.append(", expiresIn=");
        return oyr.s(sb, this.e, ')');
    }
}
