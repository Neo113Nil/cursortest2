package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class o implements n0 {
    public final String a;
    public final String b;
    public final Throwable c;

    public o(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jl40.l(this.a, oVar.a) && jl40.l(this.b, oVar.b) && jl40.l(this.c, oVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        return b + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(tag=");
        sb.append(this.a);
        sb.append(", publicDescription=");
        sb.append(this.b);
        sb.append(", th=");
        return unr0.s(sb, this.c, ')');
    }
}
