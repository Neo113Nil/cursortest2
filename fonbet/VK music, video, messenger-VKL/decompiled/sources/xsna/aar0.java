package xsna;

/* compiled from: VKAvatarSize.kt */
/* loaded from: classes15.dex */
public final class aar0 {
    public final float a;
    public final int b;

    public aar0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final float a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aar0)) {
            return false;
        }
        aar0 aar0Var = (aar0) obj;
        return Float.compare(this.a, aar0Var.a) == 0 && this.b == aar0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKAvatarSize(dp=");
        sb.append(this.a);
        sb.append(", px=");
        return vu5.b(sb, this.b, ')');
    }
}
