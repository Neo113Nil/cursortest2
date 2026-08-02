package defpackage;

/* loaded from: classes11.dex */
public final class ohl {
    public final int a;
    public final int b;

    public ohl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohl)) {
            return false;
        }
        ohl ohlVar = (ohl) obj;
        return this.a == ohlVar.a && this.b == ohlVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineBounds(top=");
        sb.append(this.a);
        sb.append(", bottom=");
        return oyr.s(sb, this.b, ')');
    }
}
