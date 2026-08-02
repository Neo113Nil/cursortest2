package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class frz {
    public final Drawable a;
    public final CharSequence b;
    public final wqz c;

    public frz(Drawable drawable, CharSequence charSequence, wqz wqzVar) {
        this.a = drawable;
        this.b = charSequence;
        this.c = wqzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frz)) {
            return false;
        }
        frz frzVar = (frz) obj;
        return jl40.l(this.a, frzVar.a) && jl40.l(this.b, frzVar.b) && this.c.equals(frzVar.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return this.c.hashCode() + smw0.b((drawable == null ? 0 : drawable.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "Button(icon=" + this.a + ", title=" + ((Object) this.b) + ", action=" + this.c + Extension.C_BRAKE;
    }
}
