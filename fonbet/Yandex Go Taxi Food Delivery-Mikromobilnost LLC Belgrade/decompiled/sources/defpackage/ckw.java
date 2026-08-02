package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ckw {
    public final String a;

    public /* synthetic */ ckw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ckw) {
            return jl40.l(this.a, ((ckw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("IntercityDashboardTariffId(id=", this.a, Extension.C_BRAKE);
    }
}
