package defpackage;

import android.view.View;
import android.widget.TextView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class b0u0 {
    public final View a;
    public final TextView b;
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;

    public b0u0(View view, TextView textView, int i, int i2, int i3, CharSequence charSequence) {
        this.a = view;
        this.b = textView;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0u0)) {
            return false;
        }
        b0u0 b0u0Var = (b0u0) obj;
        return this.a.equals(b0u0Var.a) && this.b.equals(b0u0Var.b) && this.c == b0u0Var.c && this.d == b0u0Var.d && this.e == b0u0Var.e && this.f.equals(b0u0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayViewHolder(overlayView=");
        sb.append(this.a);
        sb.append(", textView=");
        sb.append(this.b);
        sb.append(", textStartPadding=");
        vfc.u(this.c, this.d, ", textEndPadding=", ", drawablePadding=", sb);
        sb.append(this.e);
        sb.append(", text=");
        sb.append((Object) this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
