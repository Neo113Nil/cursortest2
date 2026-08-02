package xsna;

/* compiled from: DrawingColors.kt */
/* loaded from: classes16.dex */
public final class nco0 {
    public final int a;
    public final boolean b;
    public final Integer c;

    public nco0(int i, boolean z, Integer num) {
        this.a = i;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nco0)) {
            return false;
        }
        nco0 nco0Var = (nco0) obj;
        return this.a == nco0Var.a && this.b == nco0Var.b && epx.f(this.c, nco0Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextColorsInfo(color=");
        sb.append(this.a);
        sb.append(", isLightColor=");
        sb.append(this.b);
        sb.append(", accessibilityText=");
        return uqi.b(sb, this.c, ')');
    }
}
