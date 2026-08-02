package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class i0a implements o0a {
    public final int a;
    public final ChargersFeedbackCompletedOrder$FinishingStage b;

    public i0a(int i, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage) {
        this.a = i;
        this.b = chargersFeedbackCompletedOrder$FinishingStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0a)) {
            return false;
        }
        i0a i0aVar = (i0a) obj;
        return this.a == i0aVar.a && this.b == i0aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnRatingChange(value=" + this.a + ", finishingStage=" + this.b + Extension.C_BRAKE;
    }
}
