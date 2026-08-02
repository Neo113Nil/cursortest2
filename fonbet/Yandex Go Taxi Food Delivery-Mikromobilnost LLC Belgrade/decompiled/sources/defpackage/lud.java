package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatus;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentUi;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lud extends mud {
    public final AcceptancePaymentStatus a;
    public final String b;
    public final AcceptancePaymentUi c;
    public final Long d;

    public lud(AcceptancePaymentStatus acceptancePaymentStatus, String str, AcceptancePaymentUi acceptancePaymentUi, Long l) {
        this.a = acceptancePaymentStatus;
        this.b = str;
        this.c = acceptancePaymentUi;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lud)) {
            return false;
        }
        lud ludVar = (lud) obj;
        return this.a == ludVar.a && jl40.l(this.b, ludVar.b) && jl40.l(this.c, ludVar.c) && jl40.l(this.d, ludVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AcceptancePaymentUi acceptancePaymentUi = this.c;
        int hashCode3 = (hashCode2 + (acceptancePaymentUi == null ? 0 : acceptancePaymentUi.hashCode())) * 31;
        Long l = this.d;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Success(status=" + this.a + ", paymentUrl=" + this.b + ", ui=" + this.c + ", pollingDelayMs=" + this.d + Extension.C_BRAKE;
    }
}
