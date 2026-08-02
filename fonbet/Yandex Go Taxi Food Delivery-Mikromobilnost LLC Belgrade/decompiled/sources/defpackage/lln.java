package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lln {
    public final String a;
    public final String b;

    public lln(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lln)) {
            return false;
        }
        lln llnVar = (lln) obj;
        return this.a.equals(llnVar.a) && jl40.l(this.b, llnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("EditContactNameUiState(name=", this.a, ", error=", this.b, Extension.C_BRAKE);
    }
}
