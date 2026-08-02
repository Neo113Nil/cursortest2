package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fa90 {
    public final long a;
    public final String b;
    public final String c;

    public fa90(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa90)) {
            return false;
        }
        fa90 fa90Var = (fa90) obj;
        return this.a == fa90Var.a && jl40.l(this.b, fa90Var.b) && jl40.l(this.c, fa90Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.r(x4e.k("PaidWaitingInfo(freeWaitingUntil=", this.a, ", paidWaitingTitle=", this.b), ", waitingPrice=", this.c, Extension.C_BRAKE);
    }
}
