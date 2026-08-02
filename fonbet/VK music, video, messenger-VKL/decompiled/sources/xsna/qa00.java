package xsna;

/* compiled from: LyricsListItem.kt */
/* loaded from: classes3.dex */
public final class qa00 extends ja00 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public qa00(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // xsna.ja00
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa00)) {
            return false;
        }
        qa00 qa00Var = (qa00) obj;
        return epx.f(this.a, qa00Var.a) && this.b == qa00Var.b && this.c == qa00Var.c && this.d == qa00Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricsListItemTimecodeLine(line=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
