package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h9k0 implements i9k0 {
    public final String a;
    public final String b;

    public h9k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9k0)) {
            return false;
        }
        h9k0 h9k0Var = (h9k0) obj;
        return jl40.l(this.a, h9k0Var.a) && jl40.l(this.b, h9k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CloseAndDeeplink(analyticsName=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
