package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ijq0 implements wjq0 {
    public final eh01 a;
    public final PaymentProviderEntity b;
    public final String c;

    public ijq0(eh01 eh01Var, PaymentProviderEntity paymentProviderEntity, String str) {
        this.a = eh01Var;
        this.b = paymentProviderEntity;
        this.c = str;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijq0)) {
            return false;
        }
        ijq0 ijq0Var = (ijq0) obj;
        return jl40.l(this.a, ijq0Var.a) && this.b.equals(ijq0Var.b) && jl40.l(this.c, ijq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternetPayment(fromCircleButton=");
        sb.append(this.a);
        sb.append(", provider=");
        sb.append(this.b);
        sb.append(", accountNumber=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
