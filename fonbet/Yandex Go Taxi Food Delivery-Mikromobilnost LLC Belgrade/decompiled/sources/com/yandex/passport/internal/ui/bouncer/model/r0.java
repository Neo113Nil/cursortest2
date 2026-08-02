package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class r0 implements a1 {
    public final Throwable a;
    public final String b;

    public r0(Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.a.equals(r0Var.a) && jl40.l(this.b, r0Var.b);
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
