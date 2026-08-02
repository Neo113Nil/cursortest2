package xsna;

/* compiled from: SimpleHeaderItem.kt */
/* loaded from: classes16.dex */
public final class vqj0 implements hfz {
    public final String b;

    public vqj0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqj0) && epx.f(this.b, ((vqj0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SimpleHeaderItem(title="), this.b, ')');
    }
}
