package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fa4 {
    public final rr51 a;
    public final ea4 b;

    public fa4(rr51 rr51Var, ea4 ea4Var) {
        this.a = rr51Var;
        this.b = ea4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa4)) {
            return false;
        }
        fa4 fa4Var = (fa4) obj;
        return jl40.l(this.a, fa4Var.a) && jl40.l(this.b, fa4Var.b);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int hashCode = (rr51Var == null ? 0 : rr51Var.hashCode()) * 31;
        ea4 ea4Var = this.b;
        return hashCode + (ea4Var != null ? ea4Var.hashCode() : 0);
    }

    public final String toString() {
        return "AutotopupWidgetSummaryEntity(divkitWidget=" + this.a + ", nativeWidget=" + this.b + Extension.C_BRAKE;
    }
}
