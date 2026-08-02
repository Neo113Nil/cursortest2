package com.yandex.passport.api;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class o3 {
    public final PassportUidImpl a;
    public final PassportTheme b;

    public o3(PassportTheme passportTheme, PassportUidImpl passportUidImpl) {
        this.a = passportUidImpl;
        this.b = passportTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return jl40.l(this.a, o3Var.a) && this.b == o3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpgradeProperties(uid=" + this.a + ", theme=" + this.b + ')';
    }

    public /* synthetic */ o3(PassportUidImpl passportUidImpl) {
        this(PassportTheme.FOLLOW_SYSTEM, passportUidImpl);
    }
}
