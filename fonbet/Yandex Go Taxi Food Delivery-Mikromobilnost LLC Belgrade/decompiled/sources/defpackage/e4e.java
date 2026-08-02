package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e4e {
    public final lvi0 a;
    public final l330 b;
    public final l330 c;
    public final l330 d;
    public final l330 e;

    public e4e(lvi0 lvi0Var, l330 l330Var, l330 l330Var2, l330 l330Var3, l330 l330Var4) {
        this.a = lvi0Var;
        this.b = l330Var;
        this.c = l330Var2;
        this.d = l330Var3;
        this.e = l330Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4e)) {
            return false;
        }
        e4e e4eVar = (e4e) obj;
        return jl40.l(this.a, e4eVar.a) && jl40.l(this.b, e4eVar.b) && jl40.l(this.c, e4eVar.c) && jl40.l(this.d, e4eVar.d) && jl40.l(this.e, e4eVar.e);
    }

    public final int hashCode() {
        lvi0 lvi0Var = this.a;
        int hashCode = (this.b.hashCode() + ((lvi0Var == null ? 0 : lvi0Var.hashCode()) * 31)) * 31;
        l330 l330Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (l330Var != null ? l330Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ConfirmationModalViewState(headerImage=" + this.a + ", title=" + this.b + ", body=" + this.c + ", closeButtonText=" + this.d + ", confirmButtonText=" + this.e + Extension.C_BRAKE;
    }
}
