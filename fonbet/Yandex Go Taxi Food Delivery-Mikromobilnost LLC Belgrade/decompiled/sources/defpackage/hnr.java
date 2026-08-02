package defpackage;

/* loaded from: classes10.dex */
public final class hnr implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hnr hnrVar = (hnr) obj;
        int i = this.b;
        int i2 = hnrVar.b;
        return i != i2 ? i - i2 : this.a - hnrVar.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.b);
        sb.append(", index=");
        return oyr.s(sb, this.a, '}');
    }
}
