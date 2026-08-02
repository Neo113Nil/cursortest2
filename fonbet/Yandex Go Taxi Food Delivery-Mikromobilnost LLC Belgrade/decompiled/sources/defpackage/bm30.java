package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bm30 {
    public final int a;
    public final String b;
    public final boolean c;

    public bm30(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm30)) {
            return false;
        }
        bm30 bm30Var = (bm30) obj;
        return this.a == bm30Var.a && jl40.l(this.b, bm30Var.b) && this.c == bm30Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(unr0.v(this.a, "BatchResult(itemsReceived=", ", lastSuccessfulRequestId=", this.b, ", scanStopped="), this.c, Extension.C_BRAKE);
    }
}
