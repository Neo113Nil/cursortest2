package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class md61 {
    public final String a;
    public final String b;

    public md61(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md61)) {
            return false;
        }
        md61 md61Var = (md61) obj;
        return jl40.l(this.a, md61Var.a) && jl40.l(this.b, md61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ZoneCacheKey(userId=", this.a, ", zoneName=", this.b, Extension.C_BRAKE);
    }
}
