package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class abk0 implements ebk0 {
    public final int a;
    public final float b;
    public final float c;
    public final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType d;
    public final String e;

    public abk0(int i, float f, float f2, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = taxiOrderTipsValueType;
        this.e = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "select_custom_tips";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abk0)) {
            return false;
        }
        abk0 abk0Var = (abk0) obj;
        return this.a == abk0Var.a && Float.compare(this.b, abk0Var.b) == 0 && Float.compare(this.c, abk0Var.c) == 0 && this.d == abk0Var.d && jl40.l(this.e, abk0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + g8e.c(this.c, g8e.c(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectCustom(decimalDigits=");
        sb.append(this.a);
        sb.append(", minValue=");
        sb.append(this.b);
        sb.append(", maxValue=");
        sb.append(this.c);
        sb.append(", tipsValueType=");
        sb.append(this.d);
        sb.append(", previousValue=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
