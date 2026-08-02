package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p68 {
    public final Drawable a;
    public final o68 b;

    public p68(Drawable drawable, o68 o68Var) {
        this.a = drawable;
        this.b = o68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p68)) {
            return false;
        }
        p68 p68Var = (p68) obj;
        return jl40.l(this.a, p68Var.a) && jl40.l(this.b, p68Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarPlacement(drawable=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
