package xsna;

/* compiled from: ListItems.kt */
/* loaded from: classes7.dex */
public final class i0l0 implements hfz {
    public final String b;

    public i0l0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0l0) && epx.f(this.b, ((i0l0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StencilListItem(pathData="), this.b, ')');
    }
}
