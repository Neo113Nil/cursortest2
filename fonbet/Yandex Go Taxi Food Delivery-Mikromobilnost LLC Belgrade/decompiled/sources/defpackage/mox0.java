package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mox0 extends s4z0 {
    public final w4v a;
    public final w4v b;

    public mox0(w4v w4vVar, w4v w4vVar2) {
        this.a = w4vVar;
        this.b = w4vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mox0)) {
            return false;
        }
        mox0 mox0Var = (mox0) obj;
        return jl40.l(this.a, mox0Var.a) && jl40.l(this.b, mox0Var.b);
    }

    public final int hashCode() {
        w4v w4vVar = this.a;
        int hashCode = (w4vVar == null ? 0 : w4vVar.hashCode()) * 31;
        w4v w4vVar2 = this.b;
        return hashCode + (w4vVar2 != null ? w4vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TariffTileFooterModel(tariffIcon=" + this.a + ", optionIcon=" + this.b + Extension.C_BRAKE;
    }

    public mox0() {
        this(null, null);
    }
}
