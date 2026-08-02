package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cm30 {
    public final boolean a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    public cm30(int i, int i2, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm30)) {
            return false;
        }
        cm30 cm30Var = (cm30) obj;
        return this.a == cm30Var.a && this.b == cm30Var.b && jl40.l(this.c, cm30Var.c) && this.d == cm30Var.d && this.e == cm30Var.e;
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.e) + oyr.b(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder p = xvz.p("BatchResult(scanStopped=", this.b, ", itemsReceived=", ", lastSuccessfulRequestId=", this.a);
        b64.A(this.d, this.c, ", batchCycleId=", ", hasSuccessfulBatch=", p);
        return x4e.i(p, this.e, Extension.C_BRAKE);
    }
}
