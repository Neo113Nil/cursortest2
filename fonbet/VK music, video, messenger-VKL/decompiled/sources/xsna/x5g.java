package xsna;

/* compiled from: ColorData.kt */
/* loaded from: classes4.dex */
public final class x5g {
    public final int a;
    public final boolean b;

    public x5g(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5g)) {
            return false;
        }
        x5g x5gVar = (x5g) obj;
        return this.a == x5gVar.a && this.b == x5gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ColorData(color=" + this.a + ", selectedByPipette=" + this.b + ")";
    }
}
