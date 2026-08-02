package xsna;

/* compiled from: MsgCounters.kt */
/* loaded from: classes2.dex */
public final class zh30 {
    public final String a;
    public final String b;
    public final String c;

    public zh30() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh30)) {
            return false;
        }
        zh30 zh30Var = (zh30) obj;
        zh30Var.getClass();
        return epx.f(this.a, zh30Var.a) && epx.f(this.b, zh30Var.b) && epx.f(this.c, zh30Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgCounters(reactions=null, comments=");
        sb.append(this.a);
        sb.append(", reposts=");
        sb.append(this.b);
        sb.append(", views=");
        return ho8.a(sb, this.c, ')');
    }

    public zh30(String str, String str2, String str3, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
