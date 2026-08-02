package defpackage;

import android.view.View;
import android.widget.TextView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class j5o {
    public final View a;
    public final TextView b;
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;

    public j5o(View view, TextView textView, int i, int i2, int i3, CharSequence charSequence) {
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
        if (!(obj instanceof j5o)) {
            return false;
        }
        j5o j5oVar = (j5o) obj;
        return this.a.equals(j5oVar.a) && this.b.equals(j5oVar.b) && this.c == j5oVar.c && this.d == j5oVar.d && this.e == j5oVar.e && this.f.equals(j5oVar.f);
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
