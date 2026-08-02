package defpackage;

import com.ybsdk.api.entities.YBProduct;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class lri0 extends zia1 {
    public final YBProduct a;
    public final String b;

    public lri0(YBProduct yBProduct, String str) {
        this.a = yBProduct;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lri0)) {
            return false;
        }
        lri0 lri0Var = (lri0) obj;
        return this.a == lri0Var.a && jl40.l(this.b, lri0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenProduct(product=" + this.a + ", landingUrl=" + this.b + Extension.C_BRAKE;
    }
}
