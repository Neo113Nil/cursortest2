package xsna;

/* compiled from: PathPattern.kt */
/* loaded from: classes4.dex */
public final class uq90 {
    public final String a;
    public final String b;

    public uq90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq90)) {
            return false;
        }
        uq90 uq90Var = (uq90) obj;
        return epx.f(this.a, uq90Var.a) && epx.f(this.b, uq90Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathPattern(plain=");
        sb.append(this.a);
        sb.append(", regexStr=");
        return ho8.a(sb, this.b, ')');
    }
}
