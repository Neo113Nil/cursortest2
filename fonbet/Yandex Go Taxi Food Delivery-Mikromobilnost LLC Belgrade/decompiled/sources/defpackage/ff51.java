package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ff51 {
    public final String a;
    public final String b;
    public final Drawable c;

    public ff51(String str, String str2, Drawable drawable) {
        this.a = str;
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff51)) {
            return false;
        }
        ff51 ff51Var = (ff51) obj;
        return jl40.l(this.a, ff51Var.a) && jl40.l(this.b, ff51Var.b) && jl40.l(this.c, ff51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("YBCardPromotion(title=", this.a, ", subtitle=", this.b, ", image=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
