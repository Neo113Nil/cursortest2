package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g0a implements o0a {
    public final List a;
    public final ChargersFeedbackCompletedOrder$FinishingStage b;

    public g0a(ArrayList arrayList, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage) {
        this.a = arrayList;
        this.b = chargersFeedbackCompletedOrder$FinishingStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0a)) {
            return false;
        }
        g0a g0aVar = (g0a) obj;
        return jl40.l(this.a, g0aVar.a) && this.b == g0aVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "OnDoneClick(selectedChips=" + this.a + ", finishingStage=" + this.b + Extension.C_BRAKE;
    }
}
