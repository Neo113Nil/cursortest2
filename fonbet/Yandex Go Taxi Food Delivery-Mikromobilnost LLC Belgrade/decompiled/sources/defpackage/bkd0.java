package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bkd0 {
    public final String a;
    public final String b;

    public bkd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkd0)) {
            return false;
        }
        bkd0 bkd0Var = (bkd0) obj;
        return jl40.l(this.a, bkd0Var.a) && jl40.l(this.b, bkd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PlusSdkAnalyticsData(clientId=", this.a, ", openReason=", this.b, Extension.C_BRAKE);
    }
}
