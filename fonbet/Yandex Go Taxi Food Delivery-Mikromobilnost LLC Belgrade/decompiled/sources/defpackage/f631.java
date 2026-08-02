package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class f631 {
    public final g631 a;
    public final Bitmap b;

    public f631(g631 g631Var, Bitmap bitmap) {
        this.a = g631Var;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f631)) {
            return false;
        }
        f631 f631Var = (f631) obj;
        return jl40.l(this.a, f631Var.a) && jl40.l(this.b, f631Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "ImageResult(variantKey=" + this.a + ", bitmap=" + this.b + Extension.C_BRAKE;
    }
}
