package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class m8o0 {
    public final Bitmap a;
    public final Bitmap b;

    public m8o0(Bitmap bitmap, Bitmap bitmap2) {
        this.a = bitmap;
        this.b = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8o0)) {
            return false;
        }
        m8o0 m8o0Var = (m8o0) obj;
        return jl40.l(this.a, m8o0Var.a) && jl40.l(this.b, m8o0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "PaymentMethodButton(baseImage=" + this.a + ", complementImage=" + this.b + Extension.C_BRAKE;
    }
}
