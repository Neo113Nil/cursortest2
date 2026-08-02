package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ffa {
    public final float a;
    public final CharSequence b;
    public final wp2 c;
    public final wp2 d;

    public ffa(float f, CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2) {
        this.a = f;
        this.b = charSequence;
        this.c = wp2Var;
        this.d = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffa)) {
            return false;
        }
        ffa ffaVar = (ffa) obj;
        return Float.compare(this.a, ffaVar.a) == 0 && jl40.l(this.b, ffaVar.b) && jl40.l(this.c, ffaVar.c) && jl40.l(this.d, ffaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, smw0.b(Float.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Progress(fraction=" + this.a + ", text=" + ((Object) this.b) + ", trackColor=" + this.c + ", fillColor=" + this.d + Extension.C_BRAKE;
    }
}
