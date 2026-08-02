package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nhy0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final ygy0 d;
    public final ygy0 e;

    public nhy0(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, ygy0 ygy0Var, ygy0 ygy0Var2) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = ygy0Var;
        this.e = ygy0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhy0)) {
            return false;
        }
        nhy0 nhy0Var = (nhy0) obj;
        return this.a.equals(nhy0Var.a) && jl40.l(this.b, nhy0Var.b) && jl40.l(this.c, nhy0Var.c) && this.d.equals(nhy0Var.d) && jl40.l(this.e, nhy0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        ygy0 ygy0Var = this.e;
        return hashCode + (ygy0Var == null ? 0 : ygy0Var.hashCode());
    }

    public final String toString() {
        return "TestPaymentTimeoutEntity(memberImage=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", primaryButton=" + this.d + ", secondaryButton=" + this.e + Extension.C_BRAKE;
    }
}
