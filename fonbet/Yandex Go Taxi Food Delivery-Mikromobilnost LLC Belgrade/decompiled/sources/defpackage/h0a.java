package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h0a implements o0a {
    public final o0a a;
    public final ChargersFeedbackCompletedOrder$FinishingStage b;
    public final String c;

    public h0a(o0a o0aVar, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage, String str) {
        this.a = o0aVar;
        this.b = chargersFeedbackCompletedOrder$FinishingStage;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0a)) {
            return false;
        }
        h0a h0aVar = (h0a) obj;
        return this.a.equals(h0aVar.a) && this.b == h0aVar.b && jl40.l(this.c, h0aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPromoPlateClick(action=");
        sb.append(this.a);
        sb.append(", finishingStage=");
        sb.append(this.b);
        sb.append(", promoPlateId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
