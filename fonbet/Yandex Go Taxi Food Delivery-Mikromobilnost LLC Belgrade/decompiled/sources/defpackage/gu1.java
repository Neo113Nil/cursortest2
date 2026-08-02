package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class gu1 extends tg2 {
    public final String a;
    public final long b;
    public final long c;
    public final InterpolationType d;
    public final lu1 e;

    public gu1(String str, long j, long j2, InterpolationType interpolationType, lu1 lu1Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = interpolationType;
        this.e = lu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu1)) {
            return false;
        }
        gu1 gu1Var = (gu1) obj;
        return jl40.l(this.a, gu1Var.a) && this.b == gu1Var.b && this.c == gu1Var.c && this.d == gu1Var.d && jl40.l(this.e, gu1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("AlphaAnimation(type=", this.a, ", duration=", this.b);
        x4e.A(this.c, ", delay=", ", interpolator=", l);
        l.append(this.d);
        l.append(", alpha=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
