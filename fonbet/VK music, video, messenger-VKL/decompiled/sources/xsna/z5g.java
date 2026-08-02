package xsna;

/* compiled from: ColorData.kt */
/* loaded from: classes15.dex */
public final class z5g {
    public final int a;
    public final boolean b;

    public z5g(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5g)) {
            return false;
        }
        z5g z5gVar = (z5g) obj;
        return this.a == z5gVar.a && this.b == z5gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorData(color=");
        sb.append(this.a);
        sb.append(", selectedByPipette=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
