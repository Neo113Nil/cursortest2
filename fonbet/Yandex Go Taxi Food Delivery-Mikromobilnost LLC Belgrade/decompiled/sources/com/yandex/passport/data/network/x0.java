package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes8.dex */
public final class x0 {
    public static final w0 Companion = new w0();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ x0(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, v0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return jl40.l(this.a, x0Var.a) && this.b == x0Var.b && this.c == x0Var.c && this.d == x0Var.d && this.e == x0Var.e && jl40.l(this.f, x0Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", isComplete=");
        sb.append(this.b);
        sb.append(", isCompletionAvailable=");
        sb.append(this.c);
        sb.append(", isCompletionRecommended=");
        sb.append(this.d);
        sb.append(", isCompletionRequired=");
        sb.append(this.e);
        sb.append(", completionUrl=");
        return b64.p(sb, this.f, ')');
    }

    public x0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str2;
    }
}
