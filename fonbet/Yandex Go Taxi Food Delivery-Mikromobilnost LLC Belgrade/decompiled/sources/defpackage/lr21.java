package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lr21 {
    public final String a;
    public final String b;
    public final kr21 c;

    public lr21(String str, String str2, kr21 kr21Var) {
        this.a = str;
        this.b = str2;
        this.c = kr21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr21)) {
            return false;
        }
        lr21 lr21Var = (lr21) obj;
        return jl40.l(this.a, lr21Var.a) && jl40.l(this.b, lr21Var.b) && jl40.l(this.c, lr21Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        kr21 kr21Var = this.c;
        return b + (kr21Var == null ? 0 : kr21Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("UserPhotoUploadingResult(url=", this.a, ", status=", this.b, ", bdui=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
