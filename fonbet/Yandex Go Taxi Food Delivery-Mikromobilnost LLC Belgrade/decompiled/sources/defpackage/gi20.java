package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gi20 extends hi20 {
    public final String c;
    public final Bitmap d;
    public final ntb0 e;
    public final o690 f;
    public final x2s g;
    public final bi20 h;
    public final boolean i;

    public gi20(String str, Bitmap bitmap, ntb0 ntb0Var, o690 o690Var, x2s x2sVar, bi20 bi20Var, boolean z) {
        this.c = str;
        this.d = bitmap;
        this.e = ntb0Var;
        this.f = o690Var;
        this.g = x2sVar;
        this.h = bi20Var;
        this.i = z;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi20)) {
            return false;
        }
        gi20 gi20Var = (gi20) obj;
        return jl40.l(this.c, gi20Var.c) && this.d.equals(gi20Var.d) && this.e.equals(gi20Var.e) && this.f.equals(gi20Var.f) && this.g.equals(gi20Var.g) && this.h.equals(gi20Var.h) && this.i == gi20Var.i;
    }

    public final int hashCode() {
        String str = this.c;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + tse0.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(id=");
        sb.append(this.c);
        sb.append(", bitmap=");
        sb.append(this.d);
        sb.append(", pinModel=");
        sb.append(this.e);
        sb.append(", padding=");
        sb.append(this.f);
        sb.append(", analyticsData=");
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", enabled=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
