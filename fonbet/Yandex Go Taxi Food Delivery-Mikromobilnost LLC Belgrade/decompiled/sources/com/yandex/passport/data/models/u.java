package com.yandex.passport.data.models;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class u {
    public final VersionRule$Sign a;
    public final String b;

    public u(VersionRule$Sign versionRule$Sign, String str) {
        this.a = versionRule$Sign;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && jl40.l(this.b, uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRule(sign=");
        sb.append(this.a);
        sb.append(", version=");
        return b64.p(sb, this.b, ')');
    }
}
