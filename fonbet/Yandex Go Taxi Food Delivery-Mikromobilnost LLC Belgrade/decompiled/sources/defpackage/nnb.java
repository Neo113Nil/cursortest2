package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nnb {
    public final CheckoutButtonAction a;
    public final String b;
    public final String c;
    public final String d;

    public nnb(CheckoutButtonAction checkoutButtonAction, String str, String str2, String str3) {
        this.a = checkoutButtonAction;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnb)) {
            return false;
        }
        nnb nnbVar = (nnb) obj;
        return this.a == nnbVar.a && jl40.l(this.b, nnbVar.b) && jl40.l(this.c, nnbVar.c) && jl40.l(this.d, nnbVar.d);
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
        StringBuilder sb = new StringBuilder("CheckoutTapAnalytics(button=");
        sb.append(this.a);
        sb.append(", tripId=");
        sb.append(this.b);
        sb.append(", requestId=");
        return g8e.r(sb, this.c, ", property=", this.d, Extension.C_BRAKE);
    }
}
