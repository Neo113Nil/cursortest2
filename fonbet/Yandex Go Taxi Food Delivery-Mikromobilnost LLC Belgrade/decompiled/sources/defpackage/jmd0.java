package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class jmd0 {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;
    public final Drawable d;
    public final String e;

    public jmd0(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, Drawable drawable2, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
        this.d = drawable2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmd0)) {
            return false;
        }
        jmd0 jmd0Var = (jmd0) obj;
        return jl40.l(this.a, jmd0Var.a) && jl40.l(this.b, jmd0Var.b) && jl40.l(this.c, jmd0Var.c) && jl40.l(this.d, jmd0Var.d) && this.e.equals(jmd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "PlusSubsPromoData(title=", ", text=", ", background=");
        r.append(this.c);
        r.append(", image=");
        r.append(this.d);
        r.append(", type=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }
}
