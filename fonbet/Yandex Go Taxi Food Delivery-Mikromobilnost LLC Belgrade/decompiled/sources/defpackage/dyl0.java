package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dyl0 implements eyl0 {
    public final tbv a;
    public final CharSequence b;
    public final String c;
    public final String d;

    public dyl0(tbv tbvVar, CharSequence charSequence, String str, String str2) {
        this.a = tbvVar;
        this.b = charSequence;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyl0)) {
            return false;
        }
        dyl0 dyl0Var = (dyl0) obj;
        return jl40.l(this.a, dyl0Var.a) && jl40.l(this.b, dyl0Var.b) && this.c.equals(dyl0Var.c) && this.d.equals(dyl0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationFail(photoImageModel=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append((Object) this.b);
        sb.append(", galleryButtonText=");
        return g8e.r(sb, this.c, ", retakeSelfieButtonText=", this.d, Extension.C_BRAKE);
    }
}
