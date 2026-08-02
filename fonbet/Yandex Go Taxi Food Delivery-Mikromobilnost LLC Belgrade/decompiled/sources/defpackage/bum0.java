package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bum0 {
    public final CharSequence a;
    public final wp2 b;
    public final wp2 c;
    public final String d;

    public bum0(CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, String str) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bum0)) {
            return false;
        }
        bum0 bum0Var = (bum0) obj;
        return jl40.l(this.a, bum0Var.a) && jl40.l(this.b, bum0Var.b) && jl40.l(this.c, bum0Var.c) && jl40.l(this.d, bum0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Badge(text=" + ((Object) this.a) + ", bgColor=" + this.b + ", indicatorColor=" + this.c + ", leadIconTag=" + this.d + Extension.C_BRAKE;
    }
}
