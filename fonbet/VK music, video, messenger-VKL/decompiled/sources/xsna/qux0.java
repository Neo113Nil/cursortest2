package xsna;

/* compiled from: HashtagStartPositionChanged.kt */
/* loaded from: classes18.dex */
public final class qux0 {
    public final int a;
    public final int b;
    public final CharSequence c;

    public qux0(int i, int i2, CharSequence charSequence) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qux0)) {
            return false;
        }
        qux0 qux0Var = (qux0) obj;
        return this.a == qux0Var.a && this.b == qux0Var.b && epx.f(this.c, qux0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WordHolder(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", word=");
        return thl0.a(sb, this.c, ')');
    }
}
