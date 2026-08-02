package defpackage;

import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nud {
    public final Long a;
    public final PaymentMethodBindingStatusResponse.BindingStatus b;
    public final boolean c;
    public final String d;
    public final String e;

    public nud(Long l, PaymentMethodBindingStatusResponse.BindingStatus bindingStatus, boolean z, String str, String str2) {
        this.a = l;
        this.b = bindingStatus;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final Long c() {
        return this.a;
    }

    public final PaymentMethodBindingStatusResponse.BindingStatus d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nud)) {
            return false;
        }
        nud nudVar = (nud) obj;
        return jl40.l(this.a, nudVar.a) && this.b == nudVar.b && this.c == nudVar.c && jl40.l(this.d, nudVar.d) && jl40.l(this.e, nudVar.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int e = unr0.e((this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompoundBindingStatus(pollingDelay=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", isSuccessful=");
        unr0.A(", paymentMethodId=", this.d, ", bindUrl=", sb, this.c);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
