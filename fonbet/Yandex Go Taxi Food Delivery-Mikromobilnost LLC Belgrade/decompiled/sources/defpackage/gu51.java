package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gu51 {
    public final String a;
    public final String b;

    public gu51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu51)) {
            return false;
        }
        gu51 gu51Var = (gu51) obj;
        return jl40.l(this.a, gu51Var.a) && this.b.equals(gu51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("YbQrState(deeplink=", this.a, ", contentDescription=", this.b, Extension.C_BRAKE);
    }
}
