package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes15.dex */
public final class kt10 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final long e;
    public final Drawable f;
    public final Integer g;
    public final Boolean h;

    public kt10(String str, int i, int i2, boolean z, long j, Drawable drawable, Integer num, Boolean bool) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = j;
        this.f = drawable;
        this.g = num;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kt10)) {
            return false;
        }
        kt10 kt10Var = (kt10) obj;
        return this.a.equals(kt10Var.a) && this.b == kt10Var.b && this.c == kt10Var.c;
    }

    public final String toString() {
        StringBuilder s = b64.s(this.b, this.c, "Configuration(", " x ", "), anim = ");
        s.append(this.d);
        s.append(", size = ");
        s.append(this.e);
        return oyr.t(s, ", url = ", this.a);
    }
}
