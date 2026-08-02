package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class fo2 {
    public static final fo2 c = new fo2(null, null);
    public final Long a;
    public final String b;

    public fo2(String str, Long l) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo2)) {
            return false;
        }
        fo2 fo2Var = (fo2) obj;
        return jl40.l(this.a, fo2Var.a) && jl40.l(this.b, fo2Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Extras(refreshAfter=" + this.a + ", userId=" + this.b + Extension.C_BRAKE;
    }
}
