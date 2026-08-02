package xsna;

/* compiled from: PriorityBlockUIModel.kt */
/* loaded from: classes5.dex */
public final class rvw {
    public final String a;
    public final String b;

    public rvw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvw)) {
            return false;
        }
        rvw rvwVar = (rvw) obj;
        return epx.f(this.a, rvwVar.a) && epx.f(this.b, rvwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsMarketPromote(text=");
        sb.append(this.a);
        sb.append(", buttonText=");
        return ho8.a(sb, this.b, ')');
    }
}
