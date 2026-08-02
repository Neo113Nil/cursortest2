package defpackage;

import coil.graphics.DataSource;

/* loaded from: classes10.dex */
public final class pjt0 extends iwq {
    public final zev a;
    public final String b;
    public final DataSource c;

    public pjt0(zev zevVar, String str, DataSource dataSource) {
        this.a = zevVar;
        this.b = str;
        this.c = dataSource;
    }

    public final DataSource a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final zev c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjt0)) {
            return false;
        }
        pjt0 pjt0Var = (pjt0) obj;
        return this.a.equals(pjt0Var.a) && jl40.l(this.b, pjt0Var.b) && this.c == pjt0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
