package xsna;

/* compiled from: OneVideoIncreaseQualityProvider.kt */
/* loaded from: classes8.dex */
public final class kl80 {
    public final jo20 a;
    public final jo20 b;

    public kl80(jo20 jo20Var, jo20 jo20Var2) {
        this.a = jo20Var;
        this.b = jo20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl80)) {
            return false;
        }
        kl80 kl80Var = (kl80) obj;
        return this.a.equals(kl80Var.a) && this.b.equals(kl80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OneVideoIncreaseQualityProvider(minIncreaseDurationProvider=" + this.a + ", minRetainDurationProvider=" + this.b + ")";
    }
}
