package xsna;

/* compiled from: Stencil.kt */
/* loaded from: classes7.dex */
public final class e0l0 {
    public final int a;
    public final String b;

    public e0l0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0l0)) {
            return false;
        }
        e0l0 e0l0Var = (e0l0) obj;
        return this.a == e0l0Var.a && epx.f(this.b, e0l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stencil(shapeId=");
        sb.append(this.a);
        sb.append(", path=");
        return ho8.a(sb, this.b, ')');
    }
}
