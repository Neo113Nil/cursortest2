package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.jk3;

/* loaded from: classes7.dex */
public final class lm61 {
    public final ki61 a;
    public final Drawable b;
    public final jk3 c;

    public lm61(ki61 ki61Var, Drawable drawable, jk3 jk3Var) {
        this.a = ki61Var;
        this.b = drawable;
        this.c = jk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lm61) {
            lm61 lm61Var = (lm61) obj;
            if (this.a == lm61Var.a && jl40.l(this.b, lm61Var.b) && jl40.l(this.c, lm61Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        jk3 jk3Var = this.c;
        return hashCode2 + (jk3Var != null ? jk3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.a + ", drawable=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
