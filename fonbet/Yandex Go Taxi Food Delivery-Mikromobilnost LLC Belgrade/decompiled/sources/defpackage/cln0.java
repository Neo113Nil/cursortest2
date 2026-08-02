package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cln0 {
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    public final Bitmap d;
    public final nsz e;

    public cln0(CharSequence charSequence, CharSequence charSequence2, int i, Bitmap bitmap, nsz nszVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = bitmap;
        this.e = nszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cln0)) {
            return false;
        }
        cln0 cln0Var = (cln0) obj;
        return jl40.l(this.a, cln0Var.a) && jl40.l(this.b, cln0Var.b) && this.c == cln0Var.c && jl40.l(this.d, cln0Var.d) && jl40.l(this.e, cln0Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, smw0.b(this.a.hashCode() * 31, 31, this.b), 31);
        Bitmap bitmap = this.d;
        int hashCode = (b + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        nsz nszVar = this.e;
        return hashCode + (nszVar != null ? nszVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersFeedbackCardNewbieHeaderUiState(title=", ", subtitle=", ", progressStep=");
        r.append(this.c);
        r.append(", image=");
        r.append(this.d);
        r.append(", lottieComposition=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
