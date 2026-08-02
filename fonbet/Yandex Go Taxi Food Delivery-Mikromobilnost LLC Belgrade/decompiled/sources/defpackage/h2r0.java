package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h2r0 implements k2r0 {
    public final String a;
    public final String b;

    public h2r0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.k2r0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2r0)) {
            return false;
        }
        h2r0 h2r0Var = (h2r0) obj;
        return this.a.equals(h2r0Var.a) && jl40.l(this.b, h2r0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Deeplink(deeplink=", this.a, ", closeAction=", this.b, Extension.C_BRAKE);
    }
}
