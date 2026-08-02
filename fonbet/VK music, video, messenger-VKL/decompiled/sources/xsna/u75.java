package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: AuthorData.kt */
/* loaded from: classes15.dex */
public final class u75 {
    public final String a;
    public final Drawable b;

    public u75(Drawable drawable, String str) {
        this.a = str;
        this.b = drawable;
    }

    public static u75 a(u75 u75Var, String str) {
        Drawable drawable = u75Var.b;
        u75Var.getClass();
        return new u75(drawable, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u75)) {
            return false;
        }
        u75 u75Var = (u75) obj;
        return epx.f(this.a, u75Var.a) && epx.f(this.b, u75Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "AuthorData(name=" + this.a + ", verifyIcon=" + this.b + ')';
    }
}
