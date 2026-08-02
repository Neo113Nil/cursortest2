package xsna;

/* compiled from: GLRenderBuffer.kt */
/* loaded from: classes3.dex */
public final class x1t {
    public final int a;
    public final int b;
    public final int c;

    public x1t(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1t)) {
            return false;
        }
        x1t x1tVar = (x1t) obj;
        return this.a == x1tVar.a && this.b == x1tVar.b && this.c == x1tVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GLRenderBuffer(frameBufferId=");
        sb.append(this.a);
        sb.append(", renderBufferId=");
        sb.append(this.b);
        sb.append(", textureId=");
        return vu5.b(sb, this.c, ')');
    }
}
