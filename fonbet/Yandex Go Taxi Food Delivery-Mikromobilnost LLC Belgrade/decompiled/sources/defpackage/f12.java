package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f12 {
    public final Long a;
    public final String b;

    public f12(String str, Long l) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f12)) {
            return false;
        }
        f12 f12Var = (f12) obj;
        return jl40.l(this.a, f12Var.a) && jl40.l(this.b, f12Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AmUiState(userId=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }
}
