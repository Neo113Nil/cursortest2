package xsna;

import com.vk.dto.common.account.AudioAdConfig;

/* compiled from: UpdateUserStatisticResult.kt */
/* loaded from: classes3.dex */
public final class j9q0 {
    public final boolean a;
    public final AudioAdConfig.Type b;

    public j9q0(boolean z, AudioAdConfig.Type type) {
        this.a = z;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9q0)) {
            return false;
        }
        j9q0 j9q0Var = (j9q0) obj;
        return this.a == j9q0Var.a && this.b == j9q0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "UpdateUserStatisticResult(shouldShowAd=" + this.a + ", adType=" + this.b + ')';
    }
}
