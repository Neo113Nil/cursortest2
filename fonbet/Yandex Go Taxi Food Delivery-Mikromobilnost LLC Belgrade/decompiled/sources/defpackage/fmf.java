package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fmf {
    public final int a;
    public final float b;
    public final float c;
    public final String d;
    public final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType e;
    public final fef f;

    public fmf(int i, float f, float f2, String str, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, fef fefVar) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = str;
        this.e = taxiOrderTipsValueType;
        this.f = fefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmf)) {
            return false;
        }
        fmf fmfVar = (fmf) obj;
        return this.a == fmfVar.a && Float.compare(this.b, fmfVar.b) == 0 && Float.compare(this.c, fmfVar.c) == 0 && jl40.l(this.d, fmfVar.d) && this.e == fmfVar.e && jl40.l(this.f, fmfVar.f);
    }

    public final int hashCode() {
        int c = g8e.c(this.c, g8e.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        int hashCode = (this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        fef fefVar = this.f;
        return hashCode + (fefVar != null ? fefVar.hashCode() : 0);
    }

    public final String toString() {
        return "CustomTipsInputPayload(digitsCount=" + this.a + ", minValue=" + this.b + ", maxValue=" + this.c + ", previousValue=" + this.d + ", tipsValueType=" + this.e + ", currencyRules=" + this.f + Extension.C_BRAKE;
    }
}
