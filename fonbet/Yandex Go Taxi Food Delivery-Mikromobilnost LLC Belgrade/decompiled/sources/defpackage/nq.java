package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nq extends lr {
    public final hki a;
    public final boolean b;

    public nq(hki hkiVar, boolean z) {
        this.a = hkiVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        return jl40.l(this.a, nqVar.a) && this.b == nqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhoneSelected(pointType=" + this.a + ", bubbleIsHidden=" + this.b + Extension.C_BRAKE;
    }
}
