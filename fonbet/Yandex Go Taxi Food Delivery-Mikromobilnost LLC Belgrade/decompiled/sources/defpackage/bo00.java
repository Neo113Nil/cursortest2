package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bo00 implements fo00 {
    public final ixy0 a;
    public final zwy0 b;
    public final zwy0 c;
    public final Bitmap d;
    public final CharSequence e;
    public final CharSequence f;
    public final boolean g;
    public final boolean h;

    public bo00(ixy0 ixy0Var, zwy0 zwy0Var, zwy0 zwy0Var2, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.a = ixy0Var;
        this.b = zwy0Var;
        this.c = zwy0Var2;
        this.d = bitmap;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo00)) {
            return false;
        }
        bo00 bo00Var = (bo00) obj;
        return jl40.l(this.a, bo00Var.a) && jl40.l(this.b, bo00Var.b) && jl40.l(this.c, bo00Var.c) && jl40.l(this.d, bo00Var.d) && jl40.l(this.e, bo00Var.e) && jl40.l(this.f, bo00Var.f) && this.g == bo00Var.g && this.h == bo00Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zwy0 zwy0Var = this.c;
        int hashCode2 = (hashCode + (zwy0Var == null ? 0 : zwy0Var.hashCode())) * 31;
        Bitmap bitmap = this.d;
        int hashCode3 = (hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode4 = (hashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        return Boolean.hashCode(this.h) + unr0.e((hashCode4 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalLPinStyle(image=");
        sb.append(this.a);
        sb.append(", imageAssetBitmap=");
        sb.append(this.b);
        sb.append(", badgeThemedAssetBitmap=");
        sb.append(this.c);
        sb.append(", overlayAssetBitmap=");
        sb.append(this.d);
        sb.append(", title=");
        vfc.A(sb, this.e, ", subtitle=", this.f, ", isVideoPin=");
        return smw0.k(", isOrganization=", Extension.C_BRAKE, sb, this.g, this.h);
    }
}
