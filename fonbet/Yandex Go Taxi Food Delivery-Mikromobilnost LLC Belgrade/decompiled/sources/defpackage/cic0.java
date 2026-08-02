package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class cic0 implements eic0 {
    public final String a;
    public final String b;
    public final Map c;

    public cic0(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @Override // defpackage.eic0
    public final String a() {
        return this.a;
    }

    public final Map b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cic0)) {
            return false;
        }
        cic0 cic0Var = (cic0) obj;
        return jl40.l(this.a, cic0Var.a) && jl40.l(this.b, cic0Var.b) && jl40.l(this.c, cic0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSpecific(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", items=");
        return smw0.n(sb, this.c, ')');
    }
}
