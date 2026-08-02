package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jkg implements lkg {
    public final oig a;

    public jkg(oig oigVar) {
        this.a = oigVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jkg) && jl40.l(this.a, ((jkg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(dashboard=" + this.a + Extension.C_BRAKE;
    }
}
