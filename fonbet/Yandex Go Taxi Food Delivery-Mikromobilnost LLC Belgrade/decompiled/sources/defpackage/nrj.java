package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nrj {
    public final boolean a;
    public final ReferralOverrides b;
    public final ReferralService c;

    public nrj(boolean z, ReferralOverrides referralOverrides, ReferralService referralService) {
        this.a = z;
        this.b = referralOverrides;
        this.c = referralService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrj)) {
            return false;
        }
        nrj nrjVar = (nrj) obj;
        return this.a == nrjVar.a && jl40.l(this.b, nrjVar.b) && this.c == nrjVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DiscountsReferralsInfo(canShow=" + this.a + ", overrides=" + this.b + ", service=" + this.c + Extension.C_BRAKE;
    }
}
