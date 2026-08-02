package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f6m0 {
    public final MoneyEntity a;
    public final String b;

    public f6m0(MoneyEntity moneyEntity, String str) {
        this.a = moneyEntity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6m0)) {
            return false;
        }
        f6m0 f6m0Var = (f6m0) obj;
        return jl40.l(this.a, f6m0Var.a) && this.b.equals(f6m0Var.b);
    }

    public final int hashCode() {
        MoneyEntity moneyEntity = this.a;
        return this.b.hashCode() + ((moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31);
    }

    public final String toString() {
        return "SavingsAccountGoalEntity(amount=" + this.a + ", dueDate=" + this.b + Extension.C_BRAKE;
    }
}
