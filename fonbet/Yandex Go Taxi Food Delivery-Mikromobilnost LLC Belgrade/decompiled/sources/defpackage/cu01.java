package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cu01 {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;

    public cu01(CharSequence charSequence, CharSequence charSequence2, Drawable drawable) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu01)) {
            return false;
        }
        cu01 cu01Var = (cu01) obj;
        return jl40.l(this.a, cu01Var.a) && jl40.l(this.b, cu01Var.b) && jl40.l(this.c, cu01Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int b = smw0.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
        Drawable drawable = this.c;
        return b + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TransferTimeRowUiState(title=", ", selectedTimeLabel=", ", leadIcon=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
