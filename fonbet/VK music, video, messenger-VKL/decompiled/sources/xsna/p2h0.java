package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: SbpApp.kt */
/* loaded from: classes4.dex */
public final class p2h0 {
    public final String a;
    public final Drawable b;
    public final String c;
    public final r2h0 d;

    public p2h0(String str, Drawable drawable, String str2, r2h0 r2h0Var) {
        this.a = str;
        this.b = drawable;
        this.c = str2;
        this.d = r2h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2h0)) {
            return false;
        }
        p2h0 p2h0Var = (p2h0) obj;
        return epx.f(this.a, p2h0Var.a) && epx.f(this.b, p2h0Var.b) && epx.f(this.c, p2h0Var.c) && this.d.equals(p2h0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Drawable drawable = this.b;
        return this.d.hashCode() + urd0.a((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return "SbpApp(id=" + this.a + ", icon=" + this.b + ", label=" + this.c + ", launchInfo=" + this.d + ')';
    }
}
