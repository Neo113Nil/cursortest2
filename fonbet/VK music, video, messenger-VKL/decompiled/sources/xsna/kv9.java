package xsna;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class kv9 {
    public final float a;
    public final int b;
    public final int c;

    public kv9(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv9)) {
            return false;
        }
        kv9 kv9Var = (kv9) obj;
        return Float.compare(this.a, kv9Var.a) == 0 && this.b == kv9Var.b && this.c == kv9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselRatioViewState(ratio=");
        sb.append(this.a);
        sb.append(", ratioW=");
        sb.append(this.b);
        sb.append(", ratioH=");
        return vu5.b(sb, this.c, ')');
    }
}
