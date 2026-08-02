package xsna;

/* compiled from: TitleItem.kt */
/* loaded from: classes18.dex */
public final class ozo0 implements hfz {
    public final int b;

    public ozo0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozo0) && this.b == ((ozo0) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("TitleItem(titleRes="), this.b, ')');
    }
}
