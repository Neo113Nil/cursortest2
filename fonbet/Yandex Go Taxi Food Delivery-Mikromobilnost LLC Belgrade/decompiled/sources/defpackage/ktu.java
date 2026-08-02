package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ktu {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;
    public final q47 d;

    public ktu(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, q47 q47Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
        this.d = q47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktu)) {
            return false;
        }
        ktu ktuVar = (ktu) obj;
        return jl40.l(this.a, ktuVar.a) && jl40.l(this.b, ktuVar.b) && jl40.l(this.c, ktuVar.c) && this.d.equals(ktuVar.d);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        Drawable drawable = this.c;
        return this.d.hashCode() + ((b + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "HouseMissingUiState(title=", ", subtitle=", ", image=");
        r.append(this.c);
        r.append(", buttons=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
