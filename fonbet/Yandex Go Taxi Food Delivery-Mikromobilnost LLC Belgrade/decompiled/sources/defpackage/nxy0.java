package defpackage;

import android.content.res.ColorStateList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nxy0 {
    public final float a;
    public final ColorStateList b;
    public final ColorStateList c;

    public nxy0(float f, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.a = f;
        this.b = colorStateList;
        this.c = colorStateList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxy0)) {
            return false;
        }
        nxy0 nxy0Var = (nxy0) obj;
        return Float.compare(this.a, nxy0Var.a) == 0 && jl40.l(this.b, nxy0Var.b) && jl40.l(this.c, nxy0Var.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        ColorStateList colorStateList = this.b;
        int hashCode2 = (hashCode + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        ColorStateList colorStateList2 = this.c;
        return hashCode2 + (colorStateList2 != null ? colorStateList2.hashCode() : 0);
    }

    public final String toString() {
        return "TextAppearance(textSize=" + this.a + ", textColor=" + this.b + ", textColorLink=" + this.c + Extension.C_BRAKE;
    }
}
