package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: BankItem.kt */
/* loaded from: classes2.dex */
public final class r06 implements hfz {
    public final int b;
    public final Drawable c;
    public final CharSequence d;

    public r06(int i, Drawable drawable, String str) {
        this.b = i;
        this.c = drawable;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r06)) {
            return false;
        }
        r06 r06Var = (r06) obj;
        return this.b == r06Var.b && epx.f(this.c, r06Var.c) && epx.f(this.d, r06Var.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Drawable drawable = this.c;
        return this.d.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BankItem(id=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", name=");
        return thl0.a(sb, this.d, ')');
    }
}
