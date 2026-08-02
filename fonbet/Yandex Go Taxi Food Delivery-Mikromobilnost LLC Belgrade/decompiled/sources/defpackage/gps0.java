package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gps0 extends n351 {
    public final aps0 c;
    public final x2s d;
    public final String e;

    public gps0(aps0 aps0Var, x2s x2sVar, String str) {
        super("slider-button", false, 14);
        this.c = aps0Var;
        this.d = x2sVar;
        this.e = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gps0)) {
            return false;
        }
        gps0 gps0Var = (gps0) obj;
        return this.c.equals(gps0Var.c) && jl40.l(this.d, gps0Var.d) && jl40.l(this.e, gps0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        x2s x2sVar = this.d;
        int hashCode2 = (hashCode + (x2sVar == null ? 0 : x2sVar.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderButtonWidgetState(state=");
        sb.append(this.c);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
