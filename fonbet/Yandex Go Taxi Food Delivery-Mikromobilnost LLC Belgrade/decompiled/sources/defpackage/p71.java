package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p71 extends q71 {
    public final Bitmap a;
    public final cj00 b;

    public p71(Bitmap bitmap, cj00 cj00Var) {
        this.a = bitmap;
        this.b = cj00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p71)) {
            return false;
        }
        p71 p71Var = (p71) obj;
        return this.a.equals(p71Var.a) && jl40.l(this.b, p71Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cj00 cj00Var = this.b;
        return hashCode + (cj00Var == null ? 0 : cj00Var.hashCode());
    }

    public final String toString() {
        return "Success(bitmap=" + this.a + ", pin=" + this.b + Extension.C_BRAKE;
    }
}
