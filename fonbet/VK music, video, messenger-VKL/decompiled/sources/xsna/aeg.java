package xsna;

/* compiled from: CommentsButtonInfo.kt */
/* loaded from: classes2.dex */
public final class aeg {
    public final CharSequence a;
    public final boolean b;

    public aeg(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeg)) {
            return false;
        }
        aeg aegVar = (aeg) obj;
        return epx.f(this.a, aegVar.a) && this.b == aegVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentsButtonInfo(title=");
        sb.append((Object) this.a);
        sb.append(", showSeparator=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
