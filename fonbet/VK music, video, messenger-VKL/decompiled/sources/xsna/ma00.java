package xsna;

/* compiled from: LyricsListItem.kt */
/* loaded from: classes3.dex */
public final class ma00 extends ja00 {
    public final int a;
    public final int b;
    public final boolean c;

    public ma00(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // xsna.ja00
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma00)) {
            return false;
        }
        ma00 ma00Var = (ma00) obj;
        return this.a == ma00Var.a && this.b == ma00Var.b && this.c == ma00Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricsListItemInterlude(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
