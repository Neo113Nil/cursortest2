package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dws0 implements fws0 {
    public final sbv a;
    public final c0k0 b;
    public final oc21 c;
    public final String d;
    public final x2s e;
    public final String f;

    public dws0(sbv sbvVar, c0k0 c0k0Var, oc21 oc21Var, String str, x2s x2sVar, String str2) {
        this.a = sbvVar;
        this.b = c0k0Var;
        this.c = oc21Var;
        this.d = str;
        this.e = x2sVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dws0)) {
            return false;
        }
        dws0 dws0Var = (dws0) obj;
        return this.a.equals(dws0Var.a) && this.b.equals(dws0Var.b) && this.c.equals(dws0Var.c) && jl40.l(this.d, dws0Var.d) && this.e.equals(dws0Var.e) && jl40.l(this.f, dws0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int a = tse0.a(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TrailUploadImagesButton(image=" + this.a + ", position=" + this.b + ", constrains=" + this.c + ", accessibilityLabel=" + this.d + ", analyticsData=" + this.e + ", presentationId=" + this.f + Extension.C_BRAKE;
    }
}
