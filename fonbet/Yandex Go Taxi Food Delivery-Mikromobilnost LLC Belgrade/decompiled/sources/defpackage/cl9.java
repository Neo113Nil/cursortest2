package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cl9 {
    public final CharSequence a;
    public final hba b;
    public final Bitmap c;
    public final kdc d;
    public final boolean e;
    public final boolean f;

    public cl9(CharSequence charSequence, hba hbaVar, Bitmap bitmap, kdc kdcVar, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = hbaVar;
        this.c = bitmap;
        this.d = kdcVar;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl9)) {
            return false;
        }
        cl9 cl9Var = (cl9) obj;
        return jl40.l(this.a, cl9Var.a) && jl40.l(this.b, cl9Var.b) && jl40.l(this.c, cl9Var.c) && jl40.l(this.d, cl9Var.d) && this.e == cl9Var.e && this.f == cl9Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Bitmap bitmap = this.c;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        kdc kdcVar = this.d;
        return Boolean.hashCode(this.f) + unr0.e((hashCode2 + (kdcVar != null ? kdcVar.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append((Object) this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", leadIcon=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        return smw0.k(", isSquare=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
