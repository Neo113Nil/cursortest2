package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class o0 implements q0 {
    public final String a;
    public final String b;

    public o0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return jl40.l(this.a, o0Var.a) && jl40.l(this.b, o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return b64.p(new StringBuilder("OpenUrl(url=hidden, purpose="), this.b, ')');
    }
}
