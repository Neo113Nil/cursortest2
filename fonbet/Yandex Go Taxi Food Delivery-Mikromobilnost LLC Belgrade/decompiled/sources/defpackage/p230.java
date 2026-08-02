package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p230 {
    public final String a;
    public final Drawable b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;

    public p230(String str, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = str;
        this.b = drawable;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p230)) {
            return false;
        }
        p230 p230Var = (p230) obj;
        return jl40.l(this.a, p230Var.a) && jl40.l(this.b, p230Var.b) && jl40.l(this.c, p230Var.c) && jl40.l(this.d, p230Var.d) && jl40.l(this.e, p230Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return this.e.hashCode() + smw0.b(smw0.b((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalViewOnOrderUIState(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", message=", this.d, ", buttons=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
