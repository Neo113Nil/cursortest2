package xsna;

/* compiled from: AudioRestrictionButton.kt */
/* loaded from: classes3.dex */
public final class fw4 {
    public final String a;
    public final String b;

    public fw4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw4)) {
            return false;
        }
        fw4 fw4Var = (fw4) obj;
        return epx.f(this.a, fw4Var.a) && epx.f(this.b, fw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRestrictionButton(title=");
        sb.append(this.a);
        sb.append(", url=");
        return ho8.a(sb, this.b, ')');
    }
}
