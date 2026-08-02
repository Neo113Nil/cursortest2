package xsna;

/* compiled from: OnMediaAudioTitleCreator.kt */
/* loaded from: classes4.dex */
public final class w780 {
    public final String a;
    public final String b;

    public w780(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w780)) {
            return false;
        }
        w780 w780Var = (w780) obj;
        return epx.f(this.a, w780Var.a) && epx.f(this.b, w780Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaAudioTitle(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }
}
