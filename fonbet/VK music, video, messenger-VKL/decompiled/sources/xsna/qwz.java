package xsna;

/* compiled from: Locality.kt */
/* loaded from: classes6.dex */
public final class qwz {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public qwz(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwz)) {
            return false;
        }
        qwz qwzVar = (qwz) obj;
        return epx.f(this.a, qwzVar.a) && epx.f(this.b, qwzVar.b) && this.c == qwzVar.c && epx.f(this.d, qwzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Locality(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isChecked=");
        sb.append(this.c);
        sb.append(", hash=");
        return ho8.a(sb, this.d, ')');
    }
}
