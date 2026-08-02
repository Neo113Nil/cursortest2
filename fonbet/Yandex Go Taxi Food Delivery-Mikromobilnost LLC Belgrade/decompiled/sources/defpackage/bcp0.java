package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bcp0 {
    public final ActionButtonEntity a;
    public final ActionButtonEntity b;

    public bcp0(ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2) {
        this.a = actionButtonEntity;
        this.b = actionButtonEntity2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcp0)) {
            return false;
        }
        bcp0 bcp0Var = (bcp0) obj;
        return this.a.equals(bcp0Var.a) && this.b.equals(bcp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScreenButtonsEntity(selectAgreementButton=" + this.a + ", paymentButton=" + this.b + Extension.C_BRAKE;
    }
}
