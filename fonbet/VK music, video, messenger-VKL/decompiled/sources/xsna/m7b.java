package xsna;

/* compiled from: ChannelParams.kt */
/* loaded from: classes4.dex */
public final class m7b {
    public final boolean a;
    public final boolean b;
    public final String c;

    public m7b(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7b)) {
            return false;
        }
        m7b m7bVar = (m7b) obj;
        return this.a == m7bVar.a && this.b == m7bVar.b && epx.f(this.c, m7bVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelParams(isChannelPostAvailable=");
        sb.append(this.a);
        sb.append(", isShowHighlighter=");
        sb.append(this.b);
        sb.append(", hintSubtitle=");
        return ho8.a(sb, this.c, ')');
    }
}
