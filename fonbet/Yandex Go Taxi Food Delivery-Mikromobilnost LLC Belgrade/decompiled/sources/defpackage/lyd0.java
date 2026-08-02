package defpackage;

import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechPollerResultStrategy;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lyd0 {
    public final long a;
    public final double b;
    public final long c;
    public final e3n d;
    public final TechEvents$TechPollerResultStrategy e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lyd0(long j, e3n e3nVar, TechEvents$TechPollerResultStrategy techEvents$TechPollerResultStrategy, int i) {
        this(j, 2.0d, kp50.U(15, DurationUnit.SECONDS), (i & 8) != 0 ? null : e3nVar, techEvents$TechPollerResultStrategy);
        o430 o430Var = e3n.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyd0)) {
            return false;
        }
        lyd0 lyd0Var = (lyd0) obj;
        return e3n.d(this.a, lyd0Var.a) && Double.compare(this.b, lyd0Var.b) == 0 && e3n.d(this.c, lyd0Var.c) && jl40.l(this.d, lyd0Var.d) && this.e == lyd0Var.e;
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        int c = qv10.c(unr0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        e3n e3nVar = this.d;
        return this.e.hashCode() + ((c + (e3nVar == null ? 0 : Long.hashCode(e3nVar.a))) * 31);
    }

    public final String toString() {
        return "PollerBackoffParams(base=" + e3n.p(this.a) + ", factor=" + this.b + ", cap=" + e3n.p(this.c) + ", initialDelay=" + this.d + ", strategy=" + this.e + Extension.C_BRAKE;
    }

    public lyd0(long j, double d, long j2, e3n e3nVar, TechEvents$TechPollerResultStrategy techEvents$TechPollerResultStrategy) {
        this.a = j;
        this.b = d;
        this.c = j2;
        this.d = e3nVar;
        this.e = techEvents$TechPollerResultStrategy;
    }
}
