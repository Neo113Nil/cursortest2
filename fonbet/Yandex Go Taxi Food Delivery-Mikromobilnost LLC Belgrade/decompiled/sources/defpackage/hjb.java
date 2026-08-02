package defpackage;

/* loaded from: classes2.dex */
public final class hjb {
    public final int a;
    public final CharSequence b;

    public hjb(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjb)) {
            return false;
        }
        hjb hjbVar = (hjb) obj;
        return this.a == hjbVar.a && jl40.l(this.b, hjbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LegalItem(id=" + this.a + ", text=" + ((Object) this.b) + ')';
    }
}
