package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k7v {
    public final String a;
    public final String b;

    public /* synthetic */ k7v(String str, int i) {
        this((i & 1) != 0 ? "" : str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7v)) {
            return false;
        }
        k7v k7vVar = (k7v) obj;
        return jl40.l(this.a, k7vVar.a) && jl40.l(this.b, k7vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Image(url=", this.a, ", id=", this.b, Extension.C_BRAKE);
    }

    public k7v() {
        this((String) null, 3);
    }

    public k7v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
