package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;

/* loaded from: classes6.dex */
public final class h6f implements i6f {
    public final CreatePaymentResponse a;
    public final String b;

    static {
        q6f q6fVar = CreatePaymentResponse.Companion;
    }

    public h6f(CreatePaymentResponse createPaymentResponse, String str) {
        this.a = createPaymentResponse;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6f)) {
            return false;
        }
        h6f h6fVar = (h6f) obj;
        return this.a.equals(h6fVar.a) && jl40.l(this.b, h6fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Success(response=" + this.a + ", createPaymentRequestId=" + this.b + Extension.C_BRAKE;
    }
}
