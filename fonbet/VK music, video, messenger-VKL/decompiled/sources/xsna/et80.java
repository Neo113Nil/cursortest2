package xsna;

/* compiled from: OpponentEvent.kt */
/* loaded from: classes7.dex */
public final class et80 {
    public final kr5 a;
    public final String b;
    public final String c;

    public et80(kr5 kr5Var, String str, String str2) {
        this.a = kr5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et80)) {
            return false;
        }
        et80 et80Var = (et80) obj;
        return epx.f(this.a, et80Var.a) && epx.f(this.b, et80Var.b) && epx.f(this.c, et80Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarChanged(peerAvatar=");
        sb.append(this.a);
        sb.append(", peerPhoto=");
        sb.append(this.b);
        sb.append(", peerBigPhoto=");
        return ho8.a(sb, this.c, ')');
    }
}
