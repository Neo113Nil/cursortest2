package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.surge.models.domain.PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle;

/* loaded from: classes6.dex */
public final class pye0 {
    public final low0 a;
    public final String b;
    public final PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle c;
    public final String d;

    public pye0(low0 low0Var, String str, PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle, String str2) {
        this.a = low0Var;
        this.b = str;
        this.c = priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pye0)) {
            return false;
        }
        pye0 pye0Var = (pye0) obj;
        return jl40.l(this.a, pye0Var.a) && jl40.l(this.b, pye0Var.b) && this.c == pye0Var.c && jl40.l(this.d, pye0Var.d);
    }

    public final int hashCode() {
        low0 low0Var = this.a;
        int hashCode = (this.c.hashCode() + unr0.b((low0Var == null ? 0 : low0Var.hashCode()) * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Button(action=" + this.a + ", text=" + this.b + ", style=" + this.c + ", leadIconTag=" + this.d + Extension.C_BRAKE;
    }
}
