package xsna;

/* compiled from: ChildViewMaxSize.kt */
/* loaded from: classes18.dex */
public final class bac {
    public final int a;
    public final int b;

    public bac(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bac)) {
            return false;
        }
        bac bacVar = (bac) obj;
        return this.a == bacVar.a && this.b == bacVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildViewMaxSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vu5.b(sb, this.b, ')');
    }
}
