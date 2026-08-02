package xsna;

/* compiled from: TargetItemInfo.kt */
/* loaded from: classes18.dex */
public final class y3o0 {
    public final String a;
    public final String b;

    public y3o0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3o0)) {
            return false;
        }
        y3o0 y3o0Var = (y3o0) obj;
        return epx.f(this.a, y3o0Var.a) && epx.f(this.b, y3o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetItemInfo(id=");
        sb.append(this.a);
        sb.append(", type=");
        return ho8.a(sb, this.b, ')');
    }
}
