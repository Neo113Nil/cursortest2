package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hmv0 {
    public final p230 a;
    public final sls b;
    public final sls c;

    public hmv0(p230 p230Var, sls slsVar, sls slsVar2) {
        this.a = p230Var;
        this.b = slsVar;
        this.c = slsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmv0)) {
            return false;
        }
        hmv0 hmv0Var = (hmv0) obj;
        return jl40.l(this.a, hmv0Var.a) && this.b.equals(hmv0Var.b) && this.c.equals(hmv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nnm.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryPromotionOnOrderModel(uiState=");
        sb.append(this.a);
        sb.append(", onAccept=");
        sb.append(this.b);
        sb.append(", onReject=");
        return ly3.r(sb, this.c, Extension.C_BRAKE);
    }
}
