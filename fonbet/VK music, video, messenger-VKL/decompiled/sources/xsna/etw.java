package xsna;

/* compiled from: IncreaseQualityConfigProvider.kt */
/* loaded from: classes8.dex */
public final class etw {
    public final jo20 a;
    public final jo20 b;

    public etw(kl80 kl80Var) {
        jo20 jo20Var = kl80Var.a;
        jo20 jo20Var2 = kl80Var.b;
        this.a = jo20Var;
        this.b = jo20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etw)) {
            return false;
        }
        etw etwVar = (etw) obj;
        return this.a.equals(etwVar.a) && this.b.equals(etwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IncreaseQualityConfigProvider(minIncreaseDurationProvider=" + this.a + ", minRetainDurationProvider=" + this.b + ")";
    }
}
