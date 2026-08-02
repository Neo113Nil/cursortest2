package xsna;

/* compiled from: LyricsListItem.kt */
/* loaded from: classes3.dex */
public final class ka00 extends ja00 {
    public final String a;
    public final boolean b;

    public ka00(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // xsna.ja00
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka00)) {
            return false;
        }
        ka00 ka00Var = (ka00) obj;
        return epx.f(this.a, ka00Var.a) && this.b == ka00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricsListItemCredits(line=");
        sb.append(this.a);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
