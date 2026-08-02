package defpackage;

import com.yandex.go.payments.api.interactor.BankPaymentsDepositType;
import java.math.BigDecimal;

/* loaded from: classes13.dex */
public final class az51 {
    public final BigDecimal a;
    public final String b;
    public final BankPaymentsDepositType c;

    public az51(BigDecimal bigDecimal, String str, BankPaymentsDepositType bankPaymentsDepositType) {
        this.a = bigDecimal;
        this.b = str;
        this.c = bankPaymentsDepositType;
    }

    public final BigDecimal a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final BankPaymentsDepositType c() {
        return this.c;
    }
}
