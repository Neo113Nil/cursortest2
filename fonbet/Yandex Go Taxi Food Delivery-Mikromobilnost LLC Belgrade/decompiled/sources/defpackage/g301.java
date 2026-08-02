package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class g301 {
    public final v401 a;
    public final List b;
    public final f401 c;

    public g301(v401 v401Var, List list, f401 f401Var) {
        this.a = v401Var;
        this.b = list;
        this.c = f401Var;
    }

    public final List a() {
        return this.b;
    }

    public final f401 b() {
        return this.c;
    }

    public final v401 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g301)) {
            return false;
        }
        g301 g301Var = (g301) obj;
        return jl40.l(this.a, g301Var.a) && jl40.l(this.b, g301Var.b) && jl40.l(this.c, g301Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        f401 f401Var = this.c;
        return c + (f401Var == null ? 0 : f401Var.hashCode());
    }

    public final String toString() {
        return "TrackingCard(status=" + this.a + ", extraButtons=" + this.b + ", ratingSelector=" + this.c + Extension.C_BRAKE;
    }
}
