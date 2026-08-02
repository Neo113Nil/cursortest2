package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes13.dex */
public final class ab5 {
    public final Drawable a;
    public final int b;
    public final int c;

    public ab5(Drawable drawable, int i, int i2) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab5)) {
            return false;
        }
        ab5 ab5Var = (ab5) obj;
        return this.a.equals(ab5Var.a) && this.b == ab5Var.b && this.c == ab5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Style(buttonDrawable=");
        sb.append(this.a);
        sb.append(", buttonTextAppearance=");
        sb.append(this.b);
        sb.append(", legalsTextAppearance=");
        return oyr.s(sb, this.c, ')');
    }
}
