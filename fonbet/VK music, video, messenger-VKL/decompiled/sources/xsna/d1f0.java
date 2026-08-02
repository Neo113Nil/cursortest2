package xsna;

/* compiled from: ReactionItems.kt */
/* loaded from: classes7.dex */
public final class d1f0 implements hfz {
    public final b69 b;

    public d1f0(b69 b69Var) {
        this.b = b69Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1f0) && epx.f(this.b, ((d1f0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Content(item=" + this.b + ')';
    }
}
