package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bqs {
    public final MoneyEntity a;
    public final String b;
    public final String c;

    public bqs(String str, String str2, MoneyEntity moneyEntity) {
        this.a = moneyEntity;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqs)) {
            return false;
        }
        bqs bqsVar = (bqs) obj;
        return jl40.l(this.a, bqsVar.a) && jl40.l(this.b, bqsVar.b) && jl40.l(this.c, bqsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FundTopupInfoEntity(money=");
        sb.append(this.a);
        sb.append(", sourceAgreementId=");
        sb.append(this.b);
        sb.append(", targetAgreementId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
