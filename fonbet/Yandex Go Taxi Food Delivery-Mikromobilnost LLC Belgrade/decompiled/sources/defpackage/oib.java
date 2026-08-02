package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class oib implements wib {
    public final String a;
    public final nnb b;

    public oib(String str, nnb nnbVar) {
        this.a = str;
        this.b = nnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oib)) {
            return false;
        }
        oib oibVar = (oib) obj;
        return jl40.l(this.a, oibVar.a) && this.b.equals(oibVar.b);
    }

    @Override // defpackage.wib
    public final nnb getAnalytics() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Checkout(tripId=" + this.a + ", analytics=" + this.b + Extension.C_BRAKE;
    }
}
