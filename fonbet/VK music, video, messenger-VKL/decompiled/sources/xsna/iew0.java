package xsna;

/* compiled from: VoipAsrOnlineText.kt */
/* loaded from: classes7.dex */
public final class iew0 {
    public final String a;
    public final String b;

    public iew0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iew0)) {
            return false;
        }
        iew0 iew0Var = (iew0) obj;
        return epx.f(this.a, iew0Var.a) && epx.f(this.b, iew0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipAsrOnlineText(memberName=");
        sb.append(this.a);
        sb.append(", text=");
        return ho8.a(sb, this.b, ')');
    }
}
