package xsna;

/* compiled from: SubscriptionOption.kt */
/* loaded from: classes3.dex */
public final class zym0 {
    public final int a;
    public final int b;
    public final boolean c;

    public zym0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zym0)) {
            return false;
        }
        zym0 zym0Var = (zym0) obj;
        return this.a == zym0Var.a && this.b == zym0Var.b && this.c == zym0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionOption(iconRes=");
        sb.append(this.a);
        sb.append(", titleRes=");
        sb.append(this.b);
        sb.append(", newBadge=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
