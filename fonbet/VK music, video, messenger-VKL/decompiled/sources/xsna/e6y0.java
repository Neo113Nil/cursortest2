package xsna;

/* compiled from: ZhukovItemSize.java */
/* loaded from: classes2.dex */
public final class e6y0 {
    public int a = 0;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6y0)) {
            return false;
        }
        e6y0 e6y0Var = (e6y0) obj;
        return this.a == e6y0Var.a && this.b == e6y0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageGridItemMaxSize{maxWidth=");
        sb.append(this.a);
        sb.append(", maxHeight=");
        return vu5.b(sb, this.b, '}');
    }
}
