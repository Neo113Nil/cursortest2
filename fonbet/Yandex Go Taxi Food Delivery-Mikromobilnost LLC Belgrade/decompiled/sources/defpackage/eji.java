package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class eji {
    public final fji a;
    public final fji b;

    public eji(fji fjiVar, fji fjiVar2) {
        this.a = fjiVar;
        this.b = fjiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eji)) {
            return false;
        }
        eji ejiVar = (eji) obj;
        return jl40.l(this.a, ejiVar.a) && jl40.l(this.b, ejiVar.b);
    }

    public final int hashCode() {
        fji fjiVar = this.a;
        int hashCode = (fjiVar == null ? 0 : fjiVar.hashCode()) * 31;
        fji fjiVar2 = this.b;
        return hashCode + (fjiVar2 != null ? fjiVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryMapPinState(source=" + this.a + ", destination=" + this.b + Extension.C_BRAKE;
    }
}
