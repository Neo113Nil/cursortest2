package xsna;

/* compiled from: SnippetSectionItem.kt */
/* loaded from: classes3.dex */
public final class pck0 implements hfz {
    public final nck0 b;

    public pck0(nck0 nck0Var) {
        this.b = nck0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pck0) && epx.f(this.b, ((pck0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Data(section=" + this.b + ')';
    }
}
