package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gq50 {
    public final boolean a;
    public final vll0 b;
    public final List c;

    public gq50(boolean z, vll0 vll0Var, List list) {
        this.a = z;
        this.b = vll0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq50)) {
            return false;
        }
        gq50 gq50Var = (gq50) obj;
        return this.a == gq50Var.a && this.b.equals(gq50Var.b) && jl40.l(this.c, gq50Var.c);
    }

    public final int hashCode() {
        return unr0.c((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 961, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConfig(isConsoleLoggingEnabled=");
        sb.append(this.a);
        sb.append(", sslContextCreator=");
        sb.append(this.b);
        sb.append(", interceptors=");
        return ly3.s(sb, this.c, ", stethoProxy=null, dns=null)");
    }
}
