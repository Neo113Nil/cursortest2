package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hlv0 implements ilv0 {
    public final String a;
    public final jbu0 b;
    public final glv0 c;

    public hlv0(String str, jbu0 jbu0Var, glv0 glv0Var) {
        this.a = str;
        this.b = jbu0Var;
        this.c = glv0Var;
    }

    @Override // defpackage.ilv0
    public final glv0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlv0)) {
            return false;
        }
        hlv0 hlv0Var = (hlv0) obj;
        return jl40.l(this.a, hlv0Var.a) && this.b.equals(hlv0Var.b) && jl40.l(this.c, hlv0Var.c);
    }

    @Override // defpackage.ilv0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        glv0 glv0Var = this.c;
        return hashCode + (glv0Var == null ? 0 : glv0Var.hashCode());
    }

    public final String toString() {
        return "StepsInstructionSummaryPromotionModalWindow(id=" + this.a + ", state=" + this.b + ", orderButton=" + this.c + Extension.C_BRAKE;
    }
}
