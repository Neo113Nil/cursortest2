package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class h0a0 {
    public static final h0a0 c = new h0a0(zzs.f, null);
    public final zzs a;
    public final String b;

    public h0a0(zzs zzsVar, String str) {
        this.a = zzsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0a0)) {
            return false;
        }
        h0a0 h0a0Var = (h0a0) obj;
        return jl40.l(this.a, h0a0Var.a) && jl40.l(this.b, h0a0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PaymentGeoContext(geoPoint=" + this.a + ", zoneName=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ h0a0(zzs zzsVar) {
        this(zzsVar, null);
    }
}
