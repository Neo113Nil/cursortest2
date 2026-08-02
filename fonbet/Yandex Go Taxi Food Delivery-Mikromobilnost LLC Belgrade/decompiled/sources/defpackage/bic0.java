package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class bic0 implements eic0 {
    public final String a;
    public final String b;
    public final Map c;

    public bic0(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @Override // defpackage.eic0
    public final String a() {
        return "";
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bic0)) {
            return false;
        }
        bic0 bic0Var = (bic0) obj;
        return jl40.l(this.a, bic0Var.a) && jl40.l(this.b, bic0Var.b) && jl40.l(this.c, bic0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformAction(actionContext=, actionId=");
        sb.append(this.a);
        sb.append(", actionToken=");
        sb.append(this.b);
        sb.append(", actionMeta=");
        return smw0.n(sb, this.c, ')');
    }
}
