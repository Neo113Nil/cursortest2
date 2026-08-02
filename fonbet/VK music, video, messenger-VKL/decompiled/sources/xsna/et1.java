package xsna;

import android.text.Layout;

/* compiled from: AlignmentData.kt */
/* loaded from: classes4.dex */
public final class et1 {
    public final Layout.Alignment a;
    public final int b;
    public final int c;

    public et1(Layout.Alignment alignment, int i, int i2) {
        this.a = alignment;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et1)) {
            return false;
        }
        et1 et1Var = (et1) obj;
        return this.a == et1Var.a && this.b == et1Var.b && this.c == et1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlignmentData(alignment=");
        sb.append(this.a);
        sb.append(", drawableRes=");
        sb.append(this.b);
        sb.append(", accessibilityDescription=");
        return h5s.c(this.c, ")", sb);
    }
}
