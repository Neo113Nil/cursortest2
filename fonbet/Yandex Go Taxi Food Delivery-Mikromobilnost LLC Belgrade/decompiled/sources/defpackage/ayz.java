package defpackage;

import com.yandex.go.payments.data.e;
import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import com.yandex.go.payments.domain.BankModel;
import java.util.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class ayz implements eq4 {
    public final r0 a;

    public ayz() {
        BankModel.Companion.getClass();
        this.a = bvf0.c(BankModel.d);
    }

    @Override // defpackage.eq4
    public final String a(String str) {
        PaymentMethodsBankIcons paymentMethodsBankIcons;
        Map map = ((BankModel) this.a.getValue()).b;
        if (map == null || (paymentMethodsBankIcons = (PaymentMethodsBankIcons) map.get(str)) == null) {
            return null;
        }
        return paymentMethodsBankIcons.a;
    }

    @Override // defpackage.eq4
    public final tpr b() {
        return new e(new mth(this.a, 4));
    }

    @Override // defpackage.eq4
    public final String c(String str) {
        PaymentMethodsBankIcons paymentMethodsBankIcons;
        Map map = ((BankModel) this.a.getValue()).b;
        if (map == null || (paymentMethodsBankIcons = (PaymentMethodsBankIcons) map.get(str)) == null) {
            return null;
        }
        return paymentMethodsBankIcons.b;
    }

    @Override // defpackage.eq4
    public final void init() {
    }
}
