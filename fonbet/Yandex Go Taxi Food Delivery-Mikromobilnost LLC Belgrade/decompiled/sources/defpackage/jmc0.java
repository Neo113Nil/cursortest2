package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class jmc0 implements nmc0 {
    public final String a;
    public final boolean b;
    public final Map c;

    public jmc0(String str, boolean z, Map map) {
        this.a = str;
        this.b = z;
        this.c = map;
    }

    public final String a() {
        return this.a;
    }

    public final Map b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmc0)) {
            return false;
        }
        jmc0 jmc0Var = (jmc0) obj;
        return jl40.l(this.a, jmc0Var.a) && this.b == jmc0Var.b && jl40.l(this.c, jmc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemotePerformAction(actionId=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        sb.append(this.b);
        sb.append(", meta=");
        return smw0.n(sb, this.c, ')');
    }
}
