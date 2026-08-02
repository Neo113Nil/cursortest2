package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ink0 {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;

    public ink0(CharSequence charSequence, CharSequence charSequence2, BitmapDrawable bitmapDrawable) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bitmapDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ink0)) {
            return false;
        }
        ink0 ink0Var = (ink0) obj;
        return jl40.l(this.a, ink0Var.a) && jl40.l(this.b, ink0Var.b) && jl40.l(this.c, ink0Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Drawable drawable = this.c;
        return hashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "State(title=", ", subtitle=", ", image=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
