package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jo extends lr {
    public final hki a;

    public jo(hki hkiVar) {
        this.a = hkiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo) && jl40.l(this.a, ((jo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddressSelected(pointType=" + this.a + Extension.C_BRAKE;
    }
}
