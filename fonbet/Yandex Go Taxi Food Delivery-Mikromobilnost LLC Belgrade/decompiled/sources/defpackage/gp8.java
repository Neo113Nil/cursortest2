package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gp8 {
    public final Drawable a;
    public final String b;
    public final bdc c;
    public final kdc d;

    public gp8(BitmapDrawable bitmapDrawable, String str, bdc bdcVar, kdc kdcVar) {
        this.a = bitmapDrawable;
        this.b = str;
        this.c = bdcVar;
        this.d = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp8)) {
            return false;
        }
        gp8 gp8Var = (gp8) obj;
        return jl40.l(this.a, gp8Var.a) && jl40.l(this.b, gp8Var.b) && this.c.equals(gp8Var.c) && this.d.equals(gp8Var.d);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        String str = this.b;
        return this.d.hashCode() + oyr.b(this.c.a, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "SuggestTariffIconUiState(carIcon=" + this.a + ", estimatedTimeText=" + this.b + ", estimatedTimeTextColor=" + this.c + ", estimatedTimeBackgroundColor=" + this.d + Extension.C_BRAKE;
    }
}
