package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kez0 {
    public final String a;
    public final long b;
    public final String c;

    public kez0(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kez0)) {
            return false;
        }
        kez0 kez0Var = (kez0) obj;
        return jl40.l(this.a, kez0Var.a) && this.b == kez0Var.b && jl40.l(this.c, kez0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return unr0.r(x4e.l("TimerState(format=", this.a, ", timestamp=", this.b), ", placeholder=", this.c, Extension.C_BRAKE);
    }
}
