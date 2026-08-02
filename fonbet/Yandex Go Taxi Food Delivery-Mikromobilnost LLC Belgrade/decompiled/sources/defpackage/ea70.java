package defpackage;

import com.yandex.go.payments.shared.data.model.Account;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ea70 implements ha70 {
    public final snr0 a;
    public final Account b;

    public ea70(snr0 snr0Var, Account account) {
        this.a = snr0Var;
        this.b = account;
    }

    public final snr0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea70)) {
            return false;
        }
        ea70 ea70Var = (ea70) obj;
        return jl40.l(this.a, ea70Var.a) && jl40.l(this.b, ea70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Found(sharedPayment=" + this.a + ", account=" + this.b + Extension.C_BRAKE;
    }
}
