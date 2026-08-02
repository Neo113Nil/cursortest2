package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackBannerAnalyticsAlias;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m0a implements o0a {
    public final String a;
    public final ChargersFeedbackBannerAnalyticsAlias b;
    public final ChargersFeedbackCompletedOrder$FinishingStage c;
    public final String d;

    public m0a(String str, ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage, String str2) {
        this.a = str;
        this.b = chargersFeedbackBannerAnalyticsAlias;
        this.c = chargersFeedbackCompletedOrder$FinishingStage;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0a)) {
            return false;
        }
        m0a m0aVar = (m0a) obj;
        return jl40.l(this.a, m0aVar.a) && this.b == m0aVar.b && this.c == m0aVar.c && jl40.l(this.d, m0aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (chargersFeedbackBannerAnalyticsAlias == null ? 0 : chargersFeedbackBannerAnalyticsAlias.hashCode())) * 31)) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Shown(powerbankNumber=" + this.a + ", promoBanner=" + this.b + ", finishingStage=" + this.c + ", promoPlateId=" + this.d + Extension.C_BRAKE;
    }
}
