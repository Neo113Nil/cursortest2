package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class abs implements qas0 {
    public final String a;
    public final String b;

    public abs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abs)) {
            return false;
        }
        abs absVar = (abs) obj;
        return jl40.l(this.a, absVar.a) && jl40.l(this.b, absVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("ShowAlertDialog(title=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }
}
