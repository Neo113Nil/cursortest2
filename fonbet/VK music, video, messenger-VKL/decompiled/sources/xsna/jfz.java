package xsna;

/* compiled from: FaqState.kt */
/* loaded from: classes14.dex */
public final class jfz {
    public final String a;
    public final String b;
    public final boolean c;

    public jfz(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfz)) {
            return false;
        }
        jfz jfzVar = (jfz) obj;
        return epx.f(this.a, jfzVar.a) && epx.f(this.b, jfzVar.b) && this.c == jfzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListItem(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", expandable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
