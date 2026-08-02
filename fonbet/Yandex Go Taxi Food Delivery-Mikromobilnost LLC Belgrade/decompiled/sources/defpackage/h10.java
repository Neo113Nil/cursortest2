package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class h10 {
    public final odj a;

    public h10(odj odjVar) {
        this.a = odjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && jl40.l(this.a, ((h10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Known(value=" + this.a + Extension.C_BRAKE;
    }
}
