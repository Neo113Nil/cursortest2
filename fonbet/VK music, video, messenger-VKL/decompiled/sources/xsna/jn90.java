package xsna;

/* compiled from: PastAsrListViewItem.kt */
/* loaded from: classes7.dex */
public final class jn90 implements hfz {
    public final ev3 b;

    public jn90(ev3 ev3Var) {
        this.b = ev3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn90)) {
            return false;
        }
        return epx.f(this.b, ((jn90) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.a.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Content(item=" + this.b + ')';
    }
}
