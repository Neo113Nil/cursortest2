package defpackage;

import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Payment$ErrorStatusCode;

/* loaded from: classes2.dex */
public final class exw {
    public final String a;
    public final Invoice$Payment$ErrorStatusCode b;
    public final String c;
    public final String d;

    public exw(String str, Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode, String str2, String str3) {
        this.a = str;
        this.b = invoice$Payment$ErrorStatusCode;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exw)) {
            return false;
        }
        exw exwVar = (exw) obj;
        return this.a.equals(exwVar.a) && this.b == exwVar.b && jl40.l(this.c, exwVar.c) && this.d.equals(exwVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (invoice$Payment$ErrorStatusCode == null ? 0 : invoice$Payment$ErrorStatusCode.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payment(id=");
        sb.append(this.a);
        sb.append(", errorStatusCode=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", description=");
        return b64.p(sb, this.d, ')');
    }
}
