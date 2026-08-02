package xsna;

/* compiled from: RenderBuffer.kt */
/* loaded from: classes4.dex */
public final class dyf0 {
    public final int a;
    public final int b;
    public final int c;

    public dyf0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyf0)) {
            return false;
        }
        dyf0 dyf0Var = (dyf0) obj;
        return this.a == dyf0Var.a && this.b == dyf0Var.b && this.c == dyf0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return h5s.c(this.c, ")", odj.a(this.a, this.b, "RenderBuffer(frameBufferId=", ", renderBufferId=", ", textureId="));
    }
}
