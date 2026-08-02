package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o201 {
    public final p201 a;
    public final q201 b;
    public final List c;
    public final l201 d;
    public final boolean e;
    public final long f;
    public final String g;

    public o201(p201 p201Var, q201 q201Var, List list, l201 l201Var, boolean z, long j, String str) {
        this.a = p201Var;
        this.b = q201Var;
        this.c = list;
        this.d = l201Var;
        this.e = z;
        this.f = j;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o201)) {
            return false;
        }
        o201 o201Var = (o201) obj;
        return jl40.l(this.a, o201Var.a) && jl40.l(this.b, o201Var.b) && jl40.l(this.c, o201Var.c) && jl40.l(this.d, o201Var.d) && this.e == o201Var.e && this.f == o201Var.f && jl40.l(this.g, o201Var.g);
    }

    public final int hashCode() {
        int c = qv10.c(unr0.e((this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackerRemoteData(driverInfo=");
        sb.append(this.a);
        sb.append(", driverPath=");
        sb.append(this.b);
        sb.append(", track=");
        sb.append(this.c);
        sb.append(", geometry=");
        sb.append(this.d);
        sb.append(", staticIcon=");
        sb.append(this.e);
        sb.append(", requestPollingDelayMs=");
        sb.append(this.f);
        return unr0.r(sb, ", traceId=", this.g, Extension.C_BRAKE);
    }
}
