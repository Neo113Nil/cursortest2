package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nnn {
    public final String a;
    public final String b;

    public nnn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnn)) {
            return false;
        }
        nnn nnnVar = (nnn) obj;
        return jl40.l(this.a, nnnVar.a) && jl40.l(this.b, nnnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("EditStateWidgetAction(formStateKey=", this.a, ", metricaLabel=", this.b, Extension.C_BRAKE);
    }
}
