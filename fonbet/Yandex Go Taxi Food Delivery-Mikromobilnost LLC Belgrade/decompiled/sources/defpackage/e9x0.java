package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e9x0 implements r9x0 {
    public final String a;
    public final vu0 b;
    public final d51 c;

    public e9x0(String str, vu0 vu0Var, d51 d51Var) {
        this.a = str;
        this.b = vu0Var;
        this.c = d51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9x0)) {
            return false;
        }
        e9x0 e9x0Var = (e9x0) obj;
        return jl40.l(this.a, e9x0Var.a) && jl40.l(this.b, e9x0Var.b) && this.c.equals(e9x0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        vu0 vu0Var = this.b;
        return this.c.hashCode() + ((hashCode + (vu0Var != null ? vu0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OpenMap(metricaLabel=" + this.a + ", addressFlow=" + this.b + ", routeType=" + this.c + Extension.C_BRAKE;
    }
}
