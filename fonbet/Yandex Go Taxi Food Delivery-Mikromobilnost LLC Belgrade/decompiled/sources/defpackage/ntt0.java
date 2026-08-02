package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.split.deposit.internal.domain.model.SplitDepositPageData$AutoTopupData$AutoTopupStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ntt0 {
    public final MoneyEntity a;
    public final MoneyEntity b;
    public final MoneyEntity c;
    public final SplitDepositPageData$AutoTopupData$AutoTopupStatus d;

    public ntt0(MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, SplitDepositPageData$AutoTopupData$AutoTopupStatus splitDepositPageData$AutoTopupData$AutoTopupStatus) {
        this.a = moneyEntity;
        this.b = moneyEntity2;
        this.c = moneyEntity3;
        this.d = splitDepositPageData$AutoTopupData$AutoTopupStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntt0)) {
            return false;
        }
        ntt0 ntt0Var = (ntt0) obj;
        return this.a.equals(ntt0Var.a) && this.b.equals(ntt0Var.b) && this.c.equals(ntt0Var.c) && this.d == ntt0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ly3.d(this.c, ly3.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AutoTopupSettings(autoFundLimit=" + this.a + ", autoTopupThreshold=" + this.b + ", autoTopupAmount=" + this.c + ", autoTopupStatus=" + this.d + Extension.C_BRAKE;
    }
}
