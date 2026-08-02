package defpackage;

import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a1v0 {
    public final SubscriptionInfoEntity a;
    public final String b;
    public final String c;

    public a1v0(SubscriptionInfoEntity subscriptionInfoEntity, String str, String str2) {
        this.a = subscriptionInfoEntity;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1v0)) {
            return false;
        }
        a1v0 a1v0Var = (a1v0) obj;
        return this.a.equals(a1v0Var.a) && jl40.l(this.b, a1v0Var.b) && jl40.l(this.c, a1v0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionInfoEntityV2(commonSubscriptionInfo=");
        sb.append(this.a);
        sb.append(", redirectUrl=");
        sb.append(this.b);
        sb.append(", paymentServiceId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
