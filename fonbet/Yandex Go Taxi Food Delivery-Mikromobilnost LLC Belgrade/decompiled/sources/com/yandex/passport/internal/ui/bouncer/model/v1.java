package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class v1 implements c2 {
    public final String a;
    public final String b;
    public final Throwable c;

    public v1(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return jl40.l(this.a, v1Var.a) && jl40.l(this.b, v1Var.b) && jl40.l(this.c, v1Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        return b + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(tag=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", throwable=");
        return unr0.s(sb, this.c, ')');
    }
}
