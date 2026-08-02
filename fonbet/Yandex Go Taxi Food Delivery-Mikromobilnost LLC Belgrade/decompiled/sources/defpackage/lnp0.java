package defpackage;

import com.yandex.go.sdk_registry.api.SdkComponentTier;
import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lnp0 {
    public final qnp0 a;
    public final SdkComponentTier b;
    public final SdkLifecycleStage c;
    public final SdkLifecycleStage d;

    public lnp0(qnp0 qnp0Var, SdkComponentTier sdkComponentTier, SdkLifecycleStage sdkLifecycleStage, SdkLifecycleStage sdkLifecycleStage2) {
        this.a = qnp0Var;
        this.b = sdkComponentTier;
        this.c = sdkLifecycleStage;
        this.d = sdkLifecycleStage2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnp0)) {
            return false;
        }
        lnp0 lnp0Var = (lnp0) obj;
        if (!this.a.equals(lnp0Var.a) || this.b != lnp0Var.b || this.c != lnp0Var.c || this.d != lnp0Var.d) {
            return false;
        }
        nnp0 nnp0Var = nnp0.a;
        return nnp0Var.equals(nnp0Var);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31;
        SdkLifecycleStage sdkLifecycleStage = this.d;
        return ((hashCode + (sdkLifecycleStage == null ? 0 : sdkLifecycleStage.hashCode())) * 31) + 430832128;
    }

    public final String toString() {
        return "SdkComponentDescriptor(key=" + this.a + ", tier=" + this.b + ", initLifecycleStage=" + this.c + ", lightweightInitLifecycleStage=" + this.d + ", errorPolicy=" + nnp0.a + Extension.C_BRAKE;
    }
}
