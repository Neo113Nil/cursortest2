package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.w21;

/* loaded from: classes7.dex */
public final class ma71 {
    public final Drawable a;
    public final w21 b;

    public ma71(Drawable drawable, w21 w21Var) {
        this.a = drawable;
        this.b = w21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma71)) {
            return false;
        }
        ma71 ma71Var = (ma71) obj;
        return jl40.l(this.a, ma71Var.a) && this.b == ma71Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.a + ", imageType=" + this.b + Extension.C_BRAKE;
    }
}
