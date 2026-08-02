package com.yandex.passport.api;

import defpackage.unr0;

/* loaded from: classes15.dex */
public final class n2 {
    public final PassportTheme a;
    public final i b;
    public final boolean c;

    public n2(PassportTheme passportTheme, i iVar, boolean z) {
        this.a = passportTheme;
        this.b = iVar;
        this.c = z;
    }

    public final i a() {
        return this.b;
    }

    public final PassportTheme b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.a == n2Var.a && this.b.equals(n2Var.b) && this.c == n2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassportUpgradePhonishProperties(theme=");
        sb.append(this.a);
        sb.append(", account=");
        sb.append(this.b);
        sb.append(", isRequiredUpgrade=");
        return unr0.u(sb, this.c, ')');
    }
}
