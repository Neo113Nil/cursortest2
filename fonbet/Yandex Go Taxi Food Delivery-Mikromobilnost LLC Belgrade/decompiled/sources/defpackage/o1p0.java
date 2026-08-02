package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o1p0 {
    public final Bitmap a;
    public final Bitmap b;
    public final CharSequence c;

    public o1p0(Bitmap bitmap, Bitmap bitmap2, String str) {
        this.a = bitmap;
        this.b = bitmap2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1p0)) {
            return false;
        }
        o1p0 o1p0Var = (o1p0) obj;
        return jl40.l(this.a, o1p0Var.a) && jl40.l(this.b, o1p0Var.b) && jl40.l(this.c, o1p0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        CharSequence charSequence = this.c;
        return hashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodItem(baseImage=");
        sb.append(this.a);
        sb.append(", complementImage=");
        sb.append(this.b);
        sb.append(", title=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
