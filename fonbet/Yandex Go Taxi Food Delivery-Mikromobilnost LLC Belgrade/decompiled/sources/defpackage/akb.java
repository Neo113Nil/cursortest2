package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class akb implements snb {
    public final CheckoutErrorReason a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public akb(CheckoutErrorReason checkoutErrorReason, String str, String str2, String str3, String str4) {
        this.a = checkoutErrorReason;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.snb
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        return this.a == akbVar.a && jl40.l(this.b, akbVar.b) && jl40.l(this.c, akbVar.c) && jl40.l(this.d, akbVar.d) && this.e.equals(akbVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutErrorShownAnalytics(reason=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", tripId=");
        g8e.D(sb, this.c, ", orderId=", this.d, ", eventKey=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
