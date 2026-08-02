package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ajz {
    public final String a;
    public final String b;

    public ajz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajz)) {
            return false;
        }
        ajz ajzVar = (ajz) obj;
        return jl40.l(this.a, ajzVar.a) && jl40.l(this.b, ajzVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Vehicle(name=", this.a, ", number=", this.b, Extension.C_BRAKE);
    }
}
