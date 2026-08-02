package defpackage;

/* loaded from: classes14.dex */
public final class m301 {
    public final CharSequence a;
    public final CharSequence b;

    public m301(CharSequence charSequence, CharSequence charSequence2, int i) {
        charSequence2 = (i & 2) != 0 ? null : charSequence2;
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m301)) {
            return false;
        }
        m301 m301Var = (m301) obj;
        return jl40.l(this.a, m301Var.a) && jl40.l(this.b, m301Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "TrackingCardButtonUiState(title=", ", subtitle=", ", leadImageUrl=null, leadImageColor=null)");
    }
}
