package defpackage;

import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gfi0 {
    public final RebindPaymentMethodStatusEntity a;
    public final String b;

    public gfi0(RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity, String str) {
        this.a = rebindPaymentMethodStatusEntity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfi0)) {
            return false;
        }
        gfi0 gfi0Var = (gfi0) obj;
        return this.a == gfi0Var.a && jl40.l(this.b, gfi0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RebindPaymentMethodState(bindStatus=" + this.a + ", url3ds=" + this.b + Extension.C_BRAKE;
    }
}
