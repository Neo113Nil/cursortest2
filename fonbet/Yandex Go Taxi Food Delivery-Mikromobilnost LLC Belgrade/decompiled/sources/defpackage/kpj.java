package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kpj {
    public final boolean a;
    public final String b;

    public kpj(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpj)) {
            return false;
        }
        kpj kpjVar = (kpj) obj;
        return this.a == kpjVar.a && jl40.l(this.b, kpjVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.m("InputState(enabled=", this.a, ", error=", this.b, Extension.C_BRAKE);
    }
}
