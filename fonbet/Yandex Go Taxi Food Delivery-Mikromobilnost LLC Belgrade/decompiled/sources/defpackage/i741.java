package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i741 {
    public final String a;
    public final String b;
    public final boolean c;

    public i741(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i741)) {
            return false;
        }
        i741 i741Var = (i741) obj;
        return jl40.l(this.a, i741Var.a) && jl40.l(this.b, i741Var.b) && this.c == i741Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("WalkingRouteEnabledTariffClass(tariffClass=", this.a, ", alternativeType=", this.b, ", shouldZoomToWalkingRoute="), this.c, Extension.C_BRAKE);
    }
}
