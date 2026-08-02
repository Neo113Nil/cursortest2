package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class lg6 {
    public final wp2 a;
    public final qor b;
    public final sls c;

    public lg6(wp2 wp2Var, qor qorVar, sls slsVar) {
        this.a = wp2Var;
        this.b = qorVar;
        this.c = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg6)) {
            return false;
        }
        lg6 lg6Var = (lg6) obj;
        return jl40.l(this.a, lg6Var.a) && jl40.l(this.b, lg6Var.b) && jl40.l(this.c, lg6Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sls slsVar = this.c;
        return hashCode + (slsVar == null ? 0 : slsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetScrim(color=");
        sb.append(this.a);
        sb.append(", visibilityState=");
        sb.append(this.b);
        sb.append(", outsideTouchCallback=");
        return ly3.r(sb, this.c, Extension.C_BRAKE);
    }
}
