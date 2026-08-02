package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ndu implements odu {
    public final mdu a;
    public final mdu b;

    public ndu(mdu mduVar, mdu mduVar2) {
        this.a = mduVar;
        this.b = mduVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndu)) {
            return false;
        }
        ndu nduVar = (ndu) obj;
        return jl40.l(this.a, nduVar.a) && jl40.l(this.b, nduVar.b);
    }

    public final int hashCode() {
        mdu mduVar = this.a;
        int hashCode = (mduVar == null ? 0 : mduVar.hashCode()) * 31;
        mdu mduVar2 = this.b;
        return hashCode + (mduVar2 != null ? mduVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Visible(topGradient=" + this.a + ", bottomGradient=" + this.b + Extension.C_BRAKE;
    }
}
