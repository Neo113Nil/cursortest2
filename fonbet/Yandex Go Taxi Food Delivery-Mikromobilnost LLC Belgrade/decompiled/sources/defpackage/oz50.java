package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class oz50 {
    public final int a;
    public final long b;
    public final long c;
    public final zu50 d;
    public final ojt0 e;
    public final Object f;

    public /* synthetic */ oz50(int i, long j, long j2, zu50 zu50Var, int i2) {
        this((i2 & 1) != 0 ? 200 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? zu50.b : zu50Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz50)) {
            return false;
        }
        oz50 oz50Var = (oz50) obj;
        return this.a == oz50Var.a && this.b == oz50Var.b && this.c == oz50Var.c && jl40.l(this.d, oz50Var.d) && jl40.l(this.e, oz50Var.e) && jl40.l(this.f, oz50Var.f);
    }

    public final int hashCode() {
        int d = unr0.d(qv10.c(qv10.c(this.a * 31, 31, this.b), 31, this.c), 31, this.d.a);
        ojt0 ojt0Var = this.e;
        int hashCode = (d + (ojt0Var == null ? 0 : ojt0Var.a.hashCode())) * 31;
        Object obj = this.f;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        x4e.A(this.c, ", responseMillis=", ", headers=", sb);
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        return x4e.h(sb, this.f, Extension.C_BRAKE);
    }

    public oz50(int i, long j, long j2, zu50 zu50Var, ojt0 ojt0Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = zu50Var;
        this.e = ojt0Var;
        this.f = obj;
    }

    public oz50() {
        this(0, 0L, 0L, null, 63);
    }
}
