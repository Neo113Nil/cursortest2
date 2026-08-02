package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.ConfirmInstructionEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oz3 {
    public final vou0 a;
    public final ConfirmInstructionEntity b;

    public oz3(vou0 vou0Var, ConfirmInstructionEntity confirmInstructionEntity) {
        this.a = vou0Var;
        this.b = confirmInstructionEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz3)) {
            return false;
        }
        oz3 oz3Var = (oz3) obj;
        return jl40.l(this.a, oz3Var.a) && this.b.equals(oz3Var.b);
    }

    public final int hashCode() {
        vou0 vou0Var = this.a;
        return this.b.hashCode() + ((vou0Var == null ? 0 : vou0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Instructions(introductionScreen=" + this.a + ", confirmInstruction=" + this.b + Extension.C_BRAKE;
    }
}
