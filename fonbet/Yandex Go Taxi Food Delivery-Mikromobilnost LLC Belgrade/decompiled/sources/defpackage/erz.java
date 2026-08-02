package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class erz {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;

    public erz(CharSequence charSequence, CharSequence charSequence2, Drawable drawable) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erz)) {
            return false;
        }
        erz erzVar = (erz) obj;
        return jl40.l(this.a, erzVar.a) && jl40.l(this.b, erzVar.b) && jl40.l(this.c, erzVar.c);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        Drawable drawable = this.c;
        return b + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Bullet(title=", ", subtitle=", ", icon=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
