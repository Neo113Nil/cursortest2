package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class abm {
    public final String a;
    public final Drawable b;

    public abm(String str, Drawable drawable) {
        this.a = str;
        this.b = drawable;
    }

    public final Drawable a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abm)) {
            return false;
        }
        abm abmVar = (abm) obj;
        return jl40.l(this.a, abmVar.a) && this.b.equals(abmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableHolder(image=" + this.a + ", drawable=" + this.b + Extension.C_BRAKE;
    }
}
