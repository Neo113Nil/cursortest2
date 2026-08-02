package xsna;

/* compiled from: TimelineSettings.kt */
/* loaded from: classes18.dex */
public final class e5p0 {
    public final String a;
    public final String b;

    public e5p0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5p0)) {
            return false;
        }
        e5p0 e5p0Var = (e5p0) obj;
        return epx.f(this.a, e5p0Var.a) && epx.f(this.b, e5p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipData(title=");
        sb.append(this.a);
        sb.append(", id=");
        return ho8.a(sb, this.b, ')');
    }
}
