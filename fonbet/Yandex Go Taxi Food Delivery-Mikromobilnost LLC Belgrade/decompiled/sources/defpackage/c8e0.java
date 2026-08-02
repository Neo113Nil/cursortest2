package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class c8e0 implements d8e0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final kdc e;
    public final kdc f;

    public c8e0(String str, String str2, String str3, String str4, kdc kdcVar, kdc kdcVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = kdcVar;
        this.f = kdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8e0)) {
            return false;
        }
        c8e0 c8e0Var = (c8e0) obj;
        return jl40.l(this.a, c8e0Var.a) && jl40.l(this.b, c8e0Var.b) && jl40.l(this.c, c8e0Var.c) && jl40.l(this.d, c8e0Var.d) && this.e.equals(c8e0Var.e) && this.f.equals(c8e0Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + smw0.d(this.e, smw0.b(smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SliderItem(id=", this.a, ", modelId=", this.b, ", text=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", bgColor=");
        v.append(this.e);
        v.append(", textColor=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
