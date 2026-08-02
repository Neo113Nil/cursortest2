package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupRetryPaymentEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class da4 {
    public final AutotopupRetryPaymentEntity$Status a;
    public final ca4 b;

    public da4(AutotopupRetryPaymentEntity$Status autotopupRetryPaymentEntity$Status, ca4 ca4Var) {
        this.a = autotopupRetryPaymentEntity$Status;
        this.b = ca4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da4)) {
            return false;
        }
        da4 da4Var = (da4) obj;
        return this.a == da4Var.a && jl40.l(this.b, da4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ca4 ca4Var = this.b;
        return hashCode + (ca4Var == null ? 0 : ca4Var.hashCode());
    }

    public final String toString() {
        return "AutotopupRetryPaymentEntity(status=" + this.a + ", statusData=" + this.b + Extension.C_BRAKE;
    }
}
