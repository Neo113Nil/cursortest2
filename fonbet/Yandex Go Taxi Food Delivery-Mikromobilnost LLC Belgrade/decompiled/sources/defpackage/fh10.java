package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fh10 {
    public final CharSequence a;
    public final wk90 b;
    public final ibs0 c;

    public fh10(CharSequence charSequence, wk90 wk90Var, ibs0 ibs0Var) {
        this.a = charSequence;
        this.b = wk90Var;
        this.c = ibs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh10)) {
            return false;
        }
        fh10 fh10Var = (fh10) obj;
        return jl40.l(this.a, fh10Var.a) && jl40.l(this.b, fh10Var.b) && jl40.l(this.c, fh10Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        wk90 wk90Var = this.b;
        int hashCode2 = (hashCode + (wk90Var == null ? 0 : wk90Var.hashCode())) * 31;
        ibs0 ibs0Var = this.c;
        return hashCode2 + (ibs0Var != null ? ibs0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MeetingSectionUiState(title=" + ((Object) this.a) + ", passengerItem=" + this.b + ", signItem=" + this.c + Extension.C_BRAKE;
    }
}
