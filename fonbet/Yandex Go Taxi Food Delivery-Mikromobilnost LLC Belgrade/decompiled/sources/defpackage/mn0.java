package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mn0 {
    public final String a;
    public final String b;

    public mn0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn0)) {
            return false;
        }
        mn0 mn0Var = (mn0) obj;
        return this.a.equals(mn0Var.a) && this.b.equals(mn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AdditionalPolicy(title=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
