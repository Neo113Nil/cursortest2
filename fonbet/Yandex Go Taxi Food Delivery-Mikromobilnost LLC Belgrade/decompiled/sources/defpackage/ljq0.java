package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ljq0 implements wjq0 {
    public final eh01 a;
    public final PaymentProviderEntity b;
    public final String c;

    public ljq0(eh01 eh01Var, PaymentProviderEntity paymentProviderEntity, String str) {
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
        if (!(obj instanceof ljq0)) {
            return false;
        }
        ljq0 ljq0Var = (ljq0) obj;
        return jl40.l(this.a, ljq0Var.a) && this.b.equals(ljq0Var.b) && jl40.l(this.c, ljq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobilePayment(fromCircleButton=");
        sb.append(this.a);
        sb.append(", provider=");
        sb.append(this.b);
        sb.append(", phone=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
