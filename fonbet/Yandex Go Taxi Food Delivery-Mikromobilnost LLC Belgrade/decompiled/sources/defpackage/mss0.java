package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mss0 implements tss0 {
    public final CharSequence a;
    public final lss0 b;
    public final nqs0 c;

    public mss0(CharSequence charSequence, lss0 lss0Var, nqs0 nqs0Var) {
        this.a = charSequence;
        this.b = lss0Var;
        this.c = nqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mss0)) {
            return false;
        }
        mss0 mss0Var = (mss0) obj;
        return jl40.l(this.a, mss0Var.a) && jl40.l(this.b, mss0Var.b) && jl40.l(this.c, mss0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Button(text=" + ((Object) this.a) + ", style=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
