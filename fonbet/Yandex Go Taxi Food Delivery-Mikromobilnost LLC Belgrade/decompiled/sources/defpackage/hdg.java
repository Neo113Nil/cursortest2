package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class hdg {
    public final String a;
    public final h2d0 b;
    public final PlusColor c;

    public hdg(String str, h2d0 h2d0Var, PlusColor plusColor) {
        this.a = str;
        this.b = h2d0Var;
        this.c = plusColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdg)) {
            return false;
        }
        hdg hdgVar = (hdg) obj;
        return jl40.l(this.a, hdgVar.a) && this.b.equals(hdgVar.b) && this.c.equals(hdgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonProperties(text=" + this.a + ", textDrawableHolder=" + this.b + ", backgroundColor=" + this.c + ')';
    }
}
