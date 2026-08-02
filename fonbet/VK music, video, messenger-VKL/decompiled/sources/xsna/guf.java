package xsna;

/* compiled from: ClipsWrapperTitles.kt */
/* loaded from: classes17.dex */
public final class guf {
    public final tlo0 a;
    public final CharSequence b;

    public guf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guf)) {
            return false;
        }
        guf gufVar = (guf) obj;
        return epx.f(this.a, gufVar.a) && epx.f(this.b, gufVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperTitles(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return thl0.a(sb, this.b, ')');
    }

    public guf(tlo0 tlo0Var, CharSequence charSequence) {
        this.a = tlo0Var;
        this.b = charSequence;
    }

    public guf(int i) {
        this(oq.d(tlo0.Companion, ""), null);
    }
}
