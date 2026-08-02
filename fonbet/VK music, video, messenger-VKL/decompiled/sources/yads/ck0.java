package yads;

import android.graphics.drawable.Drawable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ck0 {
    public final bk0 a;
    public final Drawable b;
    public final mn3 c;

    public ck0(bk0 bk0Var, Drawable drawable, mn3 mn3Var) {
        this.a = bk0Var;
        this.b = drawable;
        this.c = mn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return epx.f(this.a, ck0Var.a) && epx.f(this.b, ck0Var.b) && epx.f(this.c, ck0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        mn3 mn3Var = this.c;
        return hashCode2 + (mn3Var != null ? mn3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.a + ", drawable=" + this.b + ", error=" + this.c + ")";
    }
}
