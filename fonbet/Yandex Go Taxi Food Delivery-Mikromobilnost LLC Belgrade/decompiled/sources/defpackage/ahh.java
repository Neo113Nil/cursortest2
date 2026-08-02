package defpackage;

import com.ybsdk.feature.change.payment.method.internal.data.DefaultPaymentMethodUnifiedStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ahh {
    public final DefaultPaymentMethodUnifiedStatusEntity a;
    public final String b;
    public final String c;
    public final String d;

    public ahh(DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity, String str, String str2, String str3) {
        this.a = defaultPaymentMethodUnifiedStatusEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahh)) {
            return false;
        }
        ahh ahhVar = (ahh) obj;
        return this.a == ahhVar.a && jl40.l(this.b, ahhVar.b) && jl40.l(this.c, ahhVar.c) && jl40.l(this.d, ahhVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultPaymentMethodUnifiedSetStatusEntity(status=");
        sb.append(this.a);
        sb.append(", url3ds=");
        sb.append(this.b);
        sb.append(", paymentUrl=");
        return g8e.r(sb, this.c, ", errorCode=", this.d, Extension.C_BRAKE);
    }
}
