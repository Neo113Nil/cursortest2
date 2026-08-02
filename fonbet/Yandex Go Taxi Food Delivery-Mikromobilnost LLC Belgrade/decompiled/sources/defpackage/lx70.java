package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lx70 {
    public final boolean a;
    public final SimplifiedPaymentStatus b;
    public final String c;
    public final String d;
    public final SimplifiedPaymentStatus e;
    public final String f;

    public lx70(boolean z, SimplifiedPaymentStatus simplifiedPaymentStatus, String str, String str2, SimplifiedPaymentStatus simplifiedPaymentStatus2, String str3) {
        this.a = z;
        this.b = simplifiedPaymentStatus;
        this.c = str;
        this.d = str2;
        this.e = simplifiedPaymentStatus2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx70)) {
            return false;
        }
        lx70 lx70Var = (lx70) obj;
        return this.a == lx70Var.a && this.b == lx70Var.b && jl40.l(this.c, lx70Var.c) && jl40.l(this.d, lx70Var.d) && this.e == lx70Var.e && jl40.l(this.f, lx70Var.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        SimplifiedPaymentStatus simplifiedPaymentStatus = this.b;
        int b = unr0.b(unr0.b((hashCode + (simplifiedPaymentStatus == null ? 0 : simplifiedPaymentStatus.hashCode())) * 31, 31, this.c), 31, this.d);
        SimplifiedPaymentStatus simplifiedPaymentStatus2 = this.e;
        return this.f.hashCode() + ((b + (simplifiedPaymentStatus2 != null ? simplifiedPaymentStatus2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderInfo(canBeAnonymous=");
        sb.append(this.a);
        sb.append(", lastTransactionStatus=");
        sb.append(this.b);
        sb.append(", longUrl=");
        g8e.D(sb, this.c, ", merchantId=", this.d, ", orderStatus=");
        sb.append(this.e);
        sb.append(", orderToken=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
