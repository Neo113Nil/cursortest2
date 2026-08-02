package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class nn71 {
    public static final lk71 Companion = new lk71();
    public final String a;
    public final String b;
    public final boolean c;

    public nn71(String str, int i, String str2, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ah71.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn71)) {
            return false;
        }
        nn71 nn71Var = (nn71) obj;
        return jl40.l(this.a, nn71Var.a) && jl40.l(this.b, nn71Var.b) && this.c == nn71Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("MediationAdapterData(format=", this.a, ", version=", this.b, ", isIntegrated="), this.c, Extension.C_BRAKE);
    }

    public nn71(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
