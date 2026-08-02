package defpackage;

import com.ybsdk.api.entities.YBProduct;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dqi0 extends eqi0 {
    public final YBProduct a;
    public final String b;
    public final Throwable c;
    public final Map d;

    public dqi0(YBProduct yBProduct, String str, Throwable th, Map map) {
        this.a = yBProduct;
        this.b = str;
        this.c = th;
        this.d = map;
    }

    @Override // defpackage.eqi0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqi0)) {
            return false;
        }
        dqi0 dqi0Var = (dqi0) obj;
        return this.a == dqi0Var.a && jl40.l(this.b, dqi0Var.b) && this.c.equals(dqi0Var.c) && jl40.l(this.d, dqi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ProductOpeningFailed(product=" + this.a + ", supportUrl=" + this.b + ", throwable=" + this.c + ", additionalParams=" + this.d + Extension.C_BRAKE;
    }
}
