package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fxb {
    public final String a;
    public final String b;
    public final wp2 c;
    public final wp2 d;

    public fxb(String str, String str2, wp2 wp2Var, wp2 wp2Var2) {
        this.a = str;
        this.b = str2;
        this.c = wp2Var;
        this.d = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        return jl40.l(this.a, fxbVar.a) && this.b.equals(fxbVar.b) && jl40.l(this.c, fxbVar.c) && jl40.l(this.d, fxbVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + n.b(this.c, unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ReloadButtonUiState(errorMessage=", this.a, ", buttonText=", this.b, ", buttonTextColor=");
        v.append(this.c);
        v.append(", buttonColor=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
