package xsna;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class wk7 extends bk7 {
    public final int c;
    public final int d;
    public final int e;

    public wk7(int i, int i2, int i3) {
        super(0);
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk7)) {
            return false;
        }
        wk7 wk7Var = (wk7) obj;
        return this.c == wk7Var.c && this.d == wk7Var.d && this.e == wk7Var.e;
    }

    @Override // xsna.bk7, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(hashCode());
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, Integer.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCatalogTutorialItem(title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", banner=");
        return vu5.b(sb, this.e, ')');
    }
}
