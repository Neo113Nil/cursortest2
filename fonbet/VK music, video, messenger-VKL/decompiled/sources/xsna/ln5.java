package xsna;

/* compiled from: AutoValue_MeterProviderSharedState.java */
/* loaded from: classes8.dex */
public final class ln5 extends dj20 {
    public final cvf a;
    public final gag0 b;
    public final long c;
    public final d4q d;

    public ln5(cvf cvfVar, gag0 gag0Var, long j, d4q d4qVar) {
        if (cvfVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = cvfVar;
        if (gag0Var == null) {
            throw new NullPointerException("Null resource");
        }
        this.b = gag0Var;
        this.c = j;
        if (d4qVar == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.d = d4qVar;
    }

    @Override // xsna.dj20
    public final cvf a() {
        return this.a;
    }

    @Override // xsna.dj20
    public final d4q b() {
        return this.d;
    }

    @Override // xsna.dj20
    public final gag0 c() {
        return this.b;
    }

    @Override // xsna.dj20
    public final long d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dj20)) {
            return false;
        }
        dj20 dj20Var = (dj20) obj;
        return this.a.equals(dj20Var.a()) && this.b.equals(dj20Var.c()) && this.c == dj20Var.d() && this.d.equals(dj20Var.b());
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + this.a + ", resource=" + this.b + ", startEpochNanos=" + this.c + ", exemplarFilter=" + this.d + "}";
    }
}
