package defpackage;

import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ffm0 {
    public final SbpChallengeResultInfo$SbpChallengeStatus a;
    public final int b;

    public ffm0(SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus, int i) {
        this.a = sbpChallengeResultInfo$SbpChallengeStatus;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffm0)) {
            return false;
        }
        ffm0 ffm0Var = (ffm0) obj;
        return this.a == ffm0Var.a && this.b == ffm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SbpChallengeResultInfo(status=" + this.a + ", attemptsLeft=" + this.b + Extension.C_BRAKE;
    }
}
