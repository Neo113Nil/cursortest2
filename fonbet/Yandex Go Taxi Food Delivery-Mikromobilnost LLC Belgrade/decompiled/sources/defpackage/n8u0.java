package defpackage;

import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n8u0 {
    public final RebindPaymentMethodStatusEntity a;
    public final String b;
    public final Throwable c;

    public n8u0(RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity, String str, Throwable th) {
        this.a = rebindPaymentMethodStatusEntity;
        this.b = str;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8u0)) {
            return false;
        }
        n8u0 n8u0Var = (n8u0) obj;
        return this.a == n8u0Var.a && jl40.l(this.b, n8u0Var.b) && jl40.l(this.c, n8u0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "StatusBindEntity(status=" + this.a + ", url3ds=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }

    public /* synthetic */ n8u0(RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity, Throwable th, int i) {
        this(rebindPaymentMethodStatusEntity, (String) null, (i & 4) != 0 ? null : th);
    }
}
