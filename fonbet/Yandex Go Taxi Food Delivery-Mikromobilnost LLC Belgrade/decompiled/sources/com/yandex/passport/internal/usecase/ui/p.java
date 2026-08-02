package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class p {
    public final Environment a;
    public final String b;

    public p(String str, Environment environment) {
        this.a = environment;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && jl40.l(this.b, pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        return b64.p(sb, this.b, ')');
    }
}
