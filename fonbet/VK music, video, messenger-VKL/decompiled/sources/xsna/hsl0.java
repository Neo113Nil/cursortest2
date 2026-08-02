package xsna;

/* compiled from: StoriesFeedSettings.kt */
/* loaded from: classes18.dex */
public final class hsl0 {
    public final boolean a;
    public final boolean b;

    public hsl0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsl0)) {
            return false;
        }
        hsl0 hsl0Var = (hsl0) obj;
        return this.a == hsl0Var.a && this.b == hsl0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesFeedSettings(isDiscoverVisible=");
        sb.append(this.a);
        sb.append(", isAdvicesVisible=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
