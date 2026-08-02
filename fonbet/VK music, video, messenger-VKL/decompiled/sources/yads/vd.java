package yads;

import xsna.epx;
import xsna.qoy;

/* loaded from: classes10.dex */
public final class vd {
    public final td a;
    public final td b;
    public final boolean c;
    public final String d;

    public vd(td tdVar, td tdVar2, boolean z, String str) {
        this.a = tdVar;
        this.b = tdVar2;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return epx.f(this.a, vdVar.a) && epx.f(this.b, vdVar.b) && this.c == vdVar.c && epx.f(this.d, vdVar.d);
    }

    public final int hashCode() {
        td tdVar = this.a;
        int hashCode = (tdVar == null ? 0 : tdVar.hashCode()) * 31;
        td tdVar2 = this.b;
        int b = qoy.b((hashCode + (tdVar2 == null ? 0 : tdVar2.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.a + ", hmsAdvertisingInfo=" + this.b + ", gmsAdvertisingReset=" + this.c + ", appSetId=" + this.d + ")";
    }
}
