package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;

/* loaded from: classes6.dex */
public final class f6f implements i6f {
    public final Throwable a;
    public final CreatePaymentDto$ErrorType b;
    public final String c;

    public f6f(Throwable th, CreatePaymentDto$ErrorType createPaymentDto$ErrorType, String str) {
        this.a = th;
        this.b = createPaymentDto$ErrorType;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6f)) {
            return false;
        }
        f6f f6fVar = (f6f) obj;
        return jl40.l(this.a, f6fVar.a) && this.b == f6fVar.b && jl40.l(this.c, f6fVar.c);
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        CreatePaymentDto$ErrorType createPaymentDto$ErrorType = this.b;
        int hashCode2 = (hashCode + (createPaymentDto$ErrorType == null ? 0 : createPaymentDto$ErrorType.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(throwable=");
        sb.append(this.a);
        sb.append(", errorType=");
        sb.append(this.b);
        sb.append(", requestId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
