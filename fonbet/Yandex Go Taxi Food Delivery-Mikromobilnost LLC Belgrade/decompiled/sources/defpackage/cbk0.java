package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cbk0 implements ebk0 {
    public final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType a;
    public final String b;

    public cbk0(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        this.a = taxiOrderTipsValueType;
        this.b = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "select_value_tips";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbk0)) {
            return false;
        }
        cbk0 cbk0Var = (cbk0) obj;
        return this.a == cbk0Var.a && this.b.equals(cbk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectValue(tipsType=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
