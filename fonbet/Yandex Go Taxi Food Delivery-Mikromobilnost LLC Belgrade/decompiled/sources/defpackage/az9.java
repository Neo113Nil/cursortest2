package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class az9 {
    public final String a;
    public final nvi0 b;
    public final boolean c;
    public final ty9 d;
    public final dz9 e;
    public final v0a f;
    public final zy9 g;
    public final ChargersFeedbackCompletedOrder$FinishingStage h;

    public az9(String str, nvi0 nvi0Var, boolean z, ty9 ty9Var, dz9 dz9Var, v0a v0aVar, zy9 zy9Var, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage) {
        this.a = str;
        this.b = nvi0Var;
        this.c = z;
        this.d = ty9Var;
        this.e = dz9Var;
        this.f = v0aVar;
        this.g = zy9Var;
        this.h = chargersFeedbackCompletedOrder$FinishingStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az9)) {
            return false;
        }
        az9 az9Var = (az9) obj;
        return jl40.l(this.a, az9Var.a) && jl40.l(this.b, az9Var.b) && this.c == az9Var.c && jl40.l(this.d, az9Var.d) && jl40.l(this.e, az9Var.e) && jl40.l(this.f, az9Var.f) && jl40.l(this.g, az9Var.g) && this.h == az9Var.h;
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ty9 ty9Var = this.d;
        int hashCode = (e + (ty9Var == null ? 0 : ty9Var.hashCode())) * 31;
        dz9 dz9Var = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (dz9Var == null ? 0 : dz9Var.hashCode())) * 31)) * 31;
        zy9 zy9Var = this.g;
        return this.h.hashCode() + ((hashCode2 + (zy9Var != null ? zy9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChargersFeedbackCompletedOrder(powerbankNumber=" + this.a + ", powerbankIcon=" + this.b + ", isRatingEnabled=" + this.c + ", banner=" + this.d + ", promoPlate=" + this.e + ", finishInfo=" + this.f + ", feedbackChips=" + this.g + ", finishingStage=" + this.h + Extension.C_BRAKE;
    }
}
