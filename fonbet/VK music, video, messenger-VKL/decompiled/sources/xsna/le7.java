package xsna;

/* compiled from: BlacklistsData.kt */
/* loaded from: classes16.dex */
public final class le7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public le7(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le7)) {
            return false;
        }
        le7 le7Var = (le7) obj;
        return this.a == le7Var.a && this.b == le7Var.b && this.c == le7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlacklistsData(isMorphingBlacklisted=");
        sb.append(this.a);
        sb.append(", isTensorflowBlacklisted=");
        sb.append(this.b);
        sb.append(", isMediaCodecBlacklisted=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
