package xsna;

/* compiled from: GoodPreviewMarketHeaderItem.kt */
/* loaded from: classes18.dex */
public final class t6u implements n4d0 {
    public final int b;

    public t6u() {
        this(0);
    }

    @Override // xsna.n4d0
    public final int N9() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6u) && this.b == ((t6u) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("GoodPreviewMarketHeaderItem(blockType="), this.b, ')');
    }

    public t6u(int i) {
        this.b = 2;
    }
}
