package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p510 implements s510 {
    public final CharSequence a;
    public final o510 b;
    public final n410 c;

    public p510(CharSequence charSequence, o510 o510Var, n410 n410Var) {
        this.a = charSequence;
        this.b = o510Var;
        this.c = n410Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p510)) {
            return false;
        }
        p510 p510Var = (p510) obj;
        return jl40.l(this.a, p510Var.a) && jl40.l(this.b, p510Var.b) && jl40.l(this.c, p510Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Button(text=" + ((Object) this.a) + ", style=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
