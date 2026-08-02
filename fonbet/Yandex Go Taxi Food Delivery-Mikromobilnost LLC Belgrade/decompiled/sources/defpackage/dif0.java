package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dif0 {
    public final CharSequence a;
    public final double b;
    public final String c;
    public final rg90 d;
    public final l690 e;

    public dif0(CharSequence charSequence, double d, String str, rg90 rg90Var, l690 l690Var) {
        this.a = charSequence;
        this.b = d;
        this.c = str;
        this.d = rg90Var;
        this.e = l690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dif0)) {
            return false;
        }
        dif0 dif0Var = (dif0) obj;
        return jl40.l(this.a, dif0Var.a) && Double.compare(this.b, dif0Var.b) == 0 && this.c.equals(dif0Var.c) && jl40.l(this.d, dif0Var.d) && this.e.equals(dif0Var.e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.a((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "ProgressBarState(text=" + ((Object) this.a) + ", value=" + this.b + ", contentDescription=" + this.c + ", style=" + this.d + ", paddings=" + this.e + Extension.C_BRAKE;
    }
}
