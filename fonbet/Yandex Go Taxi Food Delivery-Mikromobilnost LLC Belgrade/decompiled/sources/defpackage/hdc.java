package defpackage;

import android.content.res.ColorStateList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class hdc implements kdc {
    public final ColorStateList a;

    public hdc(ColorStateList colorStateList) {
        this.a = colorStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdc) && jl40.l(this.a, ((hdc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StateList(color=" + this.a + Extension.C_BRAKE;
    }
}
