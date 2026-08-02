package xsna;

/* compiled from: MarketMultiPickerSideEffect.kt */
/* loaded from: classes18.dex */
public final class x810 implements v810 {
    public final a910 a;

    public x810(a910 a910Var) {
        this.a = a910Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x810) && epx.f(this.a, ((x810) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SaveMetrics(techMetrics=" + this.a + ')';
    }
}
