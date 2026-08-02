package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class x0 implements a1 {
    public final String a;
    public final String b;

    public x0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return jl40.l(this.a, x0Var.a) && jl40.l(this.b, x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothOpenUrlResult(url=");
        uw51.y(sb, this.a, ", purpose=");
        return b64.p(sb, this.b, ')');
    }
}
