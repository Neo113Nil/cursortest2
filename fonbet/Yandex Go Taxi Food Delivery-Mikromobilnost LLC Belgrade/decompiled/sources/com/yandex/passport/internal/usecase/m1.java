package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class m1 {
    public final Environment a;
    public final String b;

    public m1(String str, Environment environment) {
        this.a = environment;
        this.b = str;
    }

    public final Environment a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.a == m1Var.a && jl40.l(this.b, m1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        return b64.p(sb, this.b, ')');
    }
}
