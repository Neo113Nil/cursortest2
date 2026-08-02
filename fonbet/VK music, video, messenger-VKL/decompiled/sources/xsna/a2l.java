package xsna;

/* compiled from: BonusPointsExpireUtils.kt */
/* loaded from: classes5.dex */
public final class a2l {
    public final int a;

    public a2l(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2l) && this.a == ((a2l) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("DAYS(days="), this.a, ')');
    }
}
