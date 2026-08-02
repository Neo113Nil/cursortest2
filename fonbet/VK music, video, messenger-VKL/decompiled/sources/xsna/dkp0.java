package xsna;

/* compiled from: TransformFallbackStat.kt */
/* loaded from: classes3.dex */
public final class dkp0 {
    public final zu10 a;

    public dkp0(zu10 zu10Var) {
        this.a = zu10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkp0) && epx.f(this.a, ((dkp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TransformFallbackStat(fallbackCauseErrorStat=" + this.a + ')';
    }
}
