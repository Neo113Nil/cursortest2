package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class izt {
    public final String a;
    public final double b;

    public izt(String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izt)) {
            return false;
        }
        izt iztVar = (izt) obj;
        return jl40.l(this.a, iztVar.a) && Double.compare(this.b, iztVar.b) == 0;
    }

    public final int hashCode() {
        String str = this.a;
        return Double.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "GradientStop(color=" + this.a + ", location=" + this.b + Extension.C_BRAKE;
    }
}
