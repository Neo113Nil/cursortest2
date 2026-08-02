package defpackage;

import com.ybsdk.api.entities.YBProduct;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class aqi0 extends cqi0 {
    public final Throwable a;
    public final String b;
    public final YBProduct c;
    public final String d;
    public final String e;

    public aqi0(Throwable th, String str, YBProduct yBProduct, String str2, String str3) {
        this.a = th;
        this.b = str;
        this.c = yBProduct;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.eqi0
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqi0)) {
            return false;
        }
        aqi0 aqi0Var = (aqi0) obj;
        return this.a.equals(aqi0Var.a) && jl40.l(this.b, aqi0Var.b) && this.c == aqi0Var.c && jl40.l(this.d, aqi0Var.d) && jl40.l(this.e, aqi0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationNextError(error=");
        sb.append(this.a);
        sb.append(", applicationId=");
        sb.append(this.b);
        sb.append(", product=");
        sb.append(this.c);
        sb.append(", supportUrl=");
        sb.append(this.d);
        sb.append(", actionAfterRegistration=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
