package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ggx0 {
    public static final ggx0 c = new ggx0("", "");
    public final String a;
    public final String b;

    public ggx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggx0)) {
            return false;
        }
        ggx0 ggx0Var = (ggx0) obj;
        return this.a.equals(ggx0Var.a) && jl40.l(this.b, ggx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TariffInfo(carIconUrl=", this.a, ", tariffName=", this.b, Extension.C_BRAKE);
    }
}
