package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gn9 implements in9 {
    public final CharSequence a;
    public final kdc b;
    public final BitmapDrawable c;
    public final km9 d;
    public final String e;
    public final BitmapDrawable f;

    public gn9(CharSequence charSequence, kdc kdcVar, BitmapDrawable bitmapDrawable, km9 km9Var, String str, BitmapDrawable bitmapDrawable2) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = bitmapDrawable;
        this.d = km9Var;
        this.e = str;
        this.f = bitmapDrawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn9)) {
            return false;
        }
        gn9 gn9Var = (gn9) obj;
        return jl40.l(this.a, gn9Var.a) && jl40.l(this.b, gn9Var.b) && jl40.l(this.c, gn9Var.c) && jl40.l(this.d, gn9Var.d) && jl40.l(this.e, gn9Var.e) && jl40.l(this.f, gn9Var.f);
    }

    public final int hashCode() {
        int d = smw0.d(this.b, this.a.hashCode() * 31, 31);
        BitmapDrawable bitmapDrawable = this.c;
        int b = unr0.b((this.d.hashCode() + ((d + (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode())) * 31)) * 31, 31, this.e);
        BitmapDrawable bitmapDrawable2 = this.f;
        return b + (bitmapDrawable2 != null ? bitmapDrawable2.hashCode() : 0);
    }

    public final String toString() {
        return "Attention(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", icon=" + this.c + ", action=" + this.d + ", promoOfferId=" + this.e + ", promoImage=" + this.f + Extension.C_BRAKE;
    }
}
