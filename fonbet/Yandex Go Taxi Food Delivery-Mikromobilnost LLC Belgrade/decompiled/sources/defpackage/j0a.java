package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class j0a implements o0a {
    public final uj9 a;
    public final ChargersFeedbackCompletedOrder$FinishingStage b;

    public j0a(uj9 uj9Var, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage) {
        this.a = uj9Var;
        this.b = chargersFeedbackCompletedOrder$FinishingStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0a)) {
            return false;
        }
        j0a j0aVar = (j0a) obj;
        return this.a.equals(j0aVar.a) && this.b == j0aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnValueClick(action=" + this.a + ", finishingStage=" + this.b + Extension.C_BRAKE;
    }
}
