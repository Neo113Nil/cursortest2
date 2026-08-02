package defpackage;

import android.graphics.Typeface;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class fyr {
    public final Typeface a;
    public final Integer b;

    public fyr(Typeface typeface, Integer num) {
        this.a = typeface;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyr)) {
            return false;
        }
        fyr fyrVar = (fyr) obj;
        return this.a.equals(fyrVar.a) && jl40.l(this.b, fyrVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MetaStyleSettings(typeface=" + this.a + ", size=" + this.b + Extension.C_BRAKE;
    }
}
