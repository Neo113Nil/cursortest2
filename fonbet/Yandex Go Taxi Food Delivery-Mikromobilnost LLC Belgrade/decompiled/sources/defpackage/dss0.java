package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dss0 implements gss0 {
    public final String a;
    public final int b;
    public final int c;
    public final Drawable d;

    public dss0(String str, int i, int i2, Drawable drawable) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dss0)) {
            return false;
        }
        dss0 dss0Var = (dss0) obj;
        if (!jl40.l(this.a, dss0Var.a) || this.b != dss0Var.b || this.c != dss0Var.c) {
            return false;
        }
        pfv pfvVar = pfv.a;
        return pfvVar.equals(pfvVar) && jl40.l(this.d, dss0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31) - 895463842) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "Downloadable(url=", this.a, ", width=", ", height=");
        u.append(this.c);
        u.append(", transformation=");
        u.append(pfv.a);
        u.append(", placeholder=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
