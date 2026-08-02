package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class f0 {
    public final Environment a;
    public final String b;
    public final String c;

    public f0(Environment environment, String str, String str2) {
        this.a = environment;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && this.b.equals(f0Var.b) && jl40.l(this.c, f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", clientId=");
        return b64.p(sb, this.c, ')');
    }
}
