package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class epc implements bpc {
    public final fo2 a;

    public epc(fo2 fo2Var) {
        this.a = fo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epc) && jl40.l(this.a, ((epc) obj).a);
    }

    @Override // defpackage.fpc
    public final fo2 getExtras() {
        return this.a;
    }

    public final int hashCode() {
        fo2 fo2Var = this.a;
        if (fo2Var == null) {
            return 0;
        }
        return fo2Var.hashCode();
    }

    public final String toString() {
        return "UnknownError(extras=" + this.a + Extension.C_BRAKE;
    }

    public epc() {
        this(null);
    }
}
