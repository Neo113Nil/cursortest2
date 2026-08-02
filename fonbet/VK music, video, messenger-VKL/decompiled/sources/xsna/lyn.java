package xsna;

/* compiled from: DonutBlock.kt */
/* loaded from: classes14.dex */
public final class lyn {
    public final String a;
    public final String b;

    public lyn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyn)) {
            return false;
        }
        lyn lynVar = (lyn) obj;
        return epx.f(this.a, lynVar.a) && epx.f(this.b, lynVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutBlock(subscriptionTitle=");
        sb.append(this.a);
        sb.append(", goalsTitle=");
        return ho8.a(sb, this.b, ')');
    }
}
