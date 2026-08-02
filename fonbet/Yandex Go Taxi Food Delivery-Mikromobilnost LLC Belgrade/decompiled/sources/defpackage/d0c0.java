package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d0c0 {
    public final BitmapDrawable a;
    public final kdc b;
    public final kdc c;

    public d0c0(BitmapDrawable bitmapDrawable, kdc kdcVar, kdc kdcVar2) {
        this.a = bitmapDrawable;
        this.b = kdcVar;
        this.c = kdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0c0)) {
            return false;
        }
        d0c0 d0c0Var = (d0c0) obj;
        return this.a.equals(d0c0Var.a) && jl40.l(this.b, d0c0Var.b) && jl40.l(this.c, d0c0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.c;
        return hashCode2 + (kdcVar2 != null ? kdcVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Icon(drawable=" + this.a + ", backgroundColor=" + this.b + ", iconColor=" + this.c + Extension.C_BRAKE;
    }
}
