package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfq40;", "", "Companion", "dq40", "eq40", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class fq40 {
    public static final eq40 Companion = new eq40();
    public final String a;
    public final boolean b;

    public /* synthetic */ fq40(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq40)) {
            return false;
        }
        fq40 fq40Var = (fq40) obj;
        return jl40.l(this.a, fq40Var.a) && this.b == fq40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("MulticlassTariff(tariffClass=", this.a, ", isSelected=", this.b, Extension.C_BRAKE);
    }

    public fq40() {
        this.a = "";
        this.b = false;
    }
}
