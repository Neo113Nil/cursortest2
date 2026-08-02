package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e0a implements o0a {
    public final xy9 a;
    public final ChargersFeedbackCompletedOrder$FinishingStage b;

    public e0a(xy9 xy9Var, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage) {
        this.a = xy9Var;
        this.b = chargersFeedbackCompletedOrder$FinishingStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0a)) {
            return false;
        }
        e0a e0aVar = (e0a) obj;
        return jl40.l(this.a, e0aVar.a) && this.b == e0aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBannerClick(bannerAction=" + this.a + ", finishingStage=" + this.b + Extension.C_BRAKE;
    }
}
