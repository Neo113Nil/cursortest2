package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gyo0 implements hyo0 {
    public final String a;

    public /* synthetic */ gyo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gyo0) {
            return jl40.l(this.a, ((gyo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Started(purchaseId=", this.a, Extension.C_BRAKE);
    }
}
