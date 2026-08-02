package xsna;

/* compiled from: VkMixInflaterDelegate.kt */
/* loaded from: classes16.dex */
public final class zs20 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zs20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs20)) {
            return false;
        }
        zs20 zs20Var = (zs20) obj;
        return this.a == zs20Var.a && this.b == zs20Var.b && this.c == zs20Var.c && this.d == zs20Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixeSizeParams(playMixHeight=");
        sb.append(this.a);
        sb.append(", playMixTopMargin=");
        sb.append(this.b);
        sb.append(", titleTopMargin=");
        sb.append(this.c);
        sb.append(", titlePlaceholderTopMargin=");
        return vu5.b(sb, this.d, ')');
    }
}
