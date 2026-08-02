package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;

/* loaded from: classes9.dex */
public final class dkd0 {
    public static final dkd0 c = new dkd0(null, SubscriptionStatusDto.UNRECOGNIZED);
    public final String a;
    public final SubscriptionStatusDto b;

    public dkd0(String str, SubscriptionStatusDto subscriptionStatusDto) {
        this.a = str;
        this.b = subscriptionStatusDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkd0)) {
            return false;
        }
        dkd0 dkd0Var = (dkd0) obj;
        return jl40.l(this.a, dkd0Var.a) && this.b == dkd0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PlusSdkContext(balance=" + this.a + ", subscriptionStatus=" + this.b + Extension.C_BRAKE;
    }
}
