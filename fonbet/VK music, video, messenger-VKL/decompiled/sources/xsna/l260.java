package xsna;

/* compiled from: NetworkCheckResult.kt */
/* loaded from: classes3.dex */
public final class l260 {
    public final String a;
    public final boolean b;

    public l260(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l260)) {
            return false;
        }
        l260 l260Var = (l260) obj;
        return epx.f(this.a, l260Var.a) && this.b == l260Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkCheckResult(id=");
        sb.append(this.a);
        sb.append(", unstable=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
