package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: MidasBankItem.kt */
/* loaded from: classes2.dex */
public final class ol20 implements hfz {
    public final int b;
    public final Drawable c;
    public final CharSequence d;

    public ol20(int i, Drawable drawable, CharSequence charSequence) {
        this.b = i;
        this.c = drawable;
        this.d = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol20)) {
            return false;
        }
        ol20 ol20Var = (ol20) obj;
        return this.b == ol20Var.b && epx.f(this.c, ol20Var.c) && epx.f(this.d, ol20Var.d);
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
        StringBuilder sb = new StringBuilder("MidasBankItem(id=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", name=");
        return thl0.a(sb, this.d, ')');
    }
}
