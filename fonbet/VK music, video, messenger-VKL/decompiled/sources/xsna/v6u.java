package xsna;

/* compiled from: GoodPreviewMarketItem.kt */
/* loaded from: classes18.dex */
public final class v6u implements n4d0 {
    public final k7u b;

    public v6u(k7u k7uVar) {
        this.b = k7uVar;
    }

    @Override // xsna.n4d0
    public final int N9() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6u) && epx.f(this.b, ((v6u) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.a.hashCode());
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "GoodPreviewMarketItem(good=" + this.b + ", blockType=1)";
    }
}
