package defpackage;

import com.yandex.go.payments.addmethod.navigation.e;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class bf0 extends e {
    public final /* synthetic */ int F;
    public final PaymentMethod$Type G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(ik0 ik0Var, int i) {
        super(ik0Var);
        this.F = i;
        switch (i) {
            case 1:
                super(ik0Var);
                this.G = PaymentMethod$Type.NEQUI_TOKEN;
                break;
            default:
                this.G = PaymentMethod$Type.JAZZCASH_WALLET;
                break;
        }
    }

    @Override // com.yandex.go.payments.addmethod.navigation.e
    public final PaymentMethod$Type R() {
        switch (this.F) {
        }
        return this.G;
    }
}
