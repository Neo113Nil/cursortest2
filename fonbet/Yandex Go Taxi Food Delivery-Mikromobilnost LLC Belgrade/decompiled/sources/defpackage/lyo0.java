package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lyo0 implements myo0 {
    public final String a;

    public /* synthetic */ lyo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lyo0) {
            return jl40.l(this.a, ((lyo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Purchasing(purchaseId=", this.a, Extension.C_BRAKE);
    }
}
