package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f7v0 {
    public final String a;
    public final String b;

    public f7v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7v0)) {
            return false;
        }
        f7v0 f7v0Var = (f7v0) obj;
        return jl40.l(this.a, f7v0Var.a) && jl40.l(this.b, f7v0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("SuggestModel(iconTag=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
