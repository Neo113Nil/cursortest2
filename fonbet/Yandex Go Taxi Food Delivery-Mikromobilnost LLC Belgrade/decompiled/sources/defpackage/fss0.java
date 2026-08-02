package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fss0 implements gss0 {
    public final Drawable a;
    public final boolean b;

    public fss0(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fss0)) {
            return false;
        }
        fss0 fss0Var = (fss0) obj;
        return jl40.l(this.a, fss0Var.a) && this.b == fss0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(drawable=" + this.a + ", animateAppearance=" + this.b + Extension.C_BRAKE;
    }
}
