package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m031 implements u031 {
    public final rvz0 a;
    public final UnconditionalLimitWidgetEntity b;
    public final rr51 c;
    public final p39 w;

    public m031(rvz0 rvz0Var, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity, rr51 rr51Var, p39 p39Var) {
        this.a = rvz0Var;
        this.b = unconditionalLimitWidgetEntity;
        this.c = rr51Var;
        this.w = p39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m031)) {
            return false;
        }
        m031 m031Var = (m031) obj;
        return jl40.l(this.a, m031Var.a) && jl40.l(this.b, m031Var.b) && jl40.l(this.c, m031Var.c) && jl40.l(this.w, m031Var.w);
    }

    public final int hashCode() {
        rvz0 rvz0Var = this.a;
        int hashCode = (rvz0Var == null ? 0 : rvz0Var.hashCode()) * 31;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.b;
        int hashCode2 = (hashCode + (unconditionalLimitWidgetEntity == null ? 0 : unconditionalLimitWidgetEntity.hashCode())) * 31;
        rr51 rr51Var = this.c;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        p39 p39Var = this.w;
        return hashCode3 + (p39Var != null ? p39Var.hashCode() : 0);
    }

    public final String toString() {
        return "Failed(tooltip=" + this.a + ", widget=" + this.b + ", shutterPayload=" + this.c + ", cashback=" + this.w + Extension.C_BRAKE;
    }
}
