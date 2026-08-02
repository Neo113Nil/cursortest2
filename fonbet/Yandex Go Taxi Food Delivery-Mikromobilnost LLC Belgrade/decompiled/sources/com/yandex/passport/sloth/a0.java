package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class a0 implements i0 {
    public final Throwable a;
    public final String b;

    public a0(Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a.equals(a0Var.a) && jl40.l(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failed(throwable=");
        sb.append(this.a);
        sb.append(", tag=");
        return b64.p(sb, this.b, ')');
    }
}
