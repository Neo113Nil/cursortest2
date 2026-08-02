package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fvd {
    public final String a;
    public final String b;
    public final bpl0 c;
    public final String d;

    public fvd(String str, String str2, bpl0 bpl0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = bpl0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvd)) {
            return false;
        }
        fvd fvdVar = (fvd) obj;
        return jl40.l(this.a, fvdVar.a) && jl40.l(this.b, fvdVar.b) && this.c.equals(fvdVar.c) && jl40.l(this.d, fvdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("CompoundOptionSelectUiState(title=", this.a, ", description=", this.b, ", items=");
        v.append(this.c);
        v.append(", cancelButtonText=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
