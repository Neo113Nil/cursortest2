package xsna;

/* compiled from: JoinGroupFromAd.kt */
/* loaded from: classes15.dex */
public final class l0y {
    public final boolean a;
    public final boolean b;

    public l0y(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0y)) {
            return false;
        }
        l0y l0yVar = (l0y) obj;
        return this.a == l0yVar.a && this.b == l0yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinGroupFromAdResult(joined=");
        sb.append(this.a);
        sb.append(", isMember=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
