package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ox00 {
    public final String a;
    public final nx00 b;
    public final long c;
    public final mx00 d;
    public final sls e;

    public ox00(String str, nx00 nx00Var, long j, mx00 mx00Var, sls slsVar) {
        this.a = str;
        this.b = nx00Var;
        this.c = j;
        this.d = mx00Var;
        this.e = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox00)) {
            return false;
        }
        ox00 ox00Var = (ox00) obj;
        return jl40.l(this.a, ox00Var.a) && this.b.equals(ox00Var.b) && this.c == ox00Var.c && jl40.l(this.d, ox00Var.d) && jl40.l(this.e, ox00Var.e);
    }

    public final int hashCode() {
        int c = qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        mx00 mx00Var = this.d;
        return this.e.hashCode() + ((c + (mx00Var == null ? 0 : mx00Var.hashCode())) * 31);
    }

    public final String toString() {
        return "MarketingItemWidgetModel(id=" + this.a + ", panelLayout=" + this.b + ", waitBeforeScrollDurationMillis=" + this.c + ", advertisementTag=" + this.d + ", onClick=" + this.e + Extension.C_BRAKE;
    }
}
