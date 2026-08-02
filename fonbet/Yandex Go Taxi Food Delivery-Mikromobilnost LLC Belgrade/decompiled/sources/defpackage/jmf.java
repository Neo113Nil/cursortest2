package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jmf implements kmf {
    public final int a;
    public final String b;

    public jmf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmf)) {
            return false;
        }
        jmf jmfVar = (jmf) obj;
        return this.a == jmfVar.a && jl40.l(this.b, jmfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "Error(errorResId=", ", param=", this.b, Extension.C_BRAKE);
    }
}
