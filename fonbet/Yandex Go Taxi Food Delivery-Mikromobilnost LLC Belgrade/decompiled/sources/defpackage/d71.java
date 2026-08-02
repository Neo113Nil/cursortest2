package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d71 {
    public final String a;
    public final x2s b;

    public d71(String str, x2s x2sVar) {
        this.a = str;
        this.b = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71)) {
            return false;
        }
        d71 d71Var = (d71) obj;
        return jl40.l(this.a, d71Var.a) && this.b.equals(d71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressSelectorUiData(title=" + this.a + ", analyticsData=" + this.b + Extension.C_BRAKE;
    }
}
