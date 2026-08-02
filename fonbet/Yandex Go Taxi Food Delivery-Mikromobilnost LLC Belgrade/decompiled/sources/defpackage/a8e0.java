package defpackage;

import android.graphics.Typeface;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a8e0 implements d8e0 {
    public final String a;
    public final z7e0 b;
    public final CharSequence c;
    public final CharSequence d;
    public final Typeface e;

    public a8e0(String str, z7e0 z7e0Var, CharSequence charSequence, CharSequence charSequence2, Typeface typeface) {
        this.a = str;
        this.b = z7e0Var;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = typeface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8e0)) {
            return false;
        }
        a8e0 a8e0Var = (a8e0) obj;
        return this.a.equals(a8e0Var.a) && this.b.equals(a8e0Var.b) && jl40.l(this.c, a8e0Var.c) && jl40.l(this.d, a8e0Var.d) && jl40.l(this.e, a8e0Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(smw0.b(smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, false);
        Typeface typeface = this.e;
        return e + (typeface != null ? typeface.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderItem(id=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", hasDivider=false, titleTypeface=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
